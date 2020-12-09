<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class CreateDigitalLogisticWaybillPayRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'arriveTime' => 'arrive_time',
        'bankSn' => 'bank_sn',
        'payAmount' => 'pay_amount',
        'payBankCardNo' => 'pay_bank_card_no',
        'payBankName' => 'pay_bank_name',
        'payCheck' => 'pay_check',
        'payDid' => 'pay_did',
        'payName' => 'pay_name',
        'payTime' => 'pay_time',
        'payTypeNew' => 'pay_type_new',
        'payWay' => 'pay_way',
        'platformDid' => 'platform_did',
        'posInfoId' => 'pos_info_id',
        'realPayBank' => 'real_pay_bank',
        'realPayBankCardNo' => 'real_pay_bank_card_no',
        'realPayName' => 'real_pay_name',
        'recvBankCardNo' => 'recv_bank_card_no',
        'recvBankName' => 'recv_bank_name',
        'recvDid' => 'recv_did',
        'recvName' => 'recv_name',
        'waybillId' => 'waybill_id',
        'checkChannel' => 'check_channel',
        'currency' => 'currency',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
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
        if (null !== $this->payCheck) {
            $res['pay_check'] = $this->payCheck;
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
        if (null !== $this->checkChannel) {
            $res['check_channel'] = $this->checkChannel;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateDigitalLogisticWaybillPayRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
        if(isset($map['arrive_time'])){
            $model->arriveTime = $map['arrive_time'];
        }
        if(isset($map['bank_sn'])){
            $model->bankSn = $map['bank_sn'];
        }
        if(isset($map['pay_amount'])){
            $model->payAmount = $map['pay_amount'];
        }
        if(isset($map['pay_bank_card_no'])){
            $model->payBankCardNo = $map['pay_bank_card_no'];
        }
        if(isset($map['pay_bank_name'])){
            $model->payBankName = $map['pay_bank_name'];
        }
        if(isset($map['pay_check'])){
            $model->payCheck = $map['pay_check'];
        }
        if(isset($map['pay_did'])){
            $model->payDid = $map['pay_did'];
        }
        if(isset($map['pay_name'])){
            $model->payName = $map['pay_name'];
        }
        if(isset($map['pay_time'])){
            $model->payTime = $map['pay_time'];
        }
        if(isset($map['pay_type_new'])){
            $model->payTypeNew = $map['pay_type_new'];
        }
        if(isset($map['pay_way'])){
            $model->payWay = $map['pay_way'];
        }
        if(isset($map['platform_did'])){
            $model->platformDid = $map['platform_did'];
        }
        if(isset($map['pos_info_id'])){
            $model->posInfoId = $map['pos_info_id'];
        }
        if(isset($map['real_pay_bank'])){
            $model->realPayBank = $map['real_pay_bank'];
        }
        if(isset($map['real_pay_bank_card_no'])){
            $model->realPayBankCardNo = $map['real_pay_bank_card_no'];
        }
        if(isset($map['real_pay_name'])){
            $model->realPayName = $map['real_pay_name'];
        }
        if(isset($map['recv_bank_card_no'])){
            $model->recvBankCardNo = $map['recv_bank_card_no'];
        }
        if(isset($map['recv_bank_name'])){
            $model->recvBankName = $map['recv_bank_name'];
        }
        if(isset($map['recv_did'])){
            $model->recvDid = $map['recv_did'];
        }
        if(isset($map['recv_name'])){
            $model->recvName = $map['recv_name'];
        }
        if(isset($map['waybill_id'])){
            $model->waybillId = $map['waybill_id'];
        }
        if(isset($map['check_channel'])){
            $model->checkChannel = $map['check_channel'];
        }
        if(isset($map['currency'])){
            $model->currency = $map['currency'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    /**
     * @var string
     */
    public $regionName;

    // 确认到账时间
    // 
    /**
     * @var int
     */
    public $arriveTime;

    // 关联银行流水号
    // 
    /**
     * @var string
     */
    public $bankSn;

    // 付款金额
    // 
    /**
     * @var string
     */
    public $payAmount;

    // 付款方银行账号
    // 
    /**
     * @var string
     */
    public $payBankCardNo;

    // 付款方开户行
    // 
    /**
     * @var string
     */
    public $payBankName;

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

    // 付款方名称
    // 
    /**
     * @var string
     */
    public $payName;

    // 付款时间戳
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
    public $payTypeNew;

    // 支付方式
    // 
    /**
     * @var string
     */
    public $payWay;

    // 无车承运平台分布式数字身份，缺省为自己的分布式数字身份
    // 
    /**
     * @var string
     */
    public $platformDid;

    // 支付订单ID
    // 
    /**
     * @var string
     */
    public $posInfoId;

    // 实际付款方开户行
    // 
    /**
     * @var string
     */
    public $realPayBank;

    // 实际付款方银行账号
    // 
    /**
     * @var string
     */
    public $realPayBankCardNo;

    // 实际付款方名称
    // 
    /**
     * @var string
     */
    public $realPayName;

    // 收款方银行账号
    // 
    /**
     * @var string
     */
    public $recvBankCardNo;

    // 收款方开户行
    // 
    /**
     * @var string
     */
    public $recvBankName;

    // 收款方did
    // 
    /**
     * @var string
     */
    public $recvDid;

    // 收款方名称
    // 
    /**
     * @var string
     */
    public $recvName;

    // 关联的运单ID
    // 
    /**
     * @var string
     */
    public $waybillId;

    // MYBank_CloudCapital_1,  ## 云资金1.0
    // MYBank_CloudCapital_2,  ## 云资金2.0
    /**
     * @var string
     */
    public $checkChannel;

    // CNY, USD
    /**
     * @var string
     */
    public $currency;

}
