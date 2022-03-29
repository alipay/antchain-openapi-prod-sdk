// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QueueRouteEditionDTO extends TeaModel {
    // 版本
    @NameInMap("edition")
    @Validation(required = true)
    public String edition;

    // 路由版本（插入时可不填）
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 路由规则id（插入时可不填）
    @NameInMap("route_id")
    @Validation(required = true)
    public Long routeId;

    // 权重
    @NameInMap("scale")
    @Validation(required = true)
    public Long scale;

    public static QueueRouteEditionDTO build(java.util.Map<String, ?> map) throws Exception {
        QueueRouteEditionDTO self = new QueueRouteEditionDTO();
        return TeaModel.build(map, self);
    }

    public QueueRouteEditionDTO setEdition(String edition) {
        this.edition = edition;
        return this;
    }
    public String getEdition() {
        return this.edition;
    }

    public QueueRouteEditionDTO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueueRouteEditionDTO setRouteId(Long routeId) {
        this.routeId = routeId;
        return this;
    }
    public Long getRouteId() {
        return this.routeId;
    }

    public QueueRouteEditionDTO setScale(Long scale) {
        this.scale = scale;
        return this;
    }
    public Long getScale() {
        return this.scale;
    }

}
