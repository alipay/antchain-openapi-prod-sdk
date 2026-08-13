<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\RISKPLUS\Models\PetCashierApplyExtInfo;

class ApplyDubbridgePetcashierRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'channelCode' => 'channel_code',
        'trafficPlatform' => 'traffic_platform',
        'storeId' => 'store_id',
        'bizOrderNo' => 'biz_order_no',
        'certNo' => 'cert_no',
        'templateSceneCertNo' => 'template_scene_cert_no',
        'amount' => 'amount',
        'subject' => 'subject',
        'sku' => 'sku',
        'buyerId' => 'buyer_id',
        'timestamp' => 'timestamp',
        'expireTime' => 'expire_time',
        'payInstitutionCode' => 'pay_institution_code',
        'payScene' => 'pay_scene',
        'returnUrl' => 'return_url',
        'enableTransfer' => 'enable_transfer',
        'extInfo' => 'ext_info',
    ];
    public function validate() {
        Model::validateRequired('channelCode', $this->channelCode, true);
        Model::validateRequired('trafficPlatform', $this->trafficPlatform, true);
        Model::validateRequired('storeId', $this->storeId, true);
        Model::validateRequired('bizOrderNo', $this->bizOrderNo, true);
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('amount', $this->amount, true);
        Model::validateRequired('subject', $this->subject, true);
        Model::validateRequired('timestamp', $this->timestamp, true);
        Model::validateRequired('payScene', $this->payScene, true);
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
        if (null !== $this->storeId) {
            $res['store_id'] = $this->storeId;
        }
        if (null !== $this->bizOrderNo) {
            $res['biz_order_no'] = $this->bizOrderNo;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->templateSceneCertNo) {
            $res['template_scene_cert_no'] = $this->templateSceneCertNo;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->subject) {
            $res['subject'] = $this->subject;
        }
        if (null !== $this->sku) {
            $res['sku'] = $this->sku;
        }
        if (null !== $this->buyerId) {
            $res['buyer_id'] = $this->buyerId;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }
        if (null !== $this->expireTime) {
            $res['expire_time'] = $this->expireTime;
        }
        if (null !== $this->payInstitutionCode) {
            $res['pay_institution_code'] = $this->payInstitutionCode;
        }
        if (null !== $this->payScene) {
            $res['pay_scene'] = $this->payScene;
        }
        if (null !== $this->returnUrl) {
            $res['return_url'] = $this->returnUrl;
        }
        if (null !== $this->enableTransfer) {
            $res['enable_transfer'] = $this->enableTransfer;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = null !== $this->extInfo ? $this->extInfo->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ApplyDubbridgePetcashierRequest
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
        if(isset($map['store_id'])){
            $model->storeId = $map['store_id'];
        }
        if(isset($map['biz_order_no'])){
            $model->bizOrderNo = $map['biz_order_no'];
        }
        if(isset($map['cert_no'])){
            $model->certNo = $map['cert_no'];
        }
        if(isset($map['template_scene_cert_no'])){
            $model->templateSceneCertNo = $map['template_scene_cert_no'];
        }
        if(isset($map['amount'])){
            $model->amount = $map['amount'];
        }
        if(isset($map['subject'])){
            $model->subject = $map['subject'];
        }
        if(isset($map['sku'])){
            $model->sku = $map['sku'];
        }
        if(isset($map['buyer_id'])){
            $model->buyerId = $map['buyer_id'];
        }
        if(isset($map['timestamp'])){
            $model->timestamp = $map['timestamp'];
        }
        if(isset($map['expire_time'])){
            $model->expireTime = $map['expire_time'];
        }
        if(isset($map['pay_institution_code'])){
            $model->payInstitutionCode = $map['pay_institution_code'];
        }
        if(isset($map['pay_scene'])){
            $model->payScene = $map['pay_scene'];
        }
        if(isset($map['return_url'])){
            $model->returnUrl = $map['return_url'];
        }
        if(isset($map['enable_transfer'])){
            $model->enableTransfer = $map['enable_transfer'];
        }
        if(isset($map['ext_info'])){
            $model->extInfo = PetCashierApplyExtInfo::fromMap($map['ext_info']);
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

    // 门店id
    /**
     * @var string
     */
    public $storeId;

    // 原始订单号
    /**
     * @var string
     */
    public $bizOrderNo;

    // 商家社信码
    /**
     * @var string
     */
    public $certNo;

    // 收银台模板渠道社信码
    /**
     * @var string
     */
    public $templateSceneCertNo;

    // 交易金额
    /**
     * @var string
     */
    public $amount;

    // 订单标题
    /**
     * @var string
     */
    public $subject;

    // 商品SKU
    /**
     * @var string
     */
    public $sku;

    // 买家Id
    /**
     * @var string
     */
    public $buyerId;

    // 时间戳
    /**
     * @var string
     */
    public $timestamp;

    // 2026-07-20 00:16:35
    /**
     * @var string
     */
    public $expireTime;

    // 支付机构编码
    /**
     * @var string
     */
    public $payInstitutionCode;

    // 交易场景
    /**
     * @var string
     */
    public $payScene;

    // 支付后返回地址
    /**
     * @var string
     */
    public $returnUrl;

    // 是否开启分账
    /**
     * @var string
     */
    public $enableTransfer;

    // 渠道扩展信息
    /**
     * @var PetCashierApplyExtInfo
     */
    public $extInfo;

}
