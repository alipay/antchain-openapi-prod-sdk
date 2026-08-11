// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class OtaModuleVersionItemResponse extends TeaModel {
    // 对外模块定位信息
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("module_locator")
    public ModuleLocator moduleLocator;

    // 设备最近一次被接受的上报版本号
    /**
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("version")
    public String version;

    // 设备上报时间戳，单位毫秒。
    /**
     * <strong>example:</strong>
     * <p>设备上报时间戳，单位毫秒。</p>
     */
    @NameInMap("reported_at")
    public String reportedAt;

    public static OtaModuleVersionItemResponse build(java.util.Map<String, ?> map) throws Exception {
        OtaModuleVersionItemResponse self = new OtaModuleVersionItemResponse();
        return TeaModel.build(map, self);
    }

    public OtaModuleVersionItemResponse setModuleLocator(ModuleLocator moduleLocator) {
        this.moduleLocator = moduleLocator;
        return this;
    }
    public ModuleLocator getModuleLocator() {
        return this.moduleLocator;
    }

    public OtaModuleVersionItemResponse setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public OtaModuleVersionItemResponse setReportedAt(String reportedAt) {
        this.reportedAt = reportedAt;
        return this;
    }
    public String getReportedAt() {
        return this.reportedAt;
    }

}
