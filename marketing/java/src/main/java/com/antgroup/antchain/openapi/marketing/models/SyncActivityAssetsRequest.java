// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketing.models;

import com.aliyun.tea.*;

public class SyncActivityAssetsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 情报标识
    @NameInMap("information_id")
    @Validation(required = true)
    public String informationId;

    // 附件信息
    @NameInMap("attachments")
    @Validation(required = true)
    public java.util.List<Attachment> attachments;

    // 资产详情列表
    @NameInMap("assets")
    @Validation(required = true)
    public java.util.List<Asset> assets;

    public static SyncActivityAssetsRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncActivityAssetsRequest self = new SyncActivityAssetsRequest();
        return TeaModel.build(map, self);
    }

    public SyncActivityAssetsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncActivityAssetsRequest setInformationId(String informationId) {
        this.informationId = informationId;
        return this;
    }
    public String getInformationId() {
        return this.informationId;
    }

    public SyncActivityAssetsRequest setAttachments(java.util.List<Attachment> attachments) {
        this.attachments = attachments;
        return this;
    }
    public java.util.List<Attachment> getAttachments() {
        return this.attachments;
    }

    public SyncActivityAssetsRequest setAssets(java.util.List<Asset> assets) {
        this.assets = assets;
        return this;
    }
    public java.util.List<Asset> getAssets() {
        return this.assets;
    }

}
