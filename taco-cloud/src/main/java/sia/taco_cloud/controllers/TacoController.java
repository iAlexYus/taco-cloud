package sia.taco_cloud.controllers;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sia.taco_cloud.data.TacoRepository;
import sia.taco_cloud.models.Taco;

@RestController
@RequestMapping(path = "/api/tacos", produces = {"application/json", "text/xml"})
@CrossOrigin(origins = {"http://tacocloud:8080", "http://tacocloud.com"})
public class TacoController {
    private TacoRepository tacoRepo;

    public TacoController(TacoRepository tacoRepo) {
        this.tacoRepo = tacoRepo;
    }

    @GetMapping(params = "recent")
    public Iterable<Taco> recentTacos() {
//        PageRequest page = PageRequest.of(0, 12, Sort.by("createdAt").descending());
        return tacoRepo.findAll();
    }
}
