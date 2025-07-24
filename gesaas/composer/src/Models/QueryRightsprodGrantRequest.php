<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

class QueryRightsprodGrantRequest extends Model
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

    // 外部发放订单号
    /**
     * @var string
     */
    public $outGrantOrderNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'outGrantOrderNo'   => 'out_grant_order_no',
    ];

    public function validate()
    {
        Model::validateRequired('outGrantOrderNo', $this->outGrantOrderNo, true);
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
        if (null !== $this->outGrantOrderNo) {
            $res['out_grant_order_no'] = $this->outGrantOrderNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRightsprodGrantRequest
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
        if (isset($map['out_grant_order_no'])) {
            $model->outGrantOrderNo = $map['out_grant_order_no'];
        }

        return $model;
    }
}
