<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIALEXTERNAL\Models;

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
    // STARTED 正常有效、STOPPED 停服、STAETED_IN_ARR 欠费运行中......
    /**
     * @example STARTED
     *
     * @var string
     */
    public $status;

    // 实例生效时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $startTime;

    // 实例计划停服时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $planStopTime;

    // 实例实际停服时间
    /**
     * @example 2018-10-10T10:10:00Z
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

    // 购买数量
    /**
     * @example
     *
     * @var int
     */
    public $num;

    // 商品规格售卖类型：按量付费（POST）、资源包（BAG）、包年包月（PRE）
    /**
     * @example POST
     *
     * @var string
     */
    public $specType;

    // 资源（包）code
    /**
     * @example 暂无
     *
     * @var string
     */
    public $resCode;

    // 其他上下文信息，kv结构，本先新增，后面有新新增可以放在这里面，不用再升级接口
    /**
     * @example 暂无
     *
     * @var string
     */
    public $context;
    protected $_name = [
        'specCode'       => 'spec_code',
        'specInstanceId' => 'spec_instance_id',
        'status'         => 'status',
        'startTime'      => 'start_time',
        'planStopTime'   => 'plan_stop_time',
        'actualStopTime' => 'actual_stop_time',
        'merchantId'     => 'merchant_id',
        'num'            => 'num',
        'specType'       => 'spec_type',
        'resCode'        => 'res_code',
        'context'        => 'context',
    ];

    public function validate()
    {
        Model::validateRequired('specCode', $this->specCode, true);
        Model::validateRequired('specInstanceId', $this->specInstanceId, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('num', $this->num, true);
        Model::validateRequired('specType', $this->specType, true);
        Model::validatePattern('startTime', $this->startTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('planStopTime', $this->planStopTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('actualStopTime', $this->actualStopTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validateMaxLength('resCode', $this->resCode, 128);
        Model::validateMaxLength('context', $this->context, 2048);
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
        if (null !== $this->num) {
            $res['num'] = $this->num;
        }
        if (null !== $this->specType) {
            $res['spec_type'] = $this->specType;
        }
        if (null !== $this->resCode) {
            $res['res_code'] = $this->resCode;
        }
        if (null !== $this->context) {
            $res['context'] = $this->context;
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
        if (isset($map['num'])) {
            $model->num = $map['num'];
        }
        if (isset($map['spec_type'])) {
            $model->specType = $map['spec_type'];
        }
        if (isset($map['res_code'])) {
            $model->resCode = $map['res_code'];
        }
        if (isset($map['context'])) {
            $model->context = $map['context'];
        }

        return $model;
    }
}
