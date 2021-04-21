package com.aocm.taskapp.controller

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

    @Shared
    MockMvc mockMvc

    void setup() {
        mockMvc = webAppContextSetup(wac).build()
    }

    def basicPath = '/task'

    def "Sample"() {

        given: "とりあえずtestという文字列を返却してもらう"

        when:
        def response = サンプル()

        then:
        assert response == "test"
    }

    def "サンプル"() {
        mockMvc.perform(get("${basicPath}/"))
                .andExpect(status().isOk())
                .andReturn().response.contentAsString
    }
}
