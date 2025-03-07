<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class ApplyFundAssertorderRequest extends Model
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

    // 授权id
    /**
     * @var string
     */
    public $authId;

    // 资方统一社会信用代码
    /**
     * @var string
     */
    public $fundId;

    // 商户的租户id
    /**
     * @var string
     */
    public $tenantId;

    // 商家统一社会信用代码
    /**
     * @var string
     */
    public $merchantId;

    // 异步生成文件任务流水号
    /**
     * @var string
     */
    public $bizNo;

    // 查询开始时间
    /**
     * @var string
     */
    public $startTime;

    // 查询结束时间
    /**
     * @var string
     */
    public $endTime;

    // 是否过滤被其他资方标记的订单（融资申请中+融资申请通过），默认值false
    /**
     * @var bool
     */
    public $filterFinancingStatus;

    // 是否过滤已取消订单 （无剩余应还期数），默认值false
    /**
     * @var bool
     */
    public $filterCancel;

    // 是否过滤提前结清订单,默认值false
    /**
     * @var bool
     */
    public $filterEarlySettlement;

    // 是否过滤某一期已逾期的订单,默认值false
    /**
     * @var bool
     */
    public $filterOverdue;

    // 是否过滤最新一期晚于计划扣款日的重试中订单 ,默认值false
    /**
     * @var bool
     */
    public $filterRetry;

    // 是否过滤付款日为当日（查询日）的订单 （当日需执行扣款的）,默认值false
    /**
     * @var bool
     */
    public $filterTodayPay;
    protected $_name = [
        'authToken'             => 'auth_token',
        'productInstanceId'     => 'product_instance_id',
        'authId'                => 'auth_id',
        'fundId'                => 'fund_id',
        'tenantId'              => 'tenant_id',
        'merchantId'            => 'merchant_id',
        'bizNo'                 => 'biz_no',
        'startTime'             => 'start_time',
        'endTime'               => 'end_time',
        'filterFinancingStatus' => 'filter_financing_status',
        'filterCancel'          => 'filter_cancel',
        'filterEarlySettlement' => 'filter_early_settlement',
        'filterOverdue'         => 'filter_overdue',
        'filterRetry'           => 'filter_retry',
        'filterTodayPay'        => 'filter_today_pay',
    ];

    public function validate()
    {
        Model::validateRequired('authId', $this->authId, true);
        Model::validateRequired('fundId', $this->fundId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('bizNo', $this->bizNo, true);
        Model::validateRequired('startTime', $this->startTime, true);
        Model::validateRequired('endTime', $this->endTime, true);
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
        if (null !== $this->authId) {
            $res['auth_id'] = $this->authId;
        }
        if (null !== $this->fundId) {
            $res['fund_id'] = $this->fundId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->bizNo) {
            $res['biz_no'] = $this->bizNo;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->filterFinancingStatus) {
            $res['filter_financing_status'] = $this->filterFinancingStatus;
        }
        if (null !== $this->filterCancel) {
            $res['filter_cancel'] = $this->filterCancel;
        }
        if (null !== $this->filterEarlySettlement) {
            $res['filter_early_settlement'] = $this->filterEarlySettlement;
        }
        if (null !== $this->filterOverdue) {
            $res['filter_overdue'] = $this->filterOverdue;
        }
        if (null !== $this->filterRetry) {
            $res['filter_retry'] = $this->filterRetry;
        }
        if (null !== $this->filterTodayPay) {
            $res['filter_today_pay'] = $this->filterTodayPay;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyFundAssertorderRequest
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
        if (isset($map['auth_id'])) {
            $model->authId = $map['auth_id'];
        }
        if (isset($map['fund_id'])) {
            $model->fundId = $map['fund_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['biz_no'])) {
            $model->bizNo = $map['biz_no'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['filter_financing_status'])) {
            $model->filterFinancingStatus = $map['filter_financing_status'];
        }
        if (isset($map['filter_cancel'])) {
            $model->filterCancel = $map['filter_cancel'];
        }
        if (isset($map['filter_early_settlement'])) {
            $model->filterEarlySettlement = $map['filter_early_settlement'];
        }
        if (isset($map['filter_overdue'])) {
            $model->filterOverdue = $map['filter_overdue'];
        }
        if (isset($map['filter_retry'])) {
            $model->filterRetry = $map['filter_retry'];
        }
        if (isset($map['filter_today_pay'])) {
            $model->filterTodayPay = $map['filter_today_pay'];
        }

        return $model;
    }
}
