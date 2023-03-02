package com.wxy97.content.api;

import com.wxy97.content.model.dto.SaveTeachplanDto;
import com.wxy97.content.model.dto.TeachplanDto;
import com.wxy97.content.service.TeachplanService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeachplanController {

    private final TeachplanService teachplanService;

    public TeachplanController(TeachplanService teachplanService) {
        this.teachplanService = teachplanService;
    }

    @GetMapping("/teachplan/{courseId}/tree-nodes")
    public List<TeachplanDto> getTreeNodes(@PathVariable Long courseId) {
        return teachplanService.findTeachplayTree(courseId);
    }

    @PostMapping("/teachplan")
    public void saveTeachplan(@RequestBody SaveTeachplanDto dto) {
        teachplanService.saveTeachplan(dto);
    }
}
