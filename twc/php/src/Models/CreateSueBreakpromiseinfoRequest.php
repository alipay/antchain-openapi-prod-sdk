<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateSueBreakpromiseinfoRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId' => 'order_id',
        'userId' => 'user_id',
        'userName' => 'user_name',
        'phoneNumber' => 'phone_number',
        'email' => 'email',
        'preSueId' => 'pre_sue_id',
        'promiseDate' => 'promise_date',
        'promiseLimit' => 'promise_limit',
        'sueDate' => 'sue_date',
        'initiatorId' => 'initiator_id',
        'initiatorName' => 'initiator_name',
        'courtName' => 'court_name',
        'courtId' => 'court_id',
        'breakPromiseMoney' => 'break_promise_money',
        'businessClass' => 'business_class',
    ];
    public function validate() {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('userName', $this->userName, true);
        Model::validateRequired('phoneNumber', $this->phoneNumber, true);
        Model::validateRequired('email', $this->email, true);
        Model::validateRequired('preSueId', $this->preSueId, true);
        Model::validateRequired('promiseDate', $this->promiseDate, true);
        Model::validateRequired('promiseLimit', $this->promiseLimit, true);
        Model::validateRequired('sueDate', $this->sueDate, true);
        Model::validateRequired('initiatorId', $this->initiatorId, true);
        Model::validateRequired('initiatorName', $this->initiatorName, true);
        Model::validateRequired('courtName', $this->courtName, true);
        Model::validateRequired('courtId', $this->courtId, true);
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
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
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
        if (null !== $this->initiatorId) {
            $res['initiator_id'] = $this->initiatorId;
        }
        if (null !== $this->initiatorName) {
            $res['initiator_name'] = $this->initiatorName;
        }
        if (null !== $this->courtName) {
            $res['court_name'] = $this->courtName;
        }
        if (null !== $this->courtId) {
            $res['court_id'] = $this->courtId;
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
     * @return CreateSueBreakpromiseinfoRequest
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
        if(isset($map['user_id'])){
            $model->userId = $map['user_id'];
        }
        if(isset($map['user_name'])){
            $model->userName = $map['user_name'];
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
        if(isset($map['initiator_id'])){
            $model->initiatorId = $map['initiator_id'];
        }
        if(isset($map['initiator_name'])){
            $model->initiatorName = $map['initiator_name'];
        }
        if(isset($map['court_name'])){
            $model->courtName = $map['court_name'];
        }
        if(isset($map['court_id'])){
            $model->courtId = $map['court_id'];
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

    // 合同唯一标识
    // 
    /**
     * @var string
     */
    public $orderId;

    // 当事人身份证号
    /**
     * @var string
     */
    public $userId;

    // 当事人姓名
    /**
     * @var string
     */
    public $userName;

    // 当事人手机号
    /**
     * @var string
     */
    public $phoneNumber;

    // 当事人邮箱地址
    /**
     * @var string
     */
    public $email;

    // 诉前Id
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
    // 
    /**
     * @var string
     */
    public $sueDate;

    // 商户统一社会信用代码或个人身份证
    /**
     * @var string
     */
    public $initiatorId;

    // 商户或个人名称
    // 
    /**
     * @var string
     */
    public $initiatorName;

    // 管辖法院名称
    /**
     * @var string
     */
    public $courtName;

    // 法院唯一标识
    /**
     * @var string
     */
    public $courtId;

    // 违约金额，精确到毫厘，即123400表示12.34元
    /**
     * @var int
     */
    public $breakPromiseMoney;

    // 所属行业
    /**
     * @var string
     */
    public $businessClass;

}
