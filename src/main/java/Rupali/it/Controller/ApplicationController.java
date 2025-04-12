package Rupali.it.Controller;

import com.example.demo.entity.Application;
import com.example.demo.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/applications")
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    @PostMapping
    public ResponseEntity<Application> createApplication(@RequestBody Application application) {
        return ResponseEntity.ok(applicationService.saveApplication(application));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Application> getApplicationById(@PathVariable("id") Integer appNum) {
        return ResponseEntity.ok(applicationService.getApplicationById(appNum));
    }

    @GetMapping
    public ResponseEntity<List<Application>> getAllApplications() {
        return ResponseEntity.ok(applicationService.getAllApplications());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Application> updateApplication(@PathVariable("id") Integer appNum,
                                                          @RequestBody Application application) {
        return ResponseEntity.ok(applicationService.updateApplication(appNum, application));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteApplication(@PathVariable("id") Integer appNum) {
        applicationService.deleteApplication(appNum);
        return ResponseEntity.noContent().build();
    }
}
