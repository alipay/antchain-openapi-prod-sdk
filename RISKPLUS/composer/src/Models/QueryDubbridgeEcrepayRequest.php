<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeEcrepayRequest extends Model
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

    // 交易流水号 UUID
    /**
     * @var string
     */
    public $transactionNo;

    // 客户ID
    /**
     * @var string
     */
    public $userId;

    // 合同编号
    /**
     * @var string
     */
    public $contractNo;

    // 借据号
    /**
     * @var string
     */
    public $loanNo;

    // 币种
    /**
     * @var string
     */
    public $currency;

    // 查询开始时间 yyyy/MM/dd,不传时查询借据下所有还款记录
    /**
     * @var string
     */
    public $startdate;

    // 查询截至时间 yyyy/MM/dd,不传时查询借据下所有还款记录
    /**
     * @var string
     */
    public $enddate;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'businessScene'     => 'business_scene',
        'transactionNo'     => 'transaction_no',
        'userId'            => 'user_id',
        'contractNo'        => 'contract_no',
        'loanNo'            => 'loan_no',
        'currency'          => 'currency',
        'startdate'         => 'startdate',
        'enddate'           => 'enddate',
    ];

    public function validate()
    {
        Model::validateRequired('businessScene', $this->businessScene, true);
        Model::validateRequired('transactionNo', $this->transactionNo, true);
        Model::validateRequired('contractNo', $this->contractNo, true);
        Model::validateRequired('currency', $this->currency, true);
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
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->contractNo) {
            $res['contract_no'] = $this->contractNo;
        }
        if (null !== $this->loanNo) {
            $res['loan_no'] = $this->loanNo;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->startdate) {
            $res['startdate'] = $this->startdate;
        }
        if (null !== $this->enddate) {
            $res['enddate'] = $this->enddate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubbridgeEcrepayRequest
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
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['contract_no'])) {
            $model->contractNo = $map['contract_no'];
        }
        if (isset($map['loan_no'])) {
            $model->loanNo = $map['loan_no'];
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }
        if (isset($map['startdate'])) {
            $model->startdate = $map['startdate'];
        }
        if (isset($map['enddate'])) {
            $model->enddate = $map['enddate'];
        }

        return $model;
    }
}
