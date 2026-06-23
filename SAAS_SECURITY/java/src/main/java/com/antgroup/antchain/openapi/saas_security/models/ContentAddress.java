// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas_security.models;

import com.aliyun.tea.*;

public class ContentAddress extends TeaModel {
    // 123
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("is_django_url")
    public Boolean isDjangoUrl;

    // 213
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("address")
    public String address;

    // 123
    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("http_url")
    public String httpUrl;

    // 123
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("audio_type")
    public String audioType;

    public static ContentAddress build(java.util.Map<String, ?> map) throws Exception {
        ContentAddress self = new ContentAddress();
        return TeaModel.build(map, self);
    }

    public ContentAddress setIsDjangoUrl(Boolean isDjangoUrl) {
        this.isDjangoUrl = isDjangoUrl;
        return this;
    }
    public Boolean getIsDjangoUrl() {
        return this.isDjangoUrl;
    }

    public ContentAddress setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public ContentAddress setHttpUrl(String httpUrl) {
        this.httpUrl = httpUrl;
        return this;
    }
    public String getHttpUrl() {
        return this.httpUrl;
    }

    public ContentAddress setAudioType(String audioType) {
        this.audioType = audioType;
        return this;
    }
    public String getAudioType() {
        return this.audioType;
    }

}
