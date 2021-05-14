package Annotations;


@Service("StudentService")
public class StudentService {
	@Autowired
	 StudentDAO StudentDAO;
	 public Student createNewCountry() {
	 
	  return StudentDAO.createNewStudent();
	 }

}
