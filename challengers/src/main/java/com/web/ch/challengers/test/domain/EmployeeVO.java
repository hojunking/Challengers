package com.web.ch.challengers.test.domain;

import lombok.Data;

/**
 * lombok의 @Data 어노테이션은
 * @Getter,@Setter,@RequiredArgsConstructor,@ToString,@EqualsAndHashCode 를
 * 한번에 설정해주는 어노테이션이다.
 */
@Data
public class EmployeeVO {
    private int employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String hireDate;
    private String jobId;
    private String salary;
    private String commission;
    private String managerId;
    private int departmentId;
}
