package io.github.apps01u7e.domain.account.type;

import io.github.apps01u7e.global.data.ErrorCode;

/**
 * <b>Account API</b>에서 발생할 수 있는 에러에 대한 ErrorCode 정보를 담고있는 열거형 객체입니다.
 *
 * @see ErrorCode
 * @author JeeInho
 * @version 0.0.1alpha-RELEASE
 * @since 0.0.1alpha-RELEASE
 */
public enum AccountErrorCode implements ErrorCode {
    /**
     * 이메일 정책을 위반하였을 경우 발생하는 오류
     */
    EMAIL_POLICY_VIOLATION,
    /**
     * 이메일 인증코드 정책을 위반하였을 경우 발생하는 오류
     */
    AUTH_CODE_POLICY_VIOLATION,
    /**
     * 비밀번호 정책을 위반하였을 경우 발생하는 오류
     */
    PASSWORD_POLICY_VIOLATION,
    /**
     * 교사 인증코드 정책을 위반하였을 경우 발생하는 오류
     */
    TEACHER_CODE_POLICY_VIOLATION,
    /**
     * 이메일 인증코드를 찾을 수 없을 경우 발생하는 오류
     */
    UNKNOWN_AUTH_CODE,
    /**
     * 교사 인증코드를 찾을 수 없을 경우 발생하는 오류
     */
    UNKNOWN_TEACHER_CODE,
    /**
     * 계정을 찾을 수 없을 경우 발생하는 오류
     */
    UNKNOWN_ACCOUNT,
    /**
     * 비밀번호가 잘못되었을 경우 발생하는 오류
     */
    WRONG_PASSWORD,
    /**
     * 재발급 토큰이 잘못되었을 경우 발생하는 오류
     */
    WRONG_REFRESH_TOKEN,
    /**
     * 가입 요청자가 이미 서비스에 가입되어있을 경우 발생하는 오류
     */
    DUPLICATED_ACCOUNT
    ;

    /**
     * 로직 처리 과정에서 발생한 오류에 대한 정보를 담는 객체에 대한 명세 입니다.
     *
     * @return 에러코드의 이름
     *
     * @see ErrorCode
     * @author JeeInho
     * @since 0.0.1alpha-RELEASE
     */
    @Override
    public String getName() {
        return name();
    }
}
