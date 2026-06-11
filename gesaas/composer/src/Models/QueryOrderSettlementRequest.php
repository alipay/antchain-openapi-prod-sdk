<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

class QueryOrderSettlementRequest extends Model
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

    // 分账请求单号
    /**
     * @var string
     */
    public $settleNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'settleNo'          => 'settle_no',
    ];

    public function validate()
    {
        Model::validateRequired('settleNo', $this->settleNo, true);
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
        if (null !== $this->settleNo) {
            $res['settle_no'] = $this->settleNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryOrderSettlementRequest
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
        if (isset($map['settle_no'])) {
            $model->settleNo = $map['settle_no'];
        }

        return $model;
    }
}
