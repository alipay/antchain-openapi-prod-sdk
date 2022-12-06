<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateContractEncrypteduserRequest extends Model
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

    // 注册机构用户。类型为机构时(userType = "ORGANIZATION")，该字段必填。
    /**
     * @var ContractOrganizationApplication
     */
    public $organization;

    // 注册为个人用户时，该字段表示个人用户的相关信息；
    // 注册为机构用户时，该字段表示对应机构经办人的个人信息。
    /**
     * @var ContractAccountApplication
     */
    public $user;

    // 用户类型
    // 个人：PERSON；
    // 机构：ORGANIZATION
    /**
     * @var string
     */
    public $userType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'organization'      => 'organization',
        'user'              => 'user',
        'userType'          => 'user_type',
    ];

    public function validate()
    {
        Model::validateRequired('user', $this->user, true);
        Model::validateRequired('userType', $this->userType, true);
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
        if (null !== $this->organization) {
            $res['organization'] = null !== $this->organization ? $this->organization->toMap() : null;
        }
        if (null !== $this->user) {
            $res['user'] = null !== $this->user ? $this->user->toMap() : null;
        }
        if (null !== $this->userType) {
            $res['user_type'] = $this->userType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateContractEncrypteduserRequest
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
        if (isset($map['organization'])) {
            $model->organization = ContractOrganizationApplication::fromMap($map['organization']);
        }
        if (isset($map['user'])) {
            $model->user = ContractAccountApplication::fromMap($map['user']);
        }
        if (isset($map['user_type'])) {
            $model->userType = $map['user_type'];
        }

        return $model;
    }
}
