<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class ExecFundPlanRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId' => 'order_id',
        'fundId' => 'fund_id',
        'merchantId' => 'merchant_id',
        'termIndex' => 'term_index',
        'retryType' => 'retry_type',
        'payType' => 'pay_type',
    ];
    public function validate() {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('fundId', $this->fundId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('termIndex', $this->termIndex, true);
        Model::validateRequired('retryType', $this->retryType, true);
        Model::validateRequired('payType', $this->payType, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->fundId) {
            $res['fund_id'] = $this->fundId;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->termIndex) {
            $res['term_index'] = $this->termIndex;
        }
        if (null !== $this->retryType) {
            $res['retry_type'] = $this->retryType;
        }
        if (null !== $this->payType) {
            $res['pay_type'] = $this->payType;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecFundPlanRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['order_id'])){
            $model->orderId = $map['order_id'];
        }
        if(isset($map['fund_id'])){
            $model->fundId = $map['fund_id'];
        }
        if(isset($map['merchant_id'])){
            $model->merchantId = $map['merchant_id'];
        }
        if(isset($map['term_index'])){
            $model->termIndex = $map['term_index'];
        }
        if(isset($map['retry_type'])){
            $model->retryType = $map['retry_type'];
        }
        if(isset($map['pay_type'])){
            $model->payType = $map['pay_type'];
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

    // 订单id 长度不可超过50
    /**
     * @var string
     */
    public $orderId;

    // 资方社会统一信用代码
    /**
     * @var string
     */
    public $fundId;

    // 商户社会统一信用代码
    /**
     * @var string
     */
    public $merchantId;

    // 商户履约的期数
    /**
     * @var int
     */
    public $termIndex;

    // 签约串类型
    // TRANSFER:转账代偿签约串
    // WITHHOLD:代扣代偿签约串
    /**
     * @var string
     */
    public $retryType;

    // 支付类型：
    // ● PERFORMANCE:正常履约
    // ● EXCESS：超额
    /**
     * @var string
     */
    public $payType;

}
