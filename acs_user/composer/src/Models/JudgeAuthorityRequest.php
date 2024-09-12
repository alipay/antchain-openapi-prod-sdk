<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACS_USER\Models;

use AlibabaCloud\Tea\Model;

class JudgeAuthorityRequest extends Model
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

    // 用户id，和参数token二者必须有一个不能为空
    /**
     * @var string
     */
    public $userId;

    // 用户登录token，和user_id二者必须有一个不能为空，当token不为空时，会先判断token 是否有效，然后进行权限判断
    /**
     * @var string
     */
    public $token;

    // 产品编码
    /**
     * @var string
     */
    public $productCode;

    // 对应的权限码或者是角色编码
    /**
     * @var string
     */
    public $actionCode;

    // 鉴权类型，ROLE：角色鉴权；ACTION：权限点鉴权
    /**
     * @var string
     */
    public $actionType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'userId'            => 'user_id',
        'token'             => 'token',
        'productCode'       => 'product_code',
        'actionCode'        => 'action_code',
        'actionType'        => 'action_type',
    ];

    public function validate()
    {
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('actionCode', $this->actionCode, true);
        Model::validateRequired('actionType', $this->actionType, true);
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
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->token) {
            $res['token'] = $this->token;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->actionCode) {
            $res['action_code'] = $this->actionCode;
        }
        if (null !== $this->actionType) {
            $res['action_type'] = $this->actionType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return JudgeAuthorityRequest
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
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['token'])) {
            $model->token = $map['token'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['action_code'])) {
            $model->actionCode = $map['action_code'];
        }
        if (isset($map['action_type'])) {
            $model->actionType = $map['action_type'];
        }

        return $model;
    }
}
