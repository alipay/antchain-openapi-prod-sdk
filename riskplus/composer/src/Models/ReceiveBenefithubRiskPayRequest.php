<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class ReceiveBenefithubRiskPayRequest extends Model
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

    // 业务分配的平台code，8位纯大写字母code
    /**
     * @var string
     */
    public $platformCode;

    // 产品code
    /**
     * @var string
     */
    public $productCode;

    // 平台code、用户唯一ID 组合出全局唯一id
    /**
     * @var string
     */
    public $userUniqueId;

    // 类型：订单支付结果类、订单退款类、续费扣款类、签约成功、解约成功、订单超时类型
    // 具体如下：
    // ODRDER_PAYMENT-订单支付结果类通知、ORDER_REFUND-订单退款、RENEWAL_DEDUCTION-续费扣款、CONTRACT_SIGNED-签约成功、CONTRACT_TERMINATED-解约成功、
    // ORDER_TIMEOUT-订单超时类型
    /**
     * @var string
     */
    public $resultType;

    // 回调结果，json数据
    // 各个平台返回的支付结果、支付退款、续费结果通知、签约、解约、订单、超时关单
    /**
     * @var string
     */
    public $callbackResult;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'platformCode'      => 'platform_code',
        'productCode'       => 'product_code',
        'userUniqueId'      => 'user_unique_id',
        'resultType'        => 'result_type',
        'callbackResult'    => 'callback_result',
    ];

    public function validate()
    {
        Model::validateRequired('platformCode', $this->platformCode, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('userUniqueId', $this->userUniqueId, true);
        Model::validateRequired('resultType', $this->resultType, true);
        Model::validateRequired('callbackResult', $this->callbackResult, true);
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
        if (null !== $this->platformCode) {
            $res['platform_code'] = $this->platformCode;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->userUniqueId) {
            $res['user_unique_id'] = $this->userUniqueId;
        }
        if (null !== $this->resultType) {
            $res['result_type'] = $this->resultType;
        }
        if (null !== $this->callbackResult) {
            $res['callback_result'] = $this->callbackResult;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ReceiveBenefithubRiskPayRequest
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
        if (isset($map['platform_code'])) {
            $model->platformCode = $map['platform_code'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['user_unique_id'])) {
            $model->userUniqueId = $map['user_unique_id'];
        }
        if (isset($map['result_type'])) {
            $model->resultType = $map['result_type'];
        }
        if (isset($map['callback_result'])) {
            $model->callbackResult = $map['callback_result'];
        }

        return $model;
    }
}
