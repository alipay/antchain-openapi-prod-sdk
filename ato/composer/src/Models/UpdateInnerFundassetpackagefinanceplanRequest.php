<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class UpdateInnerFundassetpackagefinanceplanRequest extends Model
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

    // 资产包id
    /**
     * @var string
     */
    public $assetPackageId;

    // 资方社会统一信用代码
    /**
     * @var string
     */
    public $fundId;

    // 商户租户id
    /**
     * @var string
     */
    public $tenantId;

    // 商户社会统一信用代码
    /**
     * @var string
     */
    public $merchantId;

    // 资金方案版本号
    /**
     * @var int
     */
    public $financePlanVersion;

    // 用户输入内容
    /**
     * @var string
     */
    public $content;

    // traceId
    /**
     * @var string
     */
    public $traceId;

    // 资金方案内容
    /**
     * @var AssetPackageFinancePlan
     */
    public $assetPackageFinancePlan;
    protected $_name = [
        'authToken'               => 'auth_token',
        'productInstanceId'       => 'product_instance_id',
        'fundTenantId'            => 'fund_tenant_id',
        'assetPackageId'          => 'asset_package_id',
        'fundId'                  => 'fund_id',
        'tenantId'                => 'tenant_id',
        'merchantId'              => 'merchant_id',
        'financePlanVersion'      => 'finance_plan_version',
        'content'                 => 'content',
        'traceId'                 => 'trace_id',
        'assetPackageFinancePlan' => 'asset_package_finance_plan',
    ];

    public function validate()
    {
        Model::validateRequired('fundTenantId', $this->fundTenantId, true);
        Model::validateRequired('assetPackageId', $this->assetPackageId, true);
        Model::validateRequired('fundId', $this->fundId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('financePlanVersion', $this->financePlanVersion, true);
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('traceId', $this->traceId, true);
        Model::validateRequired('assetPackageFinancePlan', $this->assetPackageFinancePlan, true);
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
        if (null !== $this->fundId) {
            $res['fund_id'] = $this->fundId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->financePlanVersion) {
            $res['finance_plan_version'] = $this->financePlanVersion;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }
        if (null !== $this->assetPackageFinancePlan) {
            $res['asset_package_finance_plan'] = null !== $this->assetPackageFinancePlan ? $this->assetPackageFinancePlan->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateInnerFundassetpackagefinanceplanRequest
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
        if (isset($map['fund_id'])) {
            $model->fundId = $map['fund_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['finance_plan_version'])) {
            $model->financePlanVersion = $map['finance_plan_version'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['trace_id'])) {
            $model->traceId = $map['trace_id'];
        }
        if (isset($map['asset_package_finance_plan'])) {
            $model->assetPackageFinancePlan = AssetPackageFinancePlan::fromMap($map['asset_package_finance_plan']);
        }

        return $model;
    }
}
