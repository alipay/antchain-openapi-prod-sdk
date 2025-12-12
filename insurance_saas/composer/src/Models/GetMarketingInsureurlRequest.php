<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class GetMarketingInsureurlRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 调用方生成的唯一编码，参考格式： yyyyMMdd_xxxxx，已接口请求的当前日期开头；
    /**
     * @var string
     */
    public $requestId;

    // 产品编码
    /**
     * @var string
     */
    public $productCode;

    // 保司编码
    /**
     * @var string
     */
    public $channelCode;

    // 保司出单机构编码
    /**
     * @var string
     */
    public $issueOrg;

    // 保司产品编码（保司提供）
    /**
     * @var string
     */
    public $channelProductCode;

    // 保险产品类型，枚举：
    // STANDARD（均分）
    // PREMIUM（大小均分）
    // GIFT_TRANSFER（赠转商）
    /**
     * @var string
     */
    public $channelProductType;

    // 保险方案
    /**
     * @var string
     */
    public $insurancePlan;

    // 一级渠道，固定值"antdigital"
    /**
     * @var string
     */
    public $firstChannel;

    // 二级渠道
    /**
     * @var string
     */
    public $secondChannel;

    // 三级渠道/广告版位
    /**
     * @var string
     */
    public $advertisingPosition;

    // 设备类型/用户类型，枚举：
    // muid
    // oaid
    // caid
    // imei
    // idfa
    // userid
    /**
     * @var string
     */
    public $deviceType;

    // 设备编号/用户编号
    /**
     * @var string
     */
    public $deviceId;

    // 点击时间 yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $clickTime;

    // 订单编号
    /**
     * @var string
     */
    public $sceneOrderNo;

    // 投保人姓名
    /**
     * @var string
     */
    public $applicantName;

    // 投保人证件号
    /**
     * @var string
     */
    public $applicantCertNo;

    // 投保人联系方式
    /**
     * @var string
     */
    public $applicantPhone;
    protected $_name = [
        'authToken'           => 'auth_token',
        'requestId'           => 'request_id',
        'productCode'         => 'product_code',
        'channelCode'         => 'channel_code',
        'issueOrg'            => 'issue_org',
        'channelProductCode'  => 'channel_product_code',
        'channelProductType'  => 'channel_product_type',
        'insurancePlan'       => 'insurance_plan',
        'firstChannel'        => 'first_channel',
        'secondChannel'       => 'second_channel',
        'advertisingPosition' => 'advertising_position',
        'deviceType'          => 'device_type',
        'deviceId'            => 'device_id',
        'clickTime'           => 'click_time',
        'sceneOrderNo'        => 'scene_order_no',
        'applicantName'       => 'applicant_name',
        'applicantCertNo'     => 'applicant_cert_no',
        'applicantPhone'      => 'applicant_phone',
    ];

    public function validate()
    {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('channelCode', $this->channelCode, true);
        Model::validateRequired('issueOrg', $this->issueOrg, true);
        Model::validateRequired('channelProductCode', $this->channelProductCode, true);
        Model::validateRequired('channelProductType', $this->channelProductType, true);
        Model::validateRequired('insurancePlan', $this->insurancePlan, true);
        Model::validateRequired('firstChannel', $this->firstChannel, true);
        Model::validateRequired('deviceType', $this->deviceType, true);
        Model::validateRequired('deviceId', $this->deviceId, true);
        Model::validateRequired('clickTime', $this->clickTime, true);
        Model::validateRequired('sceneOrderNo', $this->sceneOrderNo, true);
        Model::validateMaxLength('requestId', $this->requestId, 128);
        Model::validateMaxLength('productCode', $this->productCode, 128);
        Model::validateMaxLength('channelCode', $this->channelCode, 64);
        Model::validateMaxLength('issueOrg', $this->issueOrg, 64);
        Model::validateMaxLength('channelProductCode', $this->channelProductCode, 64);
        Model::validateMaxLength('channelProductType', $this->channelProductType, 64);
        Model::validateMaxLength('insurancePlan', $this->insurancePlan, 20);
        Model::validateMaxLength('firstChannel', $this->firstChannel, 64);
        Model::validateMaxLength('secondChannel', $this->secondChannel, 64);
        Model::validateMaxLength('advertisingPosition', $this->advertisingPosition, 64);
        Model::validateMaxLength('deviceType', $this->deviceType, 64);
        Model::validateMaxLength('deviceId', $this->deviceId, 64);
        Model::validateMaxLength('clickTime', $this->clickTime, 20);
        Model::validateMaxLength('sceneOrderNo', $this->sceneOrderNo, 64);
        Model::validateMaxLength('applicantName', $this->applicantName, 64);
        Model::validateMaxLength('applicantCertNo', $this->applicantCertNo, 64);
        Model::validateMaxLength('applicantPhone', $this->applicantPhone, 64);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->channelCode) {
            $res['channel_code'] = $this->channelCode;
        }
        if (null !== $this->issueOrg) {
            $res['issue_org'] = $this->issueOrg;
        }
        if (null !== $this->channelProductCode) {
            $res['channel_product_code'] = $this->channelProductCode;
        }
        if (null !== $this->channelProductType) {
            $res['channel_product_type'] = $this->channelProductType;
        }
        if (null !== $this->insurancePlan) {
            $res['insurance_plan'] = $this->insurancePlan;
        }
        if (null !== $this->firstChannel) {
            $res['first_channel'] = $this->firstChannel;
        }
        if (null !== $this->secondChannel) {
            $res['second_channel'] = $this->secondChannel;
        }
        if (null !== $this->advertisingPosition) {
            $res['advertising_position'] = $this->advertisingPosition;
        }
        if (null !== $this->deviceType) {
            $res['device_type'] = $this->deviceType;
        }
        if (null !== $this->deviceId) {
            $res['device_id'] = $this->deviceId;
        }
        if (null !== $this->clickTime) {
            $res['click_time'] = $this->clickTime;
        }
        if (null !== $this->sceneOrderNo) {
            $res['scene_order_no'] = $this->sceneOrderNo;
        }
        if (null !== $this->applicantName) {
            $res['applicant_name'] = $this->applicantName;
        }
        if (null !== $this->applicantCertNo) {
            $res['applicant_cert_no'] = $this->applicantCertNo;
        }
        if (null !== $this->applicantPhone) {
            $res['applicant_phone'] = $this->applicantPhone;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetMarketingInsureurlRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['channel_code'])) {
            $model->channelCode = $map['channel_code'];
        }
        if (isset($map['issue_org'])) {
            $model->issueOrg = $map['issue_org'];
        }
        if (isset($map['channel_product_code'])) {
            $model->channelProductCode = $map['channel_product_code'];
        }
        if (isset($map['channel_product_type'])) {
            $model->channelProductType = $map['channel_product_type'];
        }
        if (isset($map['insurance_plan'])) {
            $model->insurancePlan = $map['insurance_plan'];
        }
        if (isset($map['first_channel'])) {
            $model->firstChannel = $map['first_channel'];
        }
        if (isset($map['second_channel'])) {
            $model->secondChannel = $map['second_channel'];
        }
        if (isset($map['advertising_position'])) {
            $model->advertisingPosition = $map['advertising_position'];
        }
        if (isset($map['device_type'])) {
            $model->deviceType = $map['device_type'];
        }
        if (isset($map['device_id'])) {
            $model->deviceId = $map['device_id'];
        }
        if (isset($map['click_time'])) {
            $model->clickTime = $map['click_time'];
        }
        if (isset($map['scene_order_no'])) {
            $model->sceneOrderNo = $map['scene_order_no'];
        }
        if (isset($map['applicant_name'])) {
            $model->applicantName = $map['applicant_name'];
        }
        if (isset($map['applicant_cert_no'])) {
            $model->applicantCertNo = $map['applicant_cert_no'];
        }
        if (isset($map['applicant_phone'])) {
            $model->applicantPhone = $map['applicant_phone'];
        }

        return $model;
    }
}
