package io.github.apps01u7e.domain.account.signup.model;

import io.github.apps01u7e.domain.account.type.GenderType;
import io.github.apps01u7e.domain.type.SchoolType;

import java.time.LocalDate;

/**
 * 계정기본정보 를 명시한 모델입니다.
 * 가입 도메인 내에서 범용적으로 사용됩니다.
 *
 * @author JeeInho
 * @version 0.0.1alpha-RELEASE
 * @since 0.0.1alpha-RELEASE
 */
public record AccountBasicInfo (
        String name,
        LocalDate birth,
        GenderType gender,
        SchoolType school
) {}