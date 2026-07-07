// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.resolveservice.models;

import com.aliyun.tea.*;

public class QueryCustomerRepaylinkRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 客户号
    @NameInMap("cust_no")
    @Validation(required = true)
    public String custNo;

    // 模版编号
    @NameInMap("sms_template_no")
    @Validation(required = true)
    public String smsTemplateNo;

    public static QueryCustomerRepaylinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomerRepaylinkRequest self = new QueryCustomerRepaylinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryCustomerRepaylinkRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCustomerRepaylinkRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCustomerRepaylinkRequest setCustNo(String custNo) {
        this.custNo = custNo;
        return this;
    }
    public String getCustNo() {
        return this.custNo;
    }

    public QueryCustomerRepaylinkRequest setSmsTemplateNo(String smsTemplateNo) {
        this.smsTemplateNo = smsTemplateNo;
        return this;
    }
    public String getSmsTemplateNo() {
        return this.smsTemplateNo;
    }

}
