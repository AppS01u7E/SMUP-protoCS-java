package io.github.apps01u7e.global.data.type;

/**
 * <a href="https://developer.mozilla.org/ko/docs/Web/HTTP/Methods">Http 요청 메서드</a>를 정의한 열거형 객체입니다.
 *
 * @author JeeInho
 * @version 0.0.1alpha-RELEASE
 * @since 0.0.1alpha-RELEASE
 */
public enum HttpMethod {
    /**
     * GET 메서드는 특정 리소스의 표시를 요청합니다. GET을 사용하는 요청은 오직 데이터를 받기만 합니다.
     */
    GET,
    /**
     * HEAD 메서드는 GET 메서드의 요청과 동일한 응답을 요구하지만, 응답 본문을 포함하지 않습니다.
     */
    HEAD,
    /**
     * POST 메서드는 특정 리소스에 엔티티를 제출할 때 쓰입니다. 이는 종종 서버의 상태의 변화나 부작용을 일으킵니다.
     */
    POST,
    /**
     * PUT 메서드는 목적 리소스 모든 현재 표시를 요청 payload로 바꿉니다.
     */
    PUT,
    /**
     * DELETE 메서드는 특정 리소스를 삭제합니다.
     */
    DELETE,
    /**
     * CONNECT 메서드는 목적 리소스로 식별되는 서버로의 터널을 맺습니다.
     */
    CONNECT,
    /**
     * OPTIONS 메서드는 목적 리소스의 통신을 설정하는 데 쓰입니다.
     */
    OPTIONS,
    /**
     * TRACE 메서드는 목적 리소스의 경로를 따라 메시지 loop-back 테스트를 합니다.
     */
    TRACE,
    /**
     * PATCH 메서드는 리소스의 부분만을 수정하는 데 쓰입니다.
     */
    PATCH
}
