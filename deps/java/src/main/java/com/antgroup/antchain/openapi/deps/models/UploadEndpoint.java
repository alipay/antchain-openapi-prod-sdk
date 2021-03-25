// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class UploadEndpoint extends TeaModel {
    // 对象存储的access_key_id
    @NameInMap("access_key_id")
    public String accessKeyId;

    // 上传的目标bucket名称
    @NameInMap("bucket")
    public String bucket;

    // 加密策略，仅storage_type为SYSTEM_OSS时有效
    @NameInMap("encoded_policy")
    public String encodedPolicy;

    // 文件失效的日期时间
    @NameInMap("expiration")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String expiration;

    // 对象存储的上传目标文件路径
    @NameInMap("file_path")
    public String filePath;

    // 上传的目标主机名，仅storage_type为SYSTEM_OSS时有效
    @NameInMap("host")
    public String host;

    // 地域ID
    @NameInMap("region_id")
    public String regionId;

    // 签名，仅storage_type为SYSTEM_OSS时有效
    @NameInMap("signature")
    public String signature;

    // 存储类型，取值如下： SYSTEM_AFS表示AFS存储，SYSTEM_OSS表示OSS存储
    @NameInMap("storage_type")
    public String storageType;

    // 上传的目标URL
    @NameInMap("url")
    public String url;

    public static UploadEndpoint build(java.util.Map<String, ?> map) throws Exception {
        UploadEndpoint self = new UploadEndpoint();
        return TeaModel.build(map, self);
    }

    public UploadEndpoint setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public UploadEndpoint setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public UploadEndpoint setEncodedPolicy(String encodedPolicy) {
        this.encodedPolicy = encodedPolicy;
        return this;
    }
    public String getEncodedPolicy() {
        return this.encodedPolicy;
    }

    public UploadEndpoint setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

    public UploadEndpoint setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public UploadEndpoint setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public UploadEndpoint setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UploadEndpoint setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public UploadEndpoint setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public UploadEndpoint setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
