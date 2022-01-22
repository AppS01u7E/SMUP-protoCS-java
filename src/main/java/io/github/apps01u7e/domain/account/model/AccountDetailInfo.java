package io.github.apps01u7e.domain.account.model;

import io.github.apps01u7e.domain.account.type.AccountType;

/**
 * 계정 세부 정보 를 명시한 모델입니다.
 * 계정 도메인 내에서 범용적으로 사용됩니다.
 *
 * @author JeeInho
 * @version 0.0.1alpha-RELEASE
 * @since 0.0.1alpha-RELEASE
 */
public record AccountDetailInfo(
        AccountType accountType,
        Object data
) {}
