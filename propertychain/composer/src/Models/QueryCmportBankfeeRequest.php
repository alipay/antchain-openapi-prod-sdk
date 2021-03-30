<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryCmportBankfeeRequest extends Model
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

    // 融资编号
    /**
     * @var string
     */
    public $financialNo;

    // 记账日期 yyyy-mm-dd
    /**
     * @var string
     */
    public $accountDate;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'financialNo'       => 'financial_no',
        'accountDate'       => 'account_date',
    ];

    public function validate()
    {
        Model::validateRequired('financialNo', $this->financialNo, true);
        Model::validateRequired('accountDate', $this->accountDate, true);
        Model::validatePattern('accountDate', $this->accountDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->financialNo) {
            $res['financial_no'] = $this->financialNo;
        }
        if (null !== $this->accountDate) {
            $res['account_date'] = $this->accountDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCmportBankfeeRequest
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
        if (isset($map['financial_no'])) {
            $model->financialNo = $map['financial_no'];
        }
        if (isset($map['account_date'])) {
            $model->accountDate = $map['account_date'];
        }

        return $model;
    }
}
