// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryTwevPositionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 智能中控id
    @NameInMap("tuid")
    @Validation(required = true)
    public String tuid;

    // HQS（黑骑士）；ZHMAI（智迈）；MOFAQ（摩法圈）
    @NameInMap("brand")
    @Validation(required = true)
    public String brand;

    // json，扩展预留
    @NameInMap("extern_info")
    public String externInfo;

    public static QueryTwevPositionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTwevPositionRequest self = new QueryTwevPositionRequest();
        return TeaModel.build(map, self);
    }

    public QueryTwevPositionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTwevPositionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryTwevPositionRequest setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public QueryTwevPositionRequest setBrand(String brand) {
        this.brand = brand;
        return this;
    }
    public String getBrand() {
        return this.brand;
    }

    public QueryTwevPositionRequest setExternInfo(String externInfo) {
        this.externInfo = externInfo;
        return this;
    }
    public String getExternInfo() {
        return this.externInfo;
    }

}
