// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryQmpOfflinehostplanDecisionresultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 文件上传时返回的导入id
    @NameInMap("import_id")
    @Validation(required = true)
    public Long importId;

    public static QueryQmpOfflinehostplanDecisionresultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryQmpOfflinehostplanDecisionresultRequest self = new QueryQmpOfflinehostplanDecisionresultRequest();
        return TeaModel.build(map, self);
    }

    public QueryQmpOfflinehostplanDecisionresultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryQmpOfflinehostplanDecisionresultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryQmpOfflinehostplanDecisionresultRequest setImportId(Long importId) {
        this.importId = importId;
        return this;
    }
    public Long getImportId() {
        return this.importId;
    }

}
