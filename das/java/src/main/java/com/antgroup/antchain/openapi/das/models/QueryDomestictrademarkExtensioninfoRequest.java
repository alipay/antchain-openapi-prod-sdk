// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class QueryDomestictrademarkExtensioninfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据集ID
    @NameInMap("data_set_id")
    @Validation(required = true)
    public String dataSetId;

    // 商标唯一标识号
    @NameInMap("tid")
    @Validation(required = true)
    public String tid;

    public static QueryDomestictrademarkExtensioninfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDomestictrademarkExtensioninfoRequest self = new QueryDomestictrademarkExtensioninfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryDomestictrademarkExtensioninfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDomestictrademarkExtensioninfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDomestictrademarkExtensioninfoRequest setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
        return this;
    }
    public String getDataSetId() {
        return this.dataSetId;
    }

    public QueryDomestictrademarkExtensioninfoRequest setTid(String tid) {
        this.tid = tid;
        return this;
    }
    public String getTid() {
        return this.tid;
    }

}
