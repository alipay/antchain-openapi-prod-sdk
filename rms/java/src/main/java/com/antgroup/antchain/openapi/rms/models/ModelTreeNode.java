// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class ModelTreeNode extends TeaModel {
    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // plugin_name
    @NameInMap("plugin_name")
    @Validation(required = true)
    public String pluginName;

    // type
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static ModelTreeNode build(java.util.Map<String, ?> map) throws Exception {
        ModelTreeNode self = new ModelTreeNode();
        return TeaModel.build(map, self);
    }

    public ModelTreeNode setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModelTreeNode setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ModelTreeNode setPluginName(String pluginName) {
        this.pluginName = pluginName;
        return this;
    }
    public String getPluginName() {
        return this.pluginName;
    }

    public ModelTreeNode setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
