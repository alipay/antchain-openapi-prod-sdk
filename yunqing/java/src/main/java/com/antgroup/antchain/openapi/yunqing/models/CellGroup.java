// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class CellGroup extends TeaModel {
    // cellGroup的id
    @NameInMap("cell_group_id")
    @Validation(required = true)
    public String cellGroupId;

    // 默认gzone cell的id
    @NameInMap("default_gzone")
    public String defaultGzone;

    // 是否弹性
    @NameInMap("elastic")
    public Boolean elastic;

    // cellGroup的名字
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 暂时不知道啥意思
    @NameInMap("normal_drstat")
    public String normalDrstat;

    // 暂时不知道啥意思
    @NameInMap("press_drstat")
    public String pressDrstat;

    // LDC下cellGroup的类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 显示的名字
    @NameInMap("display_name")
    @Validation(required = true)
    public String displayName;

    public static CellGroup build(java.util.Map<String, ?> map) throws Exception {
        CellGroup self = new CellGroup();
        return TeaModel.build(map, self);
    }

    public CellGroup setCellGroupId(String cellGroupId) {
        this.cellGroupId = cellGroupId;
        return this;
    }
    public String getCellGroupId() {
        return this.cellGroupId;
    }

    public CellGroup setDefaultGzone(String defaultGzone) {
        this.defaultGzone = defaultGzone;
        return this;
    }
    public String getDefaultGzone() {
        return this.defaultGzone;
    }

    public CellGroup setElastic(Boolean elastic) {
        this.elastic = elastic;
        return this;
    }
    public Boolean getElastic() {
        return this.elastic;
    }

    public CellGroup setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CellGroup setNormalDrstat(String normalDrstat) {
        this.normalDrstat = normalDrstat;
        return this;
    }
    public String getNormalDrstat() {
        return this.normalDrstat;
    }

    public CellGroup setPressDrstat(String pressDrstat) {
        this.pressDrstat = pressDrstat;
        return this;
    }
    public String getPressDrstat() {
        return this.pressDrstat;
    }

    public CellGroup setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CellGroup setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

}
