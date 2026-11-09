// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sds.models;

import com.aliyun.tea.*;

public class QueryScenedataOnlineRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务号，根据biz_no_type修改类型
    @NameInMap("biz_no")
    @Validation(required = true, maxLength = 256)
    public String bizNo;

    // 业务号类型
    @NameInMap("biz_no_type")
    @Validation(required = true, maxLength = 64)
    public String bizNoType;

    // 场景，根据此参数路由适配到不同数据源
    @NameInMap("scene")
    @Validation(required = true, maxLength = 32)
    public String scene;

    // 来源标识
    @NameInMap("source_mark")
    @Validation(maxLength = 32)
    public String sourceMark;

    // 条件，目前只支持IN的逻辑
    @NameInMap("condition")
    public BizNoCondition condition;

    public static QueryScenedataOnlineRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryScenedataOnlineRequest self = new QueryScenedataOnlineRequest();
        return TeaModel.build(map, self);
    }

    public QueryScenedataOnlineRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryScenedataOnlineRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryScenedataOnlineRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public QueryScenedataOnlineRequest setBizNoType(String bizNoType) {
        this.bizNoType = bizNoType;
        return this;
    }
    public String getBizNoType() {
        return this.bizNoType;
    }

    public QueryScenedataOnlineRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public QueryScenedataOnlineRequest setSourceMark(String sourceMark) {
        this.sourceMark = sourceMark;
        return this;
    }
    public String getSourceMark() {
        return this.sourceMark;
    }

    public QueryScenedataOnlineRequest setCondition(BizNoCondition condition) {
        this.condition = condition;
        return this;
    }
    public BizNoCondition getCondition() {
        return this.condition;
    }

}
