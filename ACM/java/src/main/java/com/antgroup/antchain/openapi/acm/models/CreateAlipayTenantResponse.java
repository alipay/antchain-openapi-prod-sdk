// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class CreateAlipayTenantResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 数科租户id
    @NameInMap("tenant_id")
    public String tenantId;

    // 租户名称（code），八位大写字母
    @NameInMap("tenant_name")
    public String tenantName;

    // 蚂蚁通行证签约账户
    @NameInMap("login_name")
    public String loginName;

    // 客户id
    @NameInMap("customer_id")
    public String customerId;

    // 租户描述信息
    @NameInMap("description")
    public String description;

    // 用户类型
    @NameInMap("user_type")
    public String userType;

    // 租户的类型 N 支付宝 Q支付宝开放平台 V 蚂蚁链账号
    @NameInMap("tenant_level")
    public String tenantLevel;

    // 证件类型
    @NameInMap("cert_type")
    public String certType;

    // 证件号码
    @NameInMap("cert_no")
    public String certNo;

    // 法人姓名，个人账号时是个人姓名
    @NameInMap("real_name")
    public String realName;

    // 企业姓名
    @NameInMap("firm_name")
    public String firmName;

    // 租户创建时间，ISO8601格式
    @NameInMap("create_time")
    public String createTime;

    // 租户最近一次修改时间，ISO8601格式
    @NameInMap("update_time")
    public String updateTime;

    public static CreateAlipayTenantResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAlipayTenantResponse self = new CreateAlipayTenantResponse();
        return TeaModel.build(map, self);
    }

    public CreateAlipayTenantResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateAlipayTenantResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateAlipayTenantResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateAlipayTenantResponse setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateAlipayTenantResponse setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public CreateAlipayTenantResponse setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public CreateAlipayTenantResponse setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public CreateAlipayTenantResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAlipayTenantResponse setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public CreateAlipayTenantResponse setTenantLevel(String tenantLevel) {
        this.tenantLevel = tenantLevel;
        return this;
    }
    public String getTenantLevel() {
        return this.tenantLevel;
    }

    public CreateAlipayTenantResponse setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public CreateAlipayTenantResponse setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CreateAlipayTenantResponse setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public CreateAlipayTenantResponse setFirmName(String firmName) {
        this.firmName = firmName;
        return this;
    }
    public String getFirmName() {
        return this.firmName;
    }

    public CreateAlipayTenantResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public CreateAlipayTenantResponse setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
