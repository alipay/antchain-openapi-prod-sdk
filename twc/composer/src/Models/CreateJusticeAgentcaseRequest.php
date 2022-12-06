<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateJusticeAgentcaseRequest extends Model
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

    // 案由
    /**
     * @var string
     */
    public $caseReason;

    // 业务类型，LEASE- 租赁 ，HB_FINANCIAL - HB金融， 模板创建的其他业务类型
    /**
     * @var string
     */
    public $bizType;

    // 二级商户租户ID，八位字母
    /**
     * @var string
     */
    public $subTenantId;

    // 外部业务ID
    /**
     * @var string
     */
    public $externalBizId;

    // 业务描述,用于案件的补充描述; 没有则不填
    /**
     * @var string
     */
    public $caseDesc;

    // 根据案件要素模板对应提供要素信息
    /**
     * @var string
     */
    public $businessInfo;

    // 根据案件要素模板对应提供证据信息
    /**
     * @var string
     */
    public $evidenceInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'caseReason'        => 'case_reason',
        'bizType'           => 'biz_type',
        'subTenantId'       => 'sub_tenant_id',
        'externalBizId'     => 'external_biz_id',
        'caseDesc'          => 'case_desc',
        'businessInfo'      => 'business_info',
        'evidenceInfo'      => 'evidence_info',
    ];

    public function validate()
    {
        Model::validateRequired('caseReason', $this->caseReason, true);
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('subTenantId', $this->subTenantId, true);
        Model::validateRequired('externalBizId', $this->externalBizId, true);
        Model::validateRequired('businessInfo', $this->businessInfo, true);
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
        if (null !== $this->caseReason) {
            $res['case_reason'] = $this->caseReason;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->subTenantId) {
            $res['sub_tenant_id'] = $this->subTenantId;
        }
        if (null !== $this->externalBizId) {
            $res['external_biz_id'] = $this->externalBizId;
        }
        if (null !== $this->caseDesc) {
            $res['case_desc'] = $this->caseDesc;
        }
        if (null !== $this->businessInfo) {
            $res['business_info'] = $this->businessInfo;
        }
        if (null !== $this->evidenceInfo) {
            $res['evidence_info'] = $this->evidenceInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateJusticeAgentcaseRequest
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
        if (isset($map['case_reason'])) {
            $model->caseReason = $map['case_reason'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['sub_tenant_id'])) {
            $model->subTenantId = $map['sub_tenant_id'];
        }
        if (isset($map['external_biz_id'])) {
            $model->externalBizId = $map['external_biz_id'];
        }
        if (isset($map['case_desc'])) {
            $model->caseDesc = $map['case_desc'];
        }
        if (isset($map['business_info'])) {
            $model->businessInfo = $map['business_info'];
        }
        if (isset($map['evidence_info'])) {
            $model->evidenceInfo = $map['evidence_info'];
        }

        return $model;
    }
}
