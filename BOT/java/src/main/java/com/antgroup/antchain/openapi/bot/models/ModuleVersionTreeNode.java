// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ModuleVersionTreeNode extends TeaModel {
    // 模块名称
    /**
     * <strong>example:</strong>
     * <p>BLE</p>
     */
    @NameInMap("module_name")
    public String moduleName;

    // 版本号列表
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("versions")
    public java.util.List<String> versions;

    public static ModuleVersionTreeNode build(java.util.Map<String, ?> map) throws Exception {
        ModuleVersionTreeNode self = new ModuleVersionTreeNode();
        return TeaModel.build(map, self);
    }

    public ModuleVersionTreeNode setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public ModuleVersionTreeNode setVersions(java.util.List<String> versions) {
        this.versions = versions;
        return this;
    }
    public java.util.List<String> getVersions() {
        return this.versions;
    }

}
