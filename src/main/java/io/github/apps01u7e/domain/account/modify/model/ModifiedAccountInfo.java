package io.github.apps01u7e.domain.account.modify.model;

import io.github.apps01u7e.domain.account.model.AccountDetailInfo;
import io.github.apps01u7e.domain.account.model.AccountInfo;
import io.github.apps01u7e.domain.account.type.AccountPermission;

/**
 * 수정된 계정정보 를 명시한 모델입니다.
 * 수정 도메인 내에서 범용적으로 사용됩니다.
 *
 * @author JeeInho
 * @version 0.0.1alpha-RELEASE
 * @since 0.0.1alpha-RELEASE
 */
public record ModifiedAccountInfo(
        AccountInfo info,
        AccountPermission permission,
        AccountDetailInfo detailInfo
) {}
