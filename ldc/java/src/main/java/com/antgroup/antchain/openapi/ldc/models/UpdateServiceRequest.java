// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UpdateServiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // cluster name to apply a service
    @NameInMap("cluster_name")
    @Validation(required = true)
    public String clusterName;

    // a string service yaml
    @NameInMap("raw_template")
    @Validation(required = true)
    public String rawTemplate;

    // xxx
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    public static UpdateServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceRequest self = new UpdateServiceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateServiceRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public UpdateServiceRequest setRawTemplate(String rawTemplate) {
        this.rawTemplate = rawTemplate;
        return this;
    }
    public String getRawTemplate() {
        return this.rawTemplate;
    }

    public UpdateServiceRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
