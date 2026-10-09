// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class AudioSpec extends TeaModel {
    // 容器，如 WAV
    /**
     * <strong>example:</strong>
     * <p>WAV</p>
     */
    @NameInMap("container")
    @Validation(required = true)
    public String container;

    // 编码，如 PCM_S16LE
    /**
     * <strong>example:</strong>
     * <p>PCM_S16LE</p>
     */
    @NameInMap("codec")
    @Validation(required = true)
    public String codec;

    // 采样率，单位 Hz，如 16000
    /**
     * <strong>example:</strong>
     * <p>16000</p>
     */
    @NameInMap("sample_rate")
    @Validation(required = true)
    public Long sampleRate;

    // 声道数，如 1
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("channels")
    @Validation(required = true)
    public Long channels;

    public static AudioSpec build(java.util.Map<String, ?> map) throws Exception {
        AudioSpec self = new AudioSpec();
        return TeaModel.build(map, self);
    }

    public AudioSpec setContainer(String container) {
        this.container = container;
        return this;
    }
    public String getContainer() {
        return this.container;
    }

    public AudioSpec setCodec(String codec) {
        this.codec = codec;
        return this;
    }
    public String getCodec() {
        return this.codec;
    }

    public AudioSpec setSampleRate(Long sampleRate) {
        this.sampleRate = sampleRate;
        return this;
    }
    public Long getSampleRate() {
        return this.sampleRate;
    }

    public AudioSpec setChannels(Long channels) {
        this.channels = channels;
        return this;
    }
    public Long getChannels() {
        return this.channels;
    }

}
