// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class ImageBlackWhiteResult extends TeaModel {
    // 是否命中（任一维度命中即 true）
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("matched")
    public Boolean matched;

    // 命中名单类型
    /**
     * <strong>example:</strong>
     * <p>WHITE</p>
     */
    @NameInMap("match_type")
    public String matchType;

    // 命中向量来源
    /**
     * <strong>example:</strong>
     * <p>FULL_IMAGE</p>
     */
    @NameInMap("match_source")
    public String matchSource;

    // 命中得分（ES 返回 score 经归一化后值）
    /**
     * <strong>example:</strong>
     * <p>1.1</p>
     */
    @NameInMap("match_score")
    public Long matchScore;

    // 命中所用阈值
    /**
     * <strong>example:</strong>
     * <p>1.1</p>
     */
    @NameInMap("match_threshold")
    public Long matchThreshold;

    // 命中图片 id
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("matched_image_id")
    public String matchedImageId;

    // 命中图库名称
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("matched_library_name")
    public String matchedLibraryName;

    // 是否执行了全图维度（存在启用的全图库）
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("executed_full_image")
    public Boolean executedFullImage;

    // 是否执行了人脸维度（存在启用的人脸库）
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("executed_face")
    public Boolean executedFace;

    // 人脸检测结果
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("face_detected")
    public Boolean faceDetected;

    // 全图向量化状态
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("full_image_embed_status")
    public String fullImageEmbedStatus;

    // 人脸向量化状态
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("face_embed_status")
    public String faceEmbedStatus;

    // 全图维度 ES 最高分
    /**
     * <strong>example:</strong>
     * <p>1.2</p>
     */
    @NameInMap("full_image_top_score")
    public Long fullImageTopScore;

    // 全图维度阈值
    /**
     * <strong>example:</strong>
     * <p>1.2</p>
     */
    @NameInMap("full_image_threshold")
    public Long fullImageThreshold;

    // 人脸维度 ES 最高分
    /**
     * <strong>example:</strong>
     * <p>1.2</p>
     */
    @NameInMap("face_top_score")
    public Long faceTopScore;

    // 人脸维度阈值
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("face_threshold")
    public Long faceThreshold;

    // 是否降级
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("degraded")
    public Boolean degraded;

    // 降级或短路原因
    /**
     * <strong>example:</strong>
     * <p>参数缺失</p>
     */
    @NameInMap("degrade_reason")
    public String degradeReason;

    public static ImageBlackWhiteResult build(java.util.Map<String, ?> map) throws Exception {
        ImageBlackWhiteResult self = new ImageBlackWhiteResult();
        return TeaModel.build(map, self);
    }

    public ImageBlackWhiteResult setMatched(Boolean matched) {
        this.matched = matched;
        return this;
    }
    public Boolean getMatched() {
        return this.matched;
    }

    public ImageBlackWhiteResult setMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }
    public String getMatchType() {
        return this.matchType;
    }

    public ImageBlackWhiteResult setMatchSource(String matchSource) {
        this.matchSource = matchSource;
        return this;
    }
    public String getMatchSource() {
        return this.matchSource;
    }

    public ImageBlackWhiteResult setMatchScore(Long matchScore) {
        this.matchScore = matchScore;
        return this;
    }
    public Long getMatchScore() {
        return this.matchScore;
    }

    public ImageBlackWhiteResult setMatchThreshold(Long matchThreshold) {
        this.matchThreshold = matchThreshold;
        return this;
    }
    public Long getMatchThreshold() {
        return this.matchThreshold;
    }

    public ImageBlackWhiteResult setMatchedImageId(String matchedImageId) {
        this.matchedImageId = matchedImageId;
        return this;
    }
    public String getMatchedImageId() {
        return this.matchedImageId;
    }

    public ImageBlackWhiteResult setMatchedLibraryName(String matchedLibraryName) {
        this.matchedLibraryName = matchedLibraryName;
        return this;
    }
    public String getMatchedLibraryName() {
        return this.matchedLibraryName;
    }

    public ImageBlackWhiteResult setExecutedFullImage(Boolean executedFullImage) {
        this.executedFullImage = executedFullImage;
        return this;
    }
    public Boolean getExecutedFullImage() {
        return this.executedFullImage;
    }

    public ImageBlackWhiteResult setExecutedFace(Boolean executedFace) {
        this.executedFace = executedFace;
        return this;
    }
    public Boolean getExecutedFace() {
        return this.executedFace;
    }

    public ImageBlackWhiteResult setFaceDetected(Boolean faceDetected) {
        this.faceDetected = faceDetected;
        return this;
    }
    public Boolean getFaceDetected() {
        return this.faceDetected;
    }

    public ImageBlackWhiteResult setFullImageEmbedStatus(String fullImageEmbedStatus) {
        this.fullImageEmbedStatus = fullImageEmbedStatus;
        return this;
    }
    public String getFullImageEmbedStatus() {
        return this.fullImageEmbedStatus;
    }

    public ImageBlackWhiteResult setFaceEmbedStatus(String faceEmbedStatus) {
        this.faceEmbedStatus = faceEmbedStatus;
        return this;
    }
    public String getFaceEmbedStatus() {
        return this.faceEmbedStatus;
    }

    public ImageBlackWhiteResult setFullImageTopScore(Long fullImageTopScore) {
        this.fullImageTopScore = fullImageTopScore;
        return this;
    }
    public Long getFullImageTopScore() {
        return this.fullImageTopScore;
    }

    public ImageBlackWhiteResult setFullImageThreshold(Long fullImageThreshold) {
        this.fullImageThreshold = fullImageThreshold;
        return this;
    }
    public Long getFullImageThreshold() {
        return this.fullImageThreshold;
    }

    public ImageBlackWhiteResult setFaceTopScore(Long faceTopScore) {
        this.faceTopScore = faceTopScore;
        return this;
    }
    public Long getFaceTopScore() {
        return this.faceTopScore;
    }

    public ImageBlackWhiteResult setFaceThreshold(Long faceThreshold) {
        this.faceThreshold = faceThreshold;
        return this;
    }
    public Long getFaceThreshold() {
        return this.faceThreshold;
    }

    public ImageBlackWhiteResult setDegraded(Boolean degraded) {
        this.degraded = degraded;
        return this;
    }
    public Boolean getDegraded() {
        return this.degraded;
    }

    public ImageBlackWhiteResult setDegradeReason(String degradeReason) {
        this.degradeReason = degradeReason;
        return this;
    }
    public String getDegradeReason() {
        return this.degradeReason;
    }

}
