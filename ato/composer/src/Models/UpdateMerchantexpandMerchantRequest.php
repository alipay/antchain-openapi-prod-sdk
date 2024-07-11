<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class UpdateMerchantexpandMerchantRequest extends Model
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
     * @var CompanyInfoUpdate
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

    // 进件流水号
    /**
     * @var string
     */
    public $payExpandId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'companyInfo'       => 'company_info',
        'legalInfo'         => 'legal_info',
        'applicationInfo'   => 'application_info',
        'expandMode'        => 'expand_mode',
        'subTenantId'       => 'sub_tenant_id',
        'payExpandId'       => 'pay_expand_id',
    ];

    public function validate()
    {
        Model::validateRequired('companyInfo', $this->companyInfo, true);
        Model::validateRequired('legalInfo', $this->legalInfo, true);
        Model::validateRequired('applicationInfo', $this->applicationInfo, true);
        Model::validateRequired('expandMode', $this->expandMode, true);
        Model::validateRequired('payExpandId', $this->payExpandId, true);
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
        if (null !== $this->payExpandId) {
            $res['pay_expand_id'] = $this->payExpandId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateMerchantexpandMerchantRequest
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
            $model->companyInfo = CompanyInfoUpdate::fromMap($map['company_info']);
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
        if (isset($map['pay_expand_id'])) {
            $model->payExpandId = $map['pay_expand_id'];
        }

        return $model;
    }
}
