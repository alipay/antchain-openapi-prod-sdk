// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class Audio extends TeaModel {
    // 音频文件名称（单次请求保持唯一）
    @NameInMap("token")
    public String token;

    // 待认证的音频文件，base64编码格式
    @NameInMap("raw_data")
    public String rawData;

    // 音频文件OSS地址
    @NameInMap("audio_url")
    public String audioUrl;

    public static Audio build(java.util.Map<String, ?> map) throws Exception {
        Audio self = new Audio();
        return TeaModel.build(map, self);
    }

    public Audio setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public Audio setRawData(String rawData) {
        this.rawData = rawData;
        return this;
    }
    public String getRawData() {
        return this.rawData;
    }

    public Audio setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
        return this;
    }
    public String getAudioUrl() {
        return this.audioUrl;
    }

}
