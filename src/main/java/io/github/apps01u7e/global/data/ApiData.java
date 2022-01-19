package io.github.apps01u7e.global.data;

import io.github.apps01u7e.global.data.type.ApiVersion;

/**
 * soom 프로젝트에서 사용되는 모든 api 간 통신객체임을 정의하는 인터페이스 입니다.<br>
 * 해당 통신객체가 사용되는 API version 및 URN 등의 데이터를 명세할 수 있습니다.
 *
 * @author JeeInho
 * @since 0.0.1alpha-RELEASE
 * @version 0.0.1alpha-RELEASE
 */
public interface ApiData {
    /**
     * 자원(통신객체)이 명시되는 api 의 버전을 반환합니다.
     *
     * @return 자원이 명시되는 api 의 버전
     *
     * @author JeeInho
     * @since 0.0.1alpha-RELEASE
     */
    ApiVersion getApiVersion();
    /**
     * 자원(통신객체)의 논리적 위치를 반환합니다.<br>
     * (ex, api/v1/account/{id})
     *
     * @return 자원의 논리적 위치
     *
     * @author JeeInho
     * @since 0.0.1alpha-RELEASE
     */
    String getURN();
}
