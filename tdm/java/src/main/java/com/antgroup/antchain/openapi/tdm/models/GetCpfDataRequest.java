// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class GetCpfDataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 端ID
    @NameInMap("terminal_identity")
    public String terminalIdentity;

    // 业务流水号
    @NameInMap("biz_id")
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

    // 用户ID
    @NameInMap("data_owner_identity")
    @Validation(required = true)
    public String dataOwnerIdentity;

    // 用户姓名
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

    // 扩展字段。
    @NameInMap("extend_params")
    public String extendParams;

    // 用数请求签名信息
    @NameInMap("req_sign")
    public CpfDataUseReqSign reqSign;

    public static GetCpfDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCpfDataRequest self = new GetCpfDataRequest();
        return TeaModel.build(map, self);
    }

    public GetCpfDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetCpfDataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetCpfDataRequest setTerminalIdentity(String terminalIdentity) {
        this.terminalIdentity = terminalIdentity;
        return this;
    }
    public String getTerminalIdentity() {
        return this.terminalIdentity;
    }

    public GetCpfDataRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public GetCpfDataRequest setDataUserIdentity(String dataUserIdentity) {
        this.dataUserIdentity = dataUserIdentity;
        return this;
    }
    public String getDataUserIdentity() {
        return this.dataUserIdentity;
    }

    public GetCpfDataRequest setDataUserName(String dataUserName) {
        this.dataUserName = dataUserName;
        return this;
    }
    public String getDataUserName() {
        return this.dataUserName;
    }

    public GetCpfDataRequest setDataOwnerIdentityType(String dataOwnerIdentityType) {
        this.dataOwnerIdentityType = dataOwnerIdentityType;
        return this;
    }
    public String getDataOwnerIdentityType() {
        return this.dataOwnerIdentityType;
    }

    public GetCpfDataRequest setDataOwnerIdentity(String dataOwnerIdentity) {
        this.dataOwnerIdentity = dataOwnerIdentity;
        return this;
    }
    public String getDataOwnerIdentity() {
        return this.dataOwnerIdentity;
    }

    public GetCpfDataRequest setDataOwnerName(String dataOwnerName) {
        this.dataOwnerName = dataOwnerName;
        return this;
    }
    public String getDataOwnerName() {
        return this.dataOwnerName;
    }

    public GetCpfDataRequest setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

    public GetCpfDataRequest setDataCode(String dataCode) {
        this.dataCode = dataCode;
        return this;
    }
    public String getDataCode() {
        return this.dataCode;
    }

    public GetCpfDataRequest setTargetCode(String targetCode) {
        this.targetCode = targetCode;
        return this;
    }
    public String getTargetCode() {
        return this.targetCode;
    }

    public GetCpfDataRequest setExtendParams(String extendParams) {
        this.extendParams = extendParams;
        return this;
    }
    public String getExtendParams() {
        return this.extendParams;
    }

    public GetCpfDataRequest setReqSign(CpfDataUseReqSign reqSign) {
        this.reqSign = reqSign;
        return this;
    }
    public CpfDataUseReqSign getReqSign() {
        return this.reqSign;
    }

}
