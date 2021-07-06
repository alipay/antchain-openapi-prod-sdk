// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryContentriskInternalRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 内容业务ID，用于进行异步识别结果的索引查询
    @NameInMap("app_scene_data_id")
    @Validation(required = true)
    public String appSceneDataId;

    // 内部参数
    @NameInMap("biz_info")
    @Validation(required = true)
    public BizInfo bizInfo;

    // 内容检测事件id，根据此id查询异步检测结果
    @NameInMap("event_id")
    public String eventId;

    public static QueryContentriskInternalRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryContentriskInternalRequest self = new QueryContentriskInternalRequest();
        return TeaModel.build(map, self);
    }

    public QueryContentriskInternalRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryContentriskInternalRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryContentriskInternalRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public QueryContentriskInternalRequest setAppSceneDataId(String appSceneDataId) {
        this.appSceneDataId = appSceneDataId;
        return this;
    }
    public String getAppSceneDataId() {
        return this.appSceneDataId;
    }

    public QueryContentriskInternalRequest setBizInfo(BizInfo bizInfo) {
        this.bizInfo = bizInfo;
        return this;
    }
    public BizInfo getBizInfo() {
        return this.bizInfo;
    }

    public QueryContentriskInternalRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

}
