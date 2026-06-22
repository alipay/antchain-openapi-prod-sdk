// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.benchtwocreate.models;

import com.aliyun.tea.*;

public class BenchtwocreateStructForA extends TeaModel {
    // 业务类型 枚举
    /**
     * <strong>example:</strong>
     * <p>业务类型</p>
     */
    @NameInMap("product_main_class")
    public String productMainClass;

    // 公司名称
    /**
     * <strong>example:</strong>
     * <p>xx公司</p>
     */
    @NameInMap("company_name")
    public String companyName;

    // 公司别名
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("company_alias_name")
    public String companyAliasName;

    // 公司数科租户id
    /**
     * <strong>example:</strong>
     * <p>ASSDDDAS</p>
     */
    @NameInMap("tenant_id")
    public String tenantId;

    // 公司联系电话
    /**
     * <strong>example:</strong>
     * <p>1231xx2322</p>
     */
    @NameInMap("company_mobile")
    public String companyMobile;

    public static BenchtwocreateStructForA build(java.util.Map<String, ?> map) throws Exception {
        BenchtwocreateStructForA self = new BenchtwocreateStructForA();
        return TeaModel.build(map, self);
    }

    public BenchtwocreateStructForA setProductMainClass(String productMainClass) {
        this.productMainClass = productMainClass;
        return this;
    }
    public String getProductMainClass() {
        return this.productMainClass;
    }

    public BenchtwocreateStructForA setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public BenchtwocreateStructForA setCompanyAliasName(String companyAliasName) {
        this.companyAliasName = companyAliasName;
        return this;
    }
    public String getCompanyAliasName() {
        return this.companyAliasName;
    }

    public BenchtwocreateStructForA setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public BenchtwocreateStructForA setCompanyMobile(String companyMobile) {
        this.companyMobile = companyMobile;
        return this;
    }
    public String getCompanyMobile() {
        return this.companyMobile;
    }

}
