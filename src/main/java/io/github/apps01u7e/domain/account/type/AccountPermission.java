package io.github.apps01u7e.domain.account.type;

/**
 * 계정 권한 을 명시한 모델입니다.
 * 계정 도메인 내에서 범용적으로 사용됩니다.
 *
 * @author JeeInho
 * @version 0.0.1alpha-RELEASE
 * @since 0.0.1alpha-RELEASE
 */
public enum AccountPermission {
    /**
     * 관리자
     */
    OPERATOR,
    /**
     * 교사
     */
    TEACHER,
    /**
     * 학생
     */
    STUDENT
}
