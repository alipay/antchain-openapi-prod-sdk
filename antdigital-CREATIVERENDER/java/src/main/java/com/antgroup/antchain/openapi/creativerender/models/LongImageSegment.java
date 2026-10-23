// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creativerender.models;

import com.aliyun.tea.*;

public class LongImageSegment extends TeaModel {
    // 全局唯一的分段业务 ID。
    /**
     * <strong>example:</strong>
     * <p>LS_xxx</p>
     */
    @NameInMap("segment_id")
    public String segmentId;

    // 分段类型：BANNER 为长图头图；CONTENT 为正文段图。
    /**
     * <strong>example:</strong>
     * <p>BANNER</p>
     */
    @NameInMap("segment_type")
    public String segmentType;

    // 展示顺序，从 0 开始；头图固定为 0，正文从 1 开始，值越小越靠前。
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("sort_no")
    public Long sortNo;

    // 首次生成该分段使用的原文，后续编辑或回滚不会修改。
    /**
     * <strong>example:</strong>
     * <p>基金投资亮点</p>
     */
    @NameInMap("source_text")
    public String sourceText;

    // 当前分段版本 ID；仅在 current_status 为 SUCCESS 时可作为子图编辑来源。
    /**
     * <strong>example:</strong>
     * <p>LV_xxx</p>
     */
    @NameInMap("current_version_id")
    public String currentVersionId;

    // 当前版本状态：PROCESSING、SUCCESS、FAILED、CONFLICT。
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("current_status")
    public String currentStatus;

    // 当前版本的图片地址。
    /**
     * <strong>example:</strong>
     * <p><a href="https://example.com/segment.png">https://example.com/segment.png</a></p>
     */
    @NameInMap("current_image_url")
    public String currentImageUrl;

    // 最近可用的成功版本 ID，可作为子图编辑来源；没有成功版本时为空。
    /**
     * <strong>example:</strong>
     * <p>LV_xxx</p>
     */
    @NameInMap("last_success_version_id")
    public String lastSuccessVersionId;

    // last_success_version_id 对应的图片地址；没有成功成果时为空。
    /**
     * <strong>example:</strong>
     * <p><a href="https://example.com/segment.png">https://example.com/segment.png</a></p>
     */
    @NameInMap("last_success_image_url")
    public String lastSuccessImageUrl;

    public static LongImageSegment build(java.util.Map<String, ?> map) throws Exception {
        LongImageSegment self = new LongImageSegment();
        return TeaModel.build(map, self);
    }

    public LongImageSegment setSegmentId(String segmentId) {
        this.segmentId = segmentId;
        return this;
    }
    public String getSegmentId() {
        return this.segmentId;
    }

    public LongImageSegment setSegmentType(String segmentType) {
        this.segmentType = segmentType;
        return this;
    }
    public String getSegmentType() {
        return this.segmentType;
    }

    public LongImageSegment setSortNo(Long sortNo) {
        this.sortNo = sortNo;
        return this;
    }
    public Long getSortNo() {
        return this.sortNo;
    }

    public LongImageSegment setSourceText(String sourceText) {
        this.sourceText = sourceText;
        return this;
    }
    public String getSourceText() {
        return this.sourceText;
    }

    public LongImageSegment setCurrentVersionId(String currentVersionId) {
        this.currentVersionId = currentVersionId;
        return this;
    }
    public String getCurrentVersionId() {
        return this.currentVersionId;
    }

    public LongImageSegment setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
        return this;
    }
    public String getCurrentStatus() {
        return this.currentStatus;
    }

    public LongImageSegment setCurrentImageUrl(String currentImageUrl) {
        this.currentImageUrl = currentImageUrl;
        return this;
    }
    public String getCurrentImageUrl() {
        return this.currentImageUrl;
    }

    public LongImageSegment setLastSuccessVersionId(String lastSuccessVersionId) {
        this.lastSuccessVersionId = lastSuccessVersionId;
        return this;
    }
    public String getLastSuccessVersionId() {
        return this.lastSuccessVersionId;
    }

    public LongImageSegment setLastSuccessImageUrl(String lastSuccessImageUrl) {
        this.lastSuccessImageUrl = lastSuccessImageUrl;
        return this;
    }
    public String getLastSuccessImageUrl() {
        return this.lastSuccessImageUrl;
    }

}
