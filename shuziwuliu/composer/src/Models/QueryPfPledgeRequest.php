<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class QueryPfPledgeRequest extends Model
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

    // 质押id
    /**
     * @var string
     */
    public $pledgeId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'pledgeId'          => 'pledge_id',
    ];

    public function validate()
    {
        Model::validateRequired('pledgeId', $this->pledgeId, true);
        Model::validateMaxLength('pledgeId', $this->pledgeId, 32);
        Model::validateMinLength('pledgeId', $this->pledgeId, 16);
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
        if (null !== $this->pledgeId) {
            $res['pledge_id'] = $this->pledgeId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryPfPledgeRequest
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
        if (isset($map['pledge_id'])) {
            $model->pledgeId = $map['pledge_id'];
        }

        return $model;
    }
}
