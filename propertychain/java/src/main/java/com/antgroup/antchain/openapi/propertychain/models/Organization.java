// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class Organization extends TeaModel {
    // 企业编号
    @NameInMap("role_company_no")
    @Validation(required = true)
    public String roleCompanyNo;

    // 企业名称
    @NameInMap("role_company_name")
    @Validation(required = true)
    public String roleCompanyName;

    public static Organization build(java.util.Map<String, ?> map) throws Exception {
        Organization self = new Organization();
        return TeaModel.build(map, self);
    }

    public Organization setRoleCompanyNo(String roleCompanyNo) {
        this.roleCompanyNo = roleCompanyNo;
        return this;
    }
    public String getRoleCompanyNo() {
        return this.roleCompanyNo;
    }

    public Organization setRoleCompanyName(String roleCompanyName) {
        this.roleCompanyName = roleCompanyName;
        return this;
    }
    public String getRoleCompanyName() {
        return this.roleCompanyName;
    }

}
