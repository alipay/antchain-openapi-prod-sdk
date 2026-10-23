<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class ImageBlackWhiteResult extends Model {
    protected $_name = [
        'matched' => 'matched',
        'matchType' => 'match_type',
        'matchSource' => 'match_source',
        'matchScore' => 'match_score',
        'matchThreshold' => 'match_threshold',
        'matchedImageId' => 'matched_image_id',
        'matchedLibraryName' => 'matched_library_name',
        'executedFullImage' => 'executed_full_image',
        'executedFace' => 'executed_face',
        'faceDetected' => 'face_detected',
        'fullImageEmbedStatus' => 'full_image_embed_status',
        'faceEmbedStatus' => 'face_embed_status',
        'fullImageTopScore' => 'full_image_top_score',
        'fullImageThreshold' => 'full_image_threshold',
        'faceTopScore' => 'face_top_score',
        'faceThreshold' => 'face_threshold',
        'degraded' => 'degraded',
        'degradeReason' => 'degrade_reason',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->matched) {
            $res['matched'] = $this->matched;
        }
        if (null !== $this->matchType) {
            $res['match_type'] = $this->matchType;
        }
        if (null !== $this->matchSource) {
            $res['match_source'] = $this->matchSource;
        }
        if (null !== $this->matchScore) {
            $res['match_score'] = $this->matchScore;
        }
        if (null !== $this->matchThreshold) {
            $res['match_threshold'] = $this->matchThreshold;
        }
        if (null !== $this->matchedImageId) {
            $res['matched_image_id'] = $this->matchedImageId;
        }
        if (null !== $this->matchedLibraryName) {
            $res['matched_library_name'] = $this->matchedLibraryName;
        }
        if (null !== $this->executedFullImage) {
            $res['executed_full_image'] = $this->executedFullImage;
        }
        if (null !== $this->executedFace) {
            $res['executed_face'] = $this->executedFace;
        }
        if (null !== $this->faceDetected) {
            $res['face_detected'] = $this->faceDetected;
        }
        if (null !== $this->fullImageEmbedStatus) {
            $res['full_image_embed_status'] = $this->fullImageEmbedStatus;
        }
        if (null !== $this->faceEmbedStatus) {
            $res['face_embed_status'] = $this->faceEmbedStatus;
        }
        if (null !== $this->fullImageTopScore) {
            $res['full_image_top_score'] = $this->fullImageTopScore;
        }
        if (null !== $this->fullImageThreshold) {
            $res['full_image_threshold'] = $this->fullImageThreshold;
        }
        if (null !== $this->faceTopScore) {
            $res['face_top_score'] = $this->faceTopScore;
        }
        if (null !== $this->faceThreshold) {
            $res['face_threshold'] = $this->faceThreshold;
        }
        if (null !== $this->degraded) {
            $res['degraded'] = $this->degraded;
        }
        if (null !== $this->degradeReason) {
            $res['degrade_reason'] = $this->degradeReason;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ImageBlackWhiteResult
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['matched'])){
            $model->matched = $map['matched'];
        }
        if(isset($map['match_type'])){
            $model->matchType = $map['match_type'];
        }
        if(isset($map['match_source'])){
            $model->matchSource = $map['match_source'];
        }
        if(isset($map['match_score'])){
            $model->matchScore = $map['match_score'];
        }
        if(isset($map['match_threshold'])){
            $model->matchThreshold = $map['match_threshold'];
        }
        if(isset($map['matched_image_id'])){
            $model->matchedImageId = $map['matched_image_id'];
        }
        if(isset($map['matched_library_name'])){
            $model->matchedLibraryName = $map['matched_library_name'];
        }
        if(isset($map['executed_full_image'])){
            $model->executedFullImage = $map['executed_full_image'];
        }
        if(isset($map['executed_face'])){
            $model->executedFace = $map['executed_face'];
        }
        if(isset($map['face_detected'])){
            $model->faceDetected = $map['face_detected'];
        }
        if(isset($map['full_image_embed_status'])){
            $model->fullImageEmbedStatus = $map['full_image_embed_status'];
        }
        if(isset($map['face_embed_status'])){
            $model->faceEmbedStatus = $map['face_embed_status'];
        }
        if(isset($map['full_image_top_score'])){
            $model->fullImageTopScore = $map['full_image_top_score'];
        }
        if(isset($map['full_image_threshold'])){
            $model->fullImageThreshold = $map['full_image_threshold'];
        }
        if(isset($map['face_top_score'])){
            $model->faceTopScore = $map['face_top_score'];
        }
        if(isset($map['face_threshold'])){
            $model->faceThreshold = $map['face_threshold'];
        }
        if(isset($map['degraded'])){
            $model->degraded = $map['degraded'];
        }
        if(isset($map['degrade_reason'])){
            $model->degradeReason = $map['degrade_reason'];
        }
        return $model;
    }
    // 是否命中（任一维度命中即 true）
    /**
     * @example true
     * @var bool
     */
    public $matched;

    // 命中名单类型：BLACK / WHITE
    /**
     * @example WHITE
     * @var string
     */
    public $matchType;

    // 命中向量来源：FULL_IMAGE / FACE
    /**
     * @example FULL_IMAGE
     * @var string
     */
    public $matchSource;

    // 命中得分（ES 返回 score 经归一化后值）
    /**
     * @example 1.1
     * @var int
     */
    public $matchScore;

    // 命中所用阈值
    /**
     * @example 1.1
     * @var int
     */
    public $matchThreshold;

    // 命中图片 id
    /**
     * @example 1
     * @var string
     */
    public $matchedImageId;

    // 命中图库名称
    /**
     * @example test
     * @var string
     */
    public $matchedLibraryName;

    // 是否执行了全图维度（存在启用的全图库）
    /**
     * @example true
     * @var bool
     */
    public $executedFullImage;

    // 是否执行了人脸维度（存在启用的人脸库）
    /**
     * @example true
     * @var bool
     */
    public $executedFace;

    // 人脸检测结果（YuNet）：null 表示未执行人脸维度
    /**
     * @example true
     * @var bool
     */
    public $faceDetected;

    // 全图向量化状态：SUCCESS / SKIP / DEGRADE
    /**
     * @example SUCCESS
     * @var string
     */
    public $fullImageEmbedStatus;

    // 人脸向量化状态：SUCCESS / SKIP（无人脸或未执行）/ DEGRADE
    /**
     * @example SUCCESS
     * @var string
     */
    public $faceEmbedStatus;

    // 全图维度 ES 最高分（未命中也记录，便于阈值对比；无检索为 null）
    /**
     * @example 1.2
     * @var int
     */
    public $fullImageTopScore;

    // 全图维度阈值
    /**
     * @example 1.2
     * @var int
     */
    public $fullImageThreshold;

    // 人脸维度 ES 最高分（未命中也记录；无检索为 null）
    /**
     * @example 1.2
     * @var int
     */
    public $faceTopScore;

    // 人脸维度阈值
    /**
     * @example 1
     * @var int
     */
    public $faceThreshold;

    // 是否降级（异常/服务不可用导致跳过排黑排白）
    /**
     * @example true
     * @var bool
     */
    public $degraded;

    // 降级或短路原因（参数缺失/无启用库/下载失败/向量化异常等）
    /**
     * @example 参数缺失
     * @var string
     */
    public $degradeReason;

}
