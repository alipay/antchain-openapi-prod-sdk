<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateLeaseVerifyinfoRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'applicationId' => 'application_id',
        'async' => 'async',
        'cardNumber' => 'card_number',
        'creditEndTime' => 'credit_end_time',
        'creditLimit' => 'credit_limit',
        'creditStartTime' => 'credit_start_time',
        'extraInfo' => 'extra_info',
        'leaseCorpId' => 'lease_corp_id',
        'leaseCorpName' => 'lease_corp_name',
        'leaseCorpOwnerName' => 'lease_corp_owner_name',
        'leaseId' => 'lease_id',
        'loan' => 'loan',
        'orderId' => 'order_id',
        'payBackHash' => 'pay_back_hash',
        'payBackTxHash' => 'pay_back_tx_hash',
        'userId' => 'user_id',
        'userName' => 'user_name',
        'userPhoneNumber' => 'user_phone_number',
        'verifyResult' => 'verify_result',
        'voucher' => 'voucher',
        'verifyRefuseDesc' => 'verify_refuse_desc',
    ];
    public function validate() {
        Model::validateRequired('leaseId', $this->leaseId, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('verifyResult', $this->verifyResult, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->applicationId) {
            $res['application_id'] = $this->applicationId;
        }
        if (null !== $this->async) {
            $res['async'] = $this->async;
        }
        if (null !== $this->cardNumber) {
            $res['card_number'] = $this->cardNumber;
        }
        if (null !== $this->creditEndTime) {
            $res['credit_end_time'] = $this->creditEndTime;
        }
        if (null !== $this->creditLimit) {
            $res['credit_limit'] = $this->creditLimit;
        }
        if (null !== $this->creditStartTime) {
            $res['credit_start_time'] = $this->creditStartTime;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }
        if (null !== $this->leaseCorpId) {
            $res['lease_corp_id'] = $this->leaseCorpId;
        }
        if (null !== $this->leaseCorpName) {
            $res['lease_corp_name'] = $this->leaseCorpName;
        }
        if (null !== $this->leaseCorpOwnerName) {
            $res['lease_corp_owner_name'] = $this->leaseCorpOwnerName;
        }
        if (null !== $this->leaseId) {
            $res['lease_id'] = $this->leaseId;
        }
        if (null !== $this->loan) {
            $res['loan'] = $this->loan;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->payBackHash) {
            $res['pay_back_hash'] = $this->payBackHash;
        }
        if (null !== $this->payBackTxHash) {
            $res['pay_back_tx_hash'] = $this->payBackTxHash;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->userPhoneNumber) {
            $res['user_phone_number'] = $this->userPhoneNumber;
        }
        if (null !== $this->verifyResult) {
            $res['verify_result'] = $this->verifyResult;
        }
        if (null !== $this->voucher) {
            $res['voucher'] = $this->voucher;
        }
        if (null !== $this->verifyRefuseDesc) {
            $res['verify_refuse_desc'] = $this->verifyRefuseDesc;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateLeaseVerifyinfoRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['application_id'])){
            $model->applicationId = $map['application_id'];
        }
        if(isset($map['async'])){
            $model->async = $map['async'];
        }
        if(isset($map['card_number'])){
            $model->cardNumber = $map['card_number'];
        }
        if(isset($map['credit_end_time'])){
            $model->creditEndTime = $map['credit_end_time'];
        }
        if(isset($map['credit_limit'])){
            $model->creditLimit = $map['credit_limit'];
        }
        if(isset($map['credit_start_time'])){
            $model->creditStartTime = $map['credit_start_time'];
        }
        if(isset($map['extra_info'])){
            $model->extraInfo = $map['extra_info'];
        }
        if(isset($map['lease_corp_id'])){
            $model->leaseCorpId = $map['lease_corp_id'];
        }
        if(isset($map['lease_corp_name'])){
            $model->leaseCorpName = $map['lease_corp_name'];
        }
        if(isset($map['lease_corp_owner_name'])){
            $model->leaseCorpOwnerName = $map['lease_corp_owner_name'];
        }
        if(isset($map['lease_id'])){
            $model->leaseId = $map['lease_id'];
        }
        if(isset($map['loan'])){
            $model->loan = $map['loan'];
        }
        if(isset($map['order_id'])){
            $model->orderId = $map['order_id'];
        }
        if(isset($map['pay_back_hash'])){
            $model->payBackHash = $map['pay_back_hash'];
        }
        if(isset($map['pay_back_tx_hash'])){
            $model->payBackTxHash = $map['pay_back_tx_hash'];
        }
        if(isset($map['user_id'])){
            $model->userId = $map['user_id'];
        }
        if(isset($map['user_name'])){
            $model->userName = $map['user_name'];
        }
        if(isset($map['user_phone_number'])){
            $model->userPhoneNumber = $map['user_phone_number'];
        }
        if(isset($map['verify_result'])){
            $model->verifyResult = $map['verify_result'];
        }
        if(isset($map['voucher'])){
            $model->voucher = $map['voucher'];
        }
        if(isset($map['verify_refuse_desc'])){
            $model->verifyRefuseDesc = $map['verify_refuse_desc'];
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

    // 融资租赁业务id，由资方控制台生成返回
    /**
     * @var string
     */
    public $applicationId;

    // 是否启动订单的异步处理
    /**
     * @var int
     */
    public $async;

    // 放款账户
    /**
     * @var string
     */
    public $cardNumber;

    // 授信终止时间，格式为"2019-07-31 12:00:00"
    /**
     * @var string
     */
    public $creditEndTime;

    // 授信额度，精确到毫厘，即123400表示12.34元
    /**
     * @var int
     */
    public $creditLimit;

    // 授信起始时间，格式为"2019-07-31 12:00:00"
    /**
     * @var string
     */
    public $creditStartTime;

    // 融资租赁审贷信息额外字段
    /**
     * @var string
     */
    public $extraInfo;

    // 承租企业统一社会信用代码 长度不可超过50
    /**
     * @var string
     */
    public $leaseCorpId;

    // 承租企业名称 长度不可超过50
    /**
     * @var string
     */
    public $leaseCorpName;

    // 承租法定代表人姓名 长度不可超过50
    /**
     * @var string
     */
    public $leaseCorpOwnerName;

    // 租赁服务平台id
    /**
     * @var string
     */
    public $leaseId;

    // 放款流水单号
    /**
     * @var string
     */
    public $loan;

    // 订单id 长度不可超过50
    /**
     * @var string
     */
    public $orderId;

    // 还款计划文件哈希
    /**
     * @var string
     */
    public $payBackHash;

    // 还款计划文件存证交易哈希
    /**
     * @var string
     */
    public $payBackTxHash;

    // 承租人身份证
    /**
     * @var string
     */
    public $userId;

    // 承租人姓名 长度不可超过10
    /**
     * @var string
     */
    public $userName;

    // 承租人手机号
    /**
     * @var string
     */
    public $userPhoneNumber;

    // 是否通过，0表示不通过，1表示通过
    /**
     * @var int
     */
    public $verifyResult;

    // 付款汇款凭证 民盛转账成功后上传
    /**
     * @var string
     */
    public $voucher;

    // 拒绝的理由
    /**
     * @var string
     */
    public $verifyRefuseDesc;

}
