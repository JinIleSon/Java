package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/*
 * 날짜 : 2024/07/25
 * 이름 : 손진일
 * 내용 : PreparedStatement 실습하기
 */

public class PreparedSelectTest {

	public static void main(String[] args) {
		
		// DB정보
		String HOST = "jdbc:oracle:thin:@localhost:1521:xe";
		String USER = "thswlsdlf0000";
		String PASS = "1234";
		
		List<User1VO> users = new ArrayList<User1VO>();
		
		try {
			// 데이터베이스 접속
			Connection conn = DriverManager.getConnection(HOST,USER,PASS);
			
			// SQL 실행객체 생성(PreparedStatemet)
			String sql = "SELECT * FROM USER1 WHERE AGE >= ?"; // ?는 쿼리 파라미터. 쿼리 파라미터를 사용한 SQL(준비된 쿼리)
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setInt(1, 20); // 1번째 쿼리 파라미터(?)에 나이 숫자 20 바인딩
			
			// SQL 실행
			ResultSet rs = psmt.executeQuery(); // SELECT executeQuery() 실행!!!
			
			// 결과처리(SELECT문일 경우)
			while(rs.next()) { // 커서를 다음 Row로 이동시킴, 이동할 Row가 없으면 false

				// 커서가 가리키는 Row의 각 컬럼값을 추출해서 VO객체 초기화
				User1VO vo = new User1VO();
				vo.setUser_id(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAge(rs.getInt(4));
				
				// 리스트 삽입
				users.add(vo);
			}
			
			// 데이터베이스 종료
			rs.close();
			psmt.close();
			conn.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		// 리스트 출력
		for(User1VO user : users) {
			System.out.println(user);
		}
		
		System.out.println("Select 완료...");
		
	}
}
