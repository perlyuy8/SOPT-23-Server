package org.sopt.seminar3.utils;

/**
 * Created by ds on 2018-10-19.
 */

public class ResponseMessage {
    public static final String LOGIN_SUCCESS = "로그인 성공";
    public static final String LOGIN_FAIL = "로그인 실패";

    public static final String READ_USER = "회원 정보 조회 성공";
    public static final String NOT_FOUND_USER = "회원을 찾을 수 없습니다.";
    public static final String CREATED_USER = "회원 가입 성공";
    public static final String FAIL_CREATE_USER = "회원 가입 실패";
    public static final String UPDATE_USER = "회원 정보 수정 성공";
    public static final String FAIL_UPDATE_USER = "회원 정보 수정 실패";
    public static final String DELETE_USER = "회원 탈퇴 성공";

    public static final String ALREADY_USER = "이미 존재하는 회원입니다.";

    public static final String UNAUTHORIZED = "인증 실패";
    public static final String FORBIDDEN = "인가 실패";

    public static final String INTERNAL_SERVER_ERROR = "서버 내부 에러";
    public static final String SERVICE_UNAVAILABLE = "현재 서비스를 사용하실 수 없습니다.\n잠시후 다시 시도해 주세요.";
}
