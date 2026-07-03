<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class CountDubbridgeEcrepayTrialRequest extends Model
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

    // 申请流水
    /**
     * @var string
     */
    public $applyNo;

    // 借据号
    /**
     * @var string
     */
    public $loanAcctNo;

    // 借款人证件类型
    /**
     * @var string
     */
    public $idType;

    // 借款人证件号码
    /**
     * @var string
     */
    public $idNo;

    // 本次还款总金额(含本金、利息、复利、罚息),不送默认全额还款
    /**
     * @var string
     */
    public $repayAmount;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'businessScene'     => 'business_scene',
        'applyNo'           => 'apply_no',
        'loanAcctNo'        => 'loan_acct_no',
        'idType'            => 'id_type',
        'idNo'              => 'id_no',
        'repayAmount'       => 'repay_amount',
    ];

    public function validate()
    {
        Model::validateRequired('businessScene', $this->businessScene, true);
        Model::validateRequired('applyNo', $this->applyNo, true);
        Model::validateRequired('loanAcctNo', $this->loanAcctNo, true);
        Model::validateRequired('idType', $this->idType, true);
        Model::validateRequired('idNo', $this->idNo, true);
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
        if (null !== $this->applyNo) {
            $res['apply_no'] = $this->applyNo;
        }
        if (null !== $this->loanAcctNo) {
            $res['loan_acct_no'] = $this->loanAcctNo;
        }
        if (null !== $this->idType) {
            $res['id_type'] = $this->idType;
        }
        if (null !== $this->idNo) {
            $res['id_no'] = $this->idNo;
        }
        if (null !== $this->repayAmount) {
            $res['repay_amount'] = $this->repayAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CountDubbridgeEcrepayTrialRequest
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
        if (isset($map['apply_no'])) {
            $model->applyNo = $map['apply_no'];
        }
        if (isset($map['loan_acct_no'])) {
            $model->loanAcctNo = $map['loan_acct_no'];
        }
        if (isset($map['id_type'])) {
            $model->idType = $map['id_type'];
        }
        if (isset($map['id_no'])) {
            $model->idNo = $map['id_no'];
        }
        if (isset($map['repay_amount'])) {
            $model->repayAmount = $map['repay_amount'];
        }

        return $model;
    }
}
