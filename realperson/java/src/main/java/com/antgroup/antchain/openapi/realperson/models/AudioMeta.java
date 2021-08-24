// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class AudioMeta extends TeaModel {
    // 采样率
    @NameInMap("sample_freq")
    public Long sampleFreq;

    // 音频道数
    @NameInMap("channels_num")
    public Long channelsNum;

    // 音频数据采样点所占位数
    @NameInMap("bits")
    public Long bits;

    // 语音信道分离标识
    @NameInMap("channel")
    public Long channel;

    public static AudioMeta build(java.util.Map<String, ?> map) throws Exception {
        AudioMeta self = new AudioMeta();
        return TeaModel.build(map, self);
    }

    public AudioMeta setSampleFreq(Long sampleFreq) {
        this.sampleFreq = sampleFreq;
        return this;
    }
    public Long getSampleFreq() {
        return this.sampleFreq;
    }

    public AudioMeta setChannelsNum(Long channelsNum) {
        this.channelsNum = channelsNum;
        return this;
    }
    public Long getChannelsNum() {
        return this.channelsNum;
    }

    public AudioMeta setBits(Long bits) {
        this.bits = bits;
        return this;
    }
    public Long getBits() {
        return this.bits;
    }

    public AudioMeta setChannel(Long channel) {
        this.channel = channel;
        return this;
    }
    public Long getChannel() {
        return this.channel;
    }

}
