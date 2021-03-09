// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class PackageUploadPolicy extends TeaModel {
    // accessKey
    @NameInMap("access_key")
    public String accessKey;

    // 策略
    @NameInMap("policy")
    public String policy;

    // 签名
    @NameInMap("signature")
    public String signature;

    // 路径前缀
    @NameInMap("path_prefix")
    public String pathPrefix;

    // endpoint
    @NameInMap("endpoint")
    public String endpoint;

    // expire
    @NameInMap("expire")
    public String expire;

    // bucket
    @NameInMap("bucket")
    public String bucket;

    public static PackageUploadPolicy build(java.util.Map<String, ?> map) throws Exception {
        PackageUploadPolicy self = new PackageUploadPolicy();
        return TeaModel.build(map, self);
    }

    public PackageUploadPolicy setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public PackageUploadPolicy setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public PackageUploadPolicy setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public PackageUploadPolicy setPathPrefix(String pathPrefix) {
        this.pathPrefix = pathPrefix;
        return this;
    }
    public String getPathPrefix() {
        return this.pathPrefix;
    }

    public PackageUploadPolicy setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public PackageUploadPolicy setExpire(String expire) {
        this.expire = expire;
        return this;
    }
    public String getExpire() {
        return this.expire;
    }

    public PackageUploadPolicy setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

}
