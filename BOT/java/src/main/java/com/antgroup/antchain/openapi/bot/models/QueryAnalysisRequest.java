// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryAnalysisRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 发行设备Id集合
    // 
    // 
    @NameInMap("dis_id_list")
    public java.util.List<String> disIdList;

    // 时间，格式YYYYMMDD
    // 
    // 
    @NameInMap("time")
    @Validation(required = true)
    public String time;

    // 场景码
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // SCENE : 场景设备资产分析   DEVICE：设备分析 BIZ：订单分析   ， 默认为DEVICE
    @NameInMap("scope")
    public String scope;

    public static QueryAnalysisRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAnalysisRequest self = new QueryAnalysisRequest();
        return TeaModel.build(map, self);
    }

    public QueryAnalysisRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAnalysisRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAnalysisRequest setDisIdList(java.util.List<String> disIdList) {
        this.disIdList = disIdList;
        return this;
    }
    public java.util.List<String> getDisIdList() {
        return this.disIdList;
    }

    public QueryAnalysisRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public QueryAnalysisRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public QueryAnalysisRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

}
