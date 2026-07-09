// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ModuleVersionItem extends TeaModel {
    // 模块定位信息
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("module_locator")
    public ModuleLocator moduleLocator;

    // 当前模块版本号
    /**
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("version")
    public String version;

    public static ModuleVersionItem build(java.util.Map<String, ?> map) throws Exception {
        ModuleVersionItem self = new ModuleVersionItem();
        return TeaModel.build(map, self);
    }

    public ModuleVersionItem setModuleLocator(ModuleLocator moduleLocator) {
        this.moduleLocator = moduleLocator;
        return this;
    }
    public ModuleLocator getModuleLocator() {
        return this.moduleLocator;
    }

    public ModuleVersionItem setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
