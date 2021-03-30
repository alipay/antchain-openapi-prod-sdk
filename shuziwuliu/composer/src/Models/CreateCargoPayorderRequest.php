<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class CreateCargoPayorderRequest extends Model
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

    // 收款方银行账号
    /**
     * @var string
     */
    public $bankAccountOfPayee;

    // 付款方银行账号,货主付款的开户银行账号
    /**
     * @var string
     */
    public $bankAccountOfPayer;

    // 银行流水号，云资金校验时 必传；
    //
    /**
     * @var string
     */
    public $bankNo;

    // 收款方开户行（平台收款）
    //
    // MYBank_CloudCapital_2,  ## 云资金2.0
    //
    //
    /**
     * @var string
     */
    public $bankOfPayee;

    // 付款方开户行(货主付款)  取值
    //
    // MYBank_CloudCapital_2,  ## 云资金2.0
    /**
     * @var string
     */
    public $bankOfPayer;

    // 账单编号
    /**
     * @var string
     */
    public $billId;

    // 货源单号
    //
    /**
     * @var string
     */
    public $cargoOrder;

    // 核验渠道，请按取值约束值填入
    // MYBank_CloudCapital_2,  ## 云资金2.0
    /**
     * @var string
     */
    public $checkChannel;

    // 币种
    // 按下列取值：
    // CNY、USD
    //
    //
    /**
     * @var string
     */
    public $currency;

    // 费用类型 (运费、调度费、服务费)
    //
    /**
     * @var string
     */
    public $expenseType;

    // 收款方名称
    /**
     * @var string
     */
    public $payee;

    // 付款方名称
    /**
     * @var string
     */
    public $payer;

    // 费用金额（运单维度）
    //
    /**
     * @var string
     */
    public $payment;

    // 是否核验
    /**
     * @var bool
     */
    public $payCheck;

    // 付款方did
    //
    /**
     * @var string
     */
    public $payDid;

    // 支付单号
    //
    /**
     * @var string
     */
    public $payId;

    // 支付备注
    //
    /**
     * @var string
     */
    public $payNote;

    // 支付时间
    //
    /**
     * @var int
     */
    public $payTime;

    // 支付类型
    //
    /**
     * @var string
     */
    public $payType;

    // 所属平台did
    /**
     * @var string
     */
    public $platformDid;

    // 收款方did
    /**
     * @var string
     */
    public $recvDid;

    // 请求唯一标识
    /**
     * @var string
     */
    public $requestId;

    // 运单号
    /**
     * @var string
     */
    public $taxWaybillId;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'bankAccountOfPayee' => 'bank_account_of_payee',
        'bankAccountOfPayer' => 'bank_account_of_payer',
        'bankNo'             => 'bank_no',
        'bankOfPayee'        => 'bank_of_payee',
        'bankOfPayer'        => 'bank_of_payer',
        'billId'             => 'bill_id',
        'cargoOrder'         => 'cargo_order',
        'checkChannel'       => 'check_channel',
        'currency'           => 'currency',
        'expenseType'        => 'expense_type',
        'payee'              => 'payee',
        'payer'              => 'payer',
        'payment'            => 'payment',
        'payCheck'           => 'pay_check',
        'payDid'             => 'pay_did',
        'payId'              => 'pay_id',
        'payNote'            => 'pay_note',
        'payTime'            => 'pay_time',
        'payType'            => 'pay_type',
        'platformDid'        => 'platform_did',
        'recvDid'            => 'recv_did',
        'requestId'          => 'request_id',
        'taxWaybillId'       => 'tax_waybill_id',
    ];

    public function validate()
    {
        Model::validateRequired('cargoOrder', $this->cargoOrder, true);
        Model::validateRequired('expenseType', $this->expenseType, true);
        Model::validateRequired('payment', $this->payment, true);
        Model::validateRequired('payDid', $this->payDid, true);
        Model::validateRequired('payId', $this->payId, true);
        Model::validateRequired('payTime', $this->payTime, true);
        Model::validateRequired('platformDid', $this->platformDid, true);
        Model::validateRequired('recvDid', $this->recvDid, true);
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('taxWaybillId', $this->taxWaybillId, true);
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
        if (null !== $this->bankAccountOfPayee) {
            $res['bank_account_of_payee'] = $this->bankAccountOfPayee;
        }
        if (null !== $this->bankAccountOfPayer) {
            $res['bank_account_of_payer'] = $this->bankAccountOfPayer;
        }
        if (null !== $this->bankNo) {
            $res['bank_no'] = $this->bankNo;
        }
        if (null !== $this->bankOfPayee) {
            $res['bank_of_payee'] = $this->bankOfPayee;
        }
        if (null !== $this->bankOfPayer) {
            $res['bank_of_payer'] = $this->bankOfPayer;
        }
        if (null !== $this->billId) {
            $res['bill_id'] = $this->billId;
        }
        if (null !== $this->cargoOrder) {
            $res['cargo_order'] = $this->cargoOrder;
        }
        if (null !== $this->checkChannel) {
            $res['check_channel'] = $this->checkChannel;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->expenseType) {
            $res['expense_type'] = $this->expenseType;
        }
        if (null !== $this->payee) {
            $res['payee'] = $this->payee;
        }
        if (null !== $this->payer) {
            $res['payer'] = $this->payer;
        }
        if (null !== $this->payment) {
            $res['payment'] = $this->payment;
        }
        if (null !== $this->payCheck) {
            $res['pay_check'] = $this->payCheck;
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
        if (null !== $this->payTime) {
            $res['pay_time'] = $this->payTime;
        }
        if (null !== $this->payType) {
            $res['pay_type'] = $this->payType;
        }
        if (null !== $this->platformDid) {
            $res['platform_did'] = $this->platformDid;
        }
        if (null !== $this->recvDid) {
            $res['recv_did'] = $this->recvDid;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->taxWaybillId) {
            $res['tax_waybill_id'] = $this->taxWaybillId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateCargoPayorderRequest
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
        if (isset($map['bank_account_of_payee'])) {
            $model->bankAccountOfPayee = $map['bank_account_of_payee'];
        }
        if (isset($map['bank_account_of_payer'])) {
            $model->bankAccountOfPayer = $map['bank_account_of_payer'];
        }
        if (isset($map['bank_no'])) {
            $model->bankNo = $map['bank_no'];
        }
        if (isset($map['bank_of_payee'])) {
            $model->bankOfPayee = $map['bank_of_payee'];
        }
        if (isset($map['bank_of_payer'])) {
            $model->bankOfPayer = $map['bank_of_payer'];
        }
        if (isset($map['bill_id'])) {
            $model->billId = $map['bill_id'];
        }
        if (isset($map['cargo_order'])) {
            $model->cargoOrder = $map['cargo_order'];
        }
        if (isset($map['check_channel'])) {
            $model->checkChannel = $map['check_channel'];
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }
        if (isset($map['expense_type'])) {
            $model->expenseType = $map['expense_type'];
        }
        if (isset($map['payee'])) {
            $model->payee = $map['payee'];
        }
        if (isset($map['payer'])) {
            $model->payer = $map['payer'];
        }
        if (isset($map['payment'])) {
            $model->payment = $map['payment'];
        }
        if (isset($map['pay_check'])) {
            $model->payCheck = $map['pay_check'];
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
        if (isset($map['pay_time'])) {
            $model->payTime = $map['pay_time'];
        }
        if (isset($map['pay_type'])) {
            $model->payType = $map['pay_type'];
        }
        if (isset($map['platform_did'])) {
            $model->platformDid = $map['platform_did'];
        }
        if (isset($map['recv_did'])) {
            $model->recvDid = $map['recv_did'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['tax_waybill_id'])) {
            $model->taxWaybillId = $map['tax_waybill_id'];
        }

        return $model;
    }
}
