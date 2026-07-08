<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class DataDepositInfo extends Model
{
    // 存证字段值
    /**
     * @example
     *
     * @var DepositFieldValue[]
     */
    public $dataValue;

    // 数据存证区块链交易ID
    /**
     * @example c5fcc677a0b04c62973c2dbc72jcus83271
     *
     * @var string
     */
    public $txId;

    // 数据存证操作用户ID
    /**
     * @example user_001
     *
     * @var string
     */
    public $userId;

    // 存证数据内容
    /**
     * @example 待补充
     *
     * @var string
     */
    public $depositContent;

    // 存证执行状态
    /**
     * @example status
     *
     * @var string
     */
    public $status;

    // 存证执行(发起)时间
    /**
     * @example
     *
     * @var int
     */
    public $timestamp;
    protected $_name = [
        'dataValue'      => 'data_value',
        'txId'           => 'tx_id',
        'userId'         => 'user_id',
        'depositContent' => 'deposit_content',
        'status'         => 'status',
        'timestamp'      => 'timestamp',
    ];

    public function validate()
    {
        Model::validateRequired('dataValue', $this->dataValue, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('depositContent', $this->depositContent, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('timestamp', $this->timestamp, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->dataValue) {
            $res['data_value'] = [];
            if (null !== $this->dataValue && \is_array($this->dataValue)) {
                $n = 0;
                foreach ($this->dataValue as $item) {
                    $res['data_value'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->txId) {
            $res['tx_id'] = $this->txId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->depositContent) {
            $res['deposit_content'] = $this->depositContent;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DataDepositInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['data_value'])) {
            if (!empty($map['data_value'])) {
                $model->dataValue = [];
                $n                = 0;
                foreach ($map['data_value'] as $item) {
                    $model->dataValue[$n++] = null !== $item ? DepositFieldValue::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['tx_id'])) {
            $model->txId = $map['tx_id'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['deposit_content'])) {
            $model->depositContent = $map['deposit_content'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }

        return $model;
    }
}
