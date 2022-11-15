// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class QueryEncryptEnterpriseinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据集ID
    @NameInMap("data_set_id")
    @Validation(required = true)
    public String dataSetId;

    // 加密的查询参数
    @NameInMap("encrypt_parameters")
    @Validation(required = true)
    public String encryptParameters;

    public static QueryEncryptEnterpriseinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEncryptEnterpriseinfoRequest self = new QueryEncryptEnterpriseinfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryEncryptEnterpriseinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryEncryptEnterpriseinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryEncryptEnterpriseinfoRequest setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
        return this;
    }
    public String getDataSetId() {
        return this.dataSetId;
    }

    public QueryEncryptEnterpriseinfoRequest setEncryptParameters(String encryptParameters) {
        this.encryptParameters = encryptParameters;
        return this;
    }
    public String getEncryptParameters() {
        return this.encryptParameters;
    }

}
