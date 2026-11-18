// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class StartSignFlowRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单号，须为商户名下短租订单且已建签约单
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 91XXXXXXXXXXXXXXXX9W
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 签约回调地址
    @NameInMap("return_url")
    public String returnUrl;

    // 用户姓名
    @NameInMap("user_name")
    public String userName;

    // 用户手机号
    @NameInMap("user_phone_number")
    public String userPhoneNumber;

    // 证件类型，发起预授权时须为 CRED_PSN_CH_IDCARD
    @NameInMap("user_cert_no_type")
    public String userCertNoType;

    // 证件号，加密落库；发起预授权时与 user_name 一同校验
    @NameInMap("user_cert_no")
    public String userCertNo;

    // 签署的电子合同模板信息，JSONArray格式
    // 
    // 说明：
    // 
    // templateId：配置的模板id
    // 
    // templateArgs：模板配置，其中key=模板文本域中配置的名称
    // 
    // value=需要填充的值
    // 
    // 例如：
    // 
    // 模板f28038577d664015bfc1034c4a125121中的一个文本域字段叫textA，需要替换成“测试值”，则传入
    // 
    // [{"templateId":"f28038577d664015bfc1034c4a125121","templateArgs":{"textA":"测试值"}}]
    @NameInMap("template_list")
    public String templateList;

    public static StartSignFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        StartSignFlowRequest self = new StartSignFlowRequest();
        return TeaModel.build(map, self);
    }

    public StartSignFlowRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartSignFlowRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartSignFlowRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public StartSignFlowRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public StartSignFlowRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public StartSignFlowRequest setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }
    public String getReturnUrl() {
        return this.returnUrl;
    }

    public StartSignFlowRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public StartSignFlowRequest setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
        return this;
    }
    public String getUserPhoneNumber() {
        return this.userPhoneNumber;
    }

    public StartSignFlowRequest setUserCertNoType(String userCertNoType) {
        this.userCertNoType = userCertNoType;
        return this;
    }
    public String getUserCertNoType() {
        return this.userCertNoType;
    }

    public StartSignFlowRequest setUserCertNo(String userCertNo) {
        this.userCertNo = userCertNo;
        return this;
    }
    public String getUserCertNo() {
        return this.userCertNo;
    }

    public StartSignFlowRequest setTemplateList(String templateList) {
        this.templateList = templateList;
        return this;
    }
    public String getTemplateList() {
        return this.templateList;
    }

}
