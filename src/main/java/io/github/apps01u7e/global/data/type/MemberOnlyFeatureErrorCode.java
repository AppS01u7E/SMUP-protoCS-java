package io.github.apps01u7e.global.data.type;

import io.github.apps01u7e.global.data.ErrorCode;

/**
 * <b>서비스에 가입된 사용자 전용 API</b> 에서 발생할 수 있는 에러에 대한 ErrorCode 정보를 담고있는 열거형 객체입니다.
 *
 * @author JeeInho
 * @version 0.0.1alpha-RELEASE
 * @see ErrorCode
 * @since 0.0.1alpha-RELEASE
 */
public enum MemberOnlyFeatureErrorCode implements ErrorCode {
    /**
     * 해당 기능에 접근할 권한이 없을 경우 발생하는 오류
     * 예를들어서,
     * - 그룹(SOOM) 에서의 가입요청 수락은 해당 그룹의 관리자만이 가능하다.
     * - 해당 그룹의 관리자가 아닌 사람이 해당 기능에 접근한다.
     * - PERMISSION_DENIED 오류가 발생한다.
     * 같은 경우를 의미한다.
     * 즉, 서비스에 가입된 사용자이지만, 해당 기능을 이용할 권한이 없을 경우 발생한다
     * 서비스에 가입되지 않은 사용자이기에 발생하는 오류는 LOGIN_REQUIRED 참고
     * 
     * @see UniversalErrorCode#LOGIN_REQUIRED 서비스에 가입되지 않은 사용자이기에 발생하는 오류
     */
    PERMISSION_DENIED;

    @Override
    public String getName() {
        return name();
    }
}
