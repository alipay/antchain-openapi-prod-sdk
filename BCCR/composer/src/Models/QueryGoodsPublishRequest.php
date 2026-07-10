<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class QueryGoodsPublishRequest extends Model
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

    // 发布id
    /**
     * @var string
     */
    public $pubilshId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'pubilshId'         => 'pubilsh_id',
    ];

    public function validate()
    {
        Model::validateRequired('pubilshId', $this->pubilshId, true);
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
        if (null !== $this->pubilshId) {
            $res['pubilsh_id'] = $this->pubilshId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryGoodsPublishRequest
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
        if (isset($map['pubilsh_id'])) {
            $model->pubilshId = $map['pubilsh_id'];
        }

        return $model;
    }
}
