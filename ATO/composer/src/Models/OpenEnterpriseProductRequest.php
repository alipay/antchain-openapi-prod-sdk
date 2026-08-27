<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class OpenEnterpriseProductRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'enterpriseId' => 'enterprise_id',
        'tenantId' => 'tenant_id',
        'orderId' => 'order_id',
        'commodityCode' => 'commodity_code',
        'durationType' => 'duration_type',
        'durationValue' => 'duration_value',
        'payAmount' => 'pay_amount',
        'payerAlipayUid' => 'payer_alipay_uid',
        'callbackUrl' => 'callback_url',
    ];
    public function validate() {
        Model::validateRequired('enterpriseId', $this->enterpriseId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('commodityCode', $this->commodityCode, true);
        Model::validateRequired('durationType', $this->durationType, true);
        Model::validateRequired('durationValue', $this->durationValue, true);
        Model::validateRequired('payAmount', $this->payAmount, true);
        Model::validateRequired('payerAlipayUid', $this->payerAlipayUid, true);
        Model::validateRequired('callbackUrl', $this->callbackUrl, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->enterpriseId) {
            $res['enterprise_id'] = $this->enterpriseId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->commodityCode) {
            $res['commodity_code'] = $this->commodityCode;
        }
        if (null !== $this->durationType) {
            $res['duration_type'] = $this->durationType;
        }
        if (null !== $this->durationValue) {
            $res['duration_value'] = $this->durationValue;
        }
        if (null !== $this->payAmount) {
            $res['pay_amount'] = $this->payAmount;
        }
        if (null !== $this->payerAlipayUid) {
            $res['payer_alipay_uid'] = $this->payerAlipayUid;
        }
        if (null !== $this->callbackUrl) {
            $res['callback_url'] = $this->callbackUrl;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OpenEnterpriseProductRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['enterprise_id'])){
            $model->enterpriseId = $map['enterprise_id'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['order_id'])){
            $model->orderId = $map['order_id'];
        }
        if(isset($map['commodity_code'])){
            $model->commodityCode = $map['commodity_code'];
        }
        if(isset($map['duration_type'])){
            $model->durationType = $map['duration_type'];
        }
        if(isset($map['duration_value'])){
            $model->durationValue = $map['duration_value'];
        }
        if(isset($map['pay_amount'])){
            $model->payAmount = $map['pay_amount'];
        }
        if(isset($map['payer_alipay_uid'])){
            $model->payerAlipayUid = $map['payer_alipay_uid'];
        }
        if(isset($map['callback_url'])){
            $model->callbackUrl = $map['callback_url'];
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

    // 企业id
    /**
     * @var string
     */
    public $enterpriseId;

    // 租户ID（账户开通时返回）
    /**
     * @var string
     */
    public $tenantId;

    // 业务侧订单ID（全局唯一，幂等键，≤32位）
    /**
     * @var string
     */
    public $orderId;

    // 商品编码
    /**
     * @var string
     */
    public $commodityCode;

    // 订购时长类型 Y 单位：年
    /**
     * @var string
     */
    public $durationType;

    // 订购时长
    /**
     * @var string
     */
    public $durationValue;

    // 开通金额（元）
    /**
     * @var string
     */
    public $payAmount;

    // 付款方支付宝UID
    /**
     * @var string
     */
    public $payerAlipayUid;

    // 回调地址，业务方期望将支付结果&产品开通结果回调到自身业务系统的地址
    /**
     * @var string
     */
    public $callbackUrl;

}
