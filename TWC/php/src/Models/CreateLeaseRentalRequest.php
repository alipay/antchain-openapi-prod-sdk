<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateLeaseRentalRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'applicationId' => 'application_id',
        'charge' => 'charge',
        'extraInfo' => 'extra_info',
        'isFinish' => 'is_finish',
        'leaseTermIndex' => 'lease_term_index',
        'orderId' => 'order_id',
        'remainRental' => 'remain_rental',
        'remainTerm' => 'remain_term',
        'rentalMoney' => 'rental_money',
        'rentalReturnState' => 'rental_return_state',
        'returnTime' => 'return_time',
        'returnVoucherSerial' => 'return_voucher_serial',
        'returnVoucherType' => 'return_voucher_type',
        'returnWay' => 'return_way',
        'async' => 'async',
    ];
    public function validate() {
        Model::validateRequired('charge', $this->charge, true);
        Model::validateRequired('isFinish', $this->isFinish, true);
        Model::validateRequired('leaseTermIndex', $this->leaseTermIndex, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('remainRental', $this->remainRental, true);
        Model::validateRequired('remainTerm', $this->remainTerm, true);
        Model::validateRequired('rentalMoney', $this->rentalMoney, true);
        Model::validateRequired('rentalReturnState', $this->rentalReturnState, true);
        Model::validateRequired('returnTime', $this->returnTime, true);
        Model::validateRequired('returnVoucherSerial', $this->returnVoucherSerial, true);
        Model::validateRequired('returnVoucherType', $this->returnVoucherType, true);
        Model::validateRequired('returnWay', $this->returnWay, true);
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
        if (null !== $this->charge) {
            $res['charge'] = $this->charge;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }
        if (null !== $this->isFinish) {
            $res['is_finish'] = $this->isFinish;
        }
        if (null !== $this->leaseTermIndex) {
            $res['lease_term_index'] = $this->leaseTermIndex;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->remainRental) {
            $res['remain_rental'] = $this->remainRental;
        }
        if (null !== $this->remainTerm) {
            $res['remain_term'] = $this->remainTerm;
        }
        if (null !== $this->rentalMoney) {
            $res['rental_money'] = $this->rentalMoney;
        }
        if (null !== $this->rentalReturnState) {
            $res['rental_return_state'] = $this->rentalReturnState;
        }
        if (null !== $this->returnTime) {
            $res['return_time'] = $this->returnTime;
        }
        if (null !== $this->returnVoucherSerial) {
            $res['return_voucher_serial'] = $this->returnVoucherSerial;
        }
        if (null !== $this->returnVoucherType) {
            $res['return_voucher_type'] = $this->returnVoucherType;
        }
        if (null !== $this->returnWay) {
            $res['return_way'] = $this->returnWay;
        }
        if (null !== $this->async) {
            $res['async'] = $this->async;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateLeaseRentalRequest
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
        if(isset($map['charge'])){
            $model->charge = $map['charge'];
        }
        if(isset($map['extra_info'])){
            $model->extraInfo = $map['extra_info'];
        }
        if(isset($map['is_finish'])){
            $model->isFinish = $map['is_finish'];
        }
        if(isset($map['lease_term_index'])){
            $model->leaseTermIndex = $map['lease_term_index'];
        }
        if(isset($map['order_id'])){
            $model->orderId = $map['order_id'];
        }
        if(isset($map['remain_rental'])){
            $model->remainRental = $map['remain_rental'];
        }
        if(isset($map['remain_term'])){
            $model->remainTerm = $map['remain_term'];
        }
        if(isset($map['rental_money'])){
            $model->rentalMoney = $map['rental_money'];
        }
        if(isset($map['rental_return_state'])){
            $model->rentalReturnState = $map['rental_return_state'];
        }
        if(isset($map['return_time'])){
            $model->returnTime = $map['return_time'];
        }
        if(isset($map['return_voucher_serial'])){
            $model->returnVoucherSerial = $map['return_voucher_serial'];
        }
        if(isset($map['return_voucher_type'])){
            $model->returnVoucherType = $map['return_voucher_type'];
        }
        if(isset($map['return_way'])){
            $model->returnWay = $map['return_way'];
        }
        if(isset($map['async'])){
            $model->async = $map['async'];
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

    // 手续费，如通过预授权、代扣的方式规划，必填
    /**
     * @var int
     */
    public $charge;

    // 融资租赁用户还款额外字段
    /**
     * @var string
     */
    public $extraInfo;

    // 是否本订单所有租金还款状态结束
    /**
     * @var bool
     */
    public $isFinish;

    // 租期编号，从1开始
    /**
     * @var int
     */
    public $leaseTermIndex;

    // 订单id 长度不可超过50
    /**
     * @var string
     */
    public $orderId;

    // 剩余租金总数,会核验剩余租金与承诺等额
    /**
     * @var int
     */
    public $remainRental;

    // 剩余归还期数
    /**
     * @var int
     */
    public $remainTerm;

    // 租金归还金额,精确到毫厘，即123400表示12.34元
    /**
     * @var int
     */
    public $rentalMoney;

    // 租金归还状态，1.足额归还2.部分归还3.未归还
    /**
     * @var int
     */
    public $rentalReturnState;

    // 归还时间，格式为"2019-07-31 12:00:00"
    /**
     * @var string
     */
    public $returnTime;

    // 还款凭证编号，不超过128字符，1.支付宝流水号
    /**
     * @var string
     */
    public $returnVoucherSerial;

    // 还款凭证类型，1.支付宝2.平台代收（客户主动还款）3.其他
    /**
     * @var int
     */
    public $returnVoucherType;

    // 归还方式，1.预授权代扣2.支付宝代扣3.主动还款4.其他
    /**
     * @var int
     */
    public $returnWay;

    // 是否启动订单的异步处理
    /**
     * @var int
     */
    public $async;

}
