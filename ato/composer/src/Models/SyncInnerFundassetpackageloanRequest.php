<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class SyncInnerFundassetpackageloanRequest extends Model
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

    // 资方id
    /**
     * @var string
     */
    public $fundId;

    // 商户租户id
    /**
     * @var string
     */
    public $tenantId;

    // 商户id
    /**
     * @var string
     */
    public $merchantId;

    // traceid
    /**
     * @var string
     */
    public $traceId;

    // 资产包id
    /**
     * @var string
     */
    public $assetPackageId;

    // AGREE_LOAN（同意放款）
    // REJECT_LOAN（拒绝放款）
    /**
     * @var string
     */
    public $type;

    // 放款时间
    /**
     * @var string
     */
    public $loanTime;

    // 放款总金额
    /**
     * @var int
     */
    public $loanTotalMoney;

    // 放款凭证
    /**
     * @var FileInfo
     */
    public $loanCredit;

    // 放款其他凭证
    /**
     * @var FileInfo[]
     */
    public $loanOtherCredit;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fundTenantId'      => 'fund_tenant_id',
        'fundId'            => 'fund_id',
        'tenantId'          => 'tenant_id',
        'merchantId'        => 'merchant_id',
        'traceId'           => 'trace_id',
        'assetPackageId'    => 'asset_package_id',
        'type'              => 'type',
        'loanTime'          => 'loan_time',
        'loanTotalMoney'    => 'loan_total_money',
        'loanCredit'        => 'loan_credit',
        'loanOtherCredit'   => 'loan_other_credit',
    ];

    public function validate()
    {
        Model::validateRequired('fundTenantId', $this->fundTenantId, true);
        Model::validateRequired('fundId', $this->fundId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('traceId', $this->traceId, true);
        Model::validateRequired('assetPackageId', $this->assetPackageId, true);
        Model::validateRequired('type', $this->type, true);
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
        if (null !== $this->fundId) {
            $res['fund_id'] = $this->fundId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }
        if (null !== $this->assetPackageId) {
            $res['asset_package_id'] = $this->assetPackageId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->loanTime) {
            $res['loan_time'] = $this->loanTime;
        }
        if (null !== $this->loanTotalMoney) {
            $res['loan_total_money'] = $this->loanTotalMoney;
        }
        if (null !== $this->loanCredit) {
            $res['loan_credit'] = null !== $this->loanCredit ? $this->loanCredit->toMap() : null;
        }
        if (null !== $this->loanOtherCredit) {
            $res['loan_other_credit'] = [];
            if (null !== $this->loanOtherCredit && \is_array($this->loanOtherCredit)) {
                $n = 0;
                foreach ($this->loanOtherCredit as $item) {
                    $res['loan_other_credit'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncInnerFundassetpackageloanRequest
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
        if (isset($map['fund_id'])) {
            $model->fundId = $map['fund_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['trace_id'])) {
            $model->traceId = $map['trace_id'];
        }
        if (isset($map['asset_package_id'])) {
            $model->assetPackageId = $map['asset_package_id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['loan_time'])) {
            $model->loanTime = $map['loan_time'];
        }
        if (isset($map['loan_total_money'])) {
            $model->loanTotalMoney = $map['loan_total_money'];
        }
        if (isset($map['loan_credit'])) {
            $model->loanCredit = FileInfo::fromMap($map['loan_credit']);
        }
        if (isset($map['loan_other_credit'])) {
            if (!empty($map['loan_other_credit'])) {
                $model->loanOtherCredit = [];
                $n                      = 0;
                foreach ($map['loan_other_credit'] as $item) {
                    $model->loanOtherCredit[$n++] = null !== $item ? FileInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
