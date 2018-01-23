package com.example.demo;

import com.example.demo.domain.User;
import com.example.demo.service.UserServie;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private UserServie userService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testGetUser() {
		Long id = new Long(1);
		User user = userService.findById(id);
		Assert.assertEquals(user.getName(),"longmu");
	}

	@Test
	public void testRemoveList(){
		int[] nums = {1,1,2};
		int len = removeDuplicates(nums);
		System.out.println(len);
	}

	public int removeDuplicates(int[] nums) {
		if (nums ==null || nums.length == 0) {
			return 0;
		}
		int index = 1;
		for (int i = 1;i<nums.length;i++){
			if (nums[i] != nums[i-1]) {
				nums[index] = nums[i];
				index++;
			}
		}
		System.out.println(nums.length);
		return index;
	}
}
