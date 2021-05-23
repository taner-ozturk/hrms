package kodlama.io.hrms.api.controllers;

import kodlama.io.hrms.business.abstracts.JobService;
import kodlama.io.hrms.entities.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobsController {

    @Autowired
    private JobService jobService;

    @GetMapping("/getall")
    public List<Job> getAll(){
        return this.jobService.getAll();
    }

    @PostMapping("/add")
    public  void add(@RequestBody Job job){
        this.jobService.add(job);
    }

    @PostMapping("/getbyname")
    public List<Job> getByName(@RequestParam String name){
        return this.jobService.getByName(name);
    }
}
