// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cafecmdb.models;

import com.aliyun.tea.*;

public class ModelCategory extends TeaModel {
    // 唯一标识（全局唯一）
    @NameInMap("unique_id")
    @Validation(required = true)
    public String uniqueId;

    // 名称（全局唯一）
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 是否为系统内置
    @NameInMap("system")
    @Validation(required = true)
    public Boolean system;

    // 创建时间
    @NameInMap("created_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createdTime;

    // 修改时间
    @NameInMap("modified_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String modifiedTime;

    // icon
    @NameInMap("icon")
    public String icon;

    public static ModelCategory build(java.util.Map<String, ?> map) throws Exception {
        ModelCategory self = new ModelCategory();
        return TeaModel.build(map, self);
    }

    public ModelCategory setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

    public ModelCategory setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModelCategory setSystem(Boolean system) {
        this.system = system;
        return this;
    }
    public Boolean getSystem() {
        return this.system;
    }

    public ModelCategory setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public ModelCategory setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public ModelCategory setIcon(String icon) {
        this.icon = icon;
        return this;
    }
    public String getIcon() {
        return this.icon;
    }

}
