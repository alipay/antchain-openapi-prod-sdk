<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAFECMDB\Models;

use AlibabaCloud\Tea\Model;

class QueryModelrelationshipRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 目标模型的唯一标识
    /**
     * @var string
     */
    public $destinationModelId;
    protected $_name = [
        'authToken'          => 'auth_token',
        'destinationModelId' => 'destination_model_id',
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
        if (null !== $this->destinationModelId) {
            $res['destination_model_id'] = $this->destinationModelId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryModelrelationshipRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['destination_model_id'])) {
            $model->destinationModelId = $map['destination_model_id'];
        }

        return $model;
    }
}
