package egovframework.student.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import egovframework.student.service.StudentService;
import egovframework.student.StudentVO;
import egovframework.student.service.StudentDAO;



@Service
public class StudentServiceImpl implements StudentService {
        

    @Inject
    private StudentDAO studentDAO;
   
    public void insertStudent(StudentVO vo) throws Exception {
    	
    	studentDAO.insertStudent(vo);
    }
    public List<StudentVO> selectStudent() throws Exception {
        return studentDAO.selectStudent();
    }
	@Override
	public StudentVO selectStudent(StudentVO vo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
