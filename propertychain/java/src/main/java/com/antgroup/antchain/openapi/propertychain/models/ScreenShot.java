// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class ScreenShot extends TeaModel {
    // id
    @NameInMap("file_id")
    public String fileId;

    // url
    @NameInMap("file_url")
    public String fileUrl;

    // 时间
    @NameInMap("screenshot_time")
    public Long screenshotTime;

    // 上链txHash
    @NameInMap("tx_hash")
    public String txHash;

    // 设备名称
    @NameInMap("device_name")
    public String deviceName;

    // 关联仓位名称列表
    @NameInMap("location_name_list")
    public java.util.List<String> locationNameList;

    public static ScreenShot build(java.util.Map<String, ?> map) throws Exception {
        ScreenShot self = new ScreenShot();
        return TeaModel.build(map, self);
    }

    public ScreenShot setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ScreenShot setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public ScreenShot setScreenshotTime(Long screenshotTime) {
        this.screenshotTime = screenshotTime;
        return this;
    }
    public Long getScreenshotTime() {
        return this.screenshotTime;
    }

    public ScreenShot setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public ScreenShot setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public ScreenShot setLocationNameList(java.util.List<String> locationNameList) {
        this.locationNameList = locationNameList;
        return this;
    }
    public java.util.List<String> getLocationNameList() {
        return this.locationNameList;
    }

}
