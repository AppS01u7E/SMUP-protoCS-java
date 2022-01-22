package io.github.apps01u7e.domain.account.model;


import io.github.apps01u7e.domain.account.type.GenderType;
import io.github.apps01u7e.domain.type.SchoolType;

import java.time.LocalDate;

/**
 * 계정 정보 을 명시한 모델입니다.
 * 계정 도메인 내에서 범용적으로 사용됩니다.
 *
 * @author JeeInho
 * @version 0.0.1alpha-RELEASE
 * @since 0.0.1alpha-RELEASE
 */
public record AccountInfo(
        String UUID,
        String name,
        LocalDate birth,
        GenderType gender,
        SchoolType school,
        String profileImageUUID
) {}
