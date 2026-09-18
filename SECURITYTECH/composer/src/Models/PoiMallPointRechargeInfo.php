<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class PoiMallPointRechargeInfo extends Model {
    protected $_name = [
        'rechargeId' => 'recharge_id',
        'openId' => 'open_id',
        'storeId' => 'store_id',
        'bizOrderNo' => 'biz_order_no',
        'totalMallAmount' => 'total_mall_amount',
        'exchangeRate' => 'exchange_rate',
        'totalPhase' => 'total_phase',
        'phaseNo' => 'phase_no',
        'phaseAmount' => 'phase_amount',
        'channelCode' => 'channel_code',
        'trafficPlatform' => 'traffic_platform',
        'pointSource' => 'point_source',
    ];
    public function validate() {
        Model::validateRequired('rechargeId', $this->rechargeId, true);
        Model::validateRequired('openId', $this->openId, true);
        Model::validateRequired('storeId', $this->storeId, true);
        Model::validateRequired('bizOrderNo', $this->bizOrderNo, true);
        Model::validateRequired('totalMallAmount', $this->totalMallAmount, true);
        Model::validateRequired('exchangeRate', $this->exchangeRate, true);
        Model::validateRequired('totalPhase', $this->totalPhase, true);
        Model::validateRequired('phaseNo', $this->phaseNo, true);
        Model::validateRequired('phaseAmount', $this->phaseAmount, true);
        Model::validateRequired('channelCode', $this->channelCode, true);
        Model::validateRequired('trafficPlatform', $this->trafficPlatform, true);
        Model::validateRequired('pointSource', $this->pointSource, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->rechargeId) {
            $res['recharge_id'] = $this->rechargeId;
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
        if (null !== $this->phaseNo) {
            $res['phase_no'] = $this->phaseNo;
        }
        if (null !== $this->phaseAmount) {
            $res['phase_amount'] = $this->phaseAmount;
        }
        if (null !== $this->channelCode) {
            $res['channel_code'] = $this->channelCode;
        }
        if (null !== $this->trafficPlatform) {
            $res['traffic_platform'] = $this->trafficPlatform;
        }
        if (null !== $this->pointSource) {
            $res['point_source'] = $this->pointSource;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PoiMallPointRechargeInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['recharge_id'])){
            $model->rechargeId = $map['recharge_id'];
        }
        if(isset($map['open_id'])){
            $model->openId = $map['open_id'];
        }
        if(isset($map['store_id'])){
            $model->storeId = $map['store_id'];
        }
        if(isset($map['biz_order_no'])){
            $model->bizOrderNo = $map['biz_order_no'];
        }
        if(isset($map['total_mall_amount'])){
            $model->totalMallAmount = $map['total_mall_amount'];
        }
        if(isset($map['exchange_rate'])){
            $model->exchangeRate = $map['exchange_rate'];
        }
        if(isset($map['total_phase'])){
            $model->totalPhase = $map['total_phase'];
        }
        if(isset($map['phase_no'])){
            $model->phaseNo = $map['phase_no'];
        }
        if(isset($map['phase_amount'])){
            $model->phaseAmount = $map['phase_amount'];
        }
        if(isset($map['channel_code'])){
            $model->channelCode = $map['channel_code'];
        }
        if(isset($map['traffic_platform'])){
            $model->trafficPlatform = $map['traffic_platform'];
        }
        if(isset($map['point_source'])){
            $model->pointSource = $map['point_source'];
        }
        return $model;
    }
    // 充值唯一ID
    /**
     * @example 0
     * @var string
     */
    public $rechargeId;

    // 支付宝小程序用户唯一ID
    /**
     * @example 0
     * @var string
     */
    public $openId;

    // 门店ID
    /**
     * @example 0
     * @var string
     */
    public $storeId;

    // 分期主订单号
    /**
     * @example 0
     * @var string
     */
    public $bizOrderNo;

    // 商城总余额
    /**
     * @example 0
     * @var string
     */
    public $totalMallAmount;

    // 积分换算系数
    /**
     * @example 0
     * @var string
     */
    public $exchangeRate;

    // 商城充值总期数
    /**
     * @example 0
     * @var string
     */
    public $totalPhase;

    // 当前期数编号
    /**
     * @example 0
     * @var string
     */
    public $phaseNo;

    // 当期充值金额
    /**
     * @example 0
     * @var string
     */
    public $phaseAmount;

    // 渠道Code
    /**
     * @example TBJHF
     * @var string
     */
    public $channelCode;

    // 子渠道
    /**
     * @example NYG
     * @var string
     */
    public $trafficPlatform;

    // 充值来源
    /**
     * @example DUBHE_MALL_INTEGRAL_RECHARG
     * @var string
     */
    public $pointSource;

}
