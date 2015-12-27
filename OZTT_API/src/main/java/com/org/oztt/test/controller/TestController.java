package com.org.oztt.test.controller;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.org.oztt.base.constants.Constants;
import com.org.oztt.base.page.PagingResult;
import com.org.oztt.base.respond.JsonResponds;
import com.org.oztt.base.util.MessageUtils;
import com.org.oztt.test.respondDto.RespondPerson;

/**
 * 演示以restful为规则的API结构
 * GET /person：列出所有人
   POST /person：新建一个人
   GET /person/ID：获取某个指定人的信息
   PUT /person/ID：更新某个指定人的信息（提供该人的全部信息）
   PATCH /person/ID：更新某个指定人的信息（提供该人的部分信息）
   DELETE /person/ID：删除某个人
 * @author linliuan
 *
 */
@Controller
@RequestMapping("/person")
public class TestController extends BaseController{

//	@Resource
//	private PersonService personService;
    /**
     * 获取积分记录信息
     * 
     * @param jsonReq
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public JsonResponds getAllPerson() {
        try {
            //这里需要验证数据的完整性和token,API的接口check需要严密
        	//TODO
        	RespondPerson rp = new RespondPerson();
//        	PagingResult<Person> pageResult = personService.getPersons(new HashMap<Object, Object>(), null);
//        	// 这里需要对返回值做处理，
//        	rp.setResDtoList(pageResult.getResultList());
            return rp;
        }
        catch (Exception ex) {
            log.error("meesage", ex);
            return new JsonResponds(Constants.RESULT_ERROR, MessageUtils.getText("err.com.sys.err"));
        }
    }
}
