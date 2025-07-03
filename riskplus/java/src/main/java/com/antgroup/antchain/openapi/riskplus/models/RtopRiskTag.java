// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RtopRiskTag extends TeaModel {
    // 标签ID
    /**
     * <strong>example:</strong>
     * <p>CMN00010</p>
     */
    @NameInMap("tag_id")
    @Validation(required = true)
    public String tagId;

    // 标签名称
    /**
     * <strong>example:</strong>
     * <p>网站失联</p>
     */
    @NameInMap("tag_name")
    @Validation(required = true)
    public String tagName;

    // 标签类型
    /**
     * <strong>example:</strong>
     * <p>CMN</p>
     */
    @NameInMap("tag_type")
    public String tagType;

    // 标签文本
    /**
     * <strong>example:</strong>
     * <p>网站失联</p>
     */
    @NameInMap("tag_text")
    public String tagText;

    // 线索概览
    /**
     * <strong>example:</strong>
     * <p>企业已列入经营异常名录</p>
     */
    @NameInMap("tag_clue")
    public String tagClue;

    // 线索明细类型
    /**
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("clue_detail_type")
    public String clueDetailType;

    // 线索明细
    /**
     * <strong>example:</strong>
     * <p>通过登记的住所或者经营场所无法联系</p>
     */
    @NameInMap("tag_clue_detail")
    public String tagClueDetail;

    public static RtopRiskTag build(java.util.Map<String, ?> map) throws Exception {
        RtopRiskTag self = new RtopRiskTag();
        return TeaModel.build(map, self);
    }

    public RtopRiskTag setTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }
    public String getTagId() {
        return this.tagId;
    }

    public RtopRiskTag setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

    public RtopRiskTag setTagType(String tagType) {
        this.tagType = tagType;
        return this;
    }
    public String getTagType() {
        return this.tagType;
    }

    public RtopRiskTag setTagText(String tagText) {
        this.tagText = tagText;
        return this;
    }
    public String getTagText() {
        return this.tagText;
    }

    public RtopRiskTag setTagClue(String tagClue) {
        this.tagClue = tagClue;
        return this;
    }
    public String getTagClue() {
        return this.tagClue;
    }

    public RtopRiskTag setClueDetailType(String clueDetailType) {
        this.clueDetailType = clueDetailType;
        return this;
    }
    public String getClueDetailType() {
        return this.clueDetailType;
    }

    public RtopRiskTag setTagClueDetail(String tagClueDetail) {
        this.tagClueDetail = tagClueDetail;
        return this;
    }
    public String getTagClueDetail() {
        return this.tagClueDetail;
    }

}
