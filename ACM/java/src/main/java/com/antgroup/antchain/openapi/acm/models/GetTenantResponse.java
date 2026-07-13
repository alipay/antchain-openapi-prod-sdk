// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class GetTenantResponse extends TeaModel {
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
    @NameInMap("ant_account")
    @Validation(required = true)
    public String antAccount;

    // 用户ID
    @NameInMap("ant_uid")
    public String antUid;

    // 金融云官网:ANTCLOUD,蚂蚁开放平台：ANTOPEN
    @NameInMap("business_owner_id")
    @Validation(required = true)
    public String businessOwnerId;

    // 租户创建时间，ISO8601格式
    @NameInMap("create_time")
    public String createTime;

    // 租户所在的企业的唯一标识
    @NameInMap("customer")
    public String customer;

    // 租户描述信息
    @NameInMap("description")
    public String description;

    // 租户唯一标识
    @NameInMap("id")
    public String id;

    // 租户内部id
    @NameInMap("internal_id")
    public String internalId;

    // 用户CODE
    @NameInMap("name")
    public String name;

    // 租户最近一次修改时间，ISO8601格式
    @NameInMap("update_time")
    public String updateTime;

    public static GetTenantResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTenantResponse self = new GetTenantResponse();
        return TeaModel.build(map, self);
    }

    public GetTenantResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetTenantResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetTenantResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetTenantResponse setAntAccount(String antAccount) {
        this.antAccount = antAccount;
        return this;
    }
    public String getAntAccount() {
        return this.antAccount;
    }

    public GetTenantResponse setAntUid(String antUid) {
        this.antUid = antUid;
        return this;
    }
    public String getAntUid() {
        return this.antUid;
    }

    public GetTenantResponse setBusinessOwnerId(String businessOwnerId) {
        this.businessOwnerId = businessOwnerId;
        return this;
    }
    public String getBusinessOwnerId() {
        return this.businessOwnerId;
    }

    public GetTenantResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetTenantResponse setCustomer(String customer) {
        this.customer = customer;
        return this;
    }
    public String getCustomer() {
        return this.customer;
    }

    public GetTenantResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetTenantResponse setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetTenantResponse setInternalId(String internalId) {
        this.internalId = internalId;
        return this;
    }
    public String getInternalId() {
        return this.internalId;
    }

    public GetTenantResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetTenantResponse setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
