<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class LabelTrace extends Model
{
    // 场景码
    /**
     * @example XXXXX
     *
     * @var string
     */
    public $scene;

    // 标签id
    /**
     * @example XXXXX
     *
     * @var string
     */
    public $labelId;

    // 标签状态
    /**
     * @example XXXXX
     *
     * @var string
     */
    public $labelStatus;

    // 资产Id
    /**
     * @example XXXXX
     *
     * @var string
     */
    public $assetId;

    // 操作员
    /**
     * @example XXXXX
     *
     * @var string
     */
    public $operator;

    // 标签拥有者
    /**
     * @example XXXXX
     *
     * @var string
     */
    public $owner;

    // 标签所处流程
    /**
     * @example XXXXX
     *
     * @var string
     */
    public $process;

    // 标签操作
    /**
     * @example XXXXX
     *
     * @var string
     */
    public $action;

    // 操作时间
    /**
     * @example 1623297766839
     *
     * @var int
     */
    public $operateTime;

    // 操作设备
    /**
     * @example XXXXX
     *
     * @var string
     */
    public $operateDevice;

    // 操作内容
    /**
     * @example XXXXX
     *
     * @var string
     */
    public $content;

    // 链上哈希
    /**
     * @example XXXXX
     *
     * @var string
     */
    public $txHash;

    // 上链时间
    /**
     * @example XXXXX
     *
     * @var string
     */
    public $txTime;

    // 区块链高度
    /**
     * @example XXXXX
     *
     * @var int
     */
    public $blockNumber;

    // 请求ID
    /**
     * @example XXXXX
     *
     * @var string
     */
    public $requestId;

    // 上链失败的错误码
    /**
     * @example XXXXX
     *
     * @var string
     */
    public $errorCode;

    // 上链失败的错误信息
    /**
     * @example XXXXX
     *
     * @var string
     */
    public $errorMsg;

    // 是否上链成功
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isSuccess;
    protected $_name = [
        'scene'         => 'scene',
        'labelId'       => 'label_id',
        'labelStatus'   => 'label_status',
        'assetId'       => 'asset_id',
        'operator'      => 'operator',
        'owner'         => 'owner',
        'process'       => 'process',
        'action'        => 'action',
        'operateTime'   => 'operate_time',
        'operateDevice' => 'operate_device',
        'content'       => 'content',
        'txHash'        => 'tx_hash',
        'txTime'        => 'tx_time',
        'blockNumber'   => 'block_number',
        'requestId'     => 'request_id',
        'errorCode'     => 'error_code',
        'errorMsg'      => 'error_msg',
        'isSuccess'     => 'is_success',
    ];

    public function validate()
    {
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('labelId', $this->labelId, true);
        Model::validateRequired('labelStatus', $this->labelStatus, true);
        Model::validateRequired('operateTime', $this->operateTime, true);
        Model::validateRequired('txHash', $this->txHash, true);
    }

    public function toMap()
    {
        $res = [];
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
        if (null !== $this->operateDevice) {
            $res['operate_device'] = $this->operateDevice;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->txTime) {
            $res['tx_time'] = $this->txTime;
        }
        if (null !== $this->blockNumber) {
            $res['block_number'] = $this->blockNumber;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }
        if (null !== $this->errorMsg) {
            $res['error_msg'] = $this->errorMsg;
        }
        if (null !== $this->isSuccess) {
            $res['is_success'] = $this->isSuccess;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LabelTrace
     */
    public static function fromMap($map = [])
    {
        $model = new self();
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
        if (isset($map['operate_device'])) {
            $model->operateDevice = $map['operate_device'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['tx_time'])) {
            $model->txTime = $map['tx_time'];
        }
        if (isset($map['block_number'])) {
            $model->blockNumber = $map['block_number'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['error_code'])) {
            $model->errorCode = $map['error_code'];
        }
        if (isset($map['error_msg'])) {
            $model->errorMsg = $map['error_msg'];
        }
        if (isset($map['is_success'])) {
            $model->isSuccess = $map['is_success'];
        }

        return $model;
    }
}
