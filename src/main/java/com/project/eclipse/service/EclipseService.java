package com.project.eclipse.service;

import com.project.eclipse.model.response.EclipseResponseDTO;

import java.util.List;

public interface EclipseService {

    List<EclipseResponseDTO> findAllItems();
}
