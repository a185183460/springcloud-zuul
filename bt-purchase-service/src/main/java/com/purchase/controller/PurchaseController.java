package com.purchase.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PurchaseController {
	@RequestMapping("/getList")
	public List<String> getList(){
		List<String> resultList = new ArrayList<String>();
		resultList.add("liming");
		resultList.add("zhangsan");
		return resultList;
	}
}
