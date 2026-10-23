<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVERENDER\Models;

use AlibabaCloud\Tea\Model;

class LongImageSegment extends Model {
    protected $_name = [
        'segmentId' => 'segment_id',
        'segmentType' => 'segment_type',
        'sortNo' => 'sort_no',
        'sourceText' => 'source_text',
        'currentVersionId' => 'current_version_id',
        'currentStatus' => 'current_status',
        'currentImageUrl' => 'current_image_url',
        'lastSuccessVersionId' => 'last_success_version_id',
        'lastSuccessImageUrl' => 'last_success_image_url',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->segmentId) {
            $res['segment_id'] = $this->segmentId;
        }
        if (null !== $this->segmentType) {
            $res['segment_type'] = $this->segmentType;
        }
        if (null !== $this->sortNo) {
            $res['sort_no'] = $this->sortNo;
        }
        if (null !== $this->sourceText) {
            $res['source_text'] = $this->sourceText;
        }
        if (null !== $this->currentVersionId) {
            $res['current_version_id'] = $this->currentVersionId;
        }
        if (null !== $this->currentStatus) {
            $res['current_status'] = $this->currentStatus;
        }
        if (null !== $this->currentImageUrl) {
            $res['current_image_url'] = $this->currentImageUrl;
        }
        if (null !== $this->lastSuccessVersionId) {
            $res['last_success_version_id'] = $this->lastSuccessVersionId;
        }
        if (null !== $this->lastSuccessImageUrl) {
            $res['last_success_image_url'] = $this->lastSuccessImageUrl;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return LongImageSegment
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['segment_id'])){
            $model->segmentId = $map['segment_id'];
        }
        if(isset($map['segment_type'])){
            $model->segmentType = $map['segment_type'];
        }
        if(isset($map['sort_no'])){
            $model->sortNo = $map['sort_no'];
        }
        if(isset($map['source_text'])){
            $model->sourceText = $map['source_text'];
        }
        if(isset($map['current_version_id'])){
            $model->currentVersionId = $map['current_version_id'];
        }
        if(isset($map['current_status'])){
            $model->currentStatus = $map['current_status'];
        }
        if(isset($map['current_image_url'])){
            $model->currentImageUrl = $map['current_image_url'];
        }
        if(isset($map['last_success_version_id'])){
            $model->lastSuccessVersionId = $map['last_success_version_id'];
        }
        if(isset($map['last_success_image_url'])){
            $model->lastSuccessImageUrl = $map['last_success_image_url'];
        }
        return $model;
    }
    // 全局唯一的分段业务 ID。
    /**
     * @example LS_xxx
     * @var string
     */
    public $segmentId;

    // 分段类型：BANNER 为长图头图；CONTENT 为正文段图。
    /**
     * @example BANNER
     * @var string
     */
    public $segmentType;

    // 展示顺序，从 0 开始；头图固定为 0，正文从 1 开始，值越小越靠前。
    /**
     * @example 0
     * @var int
     */
    public $sortNo;

    // 首次生成该分段使用的原文，后续编辑或回滚不会修改。
    /**
     * @example 基金投资亮点
     * @var string
     */
    public $sourceText;

    // 当前分段版本 ID；仅在 current_status 为 SUCCESS 时可作为子图编辑来源。
    /**
     * @example LV_xxx
     * @var string
     */
    public $currentVersionId;

    // 当前版本状态：PROCESSING、SUCCESS、FAILED、CONFLICT。
    /**
     * @example SUCCESS
     * @var string
     */
    public $currentStatus;

    // 当前版本的图片地址。
    /**
     * @example https://example.com/segment.png
     * @var string
     */
    public $currentImageUrl;

    // 最近可用的成功版本 ID，可作为子图编辑来源；没有成功版本时为空。
    /**
     * @example LV_xxx
     * @var string
     */
    public $lastSuccessVersionId;

    // last_success_version_id 对应的图片地址；没有成功成果时为空。
    /**
     * @example https://example.com/segment.png
     * @var string
     */
    public $lastSuccessImageUrl;

}
