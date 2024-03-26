<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTC\Models;

use AlibabaCloud\Tea\Model;

class ApplyResourceFiletokenRequest extends Model
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

    // Token类型
    /**
     * @var string
     */
    public $tokenType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tokenType'         => 'token_type',
    ];

    public function validate()
    {
        Model::validateRequired('tokenType', $this->tokenType, true);
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
        if (null !== $this->tokenType) {
            $res['token_type'] = $this->tokenType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyResourceFiletokenRequest
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
        if (isset($map['token_type'])) {
            $model->tokenType = $map['token_type'];
        }

        return $model;
    }
}
