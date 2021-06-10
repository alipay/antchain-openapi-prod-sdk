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

    // 操作时间
    /**
     * @var int
     */
    public $operateTime;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'scene'             => 'scene',
        'labelId'           => 'label_id',
        'labelStatus'       => 'label_status',
        'assetId'           => 'asset_id',
        'operator'          => 'operator',
        'owner'             => 'owner',
        'process'           => 'process',
        'action'            => 'action',
        'operateTime'       => 'operate_time',
    ];

    public function validate()
    {
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
        if (null !== $this->operateTime) {
            $res['operate_time'] = $this->operateTime;
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
        if (isset($map['operate_time'])) {
            $model->operateTime = $map['operate_time'];
        }

        return $model;
    }
}
