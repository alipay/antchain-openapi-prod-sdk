// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class IotbasicDigitalKeyDeviceInfo extends TeaModel {
    // 设备id
    /**
     * <strong>example:</strong>
     * <p>125839</p>
     */
    @NameInMap("devid")
    @Validation(required = true)
    public String devid;

    // 设备名称
    /**
     * <strong>example:</strong>
     * <p>867186033894659</p>
     */
    @NameInMap("dev_name")
    @Validation(required = true)
    public String devName;

    // 设备sn
    /**
     * <strong>example:</strong>
     * <p>9726001010008SC30N96</p>
     */
    @NameInMap("sn")
    @Validation(required = true)
    public String sn;

    // Ccid
    /**
     * <strong>example:</strong>
     * <p>898602B1191870002179</p>
     */
    @NameInMap("ccid")
    @Validation(required = true)
    public String ccid;

    // Msisdn
    /**
     * <strong>example:</strong>
     * <p>1064818313682</p>
     */
    @NameInMap("msisdn")
    @Validation(required = true)
    public String msisdn;

    // tbox固件版本号(16进制)
    /**
     * <strong>example:</strong>
     * <p>80000109</p>
     */
    @NameInMap("ver")
    @Validation(required = true)
    public String ver;

    public static IotbasicDigitalKeyDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
        IotbasicDigitalKeyDeviceInfo self = new IotbasicDigitalKeyDeviceInfo();
        return TeaModel.build(map, self);
    }

    public IotbasicDigitalKeyDeviceInfo setDevid(String devid) {
        this.devid = devid;
        return this;
    }
    public String getDevid() {
        return this.devid;
    }

    public IotbasicDigitalKeyDeviceInfo setDevName(String devName) {
        this.devName = devName;
        return this;
    }
    public String getDevName() {
        return this.devName;
    }

    public IotbasicDigitalKeyDeviceInfo setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

    public IotbasicDigitalKeyDeviceInfo setCcid(String ccid) {
        this.ccid = ccid;
        return this;
    }
    public String getCcid() {
        return this.ccid;
    }

    public IotbasicDigitalKeyDeviceInfo setMsisdn(String msisdn) {
        this.msisdn = msisdn;
        return this;
    }
    public String getMsisdn() {
        return this.msisdn;
    }

    public IotbasicDigitalKeyDeviceInfo setVer(String ver) {
        this.ver = ver;
        return this;
    }
    public String getVer() {
        return this.ver;
    }

}
