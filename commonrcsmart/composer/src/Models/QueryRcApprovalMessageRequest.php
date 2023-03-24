<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMONRCSMART\Models;

use AlibabaCloud\Tea\Model;

class QueryRcApprovalMessageRequest extends Model
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

    // 原审核请求ID
    /**
     * @var string
     */
    public $origRequestId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'origRequestId'     => 'orig_request_id',
    ];

    public function validate()
    {
        Model::validateRequired('origRequestId', $this->origRequestId, true);
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
        if (null !== $this->origRequestId) {
            $res['orig_request_id'] = $this->origRequestId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRcApprovalMessageRequest
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
        if (isset($map['orig_request_id'])) {
            $model->origRequestId = $map['orig_request_id'];
        }

        return $model;
    }
}
