package kr.co.unit;

import kr.co.unit.build.User;
import kr.co.unit.di.Device;
import kr.co.unit.svc.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UnitApplicationTests {
	@Autowired
	private UserService userService; //실제 UserService

	@Autowired
//	@Autowired @Qualifier("lg")
//	@Resource
//	@Resource(name="sony")
	private Device dvc;

	@Test
	void dependencyLoads(){
		dvc.powerOn();
		dvc.powerOff();
		dvc.volumeUp();
		dvc.volumeDown();
	}

	@Test
	void buildTestLoads(){
		User user1 = new User.UserBuilder().uid("admin").upw("1111").build();
		System.out.println(user1);

		User user2 = new User.UserBuilder().uid("hgd").upw("1234").unm("홍길동").build();
		System.out.println(user2);
	}

	@Test
	void contextLoads(){
		//테스트 메소드 실행
		int age = userService.calculateAge(1990);

		System.out.println("age결과값: "+age);

		//junit에서 제공하는 결과 검증 로직
		//assertEquals(32, age); //예상 결과
	}

}
