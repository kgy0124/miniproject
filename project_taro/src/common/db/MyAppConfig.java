package common.db;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyAppConfig {
	private static final SqlSession sqlmapper;
	static {
		try {
			String resource = "config/mybatis/sqlMapConfig.xml";
			Reader reader = Resources.getResourceAsReader(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			sqlmapper = sqlSessionFactory.openSession(true);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(
					"Error initializing MyAppConfig class. cause : " + e);
		}
	}
	public static SqlSession getSqlSessionInstance() {
		return sqlmapper;
	}
}
