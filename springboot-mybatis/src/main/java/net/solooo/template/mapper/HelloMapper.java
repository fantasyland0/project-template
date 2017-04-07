package net.solooo.template.mapper;

import net.solooo.template.entity.Hello;
import net.solooo.template.entity.HelloExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HelloMapper {

    /** 
     * This method was generated by MyBatis Generator. This method corresponds to the database table hello
     * @mbggenerated
     */
    int countByExample(HelloExample example);

    /** 
     * This method was generated by MyBatis Generator. This method corresponds to the database table hello
     * @mbggenerated
     */
    int deleteByExample(HelloExample example);

    /** 
     * This method was generated by MyBatis Generator. This method corresponds to the database table hello
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /** 
     * This method was generated by MyBatis Generator. This method corresponds to the database table hello
     * @mbggenerated
     */
    int insert(Hello record);

    /** 
     * This method was generated by MyBatis Generator. This method corresponds to the database table hello
     * @mbggenerated
     */
    int insertSelective(Hello record);

    /** 
     * This method was generated by MyBatis Generator. This method corresponds to the database table hello
     * @mbggenerated
     */
    List<Hello> selectByExample(HelloExample example);

    /** 
     * This method was generated by MyBatis Generator. This method corresponds to the database table hello
     * @mbggenerated
     */
    Hello selectByPrimaryKey(Integer id);

    /** 
     * This method was generated by MyBatis Generator. This method corresponds to the database table hello
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Hello record, @Param("example") HelloExample example);

    /** 
     * This method was generated by MyBatis Generator. This method corresponds to the database table hello
     * @mbggenerated
     */
    int updateByExample(@Param("record") Hello record, @Param("example") HelloExample example);

    /** 
     * This method was generated by MyBatis Generator. This method corresponds to the database table hello
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Hello record);

    /** 
     * This method was generated by MyBatis Generator. This method corresponds to the database table hello
     * @mbggenerated
     */
    int updateByPrimaryKey(Hello record);
}