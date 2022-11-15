// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class QueryApplicationIpeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据集id，开发者提供
    @NameInMap("data_set_id")
    @Validation(required = true)
    public String dataSetId;

    // 企业信息
    @NameInMap("index")
    @Validation(required = true)
    public String index;

    public static QueryApplicationIpeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApplicationIpeRequest self = new QueryApplicationIpeRequest();
        return TeaModel.build(map, self);
    }

    public QueryApplicationIpeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryApplicationIpeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryApplicationIpeRequest setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
        return this;
    }
    public String getDataSetId() {
        return this.dataSetId;
    }

    public QueryApplicationIpeRequest setIndex(String index) {
        this.index = index;
        return this;
    }
    public String getIndex() {
        return this.index;
    }

}
