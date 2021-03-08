// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class GetInternalMasterRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 阿里云PK
    @NameInMap("iaas_id")
    public String iaasId;

    // 主账号ID
    @NameInMap("master_id")
    public String masterId;

    // 来源系统，例如MAYI，ALBABACLOUD
    @NameInMap("source_system")
    public String sourceSystem;

    public static GetInternalMasterRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInternalMasterRequest self = new GetInternalMasterRequest();
        return TeaModel.build(map, self);
    }

    public GetInternalMasterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetInternalMasterRequest setIaasId(String iaasId) {
        this.iaasId = iaasId;
        return this;
    }
    public String getIaasId() {
        return this.iaasId;
    }

    public GetInternalMasterRequest setMasterId(String masterId) {
        this.masterId = masterId;
        return this;
    }
    public String getMasterId() {
        return this.masterId;
    }

    public GetInternalMasterRequest setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
        return this;
    }
    public String getSourceSystem() {
        return this.sourceSystem;
    }

}
