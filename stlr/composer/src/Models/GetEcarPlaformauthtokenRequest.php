<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class GetEcarPlaformauthtokenRequest extends Model
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

    // 三方平台的客户ID
    /**
     * @var string
     */
    public $customerId;

    // 碳账户编号，碳矩阵为客户分配的碳账户编号，跟前面三方平台的客户customer_id必须任意传一个参数，优先使用customer_id查询客户
    /**
     * @var string
     */
    public $carbonAccountNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'customerId'        => 'customer_id',
        'carbonAccountNo'   => 'carbon_account_no',
    ];

    public function validate()
    {
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
        if (null !== $this->customerId) {
            $res['customer_id'] = $this->customerId;
        }
        if (null !== $this->carbonAccountNo) {
            $res['carbon_account_no'] = $this->carbonAccountNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetEcarPlaformauthtokenRequest
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
        if (isset($map['customer_id'])) {
            $model->customerId = $map['customer_id'];
        }
        if (isset($map['carbon_account_no'])) {
            $model->carbonAccountNo = $map['carbon_account_no'];
        }

        return $model;
    }
}
