package io.github.apps01u7e.domain.account.signup.model;

/**
 * 계정인증정보 을 명시한 모델입니다.
 * 가입 도메인 내에서 범용적으로 사용됩니다.
 *
 * @author JeeInho
 * @version 0.0.1alpha-RELEASE
 * @since 0.0.1alpha-RELEASE
 */
public record AccountAuthInfo (
        String id,
        String password
) {}
