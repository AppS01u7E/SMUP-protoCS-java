package io.github.apps01u7e.domain.account.read.model;

import io.github.apps01u7e.domain.account.model.AccountInfo;
import io.github.apps01u7e.domain.account.type.AccountPermission;

/**
 * 계정프로필 을 명시한 모델입니다.
 * 조회 도메인 내에서 범용적으로 사용됩니다.
 *
 * @author JeeInho
 * @version 0.0.1alpha-RELEASE
 * @since 0.0.1alpha-RELEASE
 */
public record AccountProfile (
        AccountInfo info,
        AccountPermission permission
) {}
