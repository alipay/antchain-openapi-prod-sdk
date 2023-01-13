// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_1f51f68dfc5d438387dbbaa76f5997f4.models;

import com.aliyun.tea.*;

public class ScanUserInfo extends TeaModel {
    // 用户昵称
    @NameInMap("nick")
    @Validation(required = true)
    public String nick;

    // 用户ID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 经度
    @NameInMap("longitude")
    @Validation(required = true)
    public Long longitude;

    // 纬度
    @NameInMap("latitude")
    @Validation(required = true)
    public Long latitude;

    // 用户来源
    @NameInMap("src_type")
    @Validation(required = true)
    public String srcType;

    // 扫码时间
    @NameInMap("scan_time")
    public Long scanTime;

    public static ScanUserInfo build(java.util.Map<String, ?> map) throws Exception {
        ScanUserInfo self = new ScanUserInfo();
        return TeaModel.build(map, self);
    }

    public ScanUserInfo setNick(String nick) {
        this.nick = nick;
        return this;
    }
    public String getNick() {
        return this.nick;
    }

    public ScanUserInfo setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ScanUserInfo setLongitude(Long longitude) {
        this.longitude = longitude;
        return this;
    }
    public Long getLongitude() {
        return this.longitude;
    }

    public ScanUserInfo setLatitude(Long latitude) {
        this.latitude = latitude;
        return this;
    }
    public Long getLatitude() {
        return this.latitude;
    }

    public ScanUserInfo setSrcType(String srcType) {
        this.srcType = srcType;
        return this;
    }
    public String getSrcType() {
        return this.srcType;
    }

    public ScanUserInfo setScanTime(Long scanTime) {
        this.scanTime = scanTime;
        return this;
    }
    public Long getScanTime() {
        return this.scanTime;
    }

}
