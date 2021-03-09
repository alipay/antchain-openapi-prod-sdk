<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Acm\Models;

use AlibabaCloud\Tea\Model;

class GetAccessorRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // Accessor关联的accessKey
    /**
     * @var string
     */
    public $accessKeyId;

    // 租户唯一标识
    /**
     * @var string
     */
    public $tenant;

    // 操作员或服务账号唯一ID
    /**
     * @var string
     */
    public $userId;
    protected $_name = [
        'authToken'   => 'auth_token',
        'accessKeyId' => 'access_key_id',
        'tenant'      => 'tenant',
        'userId'      => 'user_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->accessKeyId) {
            $res['access_key_id'] = $this->accessKeyId;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetAccessorRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['access_key_id'])) {
            $model->accessKeyId = $map['access_key_id'];
        }
        if (isset($map['tenant'])) {
            $model->tenant = $map['tenant'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }

        return $model;
    }
}
