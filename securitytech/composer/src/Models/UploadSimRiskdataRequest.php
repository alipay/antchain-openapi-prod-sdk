<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class UploadSimRiskdataRequest extends Model
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

    // 设备ID
    /**
     * @var string
     */
    public $deviceId;

    // 登录态token
    /**
     * @var string
     */
    public $token;

    // 上报类型
    /**
     * @var string
     */
    public $uploadType;

    // 智能中控id
    /**
     * @var string
     */
    public $tuid;

    // 中控照片，base64后的图象数据
    /**
     * @var string
     */
    public $tuidPhoto;

    // 车架号
    /**
     * @var string
     */
    public $frameNo;

    // 车架号照片，base64后的图象数据
    /**
     * @var string
     */
    public $frameNoPhoto;

    // 人车合影（销售+用户），base64后的图象数据
    /**
     * @var string
     */
    public $groupPhoto;

    // 单据照片（发票/收据），base64后的图象数据
    /**
     * @var string
     */
    public $billPhoto;

    // 上牌照片，base64后的图象数据
    /**
     * @var string
     */
    public $licensePlatePhoto;

    // 订单ID
    /**
     * @var string
     */
    public $orderId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'deviceId'          => 'device_id',
        'token'             => 'token',
        'uploadType'        => 'upload_type',
        'tuid'              => 'tuid',
        'tuidPhoto'         => 'tuid_photo',
        'frameNo'           => 'frame_no',
        'frameNoPhoto'      => 'frame_no_photo',
        'groupPhoto'        => 'group_photo',
        'billPhoto'         => 'bill_photo',
        'licensePlatePhoto' => 'license_plate_photo',
        'orderId'           => 'order_id',
    ];

    public function validate()
    {
        Model::validateRequired('deviceId', $this->deviceId, true);
        Model::validateRequired('token', $this->token, true);
        Model::validateRequired('uploadType', $this->uploadType, true);
        Model::validateRequired('orderId', $this->orderId, true);
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
        if (null !== $this->deviceId) {
            $res['device_id'] = $this->deviceId;
        }
        if (null !== $this->token) {
            $res['token'] = $this->token;
        }
        if (null !== $this->uploadType) {
            $res['upload_type'] = $this->uploadType;
        }
        if (null !== $this->tuid) {
            $res['tuid'] = $this->tuid;
        }
        if (null !== $this->tuidPhoto) {
            $res['tuid_photo'] = $this->tuidPhoto;
        }
        if (null !== $this->frameNo) {
            $res['frame_no'] = $this->frameNo;
        }
        if (null !== $this->frameNoPhoto) {
            $res['frame_no_photo'] = $this->frameNoPhoto;
        }
        if (null !== $this->groupPhoto) {
            $res['group_photo'] = $this->groupPhoto;
        }
        if (null !== $this->billPhoto) {
            $res['bill_photo'] = $this->billPhoto;
        }
        if (null !== $this->licensePlatePhoto) {
            $res['license_plate_photo'] = $this->licensePlatePhoto;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadSimRiskdataRequest
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
        if (isset($map['device_id'])) {
            $model->deviceId = $map['device_id'];
        }
        if (isset($map['token'])) {
            $model->token = $map['token'];
        }
        if (isset($map['upload_type'])) {
            $model->uploadType = $map['upload_type'];
        }
        if (isset($map['tuid'])) {
            $model->tuid = $map['tuid'];
        }
        if (isset($map['tuid_photo'])) {
            $model->tuidPhoto = $map['tuid_photo'];
        }
        if (isset($map['frame_no'])) {
            $model->frameNo = $map['frame_no'];
        }
        if (isset($map['frame_no_photo'])) {
            $model->frameNoPhoto = $map['frame_no_photo'];
        }
        if (isset($map['group_photo'])) {
            $model->groupPhoto = $map['group_photo'];
        }
        if (isset($map['bill_photo'])) {
            $model->billPhoto = $map['bill_photo'];
        }
        if (isset($map['license_plate_photo'])) {
            $model->licensePlatePhoto = $map['license_plate_photo'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }

        return $model;
    }
}
