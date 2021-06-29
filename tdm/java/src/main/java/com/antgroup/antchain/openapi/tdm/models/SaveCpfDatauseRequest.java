// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class SaveCpfDatauseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 端ID
    @NameInMap("terminal_identity")
    @Validation(required = true)
    public String terminalIdentity;

    // 业务流水号
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 使用方ID
    @NameInMap("data_user_identity")
    @Validation(required = true)
    public String dataUserIdentity;

    // 使用方名称
    @NameInMap("data_user_name")
    @Validation(required = true)
    public String dataUserName;

    // 证件类型
    @NameInMap("data_owner_identity_type")
    @Validation(required = true)
    public String dataOwnerIdentityType;

    // 数据拥有方ID
    @NameInMap("data_owner_identity")
    @Validation(required = true)
    public String dataOwnerIdentity;

    // 数据拥有方名称
    @NameInMap("data_owner_name")
    @Validation(required = true)
    public String dataOwnerName;

    // 数据源ID
    @NameInMap("provider_id")
    @Validation(required = true)
    public String providerId;

    // 数据项code
    @NameInMap("data_code")
    @Validation(required = true)
    public String dataCode;

    // 授权码
    @NameInMap("target_code")
    @Validation(required = true)
    public String targetCode;

    // 存证数据hash
    @NameInMap("data_hash")
    @Validation(required = true)
    public String dataHash;

    // 扩展字段
    @NameInMap("extend_params")
    public String extendParams;

    public static SaveCpfDatauseRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveCpfDatauseRequest self = new SaveCpfDatauseRequest();
        return TeaModel.build(map, self);
    }

    public SaveCpfDatauseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveCpfDatauseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveCpfDatauseRequest setTerminalIdentity(String terminalIdentity) {
        this.terminalIdentity = terminalIdentity;
        return this;
    }
    public String getTerminalIdentity() {
        return this.terminalIdentity;
    }

    public SaveCpfDatauseRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SaveCpfDatauseRequest setDataUserIdentity(String dataUserIdentity) {
        this.dataUserIdentity = dataUserIdentity;
        return this;
    }
    public String getDataUserIdentity() {
        return this.dataUserIdentity;
    }

    public SaveCpfDatauseRequest setDataUserName(String dataUserName) {
        this.dataUserName = dataUserName;
        return this;
    }
    public String getDataUserName() {
        return this.dataUserName;
    }

    public SaveCpfDatauseRequest setDataOwnerIdentityType(String dataOwnerIdentityType) {
        this.dataOwnerIdentityType = dataOwnerIdentityType;
        return this;
    }
    public String getDataOwnerIdentityType() {
        return this.dataOwnerIdentityType;
    }

    public SaveCpfDatauseRequest setDataOwnerIdentity(String dataOwnerIdentity) {
        this.dataOwnerIdentity = dataOwnerIdentity;
        return this;
    }
    public String getDataOwnerIdentity() {
        return this.dataOwnerIdentity;
    }

    public SaveCpfDatauseRequest setDataOwnerName(String dataOwnerName) {
        this.dataOwnerName = dataOwnerName;
        return this;
    }
    public String getDataOwnerName() {
        return this.dataOwnerName;
    }

    public SaveCpfDatauseRequest setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

    public SaveCpfDatauseRequest setDataCode(String dataCode) {
        this.dataCode = dataCode;
        return this;
    }
    public String getDataCode() {
        return this.dataCode;
    }

    public SaveCpfDatauseRequest setTargetCode(String targetCode) {
        this.targetCode = targetCode;
        return this;
    }
    public String getTargetCode() {
        return this.targetCode;
    }

    public SaveCpfDatauseRequest setDataHash(String dataHash) {
        this.dataHash = dataHash;
        return this;
    }
    public String getDataHash() {
        return this.dataHash;
    }

    public SaveCpfDatauseRequest setExtendParams(String extendParams) {
        this.extendParams = extendParams;
        return this;
    }
    public String getExtendParams() {
        return this.extendParams;
    }

}
