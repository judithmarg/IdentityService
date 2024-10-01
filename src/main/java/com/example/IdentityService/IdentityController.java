package com.example.IdentityService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/identity")
public class IdentityController {
    @Autowired
    private IdentityRepository identityRepository;
    @Autowired
    private IdentityService identityService = new IdentityService(identityRepository);

    @GetMapping
    public ResponseEntity<ResponseDto> isThereCi(@RequestParam RequestDto requestDto) {
        boolean exist = identityService.ciExist(
                requestDto.ci()
        );
        ResponseDto responseEntity = new ResponseDto(
                requestDto.ci(),
                exist
        );
        return ResponseEntity.ok(responseEntity);
    }
}
