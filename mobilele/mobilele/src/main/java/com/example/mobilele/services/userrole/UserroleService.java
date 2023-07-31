package com.example.mobilele.services.userrole;

import com.example.mobilele.domain.views.UserRoleViewDto;

import java.util.List;

public interface UserroleService {

    public void dbInit();
    List<UserRoleViewDto> getAll();
}
