package net.solooo.template.service;

import com.github.pagehelper.PageHelper;
import net.solooo.template.base.page.PageResult;
import net.solooo.template.entity.Person;
import net.solooo.template.entity.PersonExample;
import net.solooo.template.entity.Person;
import net.solooo.template.mapper.PersonMapper;
import net.solooo.template.mapper.PersonMapper;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Description:
 * Author:Eric
 * Date:17/3/31-031
 */
@Service
public class PersonService {

    @Autowired
    private PersonMapper personMapper;


    /**
     * 查询所有
     * @param name 名称
     * @return List
     */
    public List<Person> findAll(String name) {
    	PersonExample example = new PersonExample();
        if (StringUtils.isNotBlank(name)) {
            example.createCriteria().andNameLike("%" + name + "%");
        }
        return personMapper.selectByExample(example);
    }

    /**
     * 分页
     * @param name 名称
     * @param pageNum 页码
     * @param PageSize 记录数
     * @return PageInfo
     */
    public PageResult<Person> findPage(String name, Integer pageNum, Integer PageSize) {
        PersonExample example = new PersonExample();
        if (StringUtils.isNotBlank(name)) {
            example.createCriteria().andNameLike("%" + name + "%");
        }
        PageHelper.startPage(pageNum, PageSize);
        List<Person> persons = personMapper.selectByExample(example);
        return new PageResult<>(persons);
    }

    /**
     * 保存
     * @param person Person
     * @return Person
     */
    public Person save(Person person) {
    	person.setId(UUID.randomUUID().toString());
        personMapper.insert(person);
        return person;
    }

    /**
     * 修改
     * @param person Person
     */
    public void update(Person person) {
        personMapper.updateByPrimaryKeySelective(person);
    }

    /**
     * 删除
     * @param id ID
     */
    public void delete(String id) {
        personMapper.deleteByPrimaryKey(id);
    }
    
    /**
     * 获取
     * @param id id
     * @return Person
     */
    public Person get(String id) {
        return  personMapper.selectByPrimaryKey(id);
    }
}
