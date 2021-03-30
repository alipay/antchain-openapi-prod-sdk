<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class QueryPfIouRequest extends Model
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

    // 客户号
    /**
     * @var string
     */
    public $customerNo;

    // 借据Id
    /**
     * @var string
     */
    public $debitId;

    // 支用Id
    /**
     * @var string
     */
    public $financingId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'customerNo'        => 'customer_no',
        'debitId'           => 'debit_id',
        'financingId'       => 'financing_id',
    ];

    public function validate()
    {
        Model::validateMaxLength('customerNo', $this->customerNo, 20);
        Model::validateMaxLength('debitId', $this->debitId, 16);
        Model::validateMaxLength('financingId', $this->financingId, 32);
        Model::validateRequired('financingId', $this->financingId, true);
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
        if (null !== $this->customerNo) {
            $res['customer_no'] = $this->customerNo;
        }
        if (null !== $this->debitId) {
            $res['debit_id'] = $this->debitId;
        }
        if (null !== $this->financingId) {
            $res['financing_id'] = $this->financingId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryPfIouRequest
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
        if (isset($map['customer_no'])) {
            $model->customerNo = $map['customer_no'];
        }
        if (isset($map['debit_id'])) {
            $model->debitId = $map['debit_id'];
        }
        if (isset($map['financing_id'])) {
            $model->financingId = $map['financing_id'];
        }

        return $model;
    }
}
