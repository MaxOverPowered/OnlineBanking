package org.example;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bank {

    private List<Client> clientList;
    private List<Employee> employeeList;
}
