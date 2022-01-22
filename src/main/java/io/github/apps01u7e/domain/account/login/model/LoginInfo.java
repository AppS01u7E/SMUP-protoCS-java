package io.github.apps01u7e.domain.account.login.model;

/**
 * 로그인 정보 를 명시한 모델입니다.
 * 증명(로그인) 도메인 내에서 범용적으로 사용됩니다.
 *
 * @author JeeInho
 * @version 0.0.1alpha-RELEASE
 * @since 0.0.1alpha-RELEASE
 */
public record LoginInfo(
        String schoolEmail,
        String password
) {}
