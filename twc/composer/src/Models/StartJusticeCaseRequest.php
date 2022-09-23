<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class StartJusticeCaseRequest extends Model
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

    // 案件Id,创建案件返回的id
    /**
     * @var int
     */
    public $caseId;

    // 处置端租户ID
    /**
     * @var string
     */
    public $isvTenantId;

    // 处置方式
    // JUDICIAL_MEDIATION-司法调解
    /**
     * @var string
     */
    public $judicialBizType;

    // 司法调解基础参数, 当处置方式为5, 必填.
    /**
     * @var JudicialMediationBaseParamInfo
     */
    public $judicialMediationParam;

    // 调解沟通联系人(如果不传则使用租户维度的配置信息)
    /**
     * @var ContactInfo
     */
    public $contactInfo;

    // 调解回款银行账户(如果不传则使用租户维度的配置信息)
    /**
     * @var BankAccountInfo
     */
    public $bankAccountInfo;
    protected $_name = [
        'authToken'              => 'auth_token',
        'productInstanceId'      => 'product_instance_id',
        'caseId'                 => 'case_id',
        'isvTenantId'            => 'isv_tenant_id',
        'judicialBizType'        => 'judicial_biz_type',
        'judicialMediationParam' => 'judicial_mediation_param',
        'contactInfo'            => 'contact_info',
        'bankAccountInfo'        => 'bank_account_info',
    ];

    public function validate()
    {
        Model::validateRequired('caseId', $this->caseId, true);
        Model::validateRequired('isvTenantId', $this->isvTenantId, true);
        Model::validateRequired('judicialBizType', $this->judicialBizType, true);
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
        if (null !== $this->caseId) {
            $res['case_id'] = $this->caseId;
        }
        if (null !== $this->isvTenantId) {
            $res['isv_tenant_id'] = $this->isvTenantId;
        }
        if (null !== $this->judicialBizType) {
            $res['judicial_biz_type'] = $this->judicialBizType;
        }
        if (null !== $this->judicialMediationParam) {
            $res['judicial_mediation_param'] = null !== $this->judicialMediationParam ? $this->judicialMediationParam->toMap() : null;
        }
        if (null !== $this->contactInfo) {
            $res['contact_info'] = null !== $this->contactInfo ? $this->contactInfo->toMap() : null;
        }
        if (null !== $this->bankAccountInfo) {
            $res['bank_account_info'] = null !== $this->bankAccountInfo ? $this->bankAccountInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartJusticeCaseRequest
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
        if (isset($map['case_id'])) {
            $model->caseId = $map['case_id'];
        }
        if (isset($map['isv_tenant_id'])) {
            $model->isvTenantId = $map['isv_tenant_id'];
        }
        if (isset($map['judicial_biz_type'])) {
            $model->judicialBizType = $map['judicial_biz_type'];
        }
        if (isset($map['judicial_mediation_param'])) {
            $model->judicialMediationParam = JudicialMediationBaseParamInfo::fromMap($map['judicial_mediation_param']);
        }
        if (isset($map['contact_info'])) {
            $model->contactInfo = ContactInfo::fromMap($map['contact_info']);
        }
        if (isset($map['bank_account_info'])) {
            $model->bankAccountInfo = BankAccountInfo::fromMap($map['bank_account_info']);
        }

        return $model;
    }
}
