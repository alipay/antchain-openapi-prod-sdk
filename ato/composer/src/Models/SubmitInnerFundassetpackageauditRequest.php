<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class SubmitInnerFundassetpackageauditRequest extends Model
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

    // 资产包id
    /**
     * @var string
     */
    public $assetPackageId;

    // AGREE 同意
    // SUPPLEMENT_MATERIAL 补充材料
    // REJECT 拒绝
    /**
     * @var string
     */
    public $auditType;

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

    // 备注（小于200字符）
    // 审核通过不用填、
    // 审核不通过/补充材料必填，不允许传入特殊字符
    /**
     * @var string
     */
    public $remark;

    // traceId
    /**
     * @var string
     */
    public $traceId;

    // 资方租户id
    /**
     * @var string
     */
    public $fundTenantId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'assetPackageId'    => 'asset_package_id',
        'auditType'         => 'audit_type',
        'fundId'            => 'fund_id',
        'tenantId'          => 'tenant_id',
        'merchantId'        => 'merchant_id',
        'remark'            => 'remark',
        'traceId'           => 'trace_id',
        'fundTenantId'      => 'fund_tenant_id',
    ];

    public function validate()
    {
        Model::validateRequired('assetPackageId', $this->assetPackageId, true);
        Model::validateRequired('auditType', $this->auditType, true);
        Model::validateRequired('fundId', $this->fundId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('traceId', $this->traceId, true);
        Model::validateRequired('fundTenantId', $this->fundTenantId, true);
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
        if (null !== $this->assetPackageId) {
            $res['asset_package_id'] = $this->assetPackageId;
        }
        if (null !== $this->auditType) {
            $res['audit_type'] = $this->auditType;
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
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }
        if (null !== $this->fundTenantId) {
            $res['fund_tenant_id'] = $this->fundTenantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitInnerFundassetpackageauditRequest
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
        if (isset($map['asset_package_id'])) {
            $model->assetPackageId = $map['asset_package_id'];
        }
        if (isset($map['audit_type'])) {
            $model->auditType = $map['audit_type'];
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
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }
        if (isset($map['trace_id'])) {
            $model->traceId = $map['trace_id'];
        }
        if (isset($map['fund_tenant_id'])) {
            $model->fundTenantId = $map['fund_tenant_id'];
        }

        return $model;
    }
}
