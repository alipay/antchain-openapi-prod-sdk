<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DD\Models\InvoiceApplyItem;
use AntChain\DD\Models\InvoiceMailInfo;
use AntChain\DD\Models\UserInvoiceInfo;

class PushAntcloudInvoiceIntlinvoicesProformainvoiceRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenantId' => 'tenant_id',
        'arNo' => 'ar_no',
        'bizAction' => 'biz_action',
        'bizScene' => 'biz_scene',
        'currencyCode' => 'currency_code',
        'taxRate' => 'tax_rate',
        'invoiceApplyItemList' => 'invoice_apply_item_list',
        'invoiceDate' => 'invoice_date',
        'invoiceEmailInfo' => 'invoice_email_info',
        'invoiceType' => 'invoice_type',
        'operatorName' => 'operator_name',
        'operatorNo' => 'operator_no',
        'ou' => 'ou',
        'ouCurrencyCode' => 'ou_currency_code',
        'source' => 'source',
        'userInvoiceInfo' => 'user_invoice_info',
        'applyReason' => 'apply_reason',
        'expenseperiodStartdate' => 'expenseperiod_startdate',
        'expenseperiodEnddate' => 'expenseperiod_enddate',
    ];
    public function validate() {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('arNo', $this->arNo, true);
        Model::validateRequired('bizAction', $this->bizAction, true);
        Model::validateRequired('bizScene', $this->bizScene, true);
        Model::validateRequired('currencyCode', $this->currencyCode, true);
        Model::validateRequired('taxRate', $this->taxRate, true);
        Model::validateRequired('invoiceApplyItemList', $this->invoiceApplyItemList, true);
        Model::validateRequired('invoiceDate', $this->invoiceDate, true);
        Model::validateRequired('invoiceEmailInfo', $this->invoiceEmailInfo, true);
        Model::validateRequired('invoiceType', $this->invoiceType, true);
        Model::validateRequired('operatorName', $this->operatorName, true);
        Model::validateRequired('operatorNo', $this->operatorNo, true);
        Model::validateRequired('ou', $this->ou, true);
        Model::validateRequired('ouCurrencyCode', $this->ouCurrencyCode, true);
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('userInvoiceInfo', $this->userInvoiceInfo, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->arNo) {
            $res['ar_no'] = $this->arNo;
        }
        if (null !== $this->bizAction) {
            $res['biz_action'] = $this->bizAction;
        }
        if (null !== $this->bizScene) {
            $res['biz_scene'] = $this->bizScene;
        }
        if (null !== $this->currencyCode) {
            $res['currency_code'] = $this->currencyCode;
        }
        if (null !== $this->taxRate) {
            $res['tax_rate'] = $this->taxRate;
        }
        if (null !== $this->invoiceApplyItemList) {
            $res['invoice_apply_item_list'] = [];
            if(null !== $this->invoiceApplyItemList && is_array($this->invoiceApplyItemList)){
                $n = 0;
                foreach($this->invoiceApplyItemList as $item){
                    $res['invoice_apply_item_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->invoiceDate) {
            $res['invoice_date'] = $this->invoiceDate;
        }
        if (null !== $this->invoiceEmailInfo) {
            $res['invoice_email_info'] = null !== $this->invoiceEmailInfo ? $this->invoiceEmailInfo->toMap() : null;
        }
        if (null !== $this->invoiceType) {
            $res['invoice_type'] = $this->invoiceType;
        }
        if (null !== $this->operatorName) {
            $res['operator_name'] = $this->operatorName;
        }
        if (null !== $this->operatorNo) {
            $res['operator_no'] = $this->operatorNo;
        }
        if (null !== $this->ou) {
            $res['ou'] = $this->ou;
        }
        if (null !== $this->ouCurrencyCode) {
            $res['ou_currency_code'] = $this->ouCurrencyCode;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->userInvoiceInfo) {
            $res['user_invoice_info'] = null !== $this->userInvoiceInfo ? $this->userInvoiceInfo->toMap() : null;
        }
        if (null !== $this->applyReason) {
            $res['apply_reason'] = $this->applyReason;
        }
        if (null !== $this->expenseperiodStartdate) {
            $res['expenseperiod_startdate'] = $this->expenseperiodStartdate;
        }
        if (null !== $this->expenseperiodEnddate) {
            $res['expenseperiod_enddate'] = $this->expenseperiodEnddate;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PushAntcloudInvoiceIntlinvoicesProformainvoiceRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['ar_no'])){
            $model->arNo = $map['ar_no'];
        }
        if(isset($map['biz_action'])){
            $model->bizAction = $map['biz_action'];
        }
        if(isset($map['biz_scene'])){
            $model->bizScene = $map['biz_scene'];
        }
        if(isset($map['currency_code'])){
            $model->currencyCode = $map['currency_code'];
        }
        if(isset($map['tax_rate'])){
            $model->taxRate = $map['tax_rate'];
        }
        if(isset($map['invoice_apply_item_list'])){
            if(!empty($map['invoice_apply_item_list'])){
                $model->invoiceApplyItemList = [];
                $n = 0;
                foreach($map['invoice_apply_item_list'] as $item) {
                    $model->invoiceApplyItemList[$n++] = null !== $item ? InvoiceApplyItem::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['invoice_date'])){
            $model->invoiceDate = $map['invoice_date'];
        }
        if(isset($map['invoice_email_info'])){
            $model->invoiceEmailInfo = InvoiceMailInfo::fromMap($map['invoice_email_info']);
        }
        if(isset($map['invoice_type'])){
            $model->invoiceType = $map['invoice_type'];
        }
        if(isset($map['operator_name'])){
            $model->operatorName = $map['operator_name'];
        }
        if(isset($map['operator_no'])){
            $model->operatorNo = $map['operator_no'];
        }
        if(isset($map['ou'])){
            $model->ou = $map['ou'];
        }
        if(isset($map['ou_currency_code'])){
            $model->ouCurrencyCode = $map['ou_currency_code'];
        }
        if(isset($map['source'])){
            $model->source = $map['source'];
        }
        if(isset($map['user_invoice_info'])){
            $model->userInvoiceInfo = UserInvoiceInfo::fromMap($map['user_invoice_info']);
        }
        if(isset($map['apply_reason'])){
            $model->applyReason = $map['apply_reason'];
        }
        if(isset($map['expenseperiod_startdate'])){
            $model->expenseperiodStartdate = $map['expenseperiod_startdate'];
        }
        if(isset($map['expenseperiod_enddate'])){
            $model->expenseperiodEnddate = $map['expenseperiod_enddate'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 租户ID
    /**
     * @var string
     */
    public $tenantId;

    // 合同号或订单号
    /**
     * @var string
     */
    public $arNo;

    // 业务动作
    /**
     * @var string
     */
    public $bizAction;

    // 业务场景
    /**
     * @var string
     */
    public $bizScene;

    // 币种
    /**
     * @var string
     */
    public $currencyCode;

    // 税率
    /**
     * @var string
     */
    public $taxRate;

    // 开票申请项列表
    /**
     * @var InvoiceApplyItem[]
     */
    public $invoiceApplyItemList;

    // 开票日期
    /**
     * @var string
     */
    public $invoiceDate;

    // 发票邮寄信息
    /**
     * @var InvoiceMailInfo
     */
    public $invoiceEmailInfo;

    // 发票类型
    /**
     * @var string
     */
    public $invoiceType;

    // 操作人姓名
    /**
     * @var string
     */
    public $operatorName;

    // 操作人ID
    /**
     * @var string
     */
    public $operatorNo;

    // OU
    /**
     * @var string
     */
    public $ou;

    // OU币种
    /**
     * @var string
     */
    public $ouCurrencyCode;

    // 来源
    /**
     * @var string
     */
    public $source;

    // 用户开票信息
    /**
     * @var UserInvoiceInfo
     */
    public $userInvoiceInfo;

    // 申请原因
    /**
     * @var string
     */
    public $applyReason;

    // 费用期间开始日期
    /**
     * @var string
     */
    public $expenseperiodStartdate;

    // 费用期间结束日期
    /**
     * @var string
     */
    public $expenseperiodEnddate;

}
