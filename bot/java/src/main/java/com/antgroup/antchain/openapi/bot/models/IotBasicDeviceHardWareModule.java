// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class IotBasicDeviceHardWareModule extends TeaModel {
    // 所属规格
    @NameInMap("specs_id")
    @Validation(required = true)
    public Long specsId;

    // 硬件模块ID
    @NameInMap("hardware_module_id")
    @Validation(required = true)
    public Long hardwareModuleId;

    // 模块名称
    @NameInMap("hardware_module_name")
    @Validation(required = true)
    public String hardwareModuleName;

    // 模块编码
    @NameInMap("hardware_module_value")
    @Validation(required = true)
    public String hardwareModuleValue;

    // 模块参数
    @NameInMap("hardware_module_param")
    @Validation(required = true)
    public String hardwareModuleParam;

    public static IotBasicDeviceHardWareModule build(java.util.Map<String, ?> map) throws Exception {
        IotBasicDeviceHardWareModule self = new IotBasicDeviceHardWareModule();
        return TeaModel.build(map, self);
    }

    public IotBasicDeviceHardWareModule setSpecsId(Long specsId) {
        this.specsId = specsId;
        return this;
    }
    public Long getSpecsId() {
        return this.specsId;
    }

    public IotBasicDeviceHardWareModule setHardwareModuleId(Long hardwareModuleId) {
        this.hardwareModuleId = hardwareModuleId;
        return this;
    }
    public Long getHardwareModuleId() {
        return this.hardwareModuleId;
    }

    public IotBasicDeviceHardWareModule setHardwareModuleName(String hardwareModuleName) {
        this.hardwareModuleName = hardwareModuleName;
        return this;
    }
    public String getHardwareModuleName() {
        return this.hardwareModuleName;
    }

    public IotBasicDeviceHardWareModule setHardwareModuleValue(String hardwareModuleValue) {
        this.hardwareModuleValue = hardwareModuleValue;
        return this;
    }
    public String getHardwareModuleValue() {
        return this.hardwareModuleValue;
    }

    public IotBasicDeviceHardWareModule setHardwareModuleParam(String hardwareModuleParam) {
        this.hardwareModuleParam = hardwareModuleParam;
        return this;
    }
    public String getHardwareModuleParam() {
        return this.hardwareModuleParam;
    }

}
