package io.github.apps01u7e.global.data.type;

import io.github.apps01u7e.global.data.ErrorCode;

/**
 * API 전반에서 발생할 수 있는 에러에 대한 ErrorCode 정보를 담고있는 열거형 객체입니다.
 *
 * @see ErrorCode
 * @author JeeInho
 * @since 0.0.1alpha-RELEASE
 * @version 0.0.1alpha-RELEASE
 */
public enum UniversalErrorCode implements ErrorCode {
    /**
     * 알 수 없는 오류가 발생하였을 경우
     */
    UNKNOWN_ERROR;

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
