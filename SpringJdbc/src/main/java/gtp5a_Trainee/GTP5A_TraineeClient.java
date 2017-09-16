package gtp5a_Trainee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GTP5A_TraineeClient {

	public static void main(String[] args) {
		ApplicationContext contextObj = new ClassPathXmlApplicationContext("Gtp5a_Trainee.xml");
		Object object  = contextObj.getBean("gtp5aObj");
		GTP5A_TraineeDao gtp5a_TraineeDaoObj = (GTP5A_TraineeDao) object;
		
		gtp5a_TraineeDaoObj.insertGtp5a();
	//	gtp5a_TraineeDaoObj.updateGtp5a();
	//	gtp5a_TraineeDaoObj.deleteGtp5a();
	//	GTP5A_Trainee gtp5a_trainee = new GTP5A_Trainee(13,"satwik123",26,"masters","civil");
	//	gtp5a_TraineeDaoObj.insertGtp5aPrepared(gtp5a_trainee);
		

	}

}
