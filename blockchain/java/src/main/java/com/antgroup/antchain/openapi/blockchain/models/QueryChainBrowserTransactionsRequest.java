// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryChainBrowserTransactionsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // bizid
    @NameInMap("bizid")
    public String bizid;

    // start
    @NameInMap("start")
    public Long start;

    // end
    @NameInMap("end")
    public Long end;

    // region_id
    @NameInMap("region_id")
    public String regionId;

    public static QueryChainBrowserTransactionsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryChainBrowserTransactionsRequest self = new QueryChainBrowserTransactionsRequest();
        return TeaModel.build(map, self);
    }

    public QueryChainBrowserTransactionsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryChainBrowserTransactionsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryChainBrowserTransactionsRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public QueryChainBrowserTransactionsRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public QueryChainBrowserTransactionsRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public QueryChainBrowserTransactionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
