package com.project.eclipse.service.impl;

import com.project.eclipse.model.response.EclipseResponseDTO;
import com.project.eclipse.service.EclipseService;
import org.jvnet.hk2.annotations.Service;
import org.springframework.stereotype.Component;

import java.util.List;

@Service
@Component
public class EclipseServiceImpl implements EclipseService {
    @Override
    public List<EclipseResponseDTO> findAllItems() {
        return null;
    }
}
