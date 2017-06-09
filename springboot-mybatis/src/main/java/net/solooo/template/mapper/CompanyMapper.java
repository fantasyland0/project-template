package net.solooo.template.mapper;

import java.util.List;
import net.solooo.template.entity.Company;
import net.solooo.template.entity.CompanyExample;
import org.apache.ibatis.annotations.Param;

public interface CompanyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMPANY
     *
     * @mbg.generated Fri Jun 09 15:10:38 CST 2017
     */
    long countByExample(CompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMPANY
     *
     * @mbg.generated Fri Jun 09 15:10:38 CST 2017
     */
    int deleteByExample(CompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMPANY
     *
     * @mbg.generated Fri Jun 09 15:10:38 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMPANY
     *
     * @mbg.generated Fri Jun 09 15:10:38 CST 2017
     */
    int insert(Company record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMPANY
     *
     * @mbg.generated Fri Jun 09 15:10:38 CST 2017
     */
    int insertSelective(Company record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMPANY
     *
     * @mbg.generated Fri Jun 09 15:10:38 CST 2017
     */
    List<Company> selectByExample(CompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMPANY
     *
     * @mbg.generated Fri Jun 09 15:10:38 CST 2017
     */
    Company selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMPANY
     *
     * @mbg.generated Fri Jun 09 15:10:38 CST 2017
     */
    int updateByExampleSelective(@Param("record") Company record, @Param("example") CompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMPANY
     *
     * @mbg.generated Fri Jun 09 15:10:38 CST 2017
     */
    int updateByExample(@Param("record") Company record, @Param("example") CompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMPANY
     *
     * @mbg.generated Fri Jun 09 15:10:38 CST 2017
     */
    int updateByPrimaryKeySelective(Company record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMPANY
     *
     * @mbg.generated Fri Jun 09 15:10:38 CST 2017
     */
    int updateByPrimaryKey(Company record);
}