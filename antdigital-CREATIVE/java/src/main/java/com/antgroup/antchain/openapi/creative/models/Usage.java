// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creative.models;

import com.aliyun.tea.*;

public class Usage extends TeaModel {
    // 分辨率
    /**
     * <strong>example:</strong>
     * <p>720p，1080p</p>
     */
    @NameInMap("resolution")
    public String resolution;

    // 视频时长（单位：秒）
    /**
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("duration")
    public Long duration;

    // 视频比例
    /**
     * <strong>example:</strong>
     * <p>16:9</p>
     */
    @NameInMap("ratio")
    public String ratio;

    // 消耗 token 数
    /**
     * <strong>example:</strong>
     * <p>10800</p>
     */
    @NameInMap("completion_tokens")
    public Long completionTokens;

    // 消耗credit数
    /**
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("completion_credits")
    public Long completionCredits;

    public static Usage build(java.util.Map<String, ?> map) throws Exception {
        Usage self = new Usage();
        return TeaModel.build(map, self);
    }

    public Usage setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    public String getResolution() {
        return this.resolution;
    }

    public Usage setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public Usage setRatio(String ratio) {
        this.ratio = ratio;
        return this;
    }
    public String getRatio() {
        return this.ratio;
    }

    public Usage setCompletionTokens(Long completionTokens) {
        this.completionTokens = completionTokens;
        return this;
    }
    public Long getCompletionTokens() {
        return this.completionTokens;
    }

    public Usage setCompletionCredits(Long completionCredits) {
        this.completionCredits = completionCredits;
        return this;
    }
    public Long getCompletionCredits() {
        return this.completionCredits;
    }

}
