// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class ControlPlan extends TeaModel {
    // action_id
    @NameInMap("action_id")
    @Validation(required = true)
    public Long actionId;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // plugin_type
    @NameInMap("plugin_type")
    @Validation(required = true)
    public String pluginType;

    // plugin_id
    @NameInMap("plugin_id")
    @Validation(required = true)
    public String pluginId;

    // file_id
    @NameInMap("file_id")
    @Validation(required = true)
    public Long fileId;

    // ds_name
    @NameInMap("ds_name")
    @Validation(required = true)
    public String dsName;

    public static ControlPlan build(java.util.Map<String, ?> map) throws Exception {
        ControlPlan self = new ControlPlan();
        return TeaModel.build(map, self);
    }

    public ControlPlan setActionId(Long actionId) {
        this.actionId = actionId;
        return this;
    }
    public Long getActionId() {
        return this.actionId;
    }

    public ControlPlan setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ControlPlan setPluginType(String pluginType) {
        this.pluginType = pluginType;
        return this;
    }
    public String getPluginType() {
        return this.pluginType;
    }

    public ControlPlan setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public ControlPlan setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public ControlPlan setDsName(String dsName) {
        this.dsName = dsName;
        return this;
    }
    public String getDsName() {
        return this.dsName;
    }

}
