<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class CreateIpAccountRequest extends Model
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

    // 基础请求参数
    /**
     * @var BaseRequestInfo
     */
    public $baseRequest;

    // 该用户的在外部系统的用户Id
    /**
     * @var string
     */
    public $externalUserId;

    // 该用户的在外部系统的用户名称
    /**
     * @var string
     */
    public $externalUserName;

    // 角色:  1:版权方 2: 版权采购商
    /**
     * @var int
     */
    public $role;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseRequest'       => 'base_request',
        'externalUserId'    => 'external_user_id',
        'externalUserName'  => 'external_user_name',
        'role'              => 'role',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('externalUserId', $this->externalUserId, true);
        Model::validateRequired('externalUserName', $this->externalUserName, true);
        Model::validateRequired('role', $this->role, true);
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
        if (null !== $this->baseRequest) {
            $res['base_request'] = null !== $this->baseRequest ? $this->baseRequest->toMap() : null;
        }
        if (null !== $this->externalUserId) {
            $res['external_user_id'] = $this->externalUserId;
        }
        if (null !== $this->externalUserName) {
            $res['external_user_name'] = $this->externalUserName;
        }
        if (null !== $this->role) {
            $res['role'] = $this->role;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateIpAccountRequest
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
        if (isset($map['base_request'])) {
            $model->baseRequest = BaseRequestInfo::fromMap($map['base_request']);
        }
        if (isset($map['external_user_id'])) {
            $model->externalUserId = $map['external_user_id'];
        }
        if (isset($map['external_user_name'])) {
            $model->externalUserName = $map['external_user_name'];
        }
        if (isset($map['role'])) {
            $model->role = $map['role'];
        }

        return $model;
    }
}
