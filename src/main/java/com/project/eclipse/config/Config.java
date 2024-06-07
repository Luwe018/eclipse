package com.project.eclipse.config;

import com.project.eclipse.entity.Eclipse;
import com.project.eclipse.repository.EclipseRepository;
import com.project.eclipse.service.impl.EclipseServiceImpl;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@Configuration
@EntityScan(basePackageClasses = {
        Eclipse.class
})
@EnableJpaRepositories(basePackageClasses = {
        EclipseRepository.class
})
@Import(value = {
        EclipseServiceImpl.class
})
public class Config {

}
