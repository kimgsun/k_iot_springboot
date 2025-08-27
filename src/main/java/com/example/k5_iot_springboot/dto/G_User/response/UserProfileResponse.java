package com.example.k5_iot_springboot.dto.G_User.response;

import com.example.k5_iot_springboot.common.enums.Gender;

public class UserProfileResponse {
    public record MyPageResponse(
       Long id,
       String loginId,
       String email,
       String nickname,
       Gender gender
    ) {}
}
