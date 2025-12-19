// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.org.models;

import com.aliyun.tea.*;

public class ConversionData extends TeaModel {
    // 渠道
    /**
     * <strong>example:</strong>
     * <p>HUABEI</p>
     */
    @NameInMap("channel")
    @Validation(required = true)
    public String channel;

    // 投放人数
    /**
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("send_cnt")
    @Validation(required = true)
    public Long sendCnt;

    // 核销人数
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("use_cnt")
    @Validation(required = true)
    public Long useCnt;

    // 核销率
    /**
     * <strong>example:</strong>
     * <p>20.78</p>
     */
    @NameInMap("use_rate")
    @Validation(required = true)
    public String useRate;

    public static ConversionData build(java.util.Map<String, ?> map) throws Exception {
        ConversionData self = new ConversionData();
        return TeaModel.build(map, self);
    }

    public ConversionData setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public ConversionData setSendCnt(Long sendCnt) {
        this.sendCnt = sendCnt;
        return this;
    }
    public Long getSendCnt() {
        return this.sendCnt;
    }

    public ConversionData setUseCnt(Long useCnt) {
        this.useCnt = useCnt;
        return this;
    }
    public Long getUseCnt() {
        return this.useCnt;
    }

    public ConversionData setUseRate(String useRate) {
        this.useRate = useRate;
        return this;
    }
    public String getUseRate() {
        return this.useRate;
    }

}
