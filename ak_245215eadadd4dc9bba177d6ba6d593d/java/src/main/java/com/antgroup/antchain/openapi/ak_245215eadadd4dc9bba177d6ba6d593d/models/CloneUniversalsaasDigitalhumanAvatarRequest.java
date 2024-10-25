// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_245215eadadd4dc9bba177d6ba6d593d.models;

import com.aliyun.tea.*;

public class CloneUniversalsaasDigitalhumanAvatarRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数字人训练视频url
    @NameInMap("file_url")
    @Validation(required = true)
    public String fileUrl;

    // 数字人名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 是否克隆声音，默认为false
    @NameInMap("clone_voice")
    public Boolean cloneVoice;

    public static CloneUniversalsaasDigitalhumanAvatarRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneUniversalsaasDigitalhumanAvatarRequest self = new CloneUniversalsaasDigitalhumanAvatarRequest();
        return TeaModel.build(map, self);
    }

    public CloneUniversalsaasDigitalhumanAvatarRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CloneUniversalsaasDigitalhumanAvatarRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CloneUniversalsaasDigitalhumanAvatarRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public CloneUniversalsaasDigitalhumanAvatarRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CloneUniversalsaasDigitalhumanAvatarRequest setCloneVoice(Boolean cloneVoice) {
        this.cloneVoice = cloneVoice;
        return this;
    }
    public Boolean getCloneVoice() {
        return this.cloneVoice;
    }

}
