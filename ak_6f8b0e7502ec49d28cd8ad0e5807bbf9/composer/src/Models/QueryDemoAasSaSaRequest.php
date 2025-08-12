<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_6f8b0e7502ec49d28cd8ad0e5807bbf9\Models;

use AlibabaCloud\Tea\Model;

class QueryDemoAasSaSaRequest extends Model
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

    // aa
    /**
     * @var string
     */
    public $notBlankVerify;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'notBlankVerify'    => 'not_blank_verify',
    ];

    public function validate()
    {
        Model::validateRequired('notBlankVerify', $this->notBlankVerify, true);
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
        if (null !== $this->notBlankVerify) {
            $res['not_blank_verify'] = $this->notBlankVerify;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDemoAasSaSaRequest
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
        if (isset($map['not_blank_verify'])) {
            $model->notBlankVerify = $map['not_blank_verify'];
        }

        return $model;
    }
}
