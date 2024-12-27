<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\UNICONTACT\Models;

use AlibabaCloud\Tea\Model;

class CallbackSmsStatusRequest extends Model
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

    // TEXT_SMS_REPORT
    /**
     * @var string
     */
    public $type;

    // 手机号
    /**
     * @var string
     */
    public $phoneNumber;

    // 发送时间
    /**
     * @var string
     */
    public $sendTime;

    // 状态报告时间。
    /**
     * @var string
     */
    public $reportTime;

    // 是否接收成功。取值：true：接收成功false：接收失败
    /**
     * @var bool
     */
    public $success;

    // 状态报告编码。发送成功情况下为“DELIVERED”
    /**
     * @var string
     */
    public $errCode;

    // 状态报告说明。发送成功情况下为“用户接收成功”
    /**
     * @var string
     */
    public $errMsg;

    // 短信长度。
    /**
     * @var string
     */
    public $smsSize;

    // 发送回执ID，即发送流水号。
    /**
     * @var string
     */
    public $bizId;

    // 业务扩展字段，回执时透传，JSON格式
    /**
     * @var string
     */
    public $bizProperties;

    // 发送卡片短信时，文本短信状态报告中才会有该字段，且取值为CARD_SMS，发送纯文本短信时，状态报告中没有该字段
    /**
     * @var string
     */
    public $smsType;

    // 运营商
    /**
     * @var string
     */
    public $serviceProvider;

    // 手机号归属地
    /**
     * @var string
     */
    public $city;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'type'              => 'type',
        'phoneNumber'       => 'phone_number',
        'sendTime'          => 'send_time',
        'reportTime'        => 'report_time',
        'success'           => 'success',
        'errCode'           => 'err_code',
        'errMsg'            => 'err_msg',
        'smsSize'           => 'sms_size',
        'bizId'             => 'biz_id',
        'bizProperties'     => 'biz_properties',
        'smsType'           => 'sms_type',
        'serviceProvider'   => 'service_provider',
        'city'              => 'city',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('phoneNumber', $this->phoneNumber, true);
        Model::validateRequired('sendTime', $this->sendTime, true);
        Model::validateRequired('reportTime', $this->reportTime, true);
        Model::validateRequired('success', $this->success, true);
        Model::validateRequired('errCode', $this->errCode, true);
        Model::validateRequired('errMsg', $this->errMsg, true);
        Model::validateRequired('smsSize', $this->smsSize, true);
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('bizProperties', $this->bizProperties, true);
        Model::validateRequired('serviceProvider', $this->serviceProvider, true);
        Model::validateRequired('city', $this->city, true);
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
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->phoneNumber) {
            $res['phone_number'] = $this->phoneNumber;
        }
        if (null !== $this->sendTime) {
            $res['send_time'] = $this->sendTime;
        }
        if (null !== $this->reportTime) {
            $res['report_time'] = $this->reportTime;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->errCode) {
            $res['err_code'] = $this->errCode;
        }
        if (null !== $this->errMsg) {
            $res['err_msg'] = $this->errMsg;
        }
        if (null !== $this->smsSize) {
            $res['sms_size'] = $this->smsSize;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->bizProperties) {
            $res['biz_properties'] = $this->bizProperties;
        }
        if (null !== $this->smsType) {
            $res['sms_type'] = $this->smsType;
        }
        if (null !== $this->serviceProvider) {
            $res['service_provider'] = $this->serviceProvider;
        }
        if (null !== $this->city) {
            $res['city'] = $this->city;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CallbackSmsStatusRequest
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
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['phone_number'])) {
            $model->phoneNumber = $map['phone_number'];
        }
        if (isset($map['send_time'])) {
            $model->sendTime = $map['send_time'];
        }
        if (isset($map['report_time'])) {
            $model->reportTime = $map['report_time'];
        }
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['err_code'])) {
            $model->errCode = $map['err_code'];
        }
        if (isset($map['err_msg'])) {
            $model->errMsg = $map['err_msg'];
        }
        if (isset($map['sms_size'])) {
            $model->smsSize = $map['sms_size'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['biz_properties'])) {
            $model->bizProperties = $map['biz_properties'];
        }
        if (isset($map['sms_type'])) {
            $model->smsType = $map['sms_type'];
        }
        if (isset($map['service_provider'])) {
            $model->serviceProvider = $map['service_provider'];
        }
        if (isset($map['city'])) {
            $model->city = $map['city'];
        }

        return $model;
    }
}
