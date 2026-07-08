// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class Audio extends TeaModel {
    // 音频文件名称（单次请求保持唯一）
    /**
     * <strong>example:</strong>
     * <p>81995a7fa2bfc132eb69cdc2028f0619.wav</p>
     */
    @NameInMap("token")
    public String token;

    // 待认证的音频文件，base64编码格式
    /**
     * <strong>example:</strong>
     * <p>/9j/238sn382l23f4 </p>
     */
    @NameInMap("raw_data")
    public String rawData;

    // 音频文件OSS地址
    /**
     * <strong>example:</strong>
     * <p><a href="https://xxxxxx.oss-cn-shanghai.aliyuncs.com/12345.wav">https://xxxxxx.oss-cn-shanghai.aliyuncs.com/12345.wav</a></p>
     */
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
