// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryCollectorJtmediaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 异常事件ID，由告警事件标识生成，在blockchain.bot.collector.jtflux.query接口中可获取
    @NameInMap("alarm_event_id")
    @Validation(required = true)
    public String alarmEventId;

    // 异常事件媒体文件ID列表
    @NameInMap("media_id_list")
    public java.util.List<String> mediaIdList;

    public static QueryCollectorJtmediaRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCollectorJtmediaRequest self = new QueryCollectorJtmediaRequest();
        return TeaModel.build(map, self);
    }

    public QueryCollectorJtmediaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCollectorJtmediaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCollectorJtmediaRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public QueryCollectorJtmediaRequest setAlarmEventId(String alarmEventId) {
        this.alarmEventId = alarmEventId;
        return this;
    }
    public String getAlarmEventId() {
        return this.alarmEventId;
    }

    public QueryCollectorJtmediaRequest setMediaIdList(java.util.List<String> mediaIdList) {
        this.mediaIdList = mediaIdList;
        return this;
    }
    public java.util.List<String> getMediaIdList() {
        return this.mediaIdList;
    }

}
