<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeInstallmentCreditamtRequest extends Model
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

    // 订单号：request请求单号，每次请求唯一，如uuid
    /**
     * @var string
     */
    public $orderNo;

    // 1：现金贷、2：分期付
    /**
     * @var string
     */
    public $prodType;

    // 导流平台
    /**
     * @var string
     */
    public $trafficPlatform;

    // 流量来源名称，导流平台背后具体的流量名称
    /**
     * @var string
     */
    public $trafficSourceName;

    // 资产方用户唯一标识
    /**
     * @var string
     */
    public $openId;

    // 手机号
    /**
     * @var string
     */
    public $mobile;

    // 项目编号（天枢侧提前约定）
    /**
     * @var string
     */
    public $projectCode;

    // 交易金额，单位：元，如199.88（用于筛选额度充足的机构）
    /**
     * @var string
     */
    public $tradeAmount;

    // 分期金额，单位：元，如99.88（用于筛选额度充足的机构）,分期金额由天枢加工的渠道可不传递
    /**
     * @var string
     */
    public $installmentAmount;

    // 资产方购物订单号，如二轮车/摩托车订单号
    /**
     * @var string
     */
    public $bizOrderNo;

    // 身份证号
    /**
     * @var string
     */
    public $cardNo;

    // 客户姓名
    /**
     * @var string
     */
    public $customerName;

    // 广告位id，流量来源内各广告位标志
    /**
     * @var string
     */
    public $trafficAdId;

    // 营销活动编号
    /**
     * @var string
     */
    public $trafficMktId;

    // 点击id
    /**
     * @var string
     */
    public $clickId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderNo'           => 'order_no',
        'prodType'          => 'prod_type',
        'trafficPlatform'   => 'traffic_platform',
        'trafficSourceName' => 'traffic_source_name',
        'openId'            => 'open_id',
        'mobile'            => 'mobile',
        'projectCode'       => 'project_code',
        'tradeAmount'       => 'trade_amount',
        'installmentAmount' => 'installment_amount',
        'bizOrderNo'        => 'biz_order_no',
        'cardNo'            => 'card_no',
        'customerName'      => 'customer_name',
        'trafficAdId'       => 'traffic_ad_id',
        'trafficMktId'      => 'traffic_mkt_id',
        'clickId'           => 'click_id',
    ];

    public function validate()
    {
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('prodType', $this->prodType, true);
        Model::validateRequired('trafficPlatform', $this->trafficPlatform, true);
        Model::validateRequired('openId', $this->openId, true);
        Model::validateRequired('mobile', $this->mobile, true);
        Model::validateRequired('projectCode', $this->projectCode, true);
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
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->prodType) {
            $res['prod_type'] = $this->prodType;
        }
        if (null !== $this->trafficPlatform) {
            $res['traffic_platform'] = $this->trafficPlatform;
        }
        if (null !== $this->trafficSourceName) {
            $res['traffic_source_name'] = $this->trafficSourceName;
        }
        if (null !== $this->openId) {
            $res['open_id'] = $this->openId;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->projectCode) {
            $res['project_code'] = $this->projectCode;
        }
        if (null !== $this->tradeAmount) {
            $res['trade_amount'] = $this->tradeAmount;
        }
        if (null !== $this->installmentAmount) {
            $res['installment_amount'] = $this->installmentAmount;
        }
        if (null !== $this->bizOrderNo) {
            $res['biz_order_no'] = $this->bizOrderNo;
        }
        if (null !== $this->cardNo) {
            $res['card_no'] = $this->cardNo;
        }
        if (null !== $this->customerName) {
            $res['customer_name'] = $this->customerName;
        }
        if (null !== $this->trafficAdId) {
            $res['traffic_ad_id'] = $this->trafficAdId;
        }
        if (null !== $this->trafficMktId) {
            $res['traffic_mkt_id'] = $this->trafficMktId;
        }
        if (null !== $this->clickId) {
            $res['click_id'] = $this->clickId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubbridgeInstallmentCreditamtRequest
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
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['prod_type'])) {
            $model->prodType = $map['prod_type'];
        }
        if (isset($map['traffic_platform'])) {
            $model->trafficPlatform = $map['traffic_platform'];
        }
        if (isset($map['traffic_source_name'])) {
            $model->trafficSourceName = $map['traffic_source_name'];
        }
        if (isset($map['open_id'])) {
            $model->openId = $map['open_id'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['project_code'])) {
            $model->projectCode = $map['project_code'];
        }
        if (isset($map['trade_amount'])) {
            $model->tradeAmount = $map['trade_amount'];
        }
        if (isset($map['installment_amount'])) {
            $model->installmentAmount = $map['installment_amount'];
        }
        if (isset($map['biz_order_no'])) {
            $model->bizOrderNo = $map['biz_order_no'];
        }
        if (isset($map['card_no'])) {
            $model->cardNo = $map['card_no'];
        }
        if (isset($map['customer_name'])) {
            $model->customerName = $map['customer_name'];
        }
        if (isset($map['traffic_ad_id'])) {
            $model->trafficAdId = $map['traffic_ad_id'];
        }
        if (isset($map['traffic_mkt_id'])) {
            $model->trafficMktId = $map['traffic_mkt_id'];
        }
        if (isset($map['click_id'])) {
            $model->clickId = $map['click_id'];
        }

        return $model;
    }
}
