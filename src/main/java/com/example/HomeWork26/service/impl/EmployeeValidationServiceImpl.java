package com.example.HomeWork26.service.impl;

import com.example.HomeWork26.exception.InvalidEmployeeDataException;
import com.example.HomeWork26.service.EmployeeValidationService;
import org.springframework.stereotype.Service;


import static org.apache.commons.lang3.StringUtils.isAlpha;
import static org.apache.commons.lang3.StringUtils.isBlank;

@Service
public class EmployeeValidationServiceImpl implements EmployeeValidationService {
    @Override
    public void validate(String firstName, String lastName) {
        validateName(firstName);
        validateName(lastName);
    }

    private void validateName(String name) {
        if (!isAlpha(name)) {
            throw new InvalidEmployeeDataException("Некорректное значения имени сотрудника");
        }
    }
}
