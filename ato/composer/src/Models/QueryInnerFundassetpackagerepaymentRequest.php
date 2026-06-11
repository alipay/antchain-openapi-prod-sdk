<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryInnerFundassetpackagerepaymentRequest extends Model
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

    // 资方租户ID
    /**
     * @var string
     */
    public $fundTenantId;

    // 资产包ID
    /**
     * @var string
     */
    public $assetPackageId;

    // 商户名称
    /**
     * @var string
     */
    public $merchantName;

    // 放款起始时间
    /**
     * @var string
     */
    public $loanTimeStart;

    // 放款结束时间
    /**
     * @var string
     */
    public $loanTimeEnd;

    // 还款状态
    /**
     * @var string
     */
    public $repaymentStatus;

    // 分页信息
    /**
     * @var PageQuery
     */
    public $pageInfo;

    // traceId
    /**
     * @var string
     */
    public $traceId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fundTenantId'      => 'fund_tenant_id',
        'assetPackageId'    => 'asset_package_id',
        'merchantName'      => 'merchant_name',
        'loanTimeStart'     => 'loan_time_start',
        'loanTimeEnd'       => 'loan_time_end',
        'repaymentStatus'   => 'repayment_status',
        'pageInfo'          => 'page_info',
        'traceId'           => 'trace_id',
    ];

    public function validate()
    {
        Model::validateRequired('fundTenantId', $this->fundTenantId, true);
        Model::validateRequired('pageInfo', $this->pageInfo, true);
        Model::validateRequired('traceId', $this->traceId, true);
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
        if (null !== $this->assetPackageId) {
            $res['asset_package_id'] = $this->assetPackageId;
        }
        if (null !== $this->merchantName) {
            $res['merchant_name'] = $this->merchantName;
        }
        if (null !== $this->loanTimeStart) {
            $res['loan_time_start'] = $this->loanTimeStart;
        }
        if (null !== $this->loanTimeEnd) {
            $res['loan_time_end'] = $this->loanTimeEnd;
        }
        if (null !== $this->repaymentStatus) {
            $res['repayment_status'] = $this->repaymentStatus;
        }
        if (null !== $this->pageInfo) {
            $res['page_info'] = null !== $this->pageInfo ? $this->pageInfo->toMap() : null;
        }
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryInnerFundassetpackagerepaymentRequest
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
        if (isset($map['asset_package_id'])) {
            $model->assetPackageId = $map['asset_package_id'];
        }
        if (isset($map['merchant_name'])) {
            $model->merchantName = $map['merchant_name'];
        }
        if (isset($map['loan_time_start'])) {
            $model->loanTimeStart = $map['loan_time_start'];
        }
        if (isset($map['loan_time_end'])) {
            $model->loanTimeEnd = $map['loan_time_end'];
        }
        if (isset($map['repayment_status'])) {
            $model->repaymentStatus = $map['repayment_status'];
        }
        if (isset($map['page_info'])) {
            $model->pageInfo = PageQuery::fromMap($map['page_info']);
        }
        if (isset($map['trace_id'])) {
            $model->traceId = $map['trace_id'];
        }

        return $model;
    }
}
