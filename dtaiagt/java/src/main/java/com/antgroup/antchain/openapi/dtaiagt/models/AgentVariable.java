// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class AgentVariable extends TeaModel {
    // 变量对应的id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 变量名称
    /**
     * <strong>example:</strong>
     * <p>变量名称</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 变量code
    /**
     * <strong>example:</strong>
     * <p>变量code</p>
     */
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 变量描述
    /**
     * <strong>example:</strong>
     * <p>变量描述</p>
     */
    @NameInMap("desc")
    @Validation(required = true)
    public String desc;

    // 变量值
    /**
     * <strong>example:</strong>
     * <p>变量值</p>
     */
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    // 变量值更新时间
    /**
     * <strong>example:</strong>
     * <p>updateTime</p>
     */
    @NameInMap("update_time")
    @Validation(required = true)
    public String updateTime;

    // "business", "业务参数"
    // "memory", "记忆参数"
    /**
     * <strong>example:</strong>
     * <p>business</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 是否模型可见
    @NameInMap("show_to_model")
    @Validation(required = true)
    public Boolean showToModel;

    public static AgentVariable build(java.util.Map<String, ?> map) throws Exception {
        AgentVariable self = new AgentVariable();
        return TeaModel.build(map, self);
    }

    public AgentVariable setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public AgentVariable setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AgentVariable setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AgentVariable setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public AgentVariable setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public AgentVariable setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public AgentVariable setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AgentVariable setShowToModel(Boolean showToModel) {
        this.showToModel = showToModel;
        return this;
    }
    public Boolean getShowToModel() {
        return this.showToModel;
    }

}
