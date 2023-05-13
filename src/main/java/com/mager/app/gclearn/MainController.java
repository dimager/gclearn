package com.mager.app.gclearn;

import com.google.cloud.spring.core.GcpProjectIdProvider;
import com.google.cloud.storage.BlobInfo;
import com.google.cloud.storage.Bucket;
import com.google.cloud.storage.BucketInfo;
import com.google.cloud.storage.Storage;
import com.google.type.DateTime;
import com.mager.app.gclearn.repository.PersonRepository;
import com.mager.app.gclearn.repository.entity.Person;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.time.LocalDateTime;

@Controller
@AllArgsConstructor
public class MainController {
    private GcpProjectIdProvider gcpProjectIdProvider;
    private Storage storage;

    private PersonRepository personRepository;

    @ModelAttribute("projectId")
    public String projectId() {
        return gcpProjectIdProvider.getProjectId();
    }

    @GetMapping("/gcp")
    public String GCPInfo(Model model) {
        storage.create(
                BlobInfo.newBuilder("magerdimabucket1","folder1/file1").build(),
                "file contents".getBytes()
        );
        return "gcp";
    }
    @GetMapping("/add")
    public String adduser(Model model) {
        Person dima = new Person("dima",35);
        personRepository.save(dima);
        return "gcp";
    }

}
