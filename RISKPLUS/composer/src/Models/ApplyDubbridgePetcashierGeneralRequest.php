<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\RISKPLUS\Models\ProductItem;

class ApplyDubbridgePetcashierGeneralRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'channelCode' => 'channel_code',
        'trafficPlatform' => 'traffic_platform',
        'buyerId' => 'buyer_id',
        'bizOrderNo' => 'biz_order_no',
        'amount' => 'amount',
        'productMode' => 'product_mode',
        'subject' => 'subject',
        'timestamp' => 'timestamp',
        'expireTime' => 'expire_time',
        'payScene' => 'pay_scene',
        'merchantId' => 'merchant_id',
        'payInstitutionCode' => 'pay_institution_code',
        'returnUrl' => 'return_url',
        'productList' => 'product_list',
        'extInfo' => 'ext_info',
    ];
    public function validate() {
        Model::validateRequired('channelCode', $this->channelCode, true);
        Model::validateRequired('trafficPlatform', $this->trafficPlatform, true);
        Model::validateRequired('buyerId', $this->buyerId, true);
        Model::validateRequired('bizOrderNo', $this->bizOrderNo, true);
        Model::validateRequired('amount', $this->amount, true);
        Model::validateRequired('productMode', $this->productMode, true);
        Model::validateRequired('subject', $this->subject, true);
        Model::validateRequired('timestamp', $this->timestamp, true);
        Model::validateRequired('payScene', $this->payScene, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('payInstitutionCode', $this->payInstitutionCode, true);
        Model::validateRequired('productList', $this->productList, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->channelCode) {
            $res['channel_code'] = $this->channelCode;
        }
        if (null !== $this->trafficPlatform) {
            $res['traffic_platform'] = $this->trafficPlatform;
        }
        if (null !== $this->buyerId) {
            $res['buyer_id'] = $this->buyerId;
        }
        if (null !== $this->bizOrderNo) {
            $res['biz_order_no'] = $this->bizOrderNo;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->productMode) {
            $res['product_mode'] = $this->productMode;
        }
        if (null !== $this->subject) {
            $res['subject'] = $this->subject;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }
        if (null !== $this->expireTime) {
            $res['expire_time'] = $this->expireTime;
        }
        if (null !== $this->payScene) {
            $res['pay_scene'] = $this->payScene;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->payInstitutionCode) {
            $res['pay_institution_code'] = $this->payInstitutionCode;
        }
        if (null !== $this->returnUrl) {
            $res['return_url'] = $this->returnUrl;
        }
        if (null !== $this->productList) {
            $res['product_list'] = [];
            if(null !== $this->productList && is_array($this->productList)){
                $n = 0;
                foreach($this->productList as $item){
                    $res['product_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ApplyDubbridgePetcashierGeneralRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['channel_code'])){
            $model->channelCode = $map['channel_code'];
        }
        if(isset($map['traffic_platform'])){
            $model->trafficPlatform = $map['traffic_platform'];
        }
        if(isset($map['buyer_id'])){
            $model->buyerId = $map['buyer_id'];
        }
        if(isset($map['biz_order_no'])){
            $model->bizOrderNo = $map['biz_order_no'];
        }
        if(isset($map['amount'])){
            $model->amount = $map['amount'];
        }
        if(isset($map['product_mode'])){
            $model->productMode = $map['product_mode'];
        }
        if(isset($map['subject'])){
            $model->subject = $map['subject'];
        }
        if(isset($map['timestamp'])){
            $model->timestamp = $map['timestamp'];
        }
        if(isset($map['expire_time'])){
            $model->expireTime = $map['expire_time'];
        }
        if(isset($map['pay_scene'])){
            $model->payScene = $map['pay_scene'];
        }
        if(isset($map['merchant_id'])){
            $model->merchantId = $map['merchant_id'];
        }
        if(isset($map['pay_institution_code'])){
            $model->payInstitutionCode = $map['pay_institution_code'];
        }
        if(isset($map['return_url'])){
            $model->returnUrl = $map['return_url'];
        }
        if(isset($map['product_list'])){
            if(!empty($map['product_list'])){
                $model->productList = [];
                $n = 0;
                foreach($map['product_list'] as $item) {
                    $model->productList[$n++] = null !== $item ? ProductItem::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['ext_info'])){
            $model->extInfo = $map['ext_info'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 渠道编码
    /**
     * @var string
     */
    public $channelCode;

    // 流量平台
    /**
     * @var string
     */
    public $trafficPlatform;

    // 买家Id
    /**
     * @var string
     */
    public $buyerId;

    // 业务订单号
    /**
     * @var string
     */
    public $bizOrderNo;

    // 订单金额，单位元，两位小数
    /**
     * @var string
     */
    public $amount;

    // 产品模式：PET_PACKAGE-领宠模式（活体+商城套餐）、PET-单活体、GOODS-单商品、MEMBER-会员订阅
    /**
     * @var string
     */
    public $productMode;

    // 订单标题
    /**
     * @var string
     */
    public $subject;

    // 时间戳
    /**
     * @var string
     */
    public $timestamp;

    // 过期时间
    /**
     * @var string
     */
    public $expireTime;

    // 支付场景
    /**
     * @var string
     */
    public $payScene;

    // 订单归属主体，入驻到平台的id
    /**
     * @var string
     */
    public $merchantId;

    // 支付机构编码
    /**
     * @var string
     */
    public $payInstitutionCode;

    // 支付后返回地址
    /**
     * @var string
     */
    public $returnUrl;

    // 商品明细数组
    /**
     * @var ProductItem[]
     */
    public $productList;

    // 扩展信息，JSON串
    /**
     * @var string
     */
    public $extInfo;

}
