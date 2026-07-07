// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.resolveservice.models;

import com.aliyun.tea.*;

public class PushCustomerInternalmsgRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 客户号
    @NameInMap("cust_no")
    @Validation(required = true)
    public String custNo;

    // 模版信息
    @NameInMap("template_info")
    @Validation(required = true)
    public String templateInfo;

    public static PushCustomerInternalmsgRequest build(java.util.Map<String, ?> map) throws Exception {
        PushCustomerInternalmsgRequest self = new PushCustomerInternalmsgRequest();
        return TeaModel.build(map, self);
    }

    public PushCustomerInternalmsgRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushCustomerInternalmsgRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushCustomerInternalmsgRequest setCustNo(String custNo) {
        this.custNo = custNo;
        return this;
    }
    public String getCustNo() {
        return this.custNo;
    }

    public PushCustomerInternalmsgRequest setTemplateInfo(String templateInfo) {
        this.templateInfo = templateInfo;
        return this;
    }
    public String getTemplateInfo() {
        return this.templateInfo;
    }

}
