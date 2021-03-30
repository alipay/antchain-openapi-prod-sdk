<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class CreateBillPaybillorderRequest extends Model
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

    // 申请时间
    /**
     * @var int
     */
    public $applyDate;

    // 银行收款账户
    /**
     * @var string
     */
    public $bankReceiptAccount;

    // 币种
    /**
     * @var string
     */
    public $currency;

    // 开户行
    /**
     * @var string
     */
    public $depositBank;

    // 货代did
    /**
     * @var string
     */
    public $forwarderDid;

    // 应付总额
    /**
     * @var string
     */
    public $payAmount;

    // 付款单编号
    /**
     * @var string
     */
    public $payBillOrderCode;

    // 应付账单资费项 业务必填
    /**
     * @var PayBillTariffParam[]
     */
    public $payBillTariffParams;

    // 付款公司
    /**
     * @var string
     */
    public $payCompany;

    // 付款公司企业信用号
    //
    /**
     * @var string
     */
    public $payCompanyCertNo;

    // 付款公司did
    /**
     * @var string
     */
    public $payCompanyDid;

    // 付款期限
    /**
     * @var string
     */
    public $payDeadline;

    // 收款客户
    /**
     * @var string
     */
    public $receiptClient;

    // 收款客户企业信用号
    //
    /**
     * @var string
     */
    public $receiptClientCertNo;

    // 收款客户did
    /**
     * @var string
     */
    public $receiptClientDid;

    // 对应应收资费项code
    /**
     * @var string[]
     */
    public $receiptTariffCodes;

    // 结算公司
    /**
     * @var string
     */
    public $settleCompany;

    // 结算公司企业信用号
    //
    /**
     * @var string
     */
    public $settleCompanyCertNo;

    // 结算公司did
    /**
     * @var string
     */
    public $settleCompanyDid;

    // 账单结算周期
    /**
     * @var string
     */
    public $settleCycle;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'applyDate'           => 'apply_date',
        'bankReceiptAccount'  => 'bank_receipt_account',
        'currency'            => 'currency',
        'depositBank'         => 'deposit_bank',
        'forwarderDid'        => 'forwarder_did',
        'payAmount'           => 'pay_amount',
        'payBillOrderCode'    => 'pay_bill_order_code',
        'payBillTariffParams' => 'pay_bill_tariff_params',
        'payCompany'          => 'pay_company',
        'payCompanyCertNo'    => 'pay_company_cert_no',
        'payCompanyDid'       => 'pay_company_did',
        'payDeadline'         => 'pay_deadline',
        'receiptClient'       => 'receipt_client',
        'receiptClientCertNo' => 'receipt_client_cert_no',
        'receiptClientDid'    => 'receipt_client_did',
        'receiptTariffCodes'  => 'receipt_tariff_codes',
        'settleCompany'       => 'settle_company',
        'settleCompanyCertNo' => 'settle_company_cert_no',
        'settleCompanyDid'    => 'settle_company_did',
        'settleCycle'         => 'settle_cycle',
    ];

    public function validate()
    {
        Model::validateRequired('forwarderDid', $this->forwarderDid, true);
        Model::validateRequired('payBillOrderCode', $this->payBillOrderCode, true);
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
        if (null !== $this->applyDate) {
            $res['apply_date'] = $this->applyDate;
        }
        if (null !== $this->bankReceiptAccount) {
            $res['bank_receipt_account'] = $this->bankReceiptAccount;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->depositBank) {
            $res['deposit_bank'] = $this->depositBank;
        }
        if (null !== $this->forwarderDid) {
            $res['forwarder_did'] = $this->forwarderDid;
        }
        if (null !== $this->payAmount) {
            $res['pay_amount'] = $this->payAmount;
        }
        if (null !== $this->payBillOrderCode) {
            $res['pay_bill_order_code'] = $this->payBillOrderCode;
        }
        if (null !== $this->payBillTariffParams) {
            $res['pay_bill_tariff_params'] = [];
            if (null !== $this->payBillTariffParams && \is_array($this->payBillTariffParams)) {
                $n = 0;
                foreach ($this->payBillTariffParams as $item) {
                    $res['pay_bill_tariff_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->payCompany) {
            $res['pay_company'] = $this->payCompany;
        }
        if (null !== $this->payCompanyCertNo) {
            $res['pay_company_cert_no'] = $this->payCompanyCertNo;
        }
        if (null !== $this->payCompanyDid) {
            $res['pay_company_did'] = $this->payCompanyDid;
        }
        if (null !== $this->payDeadline) {
            $res['pay_deadline'] = $this->payDeadline;
        }
        if (null !== $this->receiptClient) {
            $res['receipt_client'] = $this->receiptClient;
        }
        if (null !== $this->receiptClientCertNo) {
            $res['receipt_client_cert_no'] = $this->receiptClientCertNo;
        }
        if (null !== $this->receiptClientDid) {
            $res['receipt_client_did'] = $this->receiptClientDid;
        }
        if (null !== $this->receiptTariffCodes) {
            $res['receipt_tariff_codes'] = $this->receiptTariffCodes;
        }
        if (null !== $this->settleCompany) {
            $res['settle_company'] = $this->settleCompany;
        }
        if (null !== $this->settleCompanyCertNo) {
            $res['settle_company_cert_no'] = $this->settleCompanyCertNo;
        }
        if (null !== $this->settleCompanyDid) {
            $res['settle_company_did'] = $this->settleCompanyDid;
        }
        if (null !== $this->settleCycle) {
            $res['settle_cycle'] = $this->settleCycle;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateBillPaybillorderRequest
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
        if (isset($map['apply_date'])) {
            $model->applyDate = $map['apply_date'];
        }
        if (isset($map['bank_receipt_account'])) {
            $model->bankReceiptAccount = $map['bank_receipt_account'];
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }
        if (isset($map['deposit_bank'])) {
            $model->depositBank = $map['deposit_bank'];
        }
        if (isset($map['forwarder_did'])) {
            $model->forwarderDid = $map['forwarder_did'];
        }
        if (isset($map['pay_amount'])) {
            $model->payAmount = $map['pay_amount'];
        }
        if (isset($map['pay_bill_order_code'])) {
            $model->payBillOrderCode = $map['pay_bill_order_code'];
        }
        if (isset($map['pay_bill_tariff_params'])) {
            if (!empty($map['pay_bill_tariff_params'])) {
                $model->payBillTariffParams = [];
                $n                          = 0;
                foreach ($map['pay_bill_tariff_params'] as $item) {
                    $model->payBillTariffParams[$n++] = null !== $item ? PayBillTariffParam::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['pay_company'])) {
            $model->payCompany = $map['pay_company'];
        }
        if (isset($map['pay_company_cert_no'])) {
            $model->payCompanyCertNo = $map['pay_company_cert_no'];
        }
        if (isset($map['pay_company_did'])) {
            $model->payCompanyDid = $map['pay_company_did'];
        }
        if (isset($map['pay_deadline'])) {
            $model->payDeadline = $map['pay_deadline'];
        }
        if (isset($map['receipt_client'])) {
            $model->receiptClient = $map['receipt_client'];
        }
        if (isset($map['receipt_client_cert_no'])) {
            $model->receiptClientCertNo = $map['receipt_client_cert_no'];
        }
        if (isset($map['receipt_client_did'])) {
            $model->receiptClientDid = $map['receipt_client_did'];
        }
        if (isset($map['receipt_tariff_codes'])) {
            if (!empty($map['receipt_tariff_codes'])) {
                $model->receiptTariffCodes = $map['receipt_tariff_codes'];
            }
        }
        if (isset($map['settle_company'])) {
            $model->settleCompany = $map['settle_company'];
        }
        if (isset($map['settle_company_cert_no'])) {
            $model->settleCompanyCertNo = $map['settle_company_cert_no'];
        }
        if (isset($map['settle_company_did'])) {
            $model->settleCompanyDid = $map['settle_company_did'];
        }
        if (isset($map['settle_cycle'])) {
            $model->settleCycle = $map['settle_cycle'];
        }

        return $model;
    }
}
