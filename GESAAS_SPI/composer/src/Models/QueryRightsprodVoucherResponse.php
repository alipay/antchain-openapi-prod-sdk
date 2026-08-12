<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\GESAAS_SPI\Models;

use AlibabaCloud\Tea\Model;

class QueryRightsprodVoucherResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'userId' => 'user_id',
        'phoneNumber' => 'phone_number',
        'openId' => 'open_id',
        'appId' => 'app_id',
        'supplyRightsCode' => 'supply_rights_code',
        'voucherCode' => 'voucher_code',
        'rightsName' => 'rights_name',
        'faceAmount' => 'face_amount',
        'availableAmount' => 'available_amount',
        'status' => 'status',
        'expireTime' => 'expire_time',
        'effectTime' => 'effect_time',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->phoneNumber) {
            $res['phone_number'] = $this->phoneNumber;
        }
        if (null !== $this->openId) {
            $res['open_id'] = $this->openId;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->supplyRightsCode) {
            $res['supply_rights_code'] = $this->supplyRightsCode;
        }
        if (null !== $this->voucherCode) {
            $res['voucher_code'] = $this->voucherCode;
        }
        if (null !== $this->rightsName) {
            $res['rights_name'] = $this->rightsName;
        }
        if (null !== $this->faceAmount) {
            $res['face_amount'] = $this->faceAmount;
        }
        if (null !== $this->availableAmount) {
            $res['available_amount'] = $this->availableAmount;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->expireTime) {
            $res['expire_time'] = $this->expireTime;
        }
        if (null !== $this->effectTime) {
            $res['effect_time'] = $this->effectTime;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryRightsprodVoucherResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['user_id'])){
            $model->userId = $map['user_id'];
        }
        if(isset($map['phone_number'])){
            $model->phoneNumber = $map['phone_number'];
        }
        if(isset($map['open_id'])){
            $model->openId = $map['open_id'];
        }
        if(isset($map['app_id'])){
            $model->appId = $map['app_id'];
        }
        if(isset($map['supply_rights_code'])){
            $model->supplyRightsCode = $map['supply_rights_code'];
        }
        if(isset($map['voucher_code'])){
            $model->voucherCode = $map['voucher_code'];
        }
        if(isset($map['rights_name'])){
            $model->rightsName = $map['rights_name'];
        }
        if(isset($map['face_amount'])){
            $model->faceAmount = $map['face_amount'];
        }
        if(isset($map['available_amount'])){
            $model->availableAmount = $map['available_amount'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['expire_time'])){
            $model->expireTime = $map['expire_time'];
        }
        if(isset($map['effect_time'])){
            $model->effectTime = $map['effect_time'];
        }
        return $model;
    }
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 用户ID
    /**
     * @var string
     */
    public $userId;

    // 用户手机号
    /**
     * @var string
     */
    public $phoneNumber;

    // 用户openId
    /**
     * @var string
     */
    public $openId;

    // 应用ID
    /**
     * @var string
     */
    public $appId;

    // 供应商权益编码
    /**
     * @var string
     */
    public $supplyRightsCode;

    // 权益实例ID
    /**
     * @var string
     */
    public $voucherCode;

    // 权益名称
    /**
     * @var string
     */
    public $rightsName;

    // 权益面额
    /**
     * @var string
     */
    public $faceAmount;

    // 剩余可用金额
    /**
     * @var string
     */
    public $availableAmount;

    // 权益实例状态
    /**
     * @var string
     */
    public $status;

    // 过期时间
    /**
     * @var string
     */
    public $expireTime;

    // 生效时间
    /**
     * @var string
     */
    public $effectTime;

}
