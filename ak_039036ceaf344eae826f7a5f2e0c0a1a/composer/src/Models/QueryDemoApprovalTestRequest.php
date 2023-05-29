<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_039036ceaf344eae826f7a5f2e0c0a1a\Models;

use AlibabaCloud\Tea\Model;

class QueryDemoApprovalTestRequest extends Model
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

    // 字符串
    /**
     * @var string
     */
    public $input;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'input'             => 'input',
    ];

    public function validate()
    {
        Model::validateRequired('input', $this->input, true);
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
        if (null !== $this->input) {
            $res['input'] = $this->input;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDemoApprovalTestRequest
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
        if (isset($map['input'])) {
            $model->input = $map['input'];
        }

        return $model;
    }
}
