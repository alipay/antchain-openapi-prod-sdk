<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class NotifyCmportRepayRequest extends Model
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

    // 平台融资编号
    /**
     * @var string
     */
    public $financialNo;

    // 还款编号
    /**
     * @var string
     */
    public $repayNo;

    // 融资企业名称
    /**
     * @var string
     */
    public $companyName;

    // 融资企业编码
    /**
     * @var string
     */
    public $companyCode;

    // 产品编号
    /**
     * @var string
     */
    public $productNo;

    // 产品名称
    /**
     * @var string
     */
    public $productName;

    // 还款金额，一期一次性全部还款，加上利息
    /**
     * @var int
     */
    public $totalAmount;

    // 还款银行
    /**
     * @var string
     */
    public $repayBank;

    // 还款银行账号
    /**
     * @var string
     */
    public $repayBankAccount;

    // 融资状态:
    // 10->待确权;20->待审核;30->待签署;40->待放款;50->待还款;51->还款撤销;52->还款中;60->已还款;70->审核不通过;80->已融资撤销
    /**
     * @var int
     */
    public $financialStatus;

    // 还款日期
    /**
     * @var string
     */
    public $repayDate;

    // 上链账户
    /**
     * @var string
     */
    public $userDid;

    // 联盟id
    /**
     * @var int
     */
    public $unionId;

    // Channel 名称
    /**
     * @var string
     */
    public $channelName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'financialNo'       => 'financial_no',
        'repayNo'           => 'repay_no',
        'companyName'       => 'company_name',
        'companyCode'       => 'company_code',
        'productNo'         => 'product_no',
        'productName'       => 'product_name',
        'totalAmount'       => 'total_amount',
        'repayBank'         => 'repay_bank',
        'repayBankAccount'  => 'repay_bank_account',
        'financialStatus'   => 'financial_status',
        'repayDate'         => 'repay_date',
        'userDid'           => 'user_did',
        'unionId'           => 'union_id',
        'channelName'       => 'channel_name',
    ];

    public function validate()
    {
        Model::validateRequired('financialNo', $this->financialNo, true);
        Model::validateRequired('repayNo', $this->repayNo, true);
        Model::validateRequired('companyName', $this->companyName, true);
        Model::validateRequired('companyCode', $this->companyCode, true);
        Model::validateRequired('productNo', $this->productNo, true);
        Model::validateRequired('productName', $this->productName, true);
        Model::validateRequired('totalAmount', $this->totalAmount, true);
        Model::validateRequired('repayBank', $this->repayBank, true);
        Model::validateRequired('repayBankAccount', $this->repayBankAccount, true);
        Model::validateRequired('financialStatus', $this->financialStatus, true);
        Model::validateRequired('repayDate', $this->repayDate, true);
        Model::validateRequired('userDid', $this->userDid, true);
        Model::validateRequired('unionId', $this->unionId, true);
        Model::validateRequired('channelName', $this->channelName, true);
        Model::validatePattern('repayDate', $this->repayDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->repayNo) {
            $res['repay_no'] = $this->repayNo;
        }
        if (null !== $this->companyName) {
            $res['company_name'] = $this->companyName;
        }
        if (null !== $this->companyCode) {
            $res['company_code'] = $this->companyCode;
        }
        if (null !== $this->productNo) {
            $res['product_no'] = $this->productNo;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }
        if (null !== $this->repayBank) {
            $res['repay_bank'] = $this->repayBank;
        }
        if (null !== $this->repayBankAccount) {
            $res['repay_bank_account'] = $this->repayBankAccount;
        }
        if (null !== $this->financialStatus) {
            $res['financial_status'] = $this->financialStatus;
        }
        if (null !== $this->repayDate) {
            $res['repay_date'] = $this->repayDate;
        }
        if (null !== $this->userDid) {
            $res['user_did'] = $this->userDid;
        }
        if (null !== $this->unionId) {
            $res['union_id'] = $this->unionId;
        }
        if (null !== $this->channelName) {
            $res['channel_name'] = $this->channelName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NotifyCmportRepayRequest
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
        if (isset($map['repay_no'])) {
            $model->repayNo = $map['repay_no'];
        }
        if (isset($map['company_name'])) {
            $model->companyName = $map['company_name'];
        }
        if (isset($map['company_code'])) {
            $model->companyCode = $map['company_code'];
        }
        if (isset($map['product_no'])) {
            $model->productNo = $map['product_no'];
        }
        if (isset($map['product_name'])) {
            $model->productName = $map['product_name'];
        }
        if (isset($map['total_amount'])) {
            $model->totalAmount = $map['total_amount'];
        }
        if (isset($map['repay_bank'])) {
            $model->repayBank = $map['repay_bank'];
        }
        if (isset($map['repay_bank_account'])) {
            $model->repayBankAccount = $map['repay_bank_account'];
        }
        if (isset($map['financial_status'])) {
            $model->financialStatus = $map['financial_status'];
        }
        if (isset($map['repay_date'])) {
            $model->repayDate = $map['repay_date'];
        }
        if (isset($map['user_did'])) {
            $model->userDid = $map['user_did'];
        }
        if (isset($map['union_id'])) {
            $model->unionId = $map['union_id'];
        }
        if (isset($map['channel_name'])) {
            $model->channelName = $map['channel_name'];
        }

        return $model;
    }
}
