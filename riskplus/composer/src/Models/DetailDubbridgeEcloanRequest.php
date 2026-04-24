<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class DetailDubbridgeEcloanRequest extends Model
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

    // 业务场景
    /**
     * @var string
     */
    public $businessScene;

    // 交易流水号
    /**
     * @var string
     */
    public $transactionNo;

    // 合同号
    /**
     * @var string
     */
    public $contractNo;

    // 借据号
    /**
     * @var string
     */
    public $loanNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'businessScene'     => 'business_scene',
        'transactionNo'     => 'transaction_no',
        'contractNo'        => 'contract_no',
        'loanNo'            => 'loan_no',
    ];

    public function validate()
    {
        Model::validateRequired('businessScene', $this->businessScene, true);
        Model::validateRequired('transactionNo', $this->transactionNo, true);
        Model::validateRequired('contractNo', $this->contractNo, true);
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
        if (null !== $this->businessScene) {
            $res['business_scene'] = $this->businessScene;
        }
        if (null !== $this->transactionNo) {
            $res['transaction_no'] = $this->transactionNo;
        }
        if (null !== $this->contractNo) {
            $res['contract_no'] = $this->contractNo;
        }
        if (null !== $this->loanNo) {
            $res['loan_no'] = $this->loanNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DetailDubbridgeEcloanRequest
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
        if (isset($map['business_scene'])) {
            $model->businessScene = $map['business_scene'];
        }
        if (isset($map['transaction_no'])) {
            $model->transactionNo = $map['transaction_no'];
        }
        if (isset($map['contract_no'])) {
            $model->contractNo = $map['contract_no'];
        }
        if (isset($map['loan_no'])) {
            $model->loanNo = $map['loan_no'];
        }

        return $model;
    }
}
