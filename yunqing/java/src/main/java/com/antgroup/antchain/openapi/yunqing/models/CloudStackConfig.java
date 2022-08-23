// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class CloudStackConfig extends TeaModel {
    // 阿里云accessKey获取
    @NameInMap("access_key")
    @Validation(required = true)
    public String accessKey;

    // 云游加密后的accessKeySecret
    @NameInMap("encrypted_access_key_secret")
    @Validation(required = true)
    public String encryptedAccessKeySecret;

    // 底座所在的region
    @NameInMap("region")
    @Validation(required = true)
    public String region;

    // 底座可用区
    @NameInMap("zone")
    @Validation(required = true)
    public String zone;

    // 底座类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static CloudStackConfig build(java.util.Map<String, ?> map) throws Exception {
        CloudStackConfig self = new CloudStackConfig();
        return TeaModel.build(map, self);
    }

    public CloudStackConfig setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public CloudStackConfig setEncryptedAccessKeySecret(String encryptedAccessKeySecret) {
        this.encryptedAccessKeySecret = encryptedAccessKeySecret;
        return this;
    }
    public String getEncryptedAccessKeySecret() {
        return this.encryptedAccessKeySecret;
    }

    public CloudStackConfig setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CloudStackConfig setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

    public CloudStackConfig setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
