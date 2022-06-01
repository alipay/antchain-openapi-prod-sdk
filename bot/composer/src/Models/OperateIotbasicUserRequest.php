<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class OperateIotbasicUserRequest extends Model
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

    // 操作用户集合
    /**
     * @var IotBasicUserRequest[]
     */
    public $userList;

    // 要开通的角色
    /**
     * @var string
     */
    public $iotRole;

    // 操作类型
    /**
     * @var string
     */
    public $action;

    // 操作人
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
        'userList'          => 'user_list',
        'iotRole'           => 'iot_role',
        'action'            => 'action',
        'operatorId'        => 'operator_id',
        'paramSign'         => 'param_sign',
    ];

    public function validate()
    {
        Model::validateRequired('userList', $this->userList, true);
        Model::validateRequired('action', $this->action, true);
        Model::validateRequired('operatorId', $this->operatorId, true);
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
        if (null !== $this->userList) {
            $res['user_list'] = [];
            if (null !== $this->userList && \is_array($this->userList)) {
                $n = 0;
                foreach ($this->userList as $item) {
                    $res['user_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->iotRole) {
            $res['iot_role'] = $this->iotRole;
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
     * @return OperateIotbasicUserRequest
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
        if (isset($map['user_list'])) {
            if (!empty($map['user_list'])) {
                $model->userList = [];
                $n               = 0;
                foreach ($map['user_list'] as $item) {
                    $model->userList[$n++] = null !== $item ? IotBasicUserRequest::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['iot_role'])) {
            $model->iotRole = $map['iot_role'];
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
