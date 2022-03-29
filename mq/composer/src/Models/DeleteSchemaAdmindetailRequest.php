<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class DeleteSchemaAdmindetailRequest extends Model
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

    // uniq_id
    /**
     * @var int
     */
    public $uniqId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'uniqId'            => 'uniq_id',
    ];

    public function validate()
    {
        Model::validateRequired('uniqId', $this->uniqId, true);
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
        if (null !== $this->uniqId) {
            $res['uniq_id'] = $this->uniqId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteSchemaAdmindetailRequest
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
        if (isset($map['uniq_id'])) {
            $model->uniqId = $map['uniq_id'];
        }

        return $model;
    }
}
