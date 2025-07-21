// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class ResembleDetail extends TeaModel {
    // 相似分数
    /**
     * <strong>example:</strong>
     * <p>0.99</p>
     */
    @NameInMap("score")
    @Validation(required = true)
    public String score;

    // 长度
    /**
     * <strong>example:</strong>
     * <p>02:59:59</p>
     */
    @NameInMap("length")
    public String length;

    // 明细类型，例如VIDEO_SEGMENT表示视频区间相似
    /**
     * <strong>example:</strong>
     * <p>VIDEO_SEGMENT</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 查询源文件的位置信息
    @NameInMap("query_position_data")
    @Validation(required = true)
    public ResemblePositionData queryPositionData;

    // 相似文件的位置信息
    @NameInMap("match_position_data")
    @Validation(required = true)
    public ResemblePositionData matchPositionData;

    public static ResembleDetail build(java.util.Map<String, ?> map) throws Exception {
        ResembleDetail self = new ResembleDetail();
        return TeaModel.build(map, self);
    }

    public ResembleDetail setScore(String score) {
        this.score = score;
        return this;
    }
    public String getScore() {
        return this.score;
    }

    public ResembleDetail setLength(String length) {
        this.length = length;
        return this;
    }
    public String getLength() {
        return this.length;
    }

    public ResembleDetail setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ResembleDetail setQueryPositionData(ResemblePositionData queryPositionData) {
        this.queryPositionData = queryPositionData;
        return this;
    }
    public ResemblePositionData getQueryPositionData() {
        return this.queryPositionData;
    }

    public ResembleDetail setMatchPositionData(ResemblePositionData matchPositionData) {
        this.matchPositionData = matchPositionData;
        return this;
    }
    public ResemblePositionData getMatchPositionData() {
        return this.matchPositionData;
    }

}
