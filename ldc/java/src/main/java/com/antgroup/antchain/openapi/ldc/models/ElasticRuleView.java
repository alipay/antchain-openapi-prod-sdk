// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ElasticRuleView extends TeaModel {
    // ID
    @NameInMap("id")
    public Long id;

    // 弹性类型，有效值：SERVICE，MSGBROKER
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 弹性值
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 关联应用
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 状态，有效值：VALID（线上生效），PRESS（仅压测生效），INVALID（无效状态）
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 操作人
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 场景 ID
    @NameInMap("scene_id")
    @Validation(required = true)
    public Long sceneId;

    public static ElasticRuleView build(java.util.Map<String, ?> map) throws Exception {
        ElasticRuleView self = new ElasticRuleView();
        return TeaModel.build(map, self);
    }

    public ElasticRuleView setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ElasticRuleView setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ElasticRuleView setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ElasticRuleView setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ElasticRuleView setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ElasticRuleView setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public ElasticRuleView setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

}
