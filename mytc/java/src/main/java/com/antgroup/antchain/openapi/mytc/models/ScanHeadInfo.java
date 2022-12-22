// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mytc.models;

import com.aliyun.tea.*;

public class ScanHeadInfo extends TeaModel {
    // 扫描时间
    @NameInMap("scan_time")
    @Validation(required = true)
    public Long scanTime;

    // 扫码次数
    @NameInMap("scan_count")
    @Validation(required = true)
    public Long scanCount;

    // 扫码地址
    @NameInMap("scan_addr")
    @Validation(required = true)
    public String scanAddr;

    public static ScanHeadInfo build(java.util.Map<String, ?> map) throws Exception {
        ScanHeadInfo self = new ScanHeadInfo();
        return TeaModel.build(map, self);
    }

    public ScanHeadInfo setScanTime(Long scanTime) {
        this.scanTime = scanTime;
        return this;
    }
    public Long getScanTime() {
        return this.scanTime;
    }

    public ScanHeadInfo setScanCount(Long scanCount) {
        this.scanCount = scanCount;
        return this;
    }
    public Long getScanCount() {
        return this.scanCount;
    }

    public ScanHeadInfo setScanAddr(String scanAddr) {
        this.scanAddr = scanAddr;
        return this;
    }
    public String getScanAddr() {
        return this.scanAddr;
    }

}
