// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class TechStack extends TeaModel {
    // 技术栈描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 该字段为字符串类型Map，序列化为字符串用于存储扩展信息，e.g： 云原生下打包存放目录 /home/admin/release
    @NameInMap("extend_properties")
    @Validation(required = true)
    public String extendProperties;

    // 技术栈id
    @NameInMap("id")
    public String id;

    // 技术栈名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 技术栈可见范围，全局可见|租户内可见
    @NameInMap("scope")
    @Validation(required = true)
    public String scope;

    // 创建时间（UTC）
    @NameInMap("utc_created")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcCreated;

    // 最近修改时间（UTC）
    @NameInMap("utc_modified")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcModified;

    public static TechStack build(java.util.Map<String, ?> map) throws Exception {
        TechStack self = new TechStack();
        return TeaModel.build(map, self);
    }

    public TechStack setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public TechStack setExtendProperties(String extendProperties) {
        this.extendProperties = extendProperties;
        return this;
    }
    public String getExtendProperties() {
        return this.extendProperties;
    }

    public TechStack setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public TechStack setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public TechStack setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public TechStack setUtcCreated(String utcCreated) {
        this.utcCreated = utcCreated;
        return this;
    }
    public String getUtcCreated() {
        return this.utcCreated;
    }

    public TechStack setUtcModified(String utcModified) {
        this.utcModified = utcModified;
        return this;
    }
    public String getUtcModified() {
        return this.utcModified;
    }

}
