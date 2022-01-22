package io.github.apps01u7e.domain.account.model;

import io.github.apps01u7e.domain.account.type.AccountPermission;

/**
 * 로그인된 계정 정보를 명시한 모델입니다.
 * 계정 도메인 내에서 범용적으로 사용됩니다.
 *
 * @author JeeInho
 * @version 0.0.1alpha-RELEASE
 * @since 0.0.1alpha-RELEASE
 */
public record LoginAccountInfo(
        AccountInfo accountInfo,
        AccountPermission permission,
        AccountDetailInfo accountDetailInfo
) {}
