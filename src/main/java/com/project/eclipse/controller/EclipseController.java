package com.project.eclipse.controller;

import com.project.eclipse.model.response.EclipseResponseDTO;
import com.project.eclipse.service.EclipseService;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import io.swagger.v3.oas.annotations.tags.Tag;

@Slf4j
@Setter
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "${rest.api.base-path}/eclipse", produces = {APPLICATION_JSON_VALUE})
@Tag(name = "Eclipse", description = "Eclipse API")
public class EclipseController {

    private final EclipseService service;

    @GetMapping
    @Operation(summary = "Get Eclipse")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200"
                    , description = "Success"
                    , content = {@Content(mediaType = "application/json", schema = @Schema(implementation = EclipseResponseDTO.class))}),
    })
    @ResponseStatus(code = HttpStatus.OK)
    public List<EclipseResponseDTO> getAllItems(HttpServletRequest request) {
        return service.findAllItems();
    }
}
