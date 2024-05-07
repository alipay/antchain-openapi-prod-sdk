<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class CreateDevicecorpDeviceRequest extends Model
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

    // 项目编码
    /**
     * @var string
     */
    public $projectCode;

    // 品类code
    /**
     * @var string
     */
    public $categoryCode;

    // 设备型号值
    /**
     * @var string
     */
    public $deviceModel;

    // 设备规格值
    /**
     * @var string
     */
    public $deviceSpecs;

    // 设备名称
    /**
     * @var string
     */
    public $deviceName;

    // 设备sn
    /**
     * @var string
     */
    public $deviceSn;

    // 设备标签
    /**
     * @var string
     */
    public $nickName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'projectCode'       => 'project_code',
        'categoryCode'      => 'category_code',
        'deviceModel'       => 'device_model',
        'deviceSpecs'       => 'device_specs',
        'deviceName'        => 'device_name',
        'deviceSn'          => 'device_sn',
        'nickName'          => 'nick_name',
    ];

    public function validate()
    {
        Model::validateRequired('projectCode', $this->projectCode, true);
        Model::validateRequired('categoryCode', $this->categoryCode, true);
        Model::validateRequired('deviceModel', $this->deviceModel, true);
        Model::validateRequired('deviceSpecs', $this->deviceSpecs, true);
        Model::validateRequired('deviceName', $this->deviceName, true);
        Model::validateRequired('deviceSn', $this->deviceSn, true);
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
        if (null !== $this->projectCode) {
            $res['project_code'] = $this->projectCode;
        }
        if (null !== $this->categoryCode) {
            $res['category_code'] = $this->categoryCode;
        }
        if (null !== $this->deviceModel) {
            $res['device_model'] = $this->deviceModel;
        }
        if (null !== $this->deviceSpecs) {
            $res['device_specs'] = $this->deviceSpecs;
        }
        if (null !== $this->deviceName) {
            $res['device_name'] = $this->deviceName;
        }
        if (null !== $this->deviceSn) {
            $res['device_sn'] = $this->deviceSn;
        }
        if (null !== $this->nickName) {
            $res['nick_name'] = $this->nickName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDevicecorpDeviceRequest
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
        if (isset($map['project_code'])) {
            $model->projectCode = $map['project_code'];
        }
        if (isset($map['category_code'])) {
            $model->categoryCode = $map['category_code'];
        }
        if (isset($map['device_model'])) {
            $model->deviceModel = $map['device_model'];
        }
        if (isset($map['device_specs'])) {
            $model->deviceSpecs = $map['device_specs'];
        }
        if (isset($map['device_name'])) {
            $model->deviceName = $map['device_name'];
        }
        if (isset($map['device_sn'])) {
            $model->deviceSn = $map['device_sn'];
        }
        if (isset($map['nick_name'])) {
            $model->nickName = $map['nick_name'];
        }

        return $model;
    }
}
