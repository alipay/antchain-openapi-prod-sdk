// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class DownloadContractDocumentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 流程ID
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    public static DownloadContractDocumentRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadContractDocumentRequest self = new DownloadContractDocumentRequest();
        return TeaModel.build(map, self);
    }

    public DownloadContractDocumentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DownloadContractDocumentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DownloadContractDocumentRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

}
