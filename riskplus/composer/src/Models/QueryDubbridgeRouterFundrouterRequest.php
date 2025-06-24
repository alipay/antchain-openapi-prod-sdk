<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeRouterFundrouterRequest extends Model
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

    // 订单号
    /**
     * @var string
     */
    public $orderNo;

    // 1：现金贷（默认）
    // 2：分期付
    /**
     * @var string
     */
    public $prodType;

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

    // 资产方购物订单号，如二轮车/摩托车订单号；购物场景时传递
    /**
     * @var string
     */
    public $bizOrderNo;

    // 身份证号
    /**
     * @var string
     */
    public $cardNo;

    // 姓名
    /**
     * @var string
     */
    public $customName;

    // 默认：0
    // 0：明文
    // 1：md5
    /**
     * @var string
     */
    public $mobileType;

    // 默认：0
    // 0：明文
    // 1：md5
    /**
     * @var string
     */
    public $cardNoType;

    // 默认：0
    // 0：明文
    // 1：md5
    /**
     * @var string
     */
    public $customNameType;

    // 渠道类型
    /**
     * @var string
     */
    public $channelType;

    // 客户类型
    /**
     * @var string
     */
    public $customType;

    // 合作方产品编号
    /**
     * @var string
     */
    public $prodNo;

    // 授信过期的资金方编码
    /**
     * @var string
     */
    public $expiredPlatformNo;

    // 导流平台
    /**
     * @var string
     */
    public $trafficPlatform;

    // 流量名称
    /**
     * @var string
     */
    public $trafficSourceName;

    // 广告位标志
    /**
     * @var string
     */
    public $trafficAdId;

    // 预留
    /**
     * @var string
     */
    public $trafficMktId;

    // 预留
    /**
     * @var string
     */
    public $clickId;

    // 风险字段
    /**
     * @var string
     */
    public $riskData;

    // 扩展字段
    /**
     * @var string
     */
    public $extInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderNo'           => 'order_no',
        'prodType'          => 'prod_type',
        'openId'            => 'open_id',
        'mobile'            => 'mobile',
        'bizOrderNo'        => 'biz_order_no',
        'cardNo'            => 'card_no',
        'customName'        => 'custom_name',
        'mobileType'        => 'mobile_type',
        'cardNoType'        => 'card_no_type',
        'customNameType'    => 'custom_name_type',
        'channelType'       => 'channel_type',
        'customType'        => 'custom_type',
        'prodNo'            => 'prod_no',
        'expiredPlatformNo' => 'expired_platform_no',
        'trafficPlatform'   => 'traffic_platform',
        'trafficSourceName' => 'traffic_source_name',
        'trafficAdId'       => 'traffic_ad_id',
        'trafficMktId'      => 'traffic_mkt_id',
        'clickId'           => 'click_id',
        'riskData'          => 'risk_data',
        'extInfo'           => 'ext_info',
    ];

    public function validate()
    {
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
        if (null !== $this->openId) {
            $res['open_id'] = $this->openId;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->bizOrderNo) {
            $res['biz_order_no'] = $this->bizOrderNo;
        }
        if (null !== $this->cardNo) {
            $res['card_no'] = $this->cardNo;
        }
        if (null !== $this->customName) {
            $res['custom_name'] = $this->customName;
        }
        if (null !== $this->mobileType) {
            $res['mobile_type'] = $this->mobileType;
        }
        if (null !== $this->cardNoType) {
            $res['card_no_type'] = $this->cardNoType;
        }
        if (null !== $this->customNameType) {
            $res['custom_name_type'] = $this->customNameType;
        }
        if (null !== $this->channelType) {
            $res['channel_type'] = $this->channelType;
        }
        if (null !== $this->customType) {
            $res['custom_type'] = $this->customType;
        }
        if (null !== $this->prodNo) {
            $res['prod_no'] = $this->prodNo;
        }
        if (null !== $this->expiredPlatformNo) {
            $res['expired_platform_no'] = $this->expiredPlatformNo;
        }
        if (null !== $this->trafficPlatform) {
            $res['traffic_platform'] = $this->trafficPlatform;
        }
        if (null !== $this->trafficSourceName) {
            $res['traffic_source_name'] = $this->trafficSourceName;
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
        if (null !== $this->riskData) {
            $res['risk_data'] = $this->riskData;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubbridgeRouterFundrouterRequest
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
        if (isset($map['open_id'])) {
            $model->openId = $map['open_id'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['biz_order_no'])) {
            $model->bizOrderNo = $map['biz_order_no'];
        }
        if (isset($map['card_no'])) {
            $model->cardNo = $map['card_no'];
        }
        if (isset($map['custom_name'])) {
            $model->customName = $map['custom_name'];
        }
        if (isset($map['mobile_type'])) {
            $model->mobileType = $map['mobile_type'];
        }
        if (isset($map['card_no_type'])) {
            $model->cardNoType = $map['card_no_type'];
        }
        if (isset($map['custom_name_type'])) {
            $model->customNameType = $map['custom_name_type'];
        }
        if (isset($map['channel_type'])) {
            $model->channelType = $map['channel_type'];
        }
        if (isset($map['custom_type'])) {
            $model->customType = $map['custom_type'];
        }
        if (isset($map['prod_no'])) {
            $model->prodNo = $map['prod_no'];
        }
        if (isset($map['expired_platform_no'])) {
            $model->expiredPlatformNo = $map['expired_platform_no'];
        }
        if (isset($map['traffic_platform'])) {
            $model->trafficPlatform = $map['traffic_platform'];
        }
        if (isset($map['traffic_source_name'])) {
            $model->trafficSourceName = $map['traffic_source_name'];
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
        if (isset($map['risk_data'])) {
            $model->riskData = $map['risk_data'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }

        return $model;
    }
}
