package com.xuecheng.framework.domain.ucenter;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
* @name: XcCompanyUser
*
* @description: 用户和公司关系的数据模型
*
* @author: Yifan Zheng
*
* @Date: 2020/3/20
*
* @Version：1.0
**/
@Data
@ToString
@Entity
@Table(name="xc_company_user")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class XcCompanyUser implements Serializable {
    private static final long serialVersionUID = -916357110051689786L;
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(length = 32)
    private String id;
    @Column(name="company_id")
    private String companyId;
    @Column(name="user_id")
    private String userId;


}
