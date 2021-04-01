<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateLogisticFinanceCargopayorderRequest extends Model
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

    // 银行流水号
    /**
     * @var string
     */
    public $bankNo;

    // 货源单号
    /**
     * @var string
     */
    public $cargoOrder;

    // 费用类型   (运费、调度费、服务费)
    /**
     * @var string
     */
    public $expenseType;

    // 支付金额
    /**
     * @var string
     */
    public $payment;

    // 付款方did
    /**
     * @var string
     */
    public $payDid;

    // 平台支付单号
    /**
     * @var string
     */
    public $payId;

    // 支付备注
    /**
     * @var string
     */
    public $payNote;

    // 收款方did
    /**
     * @var string
     */
    public $recvDid;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bankNo'            => 'bank_no',
        'cargoOrder'        => 'cargo_order',
        'expenseType'       => 'expense_type',
        'payment'           => 'payment',
        'payDid'            => 'pay_did',
        'payId'             => 'pay_id',
        'payNote'           => 'pay_note',
        'recvDid'           => 'recv_did',
    ];

    public function validate()
    {
        Model::validateRequired('bankNo', $this->bankNo, true);
        Model::validateRequired('cargoOrder', $this->cargoOrder, true);
        Model::validateRequired('expenseType', $this->expenseType, true);
        Model::validateRequired('payment', $this->payment, true);
        Model::validateRequired('payDid', $this->payDid, true);
        Model::validateRequired('payId', $this->payId, true);
        Model::validateRequired('recvDid', $this->recvDid, true);
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
        if (null !== $this->bankNo) {
            $res['bank_no'] = $this->bankNo;
        }
        if (null !== $this->cargoOrder) {
            $res['cargo_order'] = $this->cargoOrder;
        }
        if (null !== $this->expenseType) {
            $res['expense_type'] = $this->expenseType;
        }
        if (null !== $this->payment) {
            $res['payment'] = $this->payment;
        }
        if (null !== $this->payDid) {
            $res['pay_did'] = $this->payDid;
        }
        if (null !== $this->payId) {
            $res['pay_id'] = $this->payId;
        }
        if (null !== $this->payNote) {
            $res['pay_note'] = $this->payNote;
        }
        if (null !== $this->recvDid) {
            $res['recv_did'] = $this->recvDid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateLogisticFinanceCargopayorderRequest
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
        if (isset($map['bank_no'])) {
            $model->bankNo = $map['bank_no'];
        }
        if (isset($map['cargo_order'])) {
            $model->cargoOrder = $map['cargo_order'];
        }
        if (isset($map['expense_type'])) {
            $model->expenseType = $map['expense_type'];
        }
        if (isset($map['payment'])) {
            $model->payment = $map['payment'];
        }
        if (isset($map['pay_did'])) {
            $model->payDid = $map['pay_did'];
        }
        if (isset($map['pay_id'])) {
            $model->payId = $map['pay_id'];
        }
        if (isset($map['pay_note'])) {
            $model->payNote = $map['pay_note'];
        }
        if (isset($map['recv_did'])) {
            $model->recvDid = $map['recv_did'];
        }

        return $model;
    }
}
