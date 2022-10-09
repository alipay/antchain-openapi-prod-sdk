<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class CreateIotbasicDeviceRequest extends Model
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

    // 设备厂商名称
    /**
     * @var string
     */
    public $corpName;

    // 设备品类编码
    /**
     * @var string
     */
    public $deviceCategoryCode;

    // A1
    /**
     * @var string
     */
    public $deviceModel;

    // xxx
    /**
     * @var string
     */
    public $deviceName;

    // xe21d
    /**
     * @var string
     */
    public $deviceSn;

    // standard
    /**
     * @var string
     */
    public $deviceSpecs;

    // 安装位置
    /**
     * @var string
     */
    public $location;

    // 设备标签
    /**
     * @var string
     */
    public $nickName;

    // secid
    /**
     * @var string
     */
    public $secId;

    // 设备扩展信息
    /**
     * @var string
     */
    public $deviceExt;

    // 业务场景编码
    /**
     * @var string
     */
    public $bizScene;

    // 所属租户ID
    /**
     * @var string
     */
    public $tenantId;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'corpName'           => 'corp_name',
        'deviceCategoryCode' => 'device_category_code',
        'deviceModel'        => 'device_model',
        'deviceName'         => 'device_name',
        'deviceSn'           => 'device_sn',
        'deviceSpecs'        => 'device_specs',
        'location'           => 'location',
        'nickName'           => 'nick_name',
        'secId'              => 'sec_id',
        'deviceExt'          => 'device_ext',
        'bizScene'           => 'biz_scene',
        'tenantId'           => 'tenant_id',
    ];

    public function validate()
    {
        Model::validateRequired('corpName', $this->corpName, true);
        Model::validateRequired('deviceCategoryCode', $this->deviceCategoryCode, true);
        Model::validateRequired('deviceModel', $this->deviceModel, true);
        Model::validateRequired('deviceName', $this->deviceName, true);
        Model::validateRequired('deviceSn', $this->deviceSn, true);
        Model::validateRequired('deviceSpecs', $this->deviceSpecs, true);
        Model::validateRequired('bizScene', $this->bizScene, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
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
        if (null !== $this->corpName) {
            $res['corp_name'] = $this->corpName;
        }
        if (null !== $this->deviceCategoryCode) {
            $res['device_category_code'] = $this->deviceCategoryCode;
        }
        if (null !== $this->deviceModel) {
            $res['device_model'] = $this->deviceModel;
        }
        if (null !== $this->deviceName) {
            $res['device_name'] = $this->deviceName;
        }
        if (null !== $this->deviceSn) {
            $res['device_sn'] = $this->deviceSn;
        }
        if (null !== $this->deviceSpecs) {
            $res['device_specs'] = $this->deviceSpecs;
        }
        if (null !== $this->location) {
            $res['location'] = $this->location;
        }
        if (null !== $this->nickName) {
            $res['nick_name'] = $this->nickName;
        }
        if (null !== $this->secId) {
            $res['sec_id'] = $this->secId;
        }
        if (null !== $this->deviceExt) {
            $res['device_ext'] = $this->deviceExt;
        }
        if (null !== $this->bizScene) {
            $res['biz_scene'] = $this->bizScene;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateIotbasicDeviceRequest
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
        if (isset($map['corp_name'])) {
            $model->corpName = $map['corp_name'];
        }
        if (isset($map['device_category_code'])) {
            $model->deviceCategoryCode = $map['device_category_code'];
        }
        if (isset($map['device_model'])) {
            $model->deviceModel = $map['device_model'];
        }
        if (isset($map['device_name'])) {
            $model->deviceName = $map['device_name'];
        }
        if (isset($map['device_sn'])) {
            $model->deviceSn = $map['device_sn'];
        }
        if (isset($map['device_specs'])) {
            $model->deviceSpecs = $map['device_specs'];
        }
        if (isset($map['location'])) {
            $model->location = $map['location'];
        }
        if (isset($map['nick_name'])) {
            $model->nickName = $map['nick_name'];
        }
        if (isset($map['sec_id'])) {
            $model->secId = $map['sec_id'];
        }
        if (isset($map['device_ext'])) {
            $model->deviceExt = $map['device_ext'];
        }
        if (isset($map['biz_scene'])) {
            $model->bizScene = $map['biz_scene'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }

        return $model;
    }
}
