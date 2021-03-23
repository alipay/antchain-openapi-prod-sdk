// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class StatusDrive extends TeaModel {
    // 起始状态
    @NameInMap("from_status")
    @Validation(required = true)
    public String fromStatus;

    // 下一状态
    @NameInMap("to_status")
    @Validation(required = true)
    public String toStatus;

    // 驱动上链记录哈希
    @NameInMap("drive_hash")
    @Validation(required = true)
    public String driveHash;

    // 链上时间戳
    @NameInMap("timestamp")
    @Validation(required = true)
    public Long timestamp;

    public static StatusDrive build(java.util.Map<String, ?> map) throws Exception {
        StatusDrive self = new StatusDrive();
        return TeaModel.build(map, self);
    }

    public StatusDrive setFromStatus(String fromStatus) {
        this.fromStatus = fromStatus;
        return this;
    }
    public String getFromStatus() {
        return this.fromStatus;
    }

    public StatusDrive setToStatus(String toStatus) {
        this.toStatus = toStatus;
        return this;
    }
    public String getToStatus() {
        return this.toStatus;
    }

    public StatusDrive setDriveHash(String driveHash) {
        this.driveHash = driveHash;
        return this;
    }
    public String getDriveHash() {
        return this.driveHash;
    }

    public StatusDrive setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

}
