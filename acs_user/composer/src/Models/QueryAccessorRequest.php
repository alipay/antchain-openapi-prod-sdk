<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACS_USER\Models;

use AlibabaCloud\Tea\Model;

class QueryAccessorRequest extends Model
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

    // 网关调用的服务access key
    /**
     * @var string
     */
    public $userAccessKey;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'userAccessKey'     => 'user_access_key',
    ];

    public function validate()
    {
        Model::validateRequired('userAccessKey', $this->userAccessKey, true);
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
        if (null !== $this->userAccessKey) {
            $res['user_access_key'] = $this->userAccessKey;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAccessorRequest
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
        if (isset($map['user_access_key'])) {
            $model->userAccessKey = $map['user_access_key'];
        }

        return $model;
    }
}
