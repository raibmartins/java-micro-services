package com.rai.course.endpoint.service;


import com.rai.course.core.model.Course;
import com.rai.course.core.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CourseService {

    private final CourseRepository courseRepository;
    
    public Iterable<Course> list (Pageable pageable) {
        return courseRepository.findAll(pageable);
    }


}
