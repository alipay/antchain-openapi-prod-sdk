// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class QueryPdcpDtraceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 存证数据类型名称
    @NameInMap("data_type")
    @Validation(required = true)
    public String dataType;

    // 存证数据ID
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    public static QueryPdcpDtraceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPdcpDtraceRequest self = new QueryPdcpDtraceRequest();
        return TeaModel.build(map, self);
    }

    public QueryPdcpDtraceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryPdcpDtraceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryPdcpDtraceRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public QueryPdcpDtraceRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

}
