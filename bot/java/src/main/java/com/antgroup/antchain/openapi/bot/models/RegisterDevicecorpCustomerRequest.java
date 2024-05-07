// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class RegisterDevicecorpCustomerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 项目名称
    @NameInMap("project_name")
    @Validation(required = true)
    public String projectName;

    // 品类code
    @NameInMap("category_code")
    @Validation(required = true)
    public String categoryCode;

    // 企业名称
    @NameInMap("customer_name")
    @Validation(required = true)
    public String customerName;

    // 厂商名称
    @NameInMap("corp_name")
    @Validation(required = true)
    public String corpName;

    // 厂商value
    @NameInMap("corp_value")
    @Validation(required = true)
    public String corpValue;

    public static RegisterDevicecorpCustomerRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterDevicecorpCustomerRequest self = new RegisterDevicecorpCustomerRequest();
        return TeaModel.build(map, self);
    }

    public RegisterDevicecorpCustomerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RegisterDevicecorpCustomerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RegisterDevicecorpCustomerRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public RegisterDevicecorpCustomerRequest setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }
    public String getCategoryCode() {
        return this.categoryCode;
    }

    public RegisterDevicecorpCustomerRequest setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
    public String getCustomerName() {
        return this.customerName;
    }

    public RegisterDevicecorpCustomerRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public RegisterDevicecorpCustomerRequest setCorpValue(String corpValue) {
        this.corpValue = corpValue;
        return this;
    }
    public String getCorpValue() {
        return this.corpValue;
    }

}
