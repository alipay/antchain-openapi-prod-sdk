// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class UpdateIpGoodsgalleryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 版权方链上账户ID
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // ip链上id
    @NameInMap("ip_id")
    @Validation(required = true)
    public String ipId;

    // IP图库链接，一个压缩包
    @NameInMap("ip_gallery_url")
    @Validation(required = true)
    public String ipGalleryUrl;

    // 是否允许商家下载图库
    @NameInMap("allow_download")
    public Boolean allowDownload;

    public static UpdateIpGoodsgalleryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpGoodsgalleryRequest self = new UpdateIpGoodsgalleryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIpGoodsgalleryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateIpGoodsgalleryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateIpGoodsgalleryRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public UpdateIpGoodsgalleryRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public UpdateIpGoodsgalleryRequest setIpId(String ipId) {
        this.ipId = ipId;
        return this;
    }
    public String getIpId() {
        return this.ipId;
    }

    public UpdateIpGoodsgalleryRequest setIpGalleryUrl(String ipGalleryUrl) {
        this.ipGalleryUrl = ipGalleryUrl;
        return this;
    }
    public String getIpGalleryUrl() {
        return this.ipGalleryUrl;
    }

    public UpdateIpGoodsgalleryRequest setAllowDownload(Boolean allowDownload) {
        this.allowDownload = allowDownload;
        return this;
    }
    public Boolean getAllowDownload() {
        return this.allowDownload;
    }

}
