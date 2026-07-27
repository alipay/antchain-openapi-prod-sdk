// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.friskdescion.models;

import com.aliyun.tea.*;

public class QueryRiskplusTdiaiworkshopcloudBatchRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商品码（事件码）蚂蚁侧提供
    @NameInMap("event_code")
    @Validation(required = true)
    public String eventCode;

    // 产品code
    @NameInMap("disp_model_code")
    @Validation(required = true)
    public String dispModelCode;

    // 要查询的dataIdList
    @NameInMap("query_data_id_list")
    @Validation(required = true)
    public java.util.List<String> queryDataIdList;

    public static QueryRiskplusTdiaiworkshopcloudBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRiskplusTdiaiworkshopcloudBatchRequest self = new QueryRiskplusTdiaiworkshopcloudBatchRequest();
        return TeaModel.build(map, self);
    }

    public QueryRiskplusTdiaiworkshopcloudBatchRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRiskplusTdiaiworkshopcloudBatchRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRiskplusTdiaiworkshopcloudBatchRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public QueryRiskplusTdiaiworkshopcloudBatchRequest setDispModelCode(String dispModelCode) {
        this.dispModelCode = dispModelCode;
        return this;
    }
    public String getDispModelCode() {
        return this.dispModelCode;
    }

    public QueryRiskplusTdiaiworkshopcloudBatchRequest setQueryDataIdList(java.util.List<String> queryDataIdList) {
        this.queryDataIdList = queryDataIdList;
        return this;
    }
    public java.util.List<String> getQueryDataIdList() {
        return this.queryDataIdList;
    }

}
