// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class IotbasicDigitalKeyDeviceNoShipInfo extends TeaModel {
    // 设备id
    @NameInMap("devid")
    @Validation(required = true)
    public String devid;

    // 设备sn
    @NameInMap("sn")
    @Validation(required = true)
    public String sn;

    // ccid
    @NameInMap("ccid")
    @Validation(required = true)
    public String ccid;

    // imei
    @NameInMap("imei")
    @Validation(required = true)
    public String imei;

    // tbox固件版本号(16进制)
    @NameInMap("ver")
    @Validation(required = true)
    public String ver;

    // PEPS系统固件版本号(16进制)
    @NameInMap("peps_ver")
    @Validation(required = true)
    public String pepsVer;

    // 蓝牙固件版本号(16进制)
    @NameInMap("ble_ver")
    @Validation(required = true)
    public String bleVer;

    public static IotbasicDigitalKeyDeviceNoShipInfo build(java.util.Map<String, ?> map) throws Exception {
        IotbasicDigitalKeyDeviceNoShipInfo self = new IotbasicDigitalKeyDeviceNoShipInfo();
        return TeaModel.build(map, self);
    }

    public IotbasicDigitalKeyDeviceNoShipInfo setDevid(String devid) {
        this.devid = devid;
        return this;
    }
    public String getDevid() {
        return this.devid;
    }

    public IotbasicDigitalKeyDeviceNoShipInfo setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

    public IotbasicDigitalKeyDeviceNoShipInfo setCcid(String ccid) {
        this.ccid = ccid;
        return this;
    }
    public String getCcid() {
        return this.ccid;
    }

    public IotbasicDigitalKeyDeviceNoShipInfo setImei(String imei) {
        this.imei = imei;
        return this;
    }
    public String getImei() {
        return this.imei;
    }

    public IotbasicDigitalKeyDeviceNoShipInfo setVer(String ver) {
        this.ver = ver;
        return this;
    }
    public String getVer() {
        return this.ver;
    }

    public IotbasicDigitalKeyDeviceNoShipInfo setPepsVer(String pepsVer) {
        this.pepsVer = pepsVer;
        return this;
    }
    public String getPepsVer() {
        return this.pepsVer;
    }

    public IotbasicDigitalKeyDeviceNoShipInfo setBleVer(String bleVer) {
        this.bleVer = bleVer;
        return this;
    }
    public String getBleVer() {
        return this.bleVer;
    }

}
