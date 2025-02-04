package com.xuecheng.manage_cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xuecheng.api.cms.CmsConfigControllerApi;
import com.xuecheng.framework.domain.cms.CmsConfig;
import com.xuecheng.manage_cms.service.PageService;

@RestController
@RequestMapping("/cms/config")
public class CmsConfigController implements CmsConfigControllerApi{

	@Autowired
	private PageService pageService;
	
	@Override
	@GetMapping("/getmodel/{id}")
	public CmsConfig getmodel(@PathVariable("id") String id) {
		return pageService.getConfigById(id);
	}

}
