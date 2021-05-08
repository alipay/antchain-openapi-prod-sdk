// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class OpenCpfCertRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 端ID
    @NameInMap("terminal_identity")
    @Validation(required = true)
    public String terminalIdentity;

    // 证明类型
    @NameInMap("issue_cert_type")
    @Validation(required = true)
    public String issueCertType;

    // 公积金中心ID
    @NameInMap("provider_id")
    @Validation(required = true)
    public String providerId;

    // 数据拥有者ID（身份证ID）
    @NameInMap("data_owner_identity")
    @Validation(required = true)
    public String dataOwnerIdentity;

    // 数据拥有者姓名（真实姓名）
    @NameInMap("data_owner_name")
    @Validation(required = true)
    public String dataOwnerName;

    // 请求结构体序列化
    @NameInMap("extend_params")
    public String extendParams;

    public static OpenCpfCertRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenCpfCertRequest self = new OpenCpfCertRequest();
        return TeaModel.build(map, self);
    }

    public OpenCpfCertRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OpenCpfCertRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OpenCpfCertRequest setTerminalIdentity(String terminalIdentity) {
        this.terminalIdentity = terminalIdentity;
        return this;
    }
    public String getTerminalIdentity() {
        return this.terminalIdentity;
    }

    public OpenCpfCertRequest setIssueCertType(String issueCertType) {
        this.issueCertType = issueCertType;
        return this;
    }
    public String getIssueCertType() {
        return this.issueCertType;
    }

    public OpenCpfCertRequest setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

    public OpenCpfCertRequest setDataOwnerIdentity(String dataOwnerIdentity) {
        this.dataOwnerIdentity = dataOwnerIdentity;
        return this;
    }
    public String getDataOwnerIdentity() {
        return this.dataOwnerIdentity;
    }

    public OpenCpfCertRequest setDataOwnerName(String dataOwnerName) {
        this.dataOwnerName = dataOwnerName;
        return this;
    }
    public String getDataOwnerName() {
        return this.dataOwnerName;
    }

    public OpenCpfCertRequest setExtendParams(String extendParams) {
        this.extendParams = extendParams;
        return this;
    }
    public String getExtendParams() {
        return this.extendParams;
    }

}
