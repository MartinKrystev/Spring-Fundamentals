package com.example.mobilele.services.userrole;

import com.example.mobilele.domain.entities.UserRole;
import com.example.mobilele.domain.enums.Role;
import com.example.mobilele.domain.views.UserRoleViewDto;
import com.example.mobilele.repositories.UserRoleRepository;
import com.example.mobilele.services.init.DbInit;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserroleServiceImpl implements UserroleService, DbInit {
    private final UserRoleRepository userRoleRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public UserroleServiceImpl(UserRoleRepository userRoleRepository, ModelMapper modelMapper) {
        this.userRoleRepository = userRoleRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void dbInit() {
        if (!isDbInit()) {
            List<UserRole> roles = new ArrayList<>();
            roles.add(new UserRole().setRole(Role.USER));
            roles.add(new UserRole().setRole(Role.ADMIN));

            this.userRoleRepository.saveAllAndFlush(roles);
        }
    }

    @Override
    public boolean isDbInit() {
        return this.userRoleRepository.count() > 0;
    }

    @Override
    public List<UserRoleViewDto> getAll() {
        return this.userRoleRepository.findAll()
                .stream()
                .map(r -> this.modelMapper.map(r, UserRoleViewDto.class))
                .collect(Collectors.toList());
    }
}
