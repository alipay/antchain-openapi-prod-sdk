// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CarKeyInitData extends TeaModel {
    // IIFFAA 根密钥
    /**
     * <strong>example:</strong>
     * <p>fs</p>
     */
    @NameInMap("root_pub_key")
    @Validation(required = true)
    public String rootPubKey;

    // IIFAA 设备唯一ID
    /**
     * <strong>example:</strong>
     * <p>e2eer</p>
     */
    @NameInMap("tuid")
    @Validation(required = true)
    public String tuid;

    // 业务密钥
    /**
     * <strong>example:</strong>
     * <p>erw</p>
     */
    @NameInMap("biz_priv_key")
    @Validation(required = true)
    public String bizPrivKey;

    // 设备唯一密钥
    /**
     * <strong>example:</strong>
     * <p>fdsw</p>
     */
    @NameInMap("device_priv_key")
    @Validation(required = true)
    public String devicePrivKey;

    // 无感空车凭证
    /**
     * <strong>example:</strong>
     * <p>rew</p>
     */
    @NameInMap("key_less_authy")
    @Validation(required = true)
    public String keyLessAuthy;

    public static CarKeyInitData build(java.util.Map<String, ?> map) throws Exception {
        CarKeyInitData self = new CarKeyInitData();
        return TeaModel.build(map, self);
    }

    public CarKeyInitData setRootPubKey(String rootPubKey) {
        this.rootPubKey = rootPubKey;
        return this;
    }
    public String getRootPubKey() {
        return this.rootPubKey;
    }

    public CarKeyInitData setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public CarKeyInitData setBizPrivKey(String bizPrivKey) {
        this.bizPrivKey = bizPrivKey;
        return this;
    }
    public String getBizPrivKey() {
        return this.bizPrivKey;
    }

    public CarKeyInitData setDevicePrivKey(String devicePrivKey) {
        this.devicePrivKey = devicePrivKey;
        return this;
    }
    public String getDevicePrivKey() {
        return this.devicePrivKey;
    }

    public CarKeyInitData setKeyLessAuthy(String keyLessAuthy) {
        this.keyLessAuthy = keyLessAuthy;
        return this;
    }
    public String getKeyLessAuthy() {
        return this.keyLessAuthy;
    }

}
