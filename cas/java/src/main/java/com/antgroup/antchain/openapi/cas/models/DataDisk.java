// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DataDisk extends TeaModel {
    // 磁盘大小
    @NameInMap("size")
    @Validation(required = true)
    public Long size;

    // 若使用磁盘创建，需填写此字段
    @NameInMap("snapshot_sequence")
    public String snapshotSequence;

    // 磁盘规格
    @NameInMap("spec_id")
    @Validation(required = true)
    public String specId;

    // 数据盘设备
    @NameInMap("device")
    @Validation(required = true)
    public String device;

    public static DataDisk build(java.util.Map<String, ?> map) throws Exception {
        DataDisk self = new DataDisk();
        return TeaModel.build(map, self);
    }

    public DataDisk setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public DataDisk setSnapshotSequence(String snapshotSequence) {
        this.snapshotSequence = snapshotSequence;
        return this;
    }
    public String getSnapshotSequence() {
        return this.snapshotSequence;
    }

    public DataDisk setSpecId(String specId) {
        this.specId = specId;
        return this;
    }
    public String getSpecId() {
        return this.specId;
    }

    public DataDisk setDevice(String device) {
        this.device = device;
        return this;
    }
    public String getDevice() {
        return this.device;
    }

}
