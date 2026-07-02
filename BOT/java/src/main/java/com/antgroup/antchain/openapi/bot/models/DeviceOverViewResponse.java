// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class DeviceOverViewResponse extends TeaModel {
    // 设备品类名称
    /**
     * <strong>example:</strong>
     * <p>test_category</p>
     */
    @NameInMap("device_category_name")
    @Validation(required = true)
    public String deviceCategoryName;

    // 设备总数
    /**
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("device_total")
    @Validation(required = true)
    public Long deviceTotal;

    public static DeviceOverViewResponse build(java.util.Map<String, ?> map) throws Exception {
        DeviceOverViewResponse self = new DeviceOverViewResponse();
        return TeaModel.build(map, self);
    }

    public DeviceOverViewResponse setDeviceCategoryName(String deviceCategoryName) {
        this.deviceCategoryName = deviceCategoryName;
        return this;
    }
    public String getDeviceCategoryName() {
        return this.deviceCategoryName;
    }

    public DeviceOverViewResponse setDeviceTotal(Long deviceTotal) {
        this.deviceTotal = deviceTotal;
        return this;
    }
    public Long getDeviceTotal() {
        return this.deviceTotal;
    }

}
