package com.example.Haha.answer;

import com.example.Haha.question.Question;
import com.example.Haha.question.QuestionService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/Answer")
@RequiredArgsConstructor
@Controller
public class AnswerController {

    private final QuestionService questionService;
    private AnswerService answerService;


    @PostMapping("create/{id}")
    public String createAnswer(Model model, @PathVariable("id") Integer id, @Valid AnswerForm answerFoam, BindingResult bindingResult) {
        // BingingResult 객체를 사용해서 사용자 입력 데이터의 유효성 검사 결과를 받아온다.
        Question question = this.questionService.getQuestion(id);
        if(bindingResult.hasErrors()){
            // 이후 객체의 인스턴스인 bingingResult로 오류 처리 로직을 수행한다.
            model.addAttribute("question",question);
            return "question_detail";
        }
        this.answerService.create(question, answerFoam.getContent());
        return String.format("redirect:/question/detail/%s",id);

    }
}
