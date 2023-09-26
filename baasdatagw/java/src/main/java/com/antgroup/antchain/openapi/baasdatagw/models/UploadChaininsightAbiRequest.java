// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class UploadChaininsightAbiRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 链上地址
    @NameInMap("hex_address")
    @Validation(required = true)
    public String hexAddress;

    // 对应的合约版本
    @NameInMap("ver")
    @Validation(required = true)
    public String ver;

    // ABI文件原始内容
    @NameInMap("file")
    @Validation(required = true)
    public String file;

    // 租户ID，留空
    @NameInMap("tenant_id")
    public String tenantId;

    public static UploadChaininsightAbiRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadChaininsightAbiRequest self = new UploadChaininsightAbiRequest();
        return TeaModel.build(map, self);
    }

    public UploadChaininsightAbiRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadChaininsightAbiRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadChaininsightAbiRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public UploadChaininsightAbiRequest setHexAddress(String hexAddress) {
        this.hexAddress = hexAddress;
        return this;
    }
    public String getHexAddress() {
        return this.hexAddress;
    }

    public UploadChaininsightAbiRequest setVer(String ver) {
        this.ver = ver;
        return this;
    }
    public String getVer() {
        return this.ver;
    }

    public UploadChaininsightAbiRequest setFile(String file) {
        this.file = file;
        return this;
    }
    public String getFile() {
        return this.file;
    }

    public UploadChaininsightAbiRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
