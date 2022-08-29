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

    // 处置方式, 5-司法调解
    /**
     * @var int
     */
    public $judicialBizType;

    // 司法调解基础参数, 当处置方式为5, 必填.
    /**
     * @var JudicialMediationBaseParamInfo
     */
    public $judiciallMediationParam;
    protected $_name = [
        'authToken'               => 'auth_token',
        'productInstanceId'       => 'product_instance_id',
        'caseId'                  => 'case_id',
        'isvTenantId'             => 'isv_tenant_id',
        'judicialBizType'         => 'judicial_biz_type',
        'judiciallMediationParam' => 'judiciall_mediation_param',
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
        if (null !== $this->judiciallMediationParam) {
            $res['judiciall_mediation_param'] = null !== $this->judiciallMediationParam ? $this->judiciallMediationParam->toMap() : null;
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
        if (isset($map['judiciall_mediation_param'])) {
            $model->judiciallMediationParam = JudicialMediationBaseParamInfo::fromMap($map['judiciall_mediation_param']);
        }

        return $model;
    }
}
