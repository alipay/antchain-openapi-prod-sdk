// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRbbGeneralRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 额外参数json
    @NameInMap("extension")
    public String extension;

    // 通用查询名称
    @NameInMap("queryname")
    @Validation(required = true, maxLength = 200, minLength = 2)
    public String queryname;

    // 查询参数JSON字符串
    @NameInMap("queryparas")
    public String queryparas;

    public static QueryRbbGeneralRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRbbGeneralRequest self = new QueryRbbGeneralRequest();
        return TeaModel.build(map, self);
    }

    public QueryRbbGeneralRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRbbGeneralRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRbbGeneralRequest setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public QueryRbbGeneralRequest setQueryname(String queryname) {
        this.queryname = queryname;
        return this;
    }
    public String getQueryname() {
        return this.queryname;
    }

    public QueryRbbGeneralRequest setQueryparas(String queryparas) {
        this.queryparas = queryparas;
        return this;
    }
    public String getQueryparas() {
        return this.queryparas;
    }

}
