<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class QueryRealtytradeSigningRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 签署流程 ID
    //
    /**
     * @var string
     */
    public $processId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'processId'         => 'process_id',
    ];

    public function validate()
    {
        Model::validateRequired('processId', $this->processId, true);
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
        if (null !== $this->processId) {
            $res['process_id'] = $this->processId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRealtytradeSigningRequest
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
        if (isset($map['process_id'])) {
            $model->processId = $map['process_id'];
        }

        return $model;
    }
}
