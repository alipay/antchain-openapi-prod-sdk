// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ElasticSubRuleView extends TeaModel {
    // 弹性子规则ID
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 所属APP
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 关联的弹性规则ID
    @NameInMap("elastic_rule_id")
    @Validation(required = true)
    public Long elasticRuleId;

    // 父节点
    @NameInMap("parent_id")
    public Long parentId;

    // 值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    // 是否使用默认eid，默认 false
    @NameInMap("use_default_eid")
    public Boolean useDefaultEid;

    // 状态，有效值：VALID（线上生效），PRESS（仅压测生效），INVALID（无效状态）
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 规则类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 场景ID
    @NameInMap("scene_id")
    @Validation(required = true)
    public Long sceneId;

    public static ElasticSubRuleView build(java.util.Map<String, ?> map) throws Exception {
        ElasticSubRuleView self = new ElasticSubRuleView();
        return TeaModel.build(map, self);
    }

    public ElasticSubRuleView setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ElasticSubRuleView setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ElasticSubRuleView setElasticRuleId(Long elasticRuleId) {
        this.elasticRuleId = elasticRuleId;
        return this;
    }
    public Long getElasticRuleId() {
        return this.elasticRuleId;
    }

    public ElasticSubRuleView setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

    public ElasticSubRuleView setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public ElasticSubRuleView setUseDefaultEid(Boolean useDefaultEid) {
        this.useDefaultEid = useDefaultEid;
        return this;
    }
    public Boolean getUseDefaultEid() {
        return this.useDefaultEid;
    }

    public ElasticSubRuleView setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ElasticSubRuleView setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ElasticSubRuleView setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

}
