// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dsg.models;

import com.aliyun.tea.*;

public class SensitiveEntity extends TeaModel {
    // 存放识别结果在document中的开始位置
    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("start_offset")
    @Validation(required = true)
    public Long startOffset;

    // 存放识别结果在document中的结束位置
    /**
     * <strong>example:</strong>
     * <p>13</p>
     */
    @NameInMap("end_offset")
    @Validation(required = true)
    public Long endOffset;

    // NER识别出来的document内容
    /**
     * <strong>example:</strong>
     * <p>原恺</p>
     */
    @NameInMap("origin_phrase")
    @Validation(required = true)
    public String originPhrase;

    // 该Item出现的句子内容
    /**
     * <strong>example:</strong>
     * <p>我是原恺</p>
     */
    @NameInMap("origin_sentence")
    @Validation(required = true)
    public String originSentence;

    // 敏感类型
    /**
     * <strong>example:</strong>
     * <p>13475867654</p>
     */
    @NameInMap("sensitive_type")
    @Validation(required = true)
    public String sensitiveType;

    // 置信度
    /**
     * <strong>example:</strong>
     * <p>HIGH</p>
     */
    @NameInMap("confidence_level")
    @Validation(required = true)
    public String confidenceLevel;

    public static SensitiveEntity build(java.util.Map<String, ?> map) throws Exception {
        SensitiveEntity self = new SensitiveEntity();
        return TeaModel.build(map, self);
    }

    public SensitiveEntity setStartOffset(Long startOffset) {
        this.startOffset = startOffset;
        return this;
    }
    public Long getStartOffset() {
        return this.startOffset;
    }

    public SensitiveEntity setEndOffset(Long endOffset) {
        this.endOffset = endOffset;
        return this;
    }
    public Long getEndOffset() {
        return this.endOffset;
    }

    public SensitiveEntity setOriginPhrase(String originPhrase) {
        this.originPhrase = originPhrase;
        return this;
    }
    public String getOriginPhrase() {
        return this.originPhrase;
    }

    public SensitiveEntity setOriginSentence(String originSentence) {
        this.originSentence = originSentence;
        return this;
    }
    public String getOriginSentence() {
        return this.originSentence;
    }

    public SensitiveEntity setSensitiveType(String sensitiveType) {
        this.sensitiveType = sensitiveType;
        return this;
    }
    public String getSensitiveType() {
        return this.sensitiveType;
    }

    public SensitiveEntity setConfidenceLevel(String confidenceLevel) {
        this.confidenceLevel = confidenceLevel;
        return this;
    }
    public String getConfidenceLevel() {
        return this.confidenceLevel;
    }

}
