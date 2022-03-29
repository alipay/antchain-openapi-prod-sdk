// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class MonitorApp extends TeaModel {
    // 应用 ID
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 应用展示名称
    @NameInMap("display_name")
    @Validation(required = true)
    public String displayName;

    // 来源
    @NameInMap("source_from")
    @Validation(required = true)
    public String sourceFrom;

    // 应用描述
    @NameInMap("description")
    public String description;

    // 拼接好的stack_universal_table_id
    @NameInMap("stack_universal_table_id")
    public String stackUniversalTableId;

    public static MonitorApp build(java.util.Map<String, ?> map) throws Exception {
        MonitorApp self = new MonitorApp();
        return TeaModel.build(map, self);
    }

    public MonitorApp setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public MonitorApp setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public MonitorApp setSourceFrom(String sourceFrom) {
        this.sourceFrom = sourceFrom;
        return this;
    }
    public String getSourceFrom() {
        return this.sourceFrom;
    }

    public MonitorApp setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public MonitorApp setStackUniversalTableId(String stackUniversalTableId) {
        this.stackUniversalTableId = stackUniversalTableId;
        return this;
    }
    public String getStackUniversalTableId() {
        return this.stackUniversalTableId;
    }

}
