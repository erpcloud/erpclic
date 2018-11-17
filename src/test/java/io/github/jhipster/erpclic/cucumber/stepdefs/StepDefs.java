package io.github.jhipster.erpclic.cucumber.stepdefs;

import io.github.jhipster.erpclic.ErpclicApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = ErpclicApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
