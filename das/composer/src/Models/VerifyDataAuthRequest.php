<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class VerifyDataAuthRequest extends Model
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

    // 用户id
    /**
     * @var string
     */
    public $userId;

    // 用户表示类型
    /**
     * @var string
     */
    public $userType;

    // 场景码
    /**
     * @var string
     */
    public $sceneCode;

    // 数据源连接器空间id
    /**
     * @var string
     */
    public $sourceSpaceId;

    // 企业信用代码
    /**
     * @var string
     */
    public $enterpriseCode;

    // 授权token
    /**
     * @var string
     */
    public $authorizedToken;

    // 国标产品标识码
    /**
     * @var string
     */
    public $productIdentityId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'userId'            => 'user_id',
        'userType'          => 'user_type',
        'sceneCode'         => 'scene_code',
        'sourceSpaceId'     => 'source_space_id',
        'enterpriseCode'    => 'enterprise_code',
        'authorizedToken'   => 'authorized_token',
        'productIdentityId' => 'product_identity_id',
    ];

    public function validate()
    {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('sourceSpaceId', $this->sourceSpaceId, true);
        Model::validateRequired('enterpriseCode', $this->enterpriseCode, true);
        Model::validateRequired('authorizedToken', $this->authorizedToken, true);
        Model::validateRequired('productIdentityId', $this->productIdentityId, true);
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
        if (null !== $this->userType) {
            $res['user_type'] = $this->userType;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->sourceSpaceId) {
            $res['source_space_id'] = $this->sourceSpaceId;
        }
        if (null !== $this->enterpriseCode) {
            $res['enterprise_code'] = $this->enterpriseCode;
        }
        if (null !== $this->authorizedToken) {
            $res['authorized_token'] = $this->authorizedToken;
        }
        if (null !== $this->productIdentityId) {
            $res['product_identity_id'] = $this->productIdentityId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VerifyDataAuthRequest
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
        if (isset($map['user_type'])) {
            $model->userType = $map['user_type'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['source_space_id'])) {
            $model->sourceSpaceId = $map['source_space_id'];
        }
        if (isset($map['enterprise_code'])) {
            $model->enterpriseCode = $map['enterprise_code'];
        }
        if (isset($map['authorized_token'])) {
            $model->authorizedToken = $map['authorized_token'];
        }
        if (isset($map['product_identity_id'])) {
            $model->productIdentityId = $map['product_identity_id'];
        }

        return $model;
    }
}
