// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class AddressTimelineConfig extends TeaModel {
    // 交易时间轴看板高度
    @NameInMap("widget_height")
    @Validation(maximum = 1000, minimum = 300)
    public Long widgetHeight;

    // 接口业务字段配置列表，更新时只需传入需要更新的方法
    @NameInMap("interface_data_model_configs")
    public java.util.List<InterfaceDataModelConfig> interfaceDataModelConfigs;

    public static AddressTimelineConfig build(java.util.Map<String, ?> map) throws Exception {
        AddressTimelineConfig self = new AddressTimelineConfig();
        return TeaModel.build(map, self);
    }

    public AddressTimelineConfig setWidgetHeight(Long widgetHeight) {
        this.widgetHeight = widgetHeight;
        return this;
    }
    public Long getWidgetHeight() {
        return this.widgetHeight;
    }

    public AddressTimelineConfig setInterfaceDataModelConfigs(java.util.List<InterfaceDataModelConfig> interfaceDataModelConfigs) {
        this.interfaceDataModelConfigs = interfaceDataModelConfigs;
        return this;
    }
    public java.util.List<InterfaceDataModelConfig> getInterfaceDataModelConfigs() {
        return this.interfaceDataModelConfigs;
    }

}
