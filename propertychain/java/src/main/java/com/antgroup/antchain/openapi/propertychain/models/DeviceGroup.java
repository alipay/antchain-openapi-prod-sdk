// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class DeviceGroup extends TeaModel {
    // 设备组id
    @NameInMap("group_id")
    public String groupId;

    // 设备组名称
    @NameInMap("group_name")
    public String groupName;

    // 设备id
    @NameInMap("things_did_list")
    public java.util.List<String> thingsDidList;

    // 设备其他信息
    @NameInMap("things_info_list")
    public java.util.List<DeviceInfoNoGroup> thingsInfoList;

    public static DeviceGroup build(java.util.Map<String, ?> map) throws Exception {
        DeviceGroup self = new DeviceGroup();
        return TeaModel.build(map, self);
    }

    public DeviceGroup setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DeviceGroup setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DeviceGroup setThingsDidList(java.util.List<String> thingsDidList) {
        this.thingsDidList = thingsDidList;
        return this;
    }
    public java.util.List<String> getThingsDidList() {
        return this.thingsDidList;
    }

    public DeviceGroup setThingsInfoList(java.util.List<DeviceInfoNoGroup> thingsInfoList) {
        this.thingsInfoList = thingsInfoList;
        return this;
    }
    public java.util.List<DeviceInfoNoGroup> getThingsInfoList() {
        return this.thingsInfoList;
    }

}
