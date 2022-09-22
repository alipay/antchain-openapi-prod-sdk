// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class FlowCellGroup extends TeaModel {
    // 单元组名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 单元组类型，枚举，GZG、RZG
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 默认GZone，一般为 GZ00
    @NameInMap("default_gzone")
    public String defaultGzone;

    // 单元组是否有效
    @NameInMap("valid")
    @Validation(required = true)
    public Boolean valid;

    // 单元组容灾状态，枚举，NORMAL（正常）、LOCAL（同城容灾）、REMOTE（异地容灾）
    @NameInMap("disaster_state")
    public String disasterState;

    public static FlowCellGroup build(java.util.Map<String, ?> map) throws Exception {
        FlowCellGroup self = new FlowCellGroup();
        return TeaModel.build(map, self);
    }

    public FlowCellGroup setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public FlowCellGroup setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public FlowCellGroup setDefaultGzone(String defaultGzone) {
        this.defaultGzone = defaultGzone;
        return this;
    }
    public String getDefaultGzone() {
        return this.defaultGzone;
    }

    public FlowCellGroup setValid(Boolean valid) {
        this.valid = valid;
        return this;
    }
    public Boolean getValid() {
        return this.valid;
    }

    public FlowCellGroup setDisasterState(String disasterState) {
        this.disasterState = disasterState;
        return this;
    }
    public String getDisasterState() {
        return this.disasterState;
    }

}
