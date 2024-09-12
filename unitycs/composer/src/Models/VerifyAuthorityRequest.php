<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\UNITYCS\Models;

use AlibabaCloud\Tea\Model;

class VerifyAuthorityRequest extends Model
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

    // 元数据编码
    /**
     * @var string
     */
    public $metadataCode;

    // 用户id
    /**
     * @var string
     */
    public $userId;

    // 用户权限，默认值为USAGE_RIGHT
    /**
     * @var string
     */
    public $privilege;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'metadataCode'      => 'metadata_code',
        'userId'            => 'user_id',
        'privilege'         => 'privilege',
    ];

    public function validate()
    {
        Model::validateRequired('metadataCode', $this->metadataCode, true);
        Model::validateRequired('userId', $this->userId, true);
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
        if (null !== $this->metadataCode) {
            $res['metadata_code'] = $this->metadataCode;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->privilege) {
            $res['privilege'] = $this->privilege;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VerifyAuthorityRequest
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
        if (isset($map['metadata_code'])) {
            $model->metadataCode = $map['metadata_code'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['privilege'])) {
            $model->privilege = $map['privilege'];
        }

        return $model;
    }
}
