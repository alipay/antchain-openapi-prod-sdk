<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class CreateInnerMerchantpayexpandRequest extends Model
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

    // 租户ID
    /**
     * @var string
     */
    public $tenantId;

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

    // 是否直接提交
    // SUBMITTED 直接提交
    // STAGE 暂存
    /**
     * @var string
     */
    public $submit;

    // 进件模式
    // DIRECT(直连进件)
    // AGENT(代理进件)
    /**
     * @var string
     */
    public $expandMode;

    // expand_mode=_AGENT_ 必填
    /**
     * @var string
     */
    public $subTenantId;

    // 操作人名称
    /**
     * @var string
     */
    public $userName;

    // 第一次暂存或保存可以不传，后端直接生成
    /**
     * @var string
     */
    public $payExpandId;

    // true允许重复进件，false不允许重复进件
    /**
     * @var bool
     */
    public $allowDuplicate;

    // 支付渠道
    // JDPAY
    // ALIPAY
    /**
     * @var string
     */
    public $payChannel;

    // 京东进件控股信息
    /**
     * @var MerchantHoldingInfo
     */
    public $merchantHoldingInfo;

    // 京东进件结算信息
    /**
     * @var MerchantSettleInfo
     */
    public $merchantSettleInfo;

    // traceId
    /**
     * @var string
     */
    public $traceId;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'tenantId'            => 'tenant_id',
        'companyInfo'         => 'company_info',
        'legalInfo'           => 'legal_info',
        'applicationInfo'     => 'application_info',
        'submit'              => 'submit',
        'expandMode'          => 'expand_mode',
        'subTenantId'         => 'sub_tenant_id',
        'userName'            => 'user_name',
        'payExpandId'         => 'pay_expand_id',
        'allowDuplicate'      => 'allow_duplicate',
        'payChannel'          => 'pay_channel',
        'merchantHoldingInfo' => 'merchant_holding_info',
        'merchantSettleInfo'  => 'merchant_settle_info',
        'traceId'             => 'trace_id',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('companyInfo', $this->companyInfo, true);
        Model::validateRequired('legalInfo', $this->legalInfo, true);
        Model::validateRequired('applicationInfo', $this->applicationInfo, true);
        Model::validateRequired('submit', $this->submit, true);
        Model::validateRequired('expandMode', $this->expandMode, true);
        Model::validateRequired('userName', $this->userName, true);
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
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
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
        if (null !== $this->submit) {
            $res['submit'] = $this->submit;
        }
        if (null !== $this->expandMode) {
            $res['expand_mode'] = $this->expandMode;
        }
        if (null !== $this->subTenantId) {
            $res['sub_tenant_id'] = $this->subTenantId;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->payExpandId) {
            $res['pay_expand_id'] = $this->payExpandId;
        }
        if (null !== $this->allowDuplicate) {
            $res['allow_duplicate'] = $this->allowDuplicate;
        }
        if (null !== $this->payChannel) {
            $res['pay_channel'] = $this->payChannel;
        }
        if (null !== $this->merchantHoldingInfo) {
            $res['merchant_holding_info'] = null !== $this->merchantHoldingInfo ? $this->merchantHoldingInfo->toMap() : null;
        }
        if (null !== $this->merchantSettleInfo) {
            $res['merchant_settle_info'] = null !== $this->merchantSettleInfo ? $this->merchantSettleInfo->toMap() : null;
        }
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateInnerMerchantpayexpandRequest
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
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
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
        if (isset($map['submit'])) {
            $model->submit = $map['submit'];
        }
        if (isset($map['expand_mode'])) {
            $model->expandMode = $map['expand_mode'];
        }
        if (isset($map['sub_tenant_id'])) {
            $model->subTenantId = $map['sub_tenant_id'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['pay_expand_id'])) {
            $model->payExpandId = $map['pay_expand_id'];
        }
        if (isset($map['allow_duplicate'])) {
            $model->allowDuplicate = $map['allow_duplicate'];
        }
        if (isset($map['pay_channel'])) {
            $model->payChannel = $map['pay_channel'];
        }
        if (isset($map['merchant_holding_info'])) {
            $model->merchantHoldingInfo = MerchantHoldingInfo::fromMap($map['merchant_holding_info']);
        }
        if (isset($map['merchant_settle_info'])) {
            $model->merchantSettleInfo = MerchantSettleInfo::fromMap($map['merchant_settle_info']);
        }
        if (isset($map['trace_id'])) {
            $model->traceId = $map['trace_id'];
        }

        return $model;
    }
}
