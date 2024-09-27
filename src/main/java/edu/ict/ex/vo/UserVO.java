package edu.ict.ex.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserVO {
	private String username;
	private String password;
	private String enabled;
	
	private List<AuthVO> authList;
	
	private String email = "https://cdn2.ppomppu.co.kr/zboard/data3/2019/0127/m_20190127002243_uqfypznz.jpg";
}
