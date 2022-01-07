<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DONPA\Models;

use AlibabaCloud\Tea\Model;

class UnbindMyslxfRequest extends Model
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

    // 绑定ID
    /**
     * @var string
     */
    public $bindId;

    // 批次ID
    /**
     * @var string
     */
    public $batchId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bindId'            => 'bind_id',
        'batchId'           => 'batch_id',
    ];

    public function validate()
    {
        Model::validateRequired('bindId', $this->bindId, true);
        Model::validateRequired('batchId', $this->batchId, true);
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
        if (null !== $this->bindId) {
            $res['bind_id'] = $this->bindId;
        }
        if (null !== $this->batchId) {
            $res['batch_id'] = $this->batchId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UnbindMyslxfRequest
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
        if (isset($map['bind_id'])) {
            $model->bindId = $map['bind_id'];
        }
        if (isset($map['batch_id'])) {
            $model->batchId = $map['batch_id'];
        }

        return $model;
    }
}
