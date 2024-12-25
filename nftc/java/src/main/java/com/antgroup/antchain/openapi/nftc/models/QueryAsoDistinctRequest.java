// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftc.models;

import com.aliyun.tea.*;

public class QueryAsoDistinctRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // App ID
    @NameInMap("appid")
    @Validation(required = true)
    public String appid;

    // 苹果设备的 IDFA
    @NameInMap("idfa")
    @Validation(required = true)
    public String idfa;

    // 渠道标识(默认 qimai )
    @NameInMap("source")
    public String source;

    public static QueryAsoDistinctRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAsoDistinctRequest self = new QueryAsoDistinctRequest();
        return TeaModel.build(map, self);
    }

    public QueryAsoDistinctRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAsoDistinctRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAsoDistinctRequest setAppid(String appid) {
        this.appid = appid;
        return this;
    }
    public String getAppid() {
        return this.appid;
    }

    public QueryAsoDistinctRequest setIdfa(String idfa) {
        this.idfa = idfa;
        return this;
    }
    public String getIdfa() {
        return this.idfa;
    }

    public QueryAsoDistinctRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
