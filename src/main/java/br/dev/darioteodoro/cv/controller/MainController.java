package br.dev.darioteodoro.cv.controller;

import br.dev.darioteodoro.cv.model.*;
import jakarta.servlet.http.HttpServletResponse;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/profile")
public class MainController {

    @GetMapping
    public String index(Model model, HttpServletResponse response) {
        model.addAttribute("profile",loadProfile());
        return "pages/main";
    }

    private Profile loadProfile(){
        Profile profile = new Profile("""
            Java Developer with almost 4 years of experience in applications using JavaEE, Rest
            APIs with SpringBoot, among other technologies. In addition, I have over 7 years of
            experience in the IT industry, covering various areas such as infrastructure, support,
            requirements gathering, and implementation projects for systems, in companies in the
            supply chain segment. Graduated in Systems Analysis and Development, I enjoy staying
            updated and testing new technologies, in order to meet any technological challenge that
            the company may require. Dynamic, communicative, and adaptable to new work
            routines.
                """);
        profile.setPerson(createPerson());
        profile.setAcknowledge(createAcknowledge());
        profile.setWorkExperience(createWorkExperience());
        return profile;
    }

    private WorkExperience createWorkExperience() {
        WorkRole devSenior = new WorkRole();
        devSenior.setTitle("Senior Software Developer");
        devSenior.setDescription("Currently, I work on other supply chain solutions focused on VMI (Vendor\n" +
                                         "Managed Inventory), where the supplier manages their own inventory based\n" +
                                         "on sales data provided by retailers. I am also conducting a study to migrate\n" +
                                         "the application to distributed systems and microservices, using Docker, Spring\n" +
                                         "Boot, RebbitMq, and ReactJS on the front-end.");
        devSenior.setStartDate(LocalDate.of(2024,03,01));

        WorkRole devPleno = new WorkRole();
        devPleno.setTitle("Software Developer");
        devPleno.setDescription("Currently, I work on other supply chain solutions focused on VMI (Vendor\n" +
                                        "Managed Inventory), where the supplier manages their own inventory based\n" +
                                        "on sales data provided by retailers. I am also conducting a study to migrate\n" +
                                        "the application to distributed systems and microservices, using Docker, Spring\n" +
                                        "Boot, RebbitMq, and ReactJS on the front-end.");
        devPleno.setStartDate(LocalDate.of(2021,10,01));
        devPleno.setEndDate(LocalDate.of(2024,03,31));
        WorkRole devJunior = new WorkRole();
        devJunior.setTitle("Junior Software Developer");
        devJunior.setDescription("I worked in developing applications for the supply chain segment with\n" +
                                         "Distribution Requirements Planning (DRP) and dock scheduling, implementing\n" +
                                         "new features and resolving bugs.");
        devJunior.setStartDate(LocalDate.of(2020,02,01));
        devJunior.setEndDate(LocalDate.of(2021,10,31));
        Work work = new Work();
        work.setCompanyName("Company Software");
        work.setCompanyLocation("São Paulo/Brazil");
        work.setWorkRoles(List.of(devSenior, devPleno, devJunior));
        return new WorkExperience(List.of(work));
    }

    private Acknowledge createAcknowledge() {
        EducationPeriod educationPeriod = new EducationPeriod(LocalDate.of(2011,07,01), LocalDate.of(2013,12,31));
        List<Education> educations = List.of(
            new Education(
                    "Tecnólogo em Análise e Desenvolvimento de Sistemas",
                    "Faculdade",
                    "São Paulo - SP",
                    educationPeriod
                ));

        List<Language> languages = List.of(
                        new Language("portuguese","nativo"),
                        new Language("English", "B1")
                        );;

        List<Skill> skills = List.of(new Skill("SpringMVC"),new Skill("Sprign Boot"));

        Acknowledge acknowledge = new Acknowledge();
        acknowledge.setEducations(educations);
        acknowledge.setLanguages(languages);
        acknowledge.setSkill(skills);
        return acknowledge;
    }

    private Person createPerson() {
        List<PersonContact> contact = List.of( 
            new PersonContact("", "Bairro, Cidade/SP - Brazil"),
            new PersonContact("", "(+55) 11 99999 9999"),
            new PersonContact("", "darioteodoro@email.com")
            );
        return new Person("Dario Teodoro","Java Software Developer",contact);
    }
}
