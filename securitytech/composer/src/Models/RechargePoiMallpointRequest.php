<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class RechargePoiMallpointRequest extends Model
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

    // 支付宝小程序用户唯一ID
    /**
     * @var string
     */
    public $openId;

    // 门店ID
    /**
     * @var string
     */
    public $storeId;

    // 分期主订单号
    /**
     * @var string
     */
    public $bizOrderNo;

    // 商城总余额
    /**
     * @var string
     */
    public $totalMallAmount;

    // 积分换算系数
    /**
     * @var string
     */
    public $exchangeRate;

    // 商城充值总期数
    /**
     * @var string
     */
    public $totalPhase;

    // 当期充值金额
    /**
     * @var string
     */
    public $phaseAmount;

    // 当前期数编号
    /**
     * @var string
     */
    public $phaseNo;

    // 渠道Code
    /**
     * @var string
     */
    public $channelCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'openId'            => 'open_id',
        'storeId'           => 'store_id',
        'bizOrderNo'        => 'biz_order_no',
        'totalMallAmount'   => 'total_mall_amount',
        'exchangeRate'      => 'exchange_rate',
        'totalPhase'        => 'total_phase',
        'phaseAmount'       => 'phase_amount',
        'phaseNo'           => 'phase_no',
        'channelCode'       => 'channel_code',
    ];

    public function validate()
    {
        Model::validateRequired('openId', $this->openId, true);
        Model::validateRequired('storeId', $this->storeId, true);
        Model::validateRequired('bizOrderNo', $this->bizOrderNo, true);
        Model::validateRequired('totalMallAmount', $this->totalMallAmount, true);
        Model::validateRequired('exchangeRate', $this->exchangeRate, true);
        Model::validateRequired('totalPhase', $this->totalPhase, true);
        Model::validateRequired('phaseAmount', $this->phaseAmount, true);
        Model::validateRequired('phaseNo', $this->phaseNo, true);
        Model::validateRequired('channelCode', $this->channelCode, true);
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
        if (null !== $this->openId) {
            $res['open_id'] = $this->openId;
        }
        if (null !== $this->storeId) {
            $res['store_id'] = $this->storeId;
        }
        if (null !== $this->bizOrderNo) {
            $res['biz_order_no'] = $this->bizOrderNo;
        }
        if (null !== $this->totalMallAmount) {
            $res['total_mall_amount'] = $this->totalMallAmount;
        }
        if (null !== $this->exchangeRate) {
            $res['exchange_rate'] = $this->exchangeRate;
        }
        if (null !== $this->totalPhase) {
            $res['total_phase'] = $this->totalPhase;
        }
        if (null !== $this->phaseAmount) {
            $res['phase_amount'] = $this->phaseAmount;
        }
        if (null !== $this->phaseNo) {
            $res['phase_no'] = $this->phaseNo;
        }
        if (null !== $this->channelCode) {
            $res['channel_code'] = $this->channelCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RechargePoiMallpointRequest
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
        if (isset($map['open_id'])) {
            $model->openId = $map['open_id'];
        }
        if (isset($map['store_id'])) {
            $model->storeId = $map['store_id'];
        }
        if (isset($map['biz_order_no'])) {
            $model->bizOrderNo = $map['biz_order_no'];
        }
        if (isset($map['total_mall_amount'])) {
            $model->totalMallAmount = $map['total_mall_amount'];
        }
        if (isset($map['exchange_rate'])) {
            $model->exchangeRate = $map['exchange_rate'];
        }
        if (isset($map['total_phase'])) {
            $model->totalPhase = $map['total_phase'];
        }
        if (isset($map['phase_amount'])) {
            $model->phaseAmount = $map['phase_amount'];
        }
        if (isset($map['phase_no'])) {
            $model->phaseNo = $map['phase_no'];
        }
        if (isset($map['channel_code'])) {
            $model->channelCode = $map['channel_code'];
        }

        return $model;
    }
}
