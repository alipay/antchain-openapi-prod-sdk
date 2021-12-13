<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\LOADTESTMOCK\Models;

use AlibabaCloud\Tea\Model;

class QueryGatewayRequest extends Model
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

    // 接口返回耗时，单位是ms
    /**
     * @var int
     */
    public $timeLimit;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'timeLimit'         => 'time_limit',
    ];

    public function validate()
    {
        Model::validateRequired('timeLimit', $this->timeLimit, true);
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
        if (null !== $this->timeLimit) {
            $res['time_limit'] = $this->timeLimit;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryGatewayRequest
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
        if (isset($map['time_limit'])) {
            $model->timeLimit = $map['time_limit'];
        }

        return $model;
    }
}
