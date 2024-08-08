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
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId'          => 'tenant_id',
        'companyInfo'       => 'company_info',
        'legalInfo'         => 'legal_info',
        'applicationInfo'   => 'application_info',
        'submit'            => 'submit',
        'expandMode'        => 'expand_mode',
        'subTenantId'       => 'sub_tenant_id',
        'userName'          => 'user_name',
        'payExpandId'       => 'pay_expand_id',
        'allowDuplicate'    => 'allow_duplicate',
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

        return $model;
    }
}
