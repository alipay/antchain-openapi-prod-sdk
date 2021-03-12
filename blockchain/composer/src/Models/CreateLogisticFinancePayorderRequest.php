<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateLogisticFinancePayorderRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 确认到账时间
    /**
     * @var int
     */
    public $arriveTime;

    // 关联银行流水号
    /**
     * @var string
     */
    public $bankSn;

    // 付款金额
    /**
     * @var string
     */
    public $payAmount;

    // 付款方银行账号
    /**
     * @var string
     */
    public $payBankCardNo;

    // 付款方开户行
    /**
     * @var string
     */
    public $payBankName;

    // 付款方did
    /**
     * @var string
     */
    public $payDid;

    // 付款方名称
    /**
     * @var string
     */
    public $payName;

    // 付款时间戳
    /**
     * @var int
     */
    public $payTime;

    // 支付类型
    /**
     * @var string
     */
    public $payTypeNew;

    // 支付方式
    /**
     * @var string
     */
    public $payWay;

    // 无车承运平台分布式数字身份，缺省为自己的分布式数字身份
    /**
     * @var string
     */
    public $platformDid;

    // 支付订单ID
    /**
     * @var string
     */
    public $posInfoId;

    // 实际付款方开户行
    /**
     * @var string
     */
    public $realPayBank;

    // 实际付款方银行账号
    /**
     * @var string
     */
    public $realPayBankCardNo;

    // 实际付款方名称
    /**
     * @var string
     */
    public $realPayName;

    // 收款方银行账号
    /**
     * @var string
     */
    public $recvBankCardNo;

    // 收款方开户行
    /**
     * @var string
     */
    public $recvBankName;

    // 收款方did
    /**
     * @var string
     */
    public $recvDid;

    // 收款方名称
    /**
     * @var string
     */
    public $recvName;

    // 关联的运单ID
    /**
     * @var string
     */
    public $waybillId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'arriveTime'        => 'arrive_time',
        'bankSn'            => 'bank_sn',
        'payAmount'         => 'pay_amount',
        'payBankCardNo'     => 'pay_bank_card_no',
        'payBankName'       => 'pay_bank_name',
        'payDid'            => 'pay_did',
        'payName'           => 'pay_name',
        'payTime'           => 'pay_time',
        'payTypeNew'        => 'pay_type_new',
        'payWay'            => 'pay_way',
        'platformDid'       => 'platform_did',
        'posInfoId'         => 'pos_info_id',
        'realPayBank'       => 'real_pay_bank',
        'realPayBankCardNo' => 'real_pay_bank_card_no',
        'realPayName'       => 'real_pay_name',
        'recvBankCardNo'    => 'recv_bank_card_no',
        'recvBankName'      => 'recv_bank_name',
        'recvDid'           => 'recv_did',
        'recvName'          => 'recv_name',
        'waybillId'         => 'waybill_id',
    ];

    public function validate()
    {
        Model::validateRequired('arriveTime', $this->arriveTime, true);
        Model::validateRequired('bankSn', $this->bankSn, true);
        Model::validateRequired('payAmount', $this->payAmount, true);
        Model::validateRequired('payBankCardNo', $this->payBankCardNo, true);
        Model::validateRequired('payBankName', $this->payBankName, true);
        Model::validateRequired('payName', $this->payName, true);
        Model::validateRequired('payTime', $this->payTime, true);
        Model::validateRequired('payTypeNew', $this->payTypeNew, true);
        Model::validateRequired('payWay', $this->payWay, true);
        Model::validateRequired('posInfoId', $this->posInfoId, true);
        Model::validateRequired('realPayBank', $this->realPayBank, true);
        Model::validateRequired('realPayBankCardNo', $this->realPayBankCardNo, true);
        Model::validateRequired('realPayName', $this->realPayName, true);
        Model::validateRequired('recvBankCardNo', $this->recvBankCardNo, true);
        Model::validateRequired('recvBankName', $this->recvBankName, true);
        Model::validateRequired('recvName', $this->recvName, true);
        Model::validateRequired('waybillId', $this->waybillId, true);
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
        if (null !== $this->arriveTime) {
            $res['arrive_time'] = $this->arriveTime;
        }
        if (null !== $this->bankSn) {
            $res['bank_sn'] = $this->bankSn;
        }
        if (null !== $this->payAmount) {
            $res['pay_amount'] = $this->payAmount;
        }
        if (null !== $this->payBankCardNo) {
            $res['pay_bank_card_no'] = $this->payBankCardNo;
        }
        if (null !== $this->payBankName) {
            $res['pay_bank_name'] = $this->payBankName;
        }
        if (null !== $this->payDid) {
            $res['pay_did'] = $this->payDid;
        }
        if (null !== $this->payName) {
            $res['pay_name'] = $this->payName;
        }
        if (null !== $this->payTime) {
            $res['pay_time'] = $this->payTime;
        }
        if (null !== $this->payTypeNew) {
            $res['pay_type_new'] = $this->payTypeNew;
        }
        if (null !== $this->payWay) {
            $res['pay_way'] = $this->payWay;
        }
        if (null !== $this->platformDid) {
            $res['platform_did'] = $this->platformDid;
        }
        if (null !== $this->posInfoId) {
            $res['pos_info_id'] = $this->posInfoId;
        }
        if (null !== $this->realPayBank) {
            $res['real_pay_bank'] = $this->realPayBank;
        }
        if (null !== $this->realPayBankCardNo) {
            $res['real_pay_bank_card_no'] = $this->realPayBankCardNo;
        }
        if (null !== $this->realPayName) {
            $res['real_pay_name'] = $this->realPayName;
        }
        if (null !== $this->recvBankCardNo) {
            $res['recv_bank_card_no'] = $this->recvBankCardNo;
        }
        if (null !== $this->recvBankName) {
            $res['recv_bank_name'] = $this->recvBankName;
        }
        if (null !== $this->recvDid) {
            $res['recv_did'] = $this->recvDid;
        }
        if (null !== $this->recvName) {
            $res['recv_name'] = $this->recvName;
        }
        if (null !== $this->waybillId) {
            $res['waybill_id'] = $this->waybillId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateLogisticFinancePayorderRequest
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
        if (isset($map['arrive_time'])) {
            $model->arriveTime = $map['arrive_time'];
        }
        if (isset($map['bank_sn'])) {
            $model->bankSn = $map['bank_sn'];
        }
        if (isset($map['pay_amount'])) {
            $model->payAmount = $map['pay_amount'];
        }
        if (isset($map['pay_bank_card_no'])) {
            $model->payBankCardNo = $map['pay_bank_card_no'];
        }
        if (isset($map['pay_bank_name'])) {
            $model->payBankName = $map['pay_bank_name'];
        }
        if (isset($map['pay_did'])) {
            $model->payDid = $map['pay_did'];
        }
        if (isset($map['pay_name'])) {
            $model->payName = $map['pay_name'];
        }
        if (isset($map['pay_time'])) {
            $model->payTime = $map['pay_time'];
        }
        if (isset($map['pay_type_new'])) {
            $model->payTypeNew = $map['pay_type_new'];
        }
        if (isset($map['pay_way'])) {
            $model->payWay = $map['pay_way'];
        }
        if (isset($map['platform_did'])) {
            $model->platformDid = $map['platform_did'];
        }
        if (isset($map['pos_info_id'])) {
            $model->posInfoId = $map['pos_info_id'];
        }
        if (isset($map['real_pay_bank'])) {
            $model->realPayBank = $map['real_pay_bank'];
        }
        if (isset($map['real_pay_bank_card_no'])) {
            $model->realPayBankCardNo = $map['real_pay_bank_card_no'];
        }
        if (isset($map['real_pay_name'])) {
            $model->realPayName = $map['real_pay_name'];
        }
        if (isset($map['recv_bank_card_no'])) {
            $model->recvBankCardNo = $map['recv_bank_card_no'];
        }
        if (isset($map['recv_bank_name'])) {
            $model->recvBankName = $map['recv_bank_name'];
        }
        if (isset($map['recv_did'])) {
            $model->recvDid = $map['recv_did'];
        }
        if (isset($map['recv_name'])) {
            $model->recvName = $map['recv_name'];
        }
        if (isset($map['waybill_id'])) {
            $model->waybillId = $map['waybill_id'];
        }

        return $model;
    }
}
