// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class ExecAuthuseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 被授权租户身份ID：
    // 
    // 身份证号/统一社会组织机构信用码
    // 
    // 
    @NameInMap("authorized_identity")
    @Validation(required = true)
    public String authorizedIdentity;

    // 分配code
    // 
    // 
    @NameInMap("authorized_platform_identity")
    @Validation(required = true)
    public String authorizedPlatformIdentity;

    // 授权租户身份ID：
    // 身份证号/统一社会组织机构信用码
    @NameInMap("data_owner_identity")
    @Validation(required = true)
    public String dataOwnerIdentity;

    // 扩展字段
    // 
    // 
    @NameInMap("extend_params")
    @Validation(required = true)
    public String extendParams;

    // 请求流水号
    // 
    // 幂等标示
    // 
    // 
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 标的物
    // 
    // 
    @NameInMap("target_code")
    @Validation(required = true)
    public String targetCode;

    public static ExecAuthuseRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecAuthuseRequest self = new ExecAuthuseRequest();
        return TeaModel.build(map, self);
    }

    public ExecAuthuseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecAuthuseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecAuthuseRequest setAuthorizedIdentity(String authorizedIdentity) {
        this.authorizedIdentity = authorizedIdentity;
        return this;
    }
    public String getAuthorizedIdentity() {
        return this.authorizedIdentity;
    }

    public ExecAuthuseRequest setAuthorizedPlatformIdentity(String authorizedPlatformIdentity) {
        this.authorizedPlatformIdentity = authorizedPlatformIdentity;
        return this;
    }
    public String getAuthorizedPlatformIdentity() {
        return this.authorizedPlatformIdentity;
    }

    public ExecAuthuseRequest setDataOwnerIdentity(String dataOwnerIdentity) {
        this.dataOwnerIdentity = dataOwnerIdentity;
        return this;
    }
    public String getDataOwnerIdentity() {
        return this.dataOwnerIdentity;
    }

    public ExecAuthuseRequest setExtendParams(String extendParams) {
        this.extendParams = extendParams;
        return this;
    }
    public String getExtendParams() {
        return this.extendParams;
    }

    public ExecAuthuseRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecAuthuseRequest setTargetCode(String targetCode) {
        this.targetCode = targetCode;
        return this;
    }
    public String getTargetCode() {
        return this.targetCode;
    }

}
