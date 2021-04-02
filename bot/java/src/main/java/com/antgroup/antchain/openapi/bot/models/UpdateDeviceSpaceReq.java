// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class UpdateDeviceSpaceReq extends TeaModel {
    // API要更新的设备DID
    @NameInMap("device_did")
    @Validation(required = true)
    public String deviceDid;

    // 0-全部更新 (暂不支持)
    // 1-添加  
    // 2-删除
    // 
    @NameInMap("update_mode")
    @Validation(required = true)
    public Long updateMode;

    // API要更新的设备部署库位
    @NameInMap("device_space")
    @Validation(required = true)
    public java.util.List<String> deviceSpace;

    public static UpdateDeviceSpaceReq build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeviceSpaceReq self = new UpdateDeviceSpaceReq();
        return TeaModel.build(map, self);
    }

    public UpdateDeviceSpaceReq setDeviceDid(String deviceDid) {
        this.deviceDid = deviceDid;
        return this;
    }
    public String getDeviceDid() {
        return this.deviceDid;
    }

    public UpdateDeviceSpaceReq setUpdateMode(Long updateMode) {
        this.updateMode = updateMode;
        return this;
    }
    public Long getUpdateMode() {
        return this.updateMode;
    }

    public UpdateDeviceSpaceReq setDeviceSpace(java.util.List<String> deviceSpace) {
        this.deviceSpace = deviceSpace;
        return this;
    }
    public java.util.List<String> getDeviceSpace() {
        return this.deviceSpace;
    }

}
