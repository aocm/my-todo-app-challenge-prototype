package com.aocm.taskapp.controller

import com.aocm.taskapp.domain.task.SampleRepository
import org.spockframework.spring.SpringBean
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.web.context.WebApplicationContext
import spock.lang.Shared
import spock.lang.Specification
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*


@SpringBootTest
class TaskControllerTest extends Specification {

    @Autowired
    WebApplicationContext wac

    @SpringBean
    SampleRepository sampleRepository = Mock()

    @Shared
    MockMvc mockMvc

    void setup() {
        mockMvc = webAppContextSetup(wac).build()
        sampleRepository.getSampleAction() >> "test"
    }

    def basicPath = '/task'

    def "Sampleメソッドのテスト"() {

        given: "とりあえずtestという文字列を返却してもらう"

        when:
        def response = サンプル()

        then:
        assert response == "test"
    }

    def "最新のタスクを取得するテスト"() { // TODO リファクタ

        given: "最新のタスクを取得する"

        when:
        def response = 最新のタスクを取得するメソッド()

        then:
        assert response == "{\"taskId\":\"todo\",\"title\":\"sample title\",\"description\":\"sample description\",\"status\":\"start\"}"
    }


    def "サンプル"() {
        mockMvc.perform(get("${basicPath}/"))
                .andExpect(status().isOk())
                .andReturn().response.contentAsString
    }
    def "最新のタスクを取得するメソッド"() {
        mockMvc.perform(get("${basicPath}/latest"))
                .andExpect(status().isOk())
                .andReturn().response.contentAsString
    }
}
