// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class ExecClusterDnsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 环境id
    @NameInMap("env_id")
    @Validation(required = true)
    public String envId;

    // 产品码
    @NameInMap("prod_code")
    @Validation(required = true)
    public String prodCode;

    // 应用名列表
    @NameInMap("app_names")
    @Validation(required = true)
    public java.util.List<String> appNames;

    // dns域名的绑定/解绑
    @NameInMap("ops_action")
    @Validation(required = true)
    public String opsAction;

    // 需要调用的adns所对应环境。
    // 例如A、B环境，A环境宕机了，此时需要调用B机房的adns进行A机房的环境域名解绑操作。
    // 如果不填，默认与env_id一致。
    @NameInMap("operation_env_id")
    public String operationEnvId;

    public static ExecClusterDnsRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecClusterDnsRequest self = new ExecClusterDnsRequest();
        return TeaModel.build(map, self);
    }

    public ExecClusterDnsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecClusterDnsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecClusterDnsRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public ExecClusterDnsRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public ExecClusterDnsRequest setAppNames(java.util.List<String> appNames) {
        this.appNames = appNames;
        return this;
    }
    public java.util.List<String> getAppNames() {
        return this.appNames;
    }

    public ExecClusterDnsRequest setOpsAction(String opsAction) {
        this.opsAction = opsAction;
        return this;
    }
    public String getOpsAction() {
        return this.opsAction;
    }

    public ExecClusterDnsRequest setOperationEnvId(String operationEnvId) {
        this.operationEnvId = operationEnvId;
        return this;
    }
    public String getOperationEnvId() {
        return this.operationEnvId;
    }

}
