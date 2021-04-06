// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class GetMasterTenantResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 蚂蚁通行证签约账户
    @NameInMap("login_name")
    public String loginName;

    // 租户id
    @NameInMap("tenant_id")
    public String tenantId;

    // 租户创建时间，ISO8601格式	
    @NameInMap("create_time")
    public String createTime;

    // 客户id
    @NameInMap("customer_id")
    public String customerId;

    // 租户描述信息	
    @NameInMap("description")
    public String description;

    // 租户名称
    @NameInMap("name")
    public String name;

    // 租户最近一次修改时间，ISO8601格式	
    @NameInMap("update_time")
    public String updateTime;

    // 用户类型
    @NameInMap("user_type")
    public String userType;

    public static GetMasterTenantResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMasterTenantResponse self = new GetMasterTenantResponse();
        return TeaModel.build(map, self);
    }

    public GetMasterTenantResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetMasterTenantResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetMasterTenantResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetMasterTenantResponse setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public GetMasterTenantResponse setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetMasterTenantResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetMasterTenantResponse setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public GetMasterTenantResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetMasterTenantResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetMasterTenantResponse setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public GetMasterTenantResponse setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
