<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class OperateIotbasicPermissionRequest extends Model
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

    // 操作人
    //
    /**
     * @var string
     */
    public $operatorId;

    // 角色
    /**
     * @var string
     */
    public $iotRole;

    // 待添加的权限集合
    /**
     * @var IotBasicPermissionData[]
     */
    public $permissionList;

    // 操作类型
    /**
     * @var string
     */
    public $action;

    // 绑定权限集合
    /**
     * @var string[]
     */
    public $bindPermision;

    // 参数签名校验
    /**
     * @var string
     */
    public $paramSign;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'operatorId'        => 'operator_id',
        'iotRole'           => 'iot_role',
        'permissionList'    => 'permission_list',
        'action'            => 'action',
        'bindPermision'     => 'bind_permision',
        'paramSign'         => 'param_sign',
    ];

    public function validate()
    {
        Model::validateRequired('operatorId', $this->operatorId, true);
        Model::validateRequired('action', $this->action, true);
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
        if (null !== $this->operatorId) {
            $res['operator_id'] = $this->operatorId;
        }
        if (null !== $this->iotRole) {
            $res['iot_role'] = $this->iotRole;
        }
        if (null !== $this->permissionList) {
            $res['permission_list'] = [];
            if (null !== $this->permissionList && \is_array($this->permissionList)) {
                $n = 0;
                foreach ($this->permissionList as $item) {
                    $res['permission_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->action) {
            $res['action'] = $this->action;
        }
        if (null !== $this->bindPermision) {
            $res['bind_permision'] = $this->bindPermision;
        }
        if (null !== $this->paramSign) {
            $res['param_sign'] = $this->paramSign;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperateIotbasicPermissionRequest
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
        if (isset($map['operator_id'])) {
            $model->operatorId = $map['operator_id'];
        }
        if (isset($map['iot_role'])) {
            $model->iotRole = $map['iot_role'];
        }
        if (isset($map['permission_list'])) {
            if (!empty($map['permission_list'])) {
                $model->permissionList = [];
                $n                     = 0;
                foreach ($map['permission_list'] as $item) {
                    $model->permissionList[$n++] = null !== $item ? IotBasicPermissionData::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['action'])) {
            $model->action = $map['action'];
        }
        if (isset($map['bind_permision'])) {
            if (!empty($map['bind_permision'])) {
                $model->bindPermision = $map['bind_permision'];
            }
        }
        if (isset($map['param_sign'])) {
            $model->paramSign = $map['param_sign'];
        }

        return $model;
    }
}
