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
    public $ifPutChain;

    // 是否标准设备-- 设备注册时 判断扩展属性 或展示时 显示扩展属性
    /**
     * @var string
     */
    public $ifStandardDevice;

    // 是否生成密钥--注册设备时 生成密钥对， 存到 设备公钥(public_key)、deviceSecrect
    /**
     * @var string
     */
    public $ifGenerateScrect;

    // 接口地址
    /**
     * @var string
     */
    public $interfaceAddress;

    // 接口参数
    /**
     * @var string
     */
    public $interfaceParams;

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
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'categoryCode'      => 'category_code',
        'corpName'          => 'corp_name',
        'deviceModel'       => 'device_model',
        'controlModel'      => 'control_model',
        'ifPutChain'        => 'if_put_chain',
        'ifStandardDevice'  => 'if_standard_device',
        'ifGenerateScrect'  => 'if_generate_screct',
        'interfaceAddress'  => 'interface_address',
        'interfaceParams'   => 'interface_params',
        'action'            => 'action',
        'operatorId'        => 'operator_id',
        'paramSign'         => 'param_sign',
    ];

    public function validate()
    {
        Model::validateRequired('categoryCode', $this->categoryCode, true);
        Model::validateRequired('corpName', $this->corpName, true);
        Model::validateRequired('controlModel', $this->controlModel, true);
        Model::validateRequired('ifPutChain', $this->ifPutChain, true);
        Model::validateRequired('ifStandardDevice', $this->ifStandardDevice, true);
        Model::validateRequired('ifGenerateScrect', $this->ifGenerateScrect, true);
        Model::validateRequired('action', $this->action, true);
        Model::validateRequired('operatorId', $this->operatorId, true);
        Model::validateRequired('paramSign', $this->paramSign, true);
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
        if (null !== $this->ifPutChain) {
            $res['if_put_chain'] = $this->ifPutChain;
        }
        if (null !== $this->ifStandardDevice) {
            $res['if_standard_device'] = $this->ifStandardDevice;
        }
        if (null !== $this->ifGenerateScrect) {
            $res['if_generate_screct'] = $this->ifGenerateScrect;
        }
        if (null !== $this->interfaceAddress) {
            $res['interface_address'] = $this->interfaceAddress;
        }
        if (null !== $this->interfaceParams) {
            $res['interface_params'] = $this->interfaceParams;
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
        if (isset($map['if_put_chain'])) {
            $model->ifPutChain = $map['if_put_chain'];
        }
        if (isset($map['if_standard_device'])) {
            $model->ifStandardDevice = $map['if_standard_device'];
        }
        if (isset($map['if_generate_screct'])) {
            $model->ifGenerateScrect = $map['if_generate_screct'];
        }
        if (isset($map['interface_address'])) {
            $model->interfaceAddress = $map['interface_address'];
        }
        if (isset($map['interface_params'])) {
            $model->interfaceParams = $map['interface_params'];
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

        return $model;
    }
}
