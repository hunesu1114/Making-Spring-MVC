package hello.servlet.web.frontcontroller.v3.controller;

import hello.servlet.web.frontcontroller.ModelView;
import hello.servlet.web.frontcontroller.v3.ControllerV3;

import java.util.Map;

public class MemberFormControllerV3 implements ControllerV3 {

    @Override
    public ModelView process(Map<String, String> paramMap) {
        //Form 단계는 Post되는 데이터가 없어서 여기 매개변수인 paramMap은 null일것임
        return new ModelView("new-form");
    }
}
