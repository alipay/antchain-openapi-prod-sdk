<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class InstanceCapacity extends Model
{
    // 实例ID
    /**
     * @example A0KMMSFM00190219BMZNESCN1ZXEMO6IGIE
     *
     * @var string
     */
    public $instanceId;

    // 当前剩余容量
    /**
     * @example 1000
     *
     * @var string
     */
    public $currentCapacity;

    // 初始容量
    /**
     * @example 1000
     *
     * @var string
     */
    public $initialCapacity;

    // 起始时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $startTime;

    // 截止时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $endTime;

    // Valid：有效；Closed：已用完；Expired:已到期
    /**
     * @example 状态
     *
     * @var string
     */
    public $status;

    // 资源包对应商品码
    /**
     * @example KXSFFM00264687
     *
     * @var string
     */
    public $commodityCode;

    // 关联按量商品码
    /**
     * @example KKAASP00000001
     *
     * @var string
     */
    public $relPostpayCommodity;
    protected $_name = [
        'instanceId'          => 'instance_id',
        'currentCapacity'     => 'current_capacity',
        'initialCapacity'     => 'initial_capacity',
        'startTime'           => 'start_time',
        'endTime'             => 'end_time',
        'status'              => 'status',
        'commodityCode'       => 'commodity_code',
        'relPostpayCommodity' => 'rel_postpay_commodity',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('currentCapacity', $this->currentCapacity, true);
        Model::validateRequired('initialCapacity', $this->initialCapacity, true);
        Model::validateRequired('startTime', $this->startTime, true);
        Model::validateRequired('endTime', $this->endTime, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('commodityCode', $this->commodityCode, true);
        Model::validateRequired('relPostpayCommodity', $this->relPostpayCommodity, true);
        Model::validatePattern('startTime', $this->startTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('endTime', $this->endTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->currentCapacity) {
            $res['current_capacity'] = $this->currentCapacity;
        }
        if (null !== $this->initialCapacity) {
            $res['initial_capacity'] = $this->initialCapacity;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->commodityCode) {
            $res['commodity_code'] = $this->commodityCode;
        }
        if (null !== $this->relPostpayCommodity) {
            $res['rel_postpay_commodity'] = $this->relPostpayCommodity;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InstanceCapacity
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['current_capacity'])) {
            $model->currentCapacity = $map['current_capacity'];
        }
        if (isset($map['initial_capacity'])) {
            $model->initialCapacity = $map['initial_capacity'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['commodity_code'])) {
            $model->commodityCode = $map['commodity_code'];
        }
        if (isset($map['rel_postpay_commodity'])) {
            $model->relPostpayCommodity = $map['rel_postpay_commodity'];
        }

        return $model;
    }
}
