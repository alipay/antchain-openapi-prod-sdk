// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosdk.models;

import com.aliyun.tea.*;

public class DemosdkStructA extends TeaModel {
    // 【公司名称】
    /**
     * <strong>example:</strong>
     * <p>xx公司</p>
     */
    @NameInMap("company_name")
    public String companyName;

    // 【业务类型】
    /**
     * <strong>example:</strong>
     * <p>运营</p>
     */
    @NameInMap("product_main_class")
    public String productMainClass;

    // 【公司地址】
    /**
     * <strong>example:</strong>
     * <p>xx市xx区</p>
     */
    @NameInMap("company_address")
    public String companyAddress;

    // 【联系人】
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("contact_name")
    public String contactName;

    // 【联系人手机号】
    /**
     * <strong>example:</strong>
     * <p>13688888888</p>
     */
    @NameInMap("contact_mobile")
    public String contactMobile;

    public static DemosdkStructA build(java.util.Map<String, ?> map) throws Exception {
        DemosdkStructA self = new DemosdkStructA();
        return TeaModel.build(map, self);
    }

    public DemosdkStructA setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public DemosdkStructA setProductMainClass(String productMainClass) {
        this.productMainClass = productMainClass;
        return this;
    }
    public String getProductMainClass() {
        return this.productMainClass;
    }

    public DemosdkStructA setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
        return this;
    }
    public String getCompanyAddress() {
        return this.companyAddress;
    }

    public DemosdkStructA setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public DemosdkStructA setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
        return this;
    }
    public String getContactMobile() {
        return this.contactMobile;
    }

}
