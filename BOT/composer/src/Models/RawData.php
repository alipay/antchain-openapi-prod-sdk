<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class RawData extends Model
{
    // 链上设备id
    /**
     * @example 1122
     *
     * @var string
     */
    public $chainDeviceId;

    // 数据内容
    /**
     * @example {"a","11"}
     *
     * @var string
     */
    public $content;

    // 设备id
    /**
     * @example 433
     *
     * @var string
     */
    public $deviceId;

    // 上链哈希
    /**
     * @example 5533
     *
     * @var string
     */
    public $txHash;

    // 上链时间
    /**
     * @example
     *
     * @var int
     */
    public $txTime;

    // 链上外围设备ID
    /**
     * @example 123123
     *
     * @var string
     */
    public $chainPeripheralId;

    // 外围设备ID
    /**
     * @example 123123
     *
     * @var string
     */
    public $peripheralId;
    protected $_name = [
        'chainDeviceId'     => 'chain_device_id',
        'content'           => 'content',
        'deviceId'          => 'device_id',
        'txHash'            => 'tx_hash',
        'txTime'            => 'tx_time',
        'chainPeripheralId' => 'chain_peripheral_id',
        'peripheralId'      => 'peripheral_id',
    ];

    public function validate()
    {
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('txHash', $this->txHash, true);
        Model::validateRequired('txTime', $this->txTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->chainDeviceId) {
            $res['chain_device_id'] = $this->chainDeviceId;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->deviceId) {
            $res['device_id'] = $this->deviceId;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->txTime) {
            $res['tx_time'] = $this->txTime;
        }
        if (null !== $this->chainPeripheralId) {
            $res['chain_peripheral_id'] = $this->chainPeripheralId;
        }
        if (null !== $this->peripheralId) {
            $res['peripheral_id'] = $this->peripheralId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RawData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['chain_device_id'])) {
            $model->chainDeviceId = $map['chain_device_id'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['device_id'])) {
            $model->deviceId = $map['device_id'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['tx_time'])) {
            $model->txTime = $map['tx_time'];
        }
        if (isset($map['chain_peripheral_id'])) {
            $model->chainPeripheralId = $map['chain_peripheral_id'];
        }
        if (isset($map['peripheral_id'])) {
            $model->peripheralId = $map['peripheral_id'];
        }

        return $model;
    }
}
