// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class DeviceBean extends TeaModel {
    // 选填其中一个：imeiMd5、macMd5、adid、adidMd5、did、idfa、idfaMd5、caid、caidMd5、oaid、oaidMd5、aaid、aaidMd5、gtcid、mb、pnSha256、cid、gid
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("device_id_type")
    @Validation(required = true)
    public String deviceIdType;

    // 设备ID列表（最多200个，不要重复）
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("device_id_list")
    @Validation(required = true)
    public java.util.List<String> deviceIdList;

    public static DeviceBean build(java.util.Map<String, ?> map) throws Exception {
        DeviceBean self = new DeviceBean();
        return TeaModel.build(map, self);
    }

    public DeviceBean setDeviceIdType(String deviceIdType) {
        this.deviceIdType = deviceIdType;
        return this;
    }
    public String getDeviceIdType() {
        return this.deviceIdType;
    }

    public DeviceBean setDeviceIdList(java.util.List<String> deviceIdList) {
        this.deviceIdList = deviceIdList;
        return this;
    }
    public java.util.List<String> getDeviceIdList() {
        return this.deviceIdList;
    }

}
