// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ModuleLocator extends TeaModel {
    // 模块定位信息：EKYT_MID / MODULE_NAME / CHANNEL_EXTERNAL_ID
    /**
     * <strong>example:</strong>
     * <p>EKYT_MID</p>
     */
    @NameInMap("locator_type")
    @Validation(required = true)
    public String locatorType;

    // EKYT 模块 ID
    /**
     * <strong>example:</strong>
     * <p>fda6f23a7767486d9d5f29e7567a2004</p>
     */
    @NameInMap("mid")
    public String mid;

    // 模块名称
    /**
     * <strong>example:</strong>
     * <p>BLE</p>
     */
    @NameInMap("module_name")
    public String moduleName;

    // channel 维度外部模块 ID
    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("external_id")
    public String externalId;

    public static ModuleLocator build(java.util.Map<String, ?> map) throws Exception {
        ModuleLocator self = new ModuleLocator();
        return TeaModel.build(map, self);
    }

    public ModuleLocator setLocatorType(String locatorType) {
        this.locatorType = locatorType;
        return this;
    }
    public String getLocatorType() {
        return this.locatorType;
    }

    public ModuleLocator setMid(String mid) {
        this.mid = mid;
        return this;
    }
    public String getMid() {
        return this.mid;
    }

    public ModuleLocator setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public ModuleLocator setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

}
