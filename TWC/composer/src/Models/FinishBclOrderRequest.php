<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class FinishBclOrderRequest extends Model
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

    // 租赁宝plus服务返回的订单id
    /**
     * @var string
     */
    public $orderId;

    // 资方尾款金额，单位为分且最小值：1（租赁单有融资时必传）
    /**
     * @var int
     */
    public $investorFinalPayment;

    // 买家还款金额，单位分（提前还款，到期买断，到期归还场景必传）
    /**
     * @var int
     */
    public $buyerRepayAmount;

    // 幂等号，用来保证请求幂等性，标识一次完结请求，确保同笔订单下该值唯一。
    // 注意：
    // ● clientToken只支持ASCII字符，且不能超过64个字符；
    // ● 针对同一次完结请求如果调用接口失败或异常了，重试时要保证该值不变；
    /**
     * @var string
     */
    public $clientToken;

    // 完结场景：
    // ● BUYER_PRE_REPAY：买家提前还款
    // ● BUYER_DUE_GIVE_BACK：买家到期归还
    // ● BUYER_DUE_BUYOUT：买家到期买断
    // ● BUYER_BAD_DEBT：买家坏账
    // ● BUYER_CANCEL_AGREEMENT：买家解约
    // ● MERCHANT_CANCEL_ORDER：商家取消订单
    /**
     * @var string
     */
    public $finishScene;

    // 完结的分期信息（买家到期归还和买家到期买断场景不传，其他场景必传）
    /**
     * @var BclFinishInstallment[]
     */
    public $finishInstallments;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'orderId'              => 'order_id',
        'investorFinalPayment' => 'investor_final_payment',
        'buyerRepayAmount'     => 'buyer_repay_amount',
        'clientToken'          => 'client_token',
        'finishScene'          => 'finish_scene',
        'finishInstallments'   => 'finish_installments',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('clientToken', $this->clientToken, true);
        Model::validateRequired('finishScene', $this->finishScene, true);
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
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->investorFinalPayment) {
            $res['investor_final_payment'] = $this->investorFinalPayment;
        }
        if (null !== $this->buyerRepayAmount) {
            $res['buyer_repay_amount'] = $this->buyerRepayAmount;
        }
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }
        if (null !== $this->finishScene) {
            $res['finish_scene'] = $this->finishScene;
        }
        if (null !== $this->finishInstallments) {
            $res['finish_installments'] = [];
            if (null !== $this->finishInstallments && \is_array($this->finishInstallments)) {
                $n = 0;
                foreach ($this->finishInstallments as $item) {
                    $res['finish_installments'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FinishBclOrderRequest
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
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['investor_final_payment'])) {
            $model->investorFinalPayment = $map['investor_final_payment'];
        }
        if (isset($map['buyer_repay_amount'])) {
            $model->buyerRepayAmount = $map['buyer_repay_amount'];
        }
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }
        if (isset($map['finish_scene'])) {
            $model->finishScene = $map['finish_scene'];
        }
        if (isset($map['finish_installments'])) {
            if (!empty($map['finish_installments'])) {
                $model->finishInstallments = [];
                $n                         = 0;
                foreach ($map['finish_installments'] as $item) {
                    $model->finishInstallments[$n++] = null !== $item ? BclFinishInstallment::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
