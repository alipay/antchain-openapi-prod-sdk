<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryBclMerchantRequest extends Model
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

    // 入驻编号
    /**
     * @var string
     */
    public $enrollmentNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'enrollmentNo'      => 'enrollment_no',
    ];

    public function validate()
    {
        Model::validateRequired('enrollmentNo', $this->enrollmentNo, true);
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
        if (null !== $this->enrollmentNo) {
            $res['enrollment_no'] = $this->enrollmentNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBclMerchantRequest
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
        if (isset($map['enrollment_no'])) {
            $model->enrollmentNo = $map['enrollment_no'];
        }

        return $model;
    }
}
