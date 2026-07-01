<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateContractCourtdeductRequest extends Model
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

    // 流程id
    /**
     * @var string
     */
    public $flowId;

    // 客户自定义案件id
    /**
     * @var string
     */
    public $caseId;

    // 案件名称
    /**
     * @var string
     */
    public $caseName;

    // 收款方人姓名
    /**
     * @var string
     */
    public $payeeName;

    // 收款方人银行账户
    /**
     * @var string
     */
    public $payeeAccount;

    // 收款方银行类型
    /**
     * @var string
     */
    public $payeeBankType;

    // 付款方人姓名
    /**
     * @var string
     */
    public $payerName;

    // 付款方银行账户
    /**
     * @var string
     */
    public $payerAccount;

    // 付款方银行类型，例如：icbc（工行）
    /**
     * @var string
     */
    public $payerBankType;

    // 扣款计划详情列表
    /**
     * @var PaymentDetail[]
     */
    public $paymentDetailList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'flowId'            => 'flow_id',
        'caseId'            => 'case_id',
        'caseName'          => 'case_name',
        'payeeName'         => 'payee_name',
        'payeeAccount'      => 'payee_account',
        'payeeBankType'     => 'payee_bank_type',
        'payerName'         => 'payer_name',
        'payerAccount'      => 'payer_account',
        'payerBankType'     => 'payer_bank_type',
        'paymentDetailList' => 'payment_detail_list',
    ];

    public function validate()
    {
        Model::validateRequired('flowId', $this->flowId, true);
        Model::validateRequired('caseId', $this->caseId, true);
        Model::validateRequired('caseName', $this->caseName, true);
        Model::validateRequired('payeeName', $this->payeeName, true);
        Model::validateRequired('payeeAccount', $this->payeeAccount, true);
        Model::validateRequired('payeeBankType', $this->payeeBankType, true);
        Model::validateRequired('payerName', $this->payerName, true);
        Model::validateRequired('payerAccount', $this->payerAccount, true);
        Model::validateRequired('payerBankType', $this->payerBankType, true);
        Model::validateRequired('paymentDetailList', $this->paymentDetailList, true);
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
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        if (null !== $this->caseId) {
            $res['case_id'] = $this->caseId;
        }
        if (null !== $this->caseName) {
            $res['case_name'] = $this->caseName;
        }
        if (null !== $this->payeeName) {
            $res['payee_name'] = $this->payeeName;
        }
        if (null !== $this->payeeAccount) {
            $res['payee_account'] = $this->payeeAccount;
        }
        if (null !== $this->payeeBankType) {
            $res['payee_bank_type'] = $this->payeeBankType;
        }
        if (null !== $this->payerName) {
            $res['payer_name'] = $this->payerName;
        }
        if (null !== $this->payerAccount) {
            $res['payer_account'] = $this->payerAccount;
        }
        if (null !== $this->payerBankType) {
            $res['payer_bank_type'] = $this->payerBankType;
        }
        if (null !== $this->paymentDetailList) {
            $res['payment_detail_list'] = [];
            if (null !== $this->paymentDetailList && \is_array($this->paymentDetailList)) {
                $n = 0;
                foreach ($this->paymentDetailList as $item) {
                    $res['payment_detail_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateContractCourtdeductRequest
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
        if (isset($map['flow_id'])) {
            $model->flowId = $map['flow_id'];
        }
        if (isset($map['case_id'])) {
            $model->caseId = $map['case_id'];
        }
        if (isset($map['case_name'])) {
            $model->caseName = $map['case_name'];
        }
        if (isset($map['payee_name'])) {
            $model->payeeName = $map['payee_name'];
        }
        if (isset($map['payee_account'])) {
            $model->payeeAccount = $map['payee_account'];
        }
        if (isset($map['payee_bank_type'])) {
            $model->payeeBankType = $map['payee_bank_type'];
        }
        if (isset($map['payer_name'])) {
            $model->payerName = $map['payer_name'];
        }
        if (isset($map['payer_account'])) {
            $model->payerAccount = $map['payer_account'];
        }
        if (isset($map['payer_bank_type'])) {
            $model->payerBankType = $map['payer_bank_type'];
        }
        if (isset($map['payment_detail_list'])) {
            if (!empty($map['payment_detail_list'])) {
                $model->paymentDetailList = [];
                $n                        = 0;
                foreach ($map['payment_detail_list'] as $item) {
                    $model->paymentDetailList[$n++] = null !== $item ? PaymentDetail::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
