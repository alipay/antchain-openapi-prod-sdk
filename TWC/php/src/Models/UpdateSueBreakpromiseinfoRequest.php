<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class UpdateSueBreakpromiseinfoRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId' => 'order_id',
        'phoneNumber' => 'phone_number',
        'email' => 'email',
        'preSueId' => 'pre_sue_id',
        'promiseDate' => 'promise_date',
        'promiseLimit' => 'promise_limit',
        'sueDate' => 'sue_date',
        'breakPromiseMoney' => 'break_promise_money',
        'businessClass' => 'business_class',
    ];
    public function validate() {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('phoneNumber', $this->phoneNumber, true);
        Model::validateRequired('email', $this->email, true);
        Model::validateRequired('preSueId', $this->preSueId, true);
        Model::validateRequired('promiseDate', $this->promiseDate, true);
        Model::validateRequired('promiseLimit', $this->promiseLimit, true);
        Model::validateRequired('sueDate', $this->sueDate, true);
        Model::validateRequired('breakPromiseMoney', $this->breakPromiseMoney, true);
        Model::validateRequired('businessClass', $this->businessClass, true);
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
        if (null !== $this->phoneNumber) {
            $res['phone_number'] = $this->phoneNumber;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->preSueId) {
            $res['pre_sue_id'] = $this->preSueId;
        }
        if (null !== $this->promiseDate) {
            $res['promise_date'] = $this->promiseDate;
        }
        if (null !== $this->promiseLimit) {
            $res['promise_limit'] = $this->promiseLimit;
        }
        if (null !== $this->sueDate) {
            $res['sue_date'] = $this->sueDate;
        }
        if (null !== $this->breakPromiseMoney) {
            $res['break_promise_money'] = $this->breakPromiseMoney;
        }
        if (null !== $this->businessClass) {
            $res['business_class'] = $this->businessClass;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateSueBreakpromiseinfoRequest
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
        if(isset($map['phone_number'])){
            $model->phoneNumber = $map['phone_number'];
        }
        if(isset($map['email'])){
            $model->email = $map['email'];
        }
        if(isset($map['pre_sue_id'])){
            $model->preSueId = $map['pre_sue_id'];
        }
        if(isset($map['promise_date'])){
            $model->promiseDate = $map['promise_date'];
        }
        if(isset($map['promise_limit'])){
            $model->promiseLimit = $map['promise_limit'];
        }
        if(isset($map['sue_date'])){
            $model->sueDate = $map['sue_date'];
        }
        if(isset($map['break_promise_money'])){
            $model->breakPromiseMoney = $map['break_promise_money'];
        }
        if(isset($map['business_class'])){
            $model->businessClass = $map['business_class'];
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

    // 合同唯一标识，不可更新
    // 
    /**
     * @var string
     */
    public $orderId;

    // 当事人手机号
    /**
     * @var string
     */
    public $phoneNumber;

    // 当事人电子邮箱地址
    /**
     * @var string
     */
    public $email;

    // 诉前Id，不可更新
    // 
    /**
     * @var string
     */
    public $preSueId;

    // 应履约日期，格式为"2019-07-31 12:00:00"
    /**
     * @var string
     */
    public $promiseDate;

    // 宽限期(天数，从应履约日期到进行诉前违约惩戒的自然日数）
    /**
     * @var int
     */
    public $promiseLimit;

    // 起诉期，格式为"2019-07-31 12:00:00"
    /**
     * @var string
     */
    public $sueDate;

    // 违约金额，精确到毫厘，即123400表示12.34元
    /**
     * @var int
     */
    public $breakPromiseMoney;

    // 所属行业
    // 
    /**
     * @var string
     */
    public $businessClass;

}
