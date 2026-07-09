<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryLabelTraceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 第几页，默认值为1
    /**
     * @var int
     */
    public $pageIndex;

    // 单页记录数，默认为10
    /**
     * @var int
     */
    public $pageSize;

    // 场景码 , 使用asset_id 查询时，scene也必须传入
    /**
     * @var string
     */
    public $scene;

    // 标签Id
    /**
     * @var string
     */
    public $labelId;

    // 标签状态
    /**
     * @var string
     */
    public $labelStatus;

    // 资产Id
    /**
     * @var string
     */
    public $assetId;

    // 操作员
    /**
     * @var string
     */
    public $operator;

    // 标签拥有者
    /**
     * @var string
     */
    public $owner;

    // 标签所处流程
    /**
     * @var string
     */
    public $process;

    // 标签操作
    /**
     * @var string
     */
    public $action;

    // 开始时间
    /**
     * @var string
     */
    public $startTime;

    // 结束时间
    /**
     * @var string
     */
    public $endTime;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'pageIndex'         => 'page_index',
        'pageSize'          => 'page_size',
        'scene'             => 'scene',
        'labelId'           => 'label_id',
        'labelStatus'       => 'label_status',
        'assetId'           => 'asset_id',
        'operator'          => 'operator',
        'owner'             => 'owner',
        'process'           => 'process',
        'action'            => 'action',
        'startTime'         => 'start_time',
        'endTime'           => 'end_time',
    ];

    public function validate()
    {
        Model::validatePattern('startTime', $this->startTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('endTime', $this->endTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->pageIndex) {
            $res['page_index'] = $this->pageIndex;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->labelId) {
            $res['label_id'] = $this->labelId;
        }
        if (null !== $this->labelStatus) {
            $res['label_status'] = $this->labelStatus;
        }
        if (null !== $this->assetId) {
            $res['asset_id'] = $this->assetId;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->owner) {
            $res['owner'] = $this->owner;
        }
        if (null !== $this->process) {
            $res['process'] = $this->process;
        }
        if (null !== $this->action) {
            $res['action'] = $this->action;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryLabelTraceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['page_index'])) {
            $model->pageIndex = $map['page_index'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['label_id'])) {
            $model->labelId = $map['label_id'];
        }
        if (isset($map['label_status'])) {
            $model->labelStatus = $map['label_status'];
        }
        if (isset($map['asset_id'])) {
            $model->assetId = $map['asset_id'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['owner'])) {
            $model->owner = $map['owner'];
        }
        if (isset($map['process'])) {
            $model->process = $map['process'];
        }
        if (isset($map['action'])) {
            $model->action = $map['action'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }

        return $model;
    }
}
