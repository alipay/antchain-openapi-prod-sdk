<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class OperateAiotnextbsOpenapiRequest extends Model
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

    // 操作类型
    /**
     * @var string
     */
    public $operateType;

    // 参数签名
    /**
     * @var string
     */
    public $paramSign;

    // 业务操作类型
    /**
     * @var string
     */
    public $bizType;

    // 操作人id
    /**
     * @var string
     */
    public $operatorId;

    // 类名（实现类），首字母小写
    /**
     * @var string
     */
    public $interfaceName;

    // 方法名
    /**
     * @var string
     */
    public $methodName;

    // 参数类路径
    /**
     * @var string
     */
    public $paramClass;

    // 参数数据
    /**
     * @var string
     */
    public $paramList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'operateType'       => 'operate_type',
        'paramSign'         => 'param_sign',
        'bizType'           => 'biz_type',
        'operatorId'        => 'operator_id',
        'interfaceName'     => 'interface_name',
        'methodName'        => 'method_name',
        'paramClass'        => 'param_class',
        'paramList'         => 'param_list',
    ];

    public function validate()
    {
        Model::validateRequired('operateType', $this->operateType, true);
        Model::validateRequired('paramSign', $this->paramSign, true);
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('operatorId', $this->operatorId, true);
        Model::validateRequired('interfaceName', $this->interfaceName, true);
        Model::validateRequired('methodName', $this->methodName, true);
        Model::validateRequired('paramClass', $this->paramClass, true);
        Model::validateRequired('paramList', $this->paramList, true);
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
        if (null !== $this->operateType) {
            $res['operate_type'] = $this->operateType;
        }
        if (null !== $this->paramSign) {
            $res['param_sign'] = $this->paramSign;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->operatorId) {
            $res['operator_id'] = $this->operatorId;
        }
        if (null !== $this->interfaceName) {
            $res['interface_name'] = $this->interfaceName;
        }
        if (null !== $this->methodName) {
            $res['method_name'] = $this->methodName;
        }
        if (null !== $this->paramClass) {
            $res['param_class'] = $this->paramClass;
        }
        if (null !== $this->paramList) {
            $res['param_list'] = $this->paramList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperateAiotnextbsOpenapiRequest
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
        if (isset($map['operate_type'])) {
            $model->operateType = $map['operate_type'];
        }
        if (isset($map['param_sign'])) {
            $model->paramSign = $map['param_sign'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['operator_id'])) {
            $model->operatorId = $map['operator_id'];
        }
        if (isset($map['interface_name'])) {
            $model->interfaceName = $map['interface_name'];
        }
        if (isset($map['method_name'])) {
            $model->methodName = $map['method_name'];
        }
        if (isset($map['param_class'])) {
            $model->paramClass = $map['param_class'];
        }
        if (isset($map['param_list'])) {
            $model->paramList = $map['param_list'];
        }

        return $model;
    }
}
