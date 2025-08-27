<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class PagequeryInnerFundmngfinanceorderRequest extends Model
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

    // 资方租户id
    /**
     * @var string
     */
    public $fundTenantId;

    // 订单id
    /**
     * @var string
     */
    public $orderId;

    // 资产包id
    /**
     * @var string
     */
    public $assetPackageId;

    // 合同id
    /**
     * @var string
     */
    public $signNo;

    // 商家公司名称
    /**
     * @var string
     */
    public $merchantName;

    // 商家社会统一信用代码
    /**
     * @var string
     */
    public $merchantId;

    // 融资申请开始时间
    /**
     * @var string
     */
    public $financeApplyTimeStart;

    // 融资申请结束时间
    /**
     * @var string
     */
    public $financeApplyTimeEnd;

    // 放款状态
    /**
     * @var string
     */
    public $loanStatus;

    // 资方公司名称
    /**
     * @var string
     */
    public $fundName;

    // 是否查询资方放款申请失败订单
    /**
     * @var bool
     */
    public $isLoanApplyFail;

    // 分页
    /**
     * @var PageQuery
     */
    public $pageInfo;
    protected $_name = [
        'authToken'             => 'auth_token',
        'productInstanceId'     => 'product_instance_id',
        'fundTenantId'          => 'fund_tenant_id',
        'orderId'               => 'order_id',
        'assetPackageId'        => 'asset_package_id',
        'signNo'                => 'sign_no',
        'merchantName'          => 'merchant_name',
        'merchantId'            => 'merchant_id',
        'financeApplyTimeStart' => 'finance_apply_time_start',
        'financeApplyTimeEnd'   => 'finance_apply_time_end',
        'loanStatus'            => 'loan_status',
        'fundName'              => 'fund_name',
        'isLoanApplyFail'       => 'is_loan_apply_fail',
        'pageInfo'              => 'page_info',
    ];

    public function validate()
    {
        Model::validateRequired('fundTenantId', $this->fundTenantId, true);
        Model::validateRequired('pageInfo', $this->pageInfo, true);
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
        if (null !== $this->fundTenantId) {
            $res['fund_tenant_id'] = $this->fundTenantId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->assetPackageId) {
            $res['asset_package_id'] = $this->assetPackageId;
        }
        if (null !== $this->signNo) {
            $res['sign_no'] = $this->signNo;
        }
        if (null !== $this->merchantName) {
            $res['merchant_name'] = $this->merchantName;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->financeApplyTimeStart) {
            $res['finance_apply_time_start'] = $this->financeApplyTimeStart;
        }
        if (null !== $this->financeApplyTimeEnd) {
            $res['finance_apply_time_end'] = $this->financeApplyTimeEnd;
        }
        if (null !== $this->loanStatus) {
            $res['loan_status'] = $this->loanStatus;
        }
        if (null !== $this->fundName) {
            $res['fund_name'] = $this->fundName;
        }
        if (null !== $this->isLoanApplyFail) {
            $res['is_loan_apply_fail'] = $this->isLoanApplyFail;
        }
        if (null !== $this->pageInfo) {
            $res['page_info'] = null !== $this->pageInfo ? $this->pageInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryInnerFundmngfinanceorderRequest
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
        if (isset($map['fund_tenant_id'])) {
            $model->fundTenantId = $map['fund_tenant_id'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['asset_package_id'])) {
            $model->assetPackageId = $map['asset_package_id'];
        }
        if (isset($map['sign_no'])) {
            $model->signNo = $map['sign_no'];
        }
        if (isset($map['merchant_name'])) {
            $model->merchantName = $map['merchant_name'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['finance_apply_time_start'])) {
            $model->financeApplyTimeStart = $map['finance_apply_time_start'];
        }
        if (isset($map['finance_apply_time_end'])) {
            $model->financeApplyTimeEnd = $map['finance_apply_time_end'];
        }
        if (isset($map['loan_status'])) {
            $model->loanStatus = $map['loan_status'];
        }
        if (isset($map['fund_name'])) {
            $model->fundName = $map['fund_name'];
        }
        if (isset($map['is_loan_apply_fail'])) {
            $model->isLoanApplyFail = $map['is_loan_apply_fail'];
        }
        if (isset($map['page_info'])) {
            $model->pageInfo = PageQuery::fromMap($map['page_info']);
        }

        return $model;
    }
}
