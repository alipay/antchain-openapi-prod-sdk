<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class WarehouseReceiptTraceInfo extends Model
{
    // string (enum: PICK_UP, WEAK_ASSET, WEAK_ASSET_TRANSFER, WAREHOUSE_RECEIPT_TRANSFER, WAREHOUSE_RECEIPT_REGISTER, PLEDGE_APPLICATION, PLEDGE_RELEASE, WAREHOUSE_RECEIPT_CANCEL, WAREHOUSE_RECEIPT_UPDATE)
    /**
     * @example PICK_UP
     *
     * @var string
     */
    public $operateType;

    // 操作标识
    /**
     * @example gggg
     *
     * @var string
     */
    public $operateTypeDesc;

    // 操作时间
    /**
     * @example 5676989
     *
     * @var int
     */
    public $operateTime;

    // 区块链信息
    /**
     * @example info
     *
     * @var BlockchainInfo
     */
    public $blockchainInfo;

    // 操作主体
    /**
     * @example ff
     *
     * @var string
     */
    public $operatorName;

    // string (enum: COMMIT, AGREE, REJECT, CREATE, START, PRE_ALLOC, ALLOC, UPLOAD, UPDATE, COMPLETE, CONFIRM, CONFIRM_COMMIT, CONFIRM_RECALL, TRIGGER, SPLIT, RECALL)
    /**
     * @example COMMIT
     *
     * @var string
     */
    public $actionType;

    // 动作描述
    /**
     * @example gtger
     *
     * @var string
     */
    public $actionDesc;

    // 操作对象
    /**
     * @example tttt
     *
     * @var string
     */
    public $operateObject;
    protected $_name = [
        'operateType'     => 'operate_type',
        'operateTypeDesc' => 'operate_type_desc',
        'operateTime'     => 'operate_time',
        'blockchainInfo'  => 'blockchain_info',
        'operatorName'    => 'operator_name',
        'actionType'      => 'action_type',
        'actionDesc'      => 'action_desc',
        'operateObject'   => 'operate_object',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->operateType) {
            $res['operate_type'] = $this->operateType;
        }
        if (null !== $this->operateTypeDesc) {
            $res['operate_type_desc'] = $this->operateTypeDesc;
        }
        if (null !== $this->operateTime) {
            $res['operate_time'] = $this->operateTime;
        }
        if (null !== $this->blockchainInfo) {
            $res['blockchain_info'] = null !== $this->blockchainInfo ? $this->blockchainInfo->toMap() : null;
        }
        if (null !== $this->operatorName) {
            $res['operator_name'] = $this->operatorName;
        }
        if (null !== $this->actionType) {
            $res['action_type'] = $this->actionType;
        }
        if (null !== $this->actionDesc) {
            $res['action_desc'] = $this->actionDesc;
        }
        if (null !== $this->operateObject) {
            $res['operate_object'] = $this->operateObject;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return WarehouseReceiptTraceInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['operate_type'])) {
            $model->operateType = $map['operate_type'];
        }
        if (isset($map['operate_type_desc'])) {
            $model->operateTypeDesc = $map['operate_type_desc'];
        }
        if (isset($map['operate_time'])) {
            $model->operateTime = $map['operate_time'];
        }
        if (isset($map['blockchain_info'])) {
            $model->blockchainInfo = BlockchainInfo::fromMap($map['blockchain_info']);
        }
        if (isset($map['operator_name'])) {
            $model->operatorName = $map['operator_name'];
        }
        if (isset($map['action_type'])) {
            $model->actionType = $map['action_type'];
        }
        if (isset($map['action_desc'])) {
            $model->actionDesc = $map['action_desc'];
        }
        if (isset($map['operate_object'])) {
            $model->operateObject = $map['operate_object'];
        }

        return $model;
    }
}
