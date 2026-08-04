<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\GESAAS_SPI\Models;

use AlibabaCloud\Tea\Model;

class QueryRightsprodConfigResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'supplyRightsCode' => 'supply_rights_code',
        'rightsName' => 'rights_name',
        'rightsType' => 'rights_type',
        'status' => 'status',
        'createTime' => 'create_time',
        'grantStartTime' => 'grant_start_time',
        'grantEndTime' => 'grant_end_time',
        'validityTimeType' => 'validity_time_type',
        'voucherStartTime' => 'voucher_start_time',
        'voucherEndTime' => 'voucher_end_time',
        'validityTimeFormat' => 'validity_time_format',
        'validityTime' => 'validity_time',
        'faceAmount' => 'face_amount',
        'sillAmount' => 'sill_amount',
        'discount' => 'discount',
        'maxDiscountAmount' => 'max_discount_amount',
        'rightsNum' => 'rights_num',
        'totalBudget' => 'total_budget',
        'description' => 'description',
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
        if (null !== $this->supplyRightsCode) {
            $res['supply_rights_code'] = $this->supplyRightsCode;
        }
        if (null !== $this->rightsName) {
            $res['rights_name'] = $this->rightsName;
        }
        if (null !== $this->rightsType) {
            $res['rights_type'] = $this->rightsType;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->grantStartTime) {
            $res['grant_start_time'] = $this->grantStartTime;
        }
        if (null !== $this->grantEndTime) {
            $res['grant_end_time'] = $this->grantEndTime;
        }
        if (null !== $this->validityTimeType) {
            $res['validity_time_type'] = $this->validityTimeType;
        }
        if (null !== $this->voucherStartTime) {
            $res['voucher_start_time'] = $this->voucherStartTime;
        }
        if (null !== $this->voucherEndTime) {
            $res['voucher_end_time'] = $this->voucherEndTime;
        }
        if (null !== $this->validityTimeFormat) {
            $res['validity_time_format'] = $this->validityTimeFormat;
        }
        if (null !== $this->validityTime) {
            $res['validity_time'] = $this->validityTime;
        }
        if (null !== $this->faceAmount) {
            $res['face_amount'] = $this->faceAmount;
        }
        if (null !== $this->sillAmount) {
            $res['sill_amount'] = $this->sillAmount;
        }
        if (null !== $this->discount) {
            $res['discount'] = $this->discount;
        }
        if (null !== $this->maxDiscountAmount) {
            $res['max_discount_amount'] = $this->maxDiscountAmount;
        }
        if (null !== $this->rightsNum) {
            $res['rights_num'] = $this->rightsNum;
        }
        if (null !== $this->totalBudget) {
            $res['total_budget'] = $this->totalBudget;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryRightsprodConfigResponse
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
        if(isset($map['supply_rights_code'])){
            $model->supplyRightsCode = $map['supply_rights_code'];
        }
        if(isset($map['rights_name'])){
            $model->rightsName = $map['rights_name'];
        }
        if(isset($map['rights_type'])){
            $model->rightsType = $map['rights_type'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['create_time'])){
            $model->createTime = $map['create_time'];
        }
        if(isset($map['grant_start_time'])){
            $model->grantStartTime = $map['grant_start_time'];
        }
        if(isset($map['grant_end_time'])){
            $model->grantEndTime = $map['grant_end_time'];
        }
        if(isset($map['validity_time_type'])){
            $model->validityTimeType = $map['validity_time_type'];
        }
        if(isset($map['voucher_start_time'])){
            $model->voucherStartTime = $map['voucher_start_time'];
        }
        if(isset($map['voucher_end_time'])){
            $model->voucherEndTime = $map['voucher_end_time'];
        }
        if(isset($map['validity_time_format'])){
            $model->validityTimeFormat = $map['validity_time_format'];
        }
        if(isset($map['validity_time'])){
            $model->validityTime = $map['validity_time'];
        }
        if(isset($map['face_amount'])){
            $model->faceAmount = $map['face_amount'];
        }
        if(isset($map['sill_amount'])){
            $model->sillAmount = $map['sill_amount'];
        }
        if(isset($map['discount'])){
            $model->discount = $map['discount'];
        }
        if(isset($map['max_discount_amount'])){
            $model->maxDiscountAmount = $map['max_discount_amount'];
        }
        if(isset($map['rights_num'])){
            $model->rightsNum = $map['rights_num'];
        }
        if(isset($map['total_budget'])){
            $model->totalBudget = $map['total_budget'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
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

    // 供应权益编码
    /**
     * @var string
     */
    public $supplyRightsCode;

    // 权益名称
    /**
     * @var string
     */
    public $rightsName;

    // 权益类型
    // 满减券:FULL_REDUCTION_COUPON
    // 每满减券:EVERY_FULL_REDUCTION_COUPON
    // 折扣券:DISCOUNT_COUPON
    /**
     * @var string
     */
    public $rightsType;

    // 待发布:INIT
    // 已上线:ONLINE
    // 已暂停:PAUSED
    // 已下线:OFFLINE
    /**
     * @var string
     */
    public $status;

    // 权益创建时间格式为yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $createTime;

    // 权益发放开始时间
    /**
     * @var string
     */
    public $grantStartTime;

    // 权益发放截止时间
    /**
     * @var string
     */
    public $grantEndTime;

    // 生效时间类型 固定时间:1;领券后:0
    /**
     * @var string
     */
    public $validityTimeType;

    // 生效时间 格式为yyyy-MM-dd HH:mm:ss
    // 生效时间类型为 1 固定时间是必传
    /**
     * @var string
     */
    public $voucherStartTime;

    // 过期时间 格式为yyyy-MM-dd HH:mm:ss
    // 生效时间类型为 1 固定时间是必传
    /**
     * @var string
     */
    public $voucherEndTime;

    // 生效时间类型：DAY/HOUR
    // 当生效时间类型为0时 必传
    /**
     * @var string
     */
    public $validityTimeFormat;

    // 生效时间数
    // 生效时间类型 0时 必传
    /**
     * @var int
     */
    public $validityTime;

    // 权益面额 单位：元
    /**
     * @var string
     */
    public $faceAmount;

    // 门槛金额单位：元
    /**
     * @var string
     */
    public $sillAmount;

    // 折扣数 88折 对应为8.8
    /**
     * @var string
     */
    public $discount;

    // 最大优惠金额
    /**
     * @var string
     */
    public $maxDiscountAmount;

    // 券原始库存（最大发券数）
    /**
     * @var int
     */
    public $rightsNum;

    // 总预算金额
    /**
     * @var string
     */
    public $totalBudget;

    // 使用描述
    /**
     * @var string
     */
    public $description;

}
