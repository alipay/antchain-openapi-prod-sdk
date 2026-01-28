<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class RegisterAntchainAtoMerchantexpandMerchantRequest extends Model
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

    // 公司信息
    /**
     * @var CompanyInfo
     */
    public $companyInfo;

    // 法人信息
    /**
     * @var LegalInfo
     */
    public $legalInfo;

    // 应用信息
    /**
     * @var ApplicationInfo
     */
    public $applicationInfo;

    // 进件模式 DIRECT(直连进件) AGENT(代理进件)
    /**
     * @var string
     */
    public $expandMode;

    // expand_mode=_AGENT_ 必填
    /**
     * @var string
     */
    public $subTenantId;

    // 京东商家控股信息
    /**
     * @var MerchantHoldingInfo
     */
    public $merchantHoldingInfo;

    // 京东商家结算信息
    /**
     * @var MerchantSettleInfo
     */
    public $merchantSettleInfo;

    // 支付渠道
    // ALIPAY（默认）
    // JDPAY
    /**
     * @var string
     */
    public $payChannel;

    // 角色
    // MERCHANT（默认）
    // FINANCIER
    /**
     * @var string
     */
    public $role;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'companyInfo'         => 'company_info',
        'legalInfo'           => 'legal_info',
        'applicationInfo'     => 'application_info',
        'expandMode'          => 'expand_mode',
        'subTenantId'         => 'sub_tenant_id',
        'merchantHoldingInfo' => 'merchant_holding_info',
        'merchantSettleInfo'  => 'merchant_settle_info',
        'payChannel'          => 'pay_channel',
        'role'                => 'role',
    ];

    public function validate()
    {
        Model::validateRequired('companyInfo', $this->companyInfo, true);
        Model::validateRequired('legalInfo', $this->legalInfo, true);
        Model::validateRequired('expandMode', $this->expandMode, true);
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
        if (null !== $this->companyInfo) {
            $res['company_info'] = null !== $this->companyInfo ? $this->companyInfo->toMap() : null;
        }
        if (null !== $this->legalInfo) {
            $res['legal_info'] = null !== $this->legalInfo ? $this->legalInfo->toMap() : null;
        }
        if (null !== $this->applicationInfo) {
            $res['application_info'] = null !== $this->applicationInfo ? $this->applicationInfo->toMap() : null;
        }
        if (null !== $this->expandMode) {
            $res['expand_mode'] = $this->expandMode;
        }
        if (null !== $this->subTenantId) {
            $res['sub_tenant_id'] = $this->subTenantId;
        }
        if (null !== $this->merchantHoldingInfo) {
            $res['merchant_holding_info'] = null !== $this->merchantHoldingInfo ? $this->merchantHoldingInfo->toMap() : null;
        }
        if (null !== $this->merchantSettleInfo) {
            $res['merchant_settle_info'] = null !== $this->merchantSettleInfo ? $this->merchantSettleInfo->toMap() : null;
        }
        if (null !== $this->payChannel) {
            $res['pay_channel'] = $this->payChannel;
        }
        if (null !== $this->role) {
            $res['role'] = $this->role;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RegisterAntchainAtoMerchantexpandMerchantRequest
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
        if (isset($map['company_info'])) {
            $model->companyInfo = CompanyInfo::fromMap($map['company_info']);
        }
        if (isset($map['legal_info'])) {
            $model->legalInfo = LegalInfo::fromMap($map['legal_info']);
        }
        if (isset($map['application_info'])) {
            $model->applicationInfo = ApplicationInfo::fromMap($map['application_info']);
        }
        if (isset($map['expand_mode'])) {
            $model->expandMode = $map['expand_mode'];
        }
        if (isset($map['sub_tenant_id'])) {
            $model->subTenantId = $map['sub_tenant_id'];
        }
        if (isset($map['merchant_holding_info'])) {
            $model->merchantHoldingInfo = MerchantHoldingInfo::fromMap($map['merchant_holding_info']);
        }
        if (isset($map['merchant_settle_info'])) {
            $model->merchantSettleInfo = MerchantSettleInfo::fromMap($map['merchant_settle_info']);
        }
        if (isset($map['pay_channel'])) {
            $model->payChannel = $map['pay_channel'];
        }
        if (isset($map['role'])) {
            $model->role = $map['role'];
        }

        return $model;
    }
}
