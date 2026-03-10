<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeRepaymentLxRequest extends Model
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

    // 还款请求流水号/账单号
    /**
     * @var string
     */
    public $billId;

    // 放款编号/借据号
    /**
     * @var string
     */
    public $capitalLoanNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'billId'            => 'bill_id',
        'capitalLoanNo'     => 'capital_loan_no',
    ];

    public function validate()
    {
        Model::validateRequired('billId', $this->billId, true);
        Model::validateRequired('capitalLoanNo', $this->capitalLoanNo, true);
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
        if (null !== $this->billId) {
            $res['bill_id'] = $this->billId;
        }
        if (null !== $this->capitalLoanNo) {
            $res['capital_loan_no'] = $this->capitalLoanNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubbridgeRepaymentLxRequest
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
        if (isset($map['bill_id'])) {
            $model->billId = $map['bill_id'];
        }
        if (isset($map['capital_loan_no'])) {
            $model->capitalLoanNo = $map['capital_loan_no'];
        }

        return $model;
    }
}
