<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\QQQ\Models;

use AlibabaCloud\Tea\Model;

class QueryAntchainAbcApprovalTestRequest extends Model
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

    // 入参
    /**
     * @var string
     */
    public $input;

    // 新增字段
    /**
     * @var string
     */
    public $delete;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'input'             => 'input',
        'delete'            => 'delete',
    ];

    public function validate()
    {
        Model::validateRequired('input', $this->input, true);
        Model::validateRequired('delete', $this->delete, true);
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
        if (null !== $this->delete) {
            $res['delete'] = $this->delete;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAntchainAbcApprovalTestRequest
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
        if (isset($map['delete'])) {
            $model->delete = $map['delete'];
        }

        return $model;
    }
}
