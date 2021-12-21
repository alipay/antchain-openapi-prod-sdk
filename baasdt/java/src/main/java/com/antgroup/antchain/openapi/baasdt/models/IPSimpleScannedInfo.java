// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class IPSimpleScannedInfo extends TeaModel {
    // 扫码人
    @NameInMap("user_name")
    public String userName;

    // 扫码时间
    @NameInMap("scanned_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String scannedTime;

    // 扫码地址
    @NameInMap("gps")
    public String gps;

    public static IPSimpleScannedInfo build(java.util.Map<String, ?> map) throws Exception {
        IPSimpleScannedInfo self = new IPSimpleScannedInfo();
        return TeaModel.build(map, self);
    }

    public IPSimpleScannedInfo setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public IPSimpleScannedInfo setScannedTime(String scannedTime) {
        this.scannedTime = scannedTime;
        return this;
    }
    public String getScannedTime() {
        return this.scannedTime;
    }

    public IPSimpleScannedInfo setGps(String gps) {
        this.gps = gps;
        return this;
    }
    public String getGps() {
        return this.gps;
    }

}
