package io.github.apps01u7e.global.data.response;

import io.github.apps01u7e.global.data.ErrorCode;

/**
 * 클라이언트에 오류에 대한 응답을 수행하는 객체들에 대한 명세입니다.
 *
 * @author JeeInho
 * @since 0.0.1alpha-RELEASE
 * @version 0.0.1alpha-RELEASE
 */
public interface ErrorResponsible extends Responsible {
    /**
     * ErrorCode를 반환합니다.
     *
     * @return ErrorCode
     *
     * @author JeeInho
     * @since 0.0.1alpha-RELEASE
     */
    ErrorCode getError();
    /**
     * 오류에 관련된 부가적인 정보를 반환합니다
     *
     * @return 오류 관련 정보
     *
     * @author JeeInho
     * @since 0.0.1alpha-RELEASE
     */
    Object getData();
    /**
     * 오류에 대한 상세 메세지를 반환합니다
     *
     * @return 오류 메세지
     *
     * @author JeeInho
     * @since 0.0.1alpha-RELEASE
     */
    String getMessage();
}
