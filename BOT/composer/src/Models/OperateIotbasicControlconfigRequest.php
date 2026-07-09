<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class OperateIotbasicControlconfigRequest extends Model
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

    // 设备品类编码
    /**
     * @var string
     */
    public $categoryCode;

    // 厂商
    /**
     * @var string
     */
    public $corpName;

    // 设备型号
    /**
     * @var string
     */
    public $deviceModel;

    // 管控模式
    /**
     * @var string
     */
    public $controlModel;

    // 是否上链--注册设备后需上链存证，记录存证hash
    /**
     * @var string
     */
    public $isRegisterNotify;

    // 是否标准设备-- 设备注册时 判断扩展属性 或展示时 显示扩展属性
    /**
     * @var string
     */
    public $isStandard;

    // 是否生成密钥--注册设备时 生成密钥对， 存到 设备公钥(public_key)、deviceSecrect
    /**
     * @var string
     */
    public $isGenSecret;

    // 接口地址
    /**
     * @var string
     */
    public $serviceProvider;

    // 接口参数
    /**
     * @var string
     */
    public $controlParam;

    // 操作类型
    /**
     * @var string
     */
    public $action;

    // 操作人id
    /**
     * @var string
     */
    public $operatorId;

    // 参数签名校验
    /**
     * @var string
     */
    public $paramSign;

    // 是否接入安全认证
    /**
     * @var string
     */
    public $isSupportSec;

    // 设备规格ID
    /**
     * @var int
     */
    public $deviceSpecs;

    // 厂商ID
    /**
     * @var int
     */
    public $corpId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'categoryCode'      => 'category_code',
        'corpName'          => 'corp_name',
        'deviceModel'       => 'device_model',
        'controlModel'      => 'control_model',
        'isRegisterNotify'  => 'is_register_notify',
        'isStandard'        => 'is_standard',
        'isGenSecret'       => 'is_gen_secret',
        'serviceProvider'   => 'service_provider',
        'controlParam'      => 'control_param',
        'action'            => 'action',
        'operatorId'        => 'operator_id',
        'paramSign'         => 'param_sign',
        'isSupportSec'      => 'is_support_sec',
        'deviceSpecs'       => 'device_specs',
        'corpId'            => 'corp_id',
    ];

    public function validate()
    {
        Model::validateRequired('categoryCode', $this->categoryCode, true);
        Model::validateRequired('corpName', $this->corpName, true);
        Model::validateRequired('controlModel', $this->controlModel, true);
        Model::validateRequired('isRegisterNotify', $this->isRegisterNotify, true);
        Model::validateRequired('isStandard', $this->isStandard, true);
        Model::validateRequired('isGenSecret', $this->isGenSecret, true);
        Model::validateRequired('action', $this->action, true);
        Model::validateRequired('operatorId', $this->operatorId, true);
        Model::validateRequired('paramSign', $this->paramSign, true);
        Model::validateRequired('isSupportSec', $this->isSupportSec, true);
        Model::validateRequired('corpId', $this->corpId, true);
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
        if (null !== $this->categoryCode) {
            $res['category_code'] = $this->categoryCode;
        }
        if (null !== $this->corpName) {
            $res['corp_name'] = $this->corpName;
        }
        if (null !== $this->deviceModel) {
            $res['device_model'] = $this->deviceModel;
        }
        if (null !== $this->controlModel) {
            $res['control_model'] = $this->controlModel;
        }
        if (null !== $this->isRegisterNotify) {
            $res['is_register_notify'] = $this->isRegisterNotify;
        }
        if (null !== $this->isStandard) {
            $res['is_standard'] = $this->isStandard;
        }
        if (null !== $this->isGenSecret) {
            $res['is_gen_secret'] = $this->isGenSecret;
        }
        if (null !== $this->serviceProvider) {
            $res['service_provider'] = $this->serviceProvider;
        }
        if (null !== $this->controlParam) {
            $res['control_param'] = $this->controlParam;
        }
        if (null !== $this->action) {
            $res['action'] = $this->action;
        }
        if (null !== $this->operatorId) {
            $res['operator_id'] = $this->operatorId;
        }
        if (null !== $this->paramSign) {
            $res['param_sign'] = $this->paramSign;
        }
        if (null !== $this->isSupportSec) {
            $res['is_support_sec'] = $this->isSupportSec;
        }
        if (null !== $this->deviceSpecs) {
            $res['device_specs'] = $this->deviceSpecs;
        }
        if (null !== $this->corpId) {
            $res['corp_id'] = $this->corpId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperateIotbasicControlconfigRequest
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
        if (isset($map['category_code'])) {
            $model->categoryCode = $map['category_code'];
        }
        if (isset($map['corp_name'])) {
            $model->corpName = $map['corp_name'];
        }
        if (isset($map['device_model'])) {
            $model->deviceModel = $map['device_model'];
        }
        if (isset($map['control_model'])) {
            $model->controlModel = $map['control_model'];
        }
        if (isset($map['is_register_notify'])) {
            $model->isRegisterNotify = $map['is_register_notify'];
        }
        if (isset($map['is_standard'])) {
            $model->isStandard = $map['is_standard'];
        }
        if (isset($map['is_gen_secret'])) {
            $model->isGenSecret = $map['is_gen_secret'];
        }
        if (isset($map['service_provider'])) {
            $model->serviceProvider = $map['service_provider'];
        }
        if (isset($map['control_param'])) {
            $model->controlParam = $map['control_param'];
        }
        if (isset($map['action'])) {
            $model->action = $map['action'];
        }
        if (isset($map['operator_id'])) {
            $model->operatorId = $map['operator_id'];
        }
        if (isset($map['param_sign'])) {
            $model->paramSign = $map['param_sign'];
        }
        if (isset($map['is_support_sec'])) {
            $model->isSupportSec = $map['is_support_sec'];
        }
        if (isset($map['device_specs'])) {
            $model->deviceSpecs = $map['device_specs'];
        }
        if (isset($map['corp_id'])) {
            $model->corpId = $map['corp_id'];
        }

        return $model;
    }
}
