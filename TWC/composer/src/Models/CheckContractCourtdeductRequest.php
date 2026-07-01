<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CheckContractCourtdeductRequest extends Model
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

    // 付款账户人姓名
    /**
     * @var string
     */
    public $payerName;

    // 付款人银行账户
    /**
     * @var string
     */
    public $payerAccount;

    // 银行类型：icbc(工行)
    /**
     * @var string
     */
    public $bankType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'payerName'         => 'payer_name',
        'payerAccount'      => 'payer_account',
        'bankType'          => 'bank_type',
    ];

    public function validate()
    {
        Model::validateRequired('payerName', $this->payerName, true);
        Model::validateRequired('payerAccount', $this->payerAccount, true);
        Model::validateRequired('bankType', $this->bankType, true);
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
        if (null !== $this->payerName) {
            $res['payer_name'] = $this->payerName;
        }
        if (null !== $this->payerAccount) {
            $res['payer_account'] = $this->payerAccount;
        }
        if (null !== $this->bankType) {
            $res['bank_type'] = $this->bankType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckContractCourtdeductRequest
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
        if (isset($map['payer_name'])) {
            $model->payerName = $map['payer_name'];
        }
        if (isset($map['payer_account'])) {
            $model->payerAccount = $map['payer_account'];
        }
        if (isset($map['bank_type'])) {
            $model->bankType = $map['bank_type'];
        }

        return $model;
    }
}
