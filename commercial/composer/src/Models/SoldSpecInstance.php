<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class SoldSpecInstance extends Model
{
    // 规格码
    /**
     * @example 暂无
     *
     * @var string
     */
    public $specCode;

    // 规格实例id
    /**
     * @example 暂无
     *
     * @var string
     */
    public $specInstanceId;

    // 规格实例运行状态.
    // 实例状态 STARTED 正常有效、STOPPED 停服、STAETED_IN_ARR 欠费运行中
    /**
     * @example STARTED
     *
     * @var string
     */
    public $status;

    // 实例生效时间
    /**
     * @example 2018-10-10 13:15:24
     *
     * @var string
     */
    public $startTime;

    // 实例计划停服时间
    /**
     * @example 2018-10-11 00:00:00
     *
     * @var string
     */
    public $planStopTime;

    // 实例实际停服时间
    /**
     * @example 2018-10-11 00:00:01
     *
     * @var string
     */
    public $actualStopTime;

    // 购买规格实例的商户id(商业中台用来唯一标识商户的id)
    /**
     * @example 暂无
     *
     * @var string
     */
    public $merchantId;
    protected $_name = [
        'specCode'       => 'spec_code',
        'specInstanceId' => 'spec_instance_id',
        'status'         => 'status',
        'startTime'      => 'start_time',
        'planStopTime'   => 'plan_stop_time',
        'actualStopTime' => 'actual_stop_time',
        'merchantId'     => 'merchant_id',
    ];

    public function validate()
    {
        Model::validateRequired('specCode', $this->specCode, true);
        Model::validateRequired('specInstanceId', $this->specInstanceId, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validatePattern('startTime', $this->startTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('planStopTime', $this->planStopTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('actualStopTime', $this->actualStopTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->specCode) {
            $res['spec_code'] = $this->specCode;
        }
        if (null !== $this->specInstanceId) {
            $res['spec_instance_id'] = $this->specInstanceId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->planStopTime) {
            $res['plan_stop_time'] = $this->planStopTime;
        }
        if (null !== $this->actualStopTime) {
            $res['actual_stop_time'] = $this->actualStopTime;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SoldSpecInstance
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['spec_code'])) {
            $model->specCode = $map['spec_code'];
        }
        if (isset($map['spec_instance_id'])) {
            $model->specInstanceId = $map['spec_instance_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['plan_stop_time'])) {
            $model->planStopTime = $map['plan_stop_time'];
        }
        if (isset($map['actual_stop_time'])) {
            $model->actualStopTime = $map['actual_stop_time'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }

        return $model;
    }
}
