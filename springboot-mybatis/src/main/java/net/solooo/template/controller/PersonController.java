package net.solooo.template.controller;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import net.solooo.template.base.exception.WebException;
import net.solooo.template.base.page.PageResult;
import net.solooo.template.entity.Person;
import net.solooo.template.service.PersonService;

/**
 * Description:
 * Author:Eric
 * Date:17/3/31-031
 */
@RestController
@RequestMapping(value = "/person", produces = {"application/json;charset=utf-8"})
public class PersonController {
	private static final Logger LOG = LoggerFactory.getLogger(PersonController.class);  
	

    @Autowired
    private PersonService personService;

    /**
     * 列表
     * @param name 名称
     * @return List
     */
    @ApiOperation(value="获取用户列表", notes="获取用户列表")
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public List<Person> person(String name) {
        return personService.findAll(name);
    }

    /**
     * 分页
     * @param name 名称
     * @param pageNum 页码
     * @param pageSize 数量
     * @return 分页
     */
    @ApiOperation(value="获取用户分页", notes="")
    @RequestMapping(value = "page", method = RequestMethod.GET)
    public PageResult<Person> findPage(String name,
            @RequestParam(defaultValue = "1") Integer pageNum,
            @RequestParam(defaultValue = "10") Integer pageSize) {
        return personService.findPage(name, pageNum, pageSize);
    }

    /**
     * 新增
     * @param person person
     * @return Person
     */
    @ApiOperation(value="创建用户", notes="根据person对象创建用户")
    @ApiImplicitParam(name = "person", value = "用户详细实体person", required = true, dataType = "Person")
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Person save(Person person) {
        if (StringUtils.isBlank(person.getName())) {
            throw new WebException("name 不可为空");
        }
        return personService.save(person);
    }

    /**
     * 修改
     * @param person Person
     * @return boolean
     */
    @RequestMapping(value = "update", method = RequestMethod.PUT)
    public boolean update(Person person) {
        personService.update(person);
        return true;
    }

    /**
     * 删除
     * @param id id
     * @return boolean
     */
    @RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
    public boolean delete(@PathVariable String id) {
        if (id == null) {
            throw new WebException("ID 不可为空");
        }
        personService.delete(id);
        return true;
    }
    
    /**
     * 获取
     * @param id id
     * @return boolean
     */
    @RequestMapping(value = "get/{id}", method = RequestMethod.GET)
    public Person get(@PathVariable String id) {
        if (id == null) {
            throw new WebException("ID 不可为空");
        }
        return personService.get(id);
    }
    
}
