package com.preorder.preorderservice.domain.user.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupRequestDto {
    @NotBlank
    @Size(min = 4, max = 10, message = "유저네임은 최소 4글자 이상 최대 10글자 이하로, 영문 대소문자와 숫자로 이루어져야 합니다.")
    @Pattern(regexp = "^[a-zA-Z0-9_]+$")
    private String username;

    @Size(min = 8, max = 15, message = "비밀번호는 8글자 이상 최대 15글자 이하로, 대소문자 각 1개, 특수문자 1개, 숫자 1개 이상으로 구성되어야 합니다.")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!#$%&'*+/=?`{|}~^.-])[a-zA-Z\\d!#$%&'*+/=?`{|}~^.-]+$")
    @NotBlank
    private String password;

    @Pattern(regexp = "^[a-zA-Z0-9_.-]+@[a-zA-Z0-9.-]+$")
    @NotBlank
    private String email;

    private boolean admin = false;
    private String adminToken = "";
}