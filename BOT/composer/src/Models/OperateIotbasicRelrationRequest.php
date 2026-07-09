<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class OperateIotbasicRelrationRequest extends Model
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

    // 设备属性关系id
    /**
     * @var int
     */
    public $id;

    // 设备品类名称
    /**
     * @var string
     */
    public $deviceCategory;

    // 数据关系类型
    /**
     * @var string
     */
    public $relationType;

    // 厂商名称
    /**
     * @var string
     */
    public $corpName;

    // TPS980	设备型号
    /**
     * @var string
     */
    public $deviceModel;

    // 设备规格
    /**
     * @var string
     */
    public $deviceSpecs;

    // 硬件模块
    /**
     * @var string
     */
    public $hardwareModule;

    // ADD,EDIT,DELETE，QUERY；选择操作
    /**
     * @var string
     */
    public $operate;

    // 参数签名校验
    /**
     * @var string
     */
    public $paramSign;

    // 项目空间
    /**
     * @var string
     */
    public $projectSpace;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'id'                => 'id',
        'deviceCategory'    => 'device_category',
        'relationType'      => 'relation_type',
        'corpName'          => 'corp_name',
        'deviceModel'       => 'device_model',
        'deviceSpecs'       => 'device_specs',
        'hardwareModule'    => 'hardware_module',
        'operate'           => 'operate',
        'paramSign'         => 'param_sign',
        'projectSpace'      => 'project_space',
    ];

    public function validate()
    {
        Model::validateRequired('deviceCategory', $this->deviceCategory, true);
        Model::validateRequired('relationType', $this->relationType, true);
        Model::validateRequired('operate', $this->operate, true);
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
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->deviceCategory) {
            $res['device_category'] = $this->deviceCategory;
        }
        if (null !== $this->relationType) {
            $res['relation_type'] = $this->relationType;
        }
        if (null !== $this->corpName) {
            $res['corp_name'] = $this->corpName;
        }
        if (null !== $this->deviceModel) {
            $res['device_model'] = $this->deviceModel;
        }
        if (null !== $this->deviceSpecs) {
            $res['device_specs'] = $this->deviceSpecs;
        }
        if (null !== $this->hardwareModule) {
            $res['hardware_module'] = $this->hardwareModule;
        }
        if (null !== $this->operate) {
            $res['operate'] = $this->operate;
        }
        if (null !== $this->paramSign) {
            $res['param_sign'] = $this->paramSign;
        }
        if (null !== $this->projectSpace) {
            $res['project_space'] = $this->projectSpace;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperateIotbasicRelrationRequest
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
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['device_category'])) {
            $model->deviceCategory = $map['device_category'];
        }
        if (isset($map['relation_type'])) {
            $model->relationType = $map['relation_type'];
        }
        if (isset($map['corp_name'])) {
            $model->corpName = $map['corp_name'];
        }
        if (isset($map['device_model'])) {
            $model->deviceModel = $map['device_model'];
        }
        if (isset($map['device_specs'])) {
            $model->deviceSpecs = $map['device_specs'];
        }
        if (isset($map['hardware_module'])) {
            $model->hardwareModule = $map['hardware_module'];
        }
        if (isset($map['operate'])) {
            $model->operate = $map['operate'];
        }
        if (isset($map['param_sign'])) {
            $model->paramSign = $map['param_sign'];
        }
        if (isset($map['project_space'])) {
            $model->projectSpace = $map['project_space'];
        }

        return $model;
    }
}
