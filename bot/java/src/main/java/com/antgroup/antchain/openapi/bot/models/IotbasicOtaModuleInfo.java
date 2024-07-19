// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class IotbasicOtaModuleInfo extends TeaModel {
    // OTA模块名称
    @NameInMap("module_name")
    @Validation(required = true)
    public String moduleName;

    // 最新版本号
    @NameInMap("last_version")
    public String lastVersion;

    public static IotbasicOtaModuleInfo build(java.util.Map<String, ?> map) throws Exception {
        IotbasicOtaModuleInfo self = new IotbasicOtaModuleInfo();
        return TeaModel.build(map, self);
    }

    public IotbasicOtaModuleInfo setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public IotbasicOtaModuleInfo setLastVersion(String lastVersion) {
        this.lastVersion = lastVersion;
        return this;
    }
    public String getLastVersion() {
        return this.lastVersion;
    }

}
