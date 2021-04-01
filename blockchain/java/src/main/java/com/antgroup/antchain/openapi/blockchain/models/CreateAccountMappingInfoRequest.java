// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateAccountMappingInfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 注册地址
    @NameInMap("address")
    public String address;

    // 业务场景code
    @NameInMap("biz_code")
    @Validation(required = true)
    public String bizCode;

    // 业务名称
    @NameInMap("biz_name")
    @Validation(required = true)
    public String bizName;

    // 业务类型，预留
    @NameInMap("biz_type")
    public String bizType;

    // 用户创建时间
    @NameInMap("create_time")
    public String createTime;

    // 用户注销时间
    @NameInMap("end_time")
    public String endTime;

    // 扩展字段，使用json格式
    @NameInMap("extension")
    public String extension;

    // 业务组code
    @NameInMap("group_code")
    @Validation(required = true)
    public String groupCode;

    // 业务组名称
    @NameInMap("group_name")
    @Validation(required = true)
    public String groupName;

    // 唯一标示类型，0:统一信用代码,1:开票机构代码,2:身份证号
    @NameInMap("identity_type")
    public Long identityType;

    // 唯一标示码
    @NameInMap("identity_value")
    public String identityValue;

    // 用户标签
    @NameInMap("label")
    public String label;

    // 间连用户的上层直连用户名称
    @NameInMap("parent")
    public String parent;

    // 统计时间
    @NameInMap("stat_date")
    public String statDate;

    // 用户id
    @NameInMap("user_id")
    public String userId;

    // 用户或企业名称
    @NameInMap("user_name")
    public String userName;

    // 用户类型：direct直连，indirect间连，partner合作伙伴
    @NameInMap("user_type")
    public String userType;

    public static CreateAccountMappingInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAccountMappingInfoRequest self = new CreateAccountMappingInfoRequest();
        return TeaModel.build(map, self);
    }

    public CreateAccountMappingInfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAccountMappingInfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateAccountMappingInfoRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public CreateAccountMappingInfoRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public CreateAccountMappingInfoRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public CreateAccountMappingInfoRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateAccountMappingInfoRequest setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public CreateAccountMappingInfoRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateAccountMappingInfoRequest setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public CreateAccountMappingInfoRequest setGroupCode(String groupCode) {
        this.groupCode = groupCode;
        return this;
    }
    public String getGroupCode() {
        return this.groupCode;
    }

    public CreateAccountMappingInfoRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateAccountMappingInfoRequest setIdentityType(Long identityType) {
        this.identityType = identityType;
        return this;
    }
    public Long getIdentityType() {
        return this.identityType;
    }

    public CreateAccountMappingInfoRequest setIdentityValue(String identityValue) {
        this.identityValue = identityValue;
        return this;
    }
    public String getIdentityValue() {
        return this.identityValue;
    }

    public CreateAccountMappingInfoRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public CreateAccountMappingInfoRequest setParent(String parent) {
        this.parent = parent;
        return this;
    }
    public String getParent() {
        return this.parent;
    }

    public CreateAccountMappingInfoRequest setStatDate(String statDate) {
        this.statDate = statDate;
        return this;
    }
    public String getStatDate() {
        return this.statDate;
    }

    public CreateAccountMappingInfoRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreateAccountMappingInfoRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CreateAccountMappingInfoRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
