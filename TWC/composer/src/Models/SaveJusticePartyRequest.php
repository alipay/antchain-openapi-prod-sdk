<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class SaveJusticePartyRequest extends Model
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

    // 委托申请方配置ID
    /**
     * @var int
     */
    public $partyId;

    // 委托申请方类型,目前仅支持企业.
    // 个人: PERSON
    // 企业:ORG
    /**
     * @var string
     */
    public $partyType;

    // 企业信息实体;
    // 当申请方类型为企业时,该字段必填;
    /**
     * @var JudicialOrgInfo
     */
    public $partyOrganizationInfo;

    // 案件协同工作联系人信息实体
    /**
     * @var JudicialPersonInfo
     */
    public $coordinatorPersonInfo;

    // 案件协同人银行账户信息
    /**
     * @var JudicialBankInfo
     */
    public $coordinatorBankInfo;

    // adsada
    /**
     * @var string
     */
    public $subTenantId;

    // 默认为空,true表示为二级商户创建或者修改申请人,sub_tenant_id不能为空,
    // false表示为当前商户创建或者修改申请人,sub_tenant_id为空
    /**
     * @var bool
     */
    public $agentCreateParty;
    protected $_name = [
        'authToken'             => 'auth_token',
        'productInstanceId'     => 'product_instance_id',
        'partyId'               => 'party_id',
        'partyType'             => 'party_type',
        'partyOrganizationInfo' => 'party_organization_info',
        'coordinatorPersonInfo' => 'coordinator_person_info',
        'coordinatorBankInfo'   => 'coordinator_bank_info',
        'subTenantId'           => 'sub_tenant_id',
        'agentCreateParty'      => 'agent_create_party',
    ];

    public function validate()
    {
        Model::validateRequired('partyType', $this->partyType, true);
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
        if (null !== $this->partyId) {
            $res['party_id'] = $this->partyId;
        }
        if (null !== $this->partyType) {
            $res['party_type'] = $this->partyType;
        }
        if (null !== $this->partyOrganizationInfo) {
            $res['party_organization_info'] = null !== $this->partyOrganizationInfo ? $this->partyOrganizationInfo->toMap() : null;
        }
        if (null !== $this->coordinatorPersonInfo) {
            $res['coordinator_person_info'] = null !== $this->coordinatorPersonInfo ? $this->coordinatorPersonInfo->toMap() : null;
        }
        if (null !== $this->coordinatorBankInfo) {
            $res['coordinator_bank_info'] = null !== $this->coordinatorBankInfo ? $this->coordinatorBankInfo->toMap() : null;
        }
        if (null !== $this->subTenantId) {
            $res['sub_tenant_id'] = $this->subTenantId;
        }
        if (null !== $this->agentCreateParty) {
            $res['agent_create_party'] = $this->agentCreateParty;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaveJusticePartyRequest
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
        if (isset($map['party_id'])) {
            $model->partyId = $map['party_id'];
        }
        if (isset($map['party_type'])) {
            $model->partyType = $map['party_type'];
        }
        if (isset($map['party_organization_info'])) {
            $model->partyOrganizationInfo = JudicialOrgInfo::fromMap($map['party_organization_info']);
        }
        if (isset($map['coordinator_person_info'])) {
            $model->coordinatorPersonInfo = JudicialPersonInfo::fromMap($map['coordinator_person_info']);
        }
        if (isset($map['coordinator_bank_info'])) {
            $model->coordinatorBankInfo = JudicialBankInfo::fromMap($map['coordinator_bank_info']);
        }
        if (isset($map['sub_tenant_id'])) {
            $model->subTenantId = $map['sub_tenant_id'];
        }
        if (isset($map['agent_create_party'])) {
            $model->agentCreateParty = $map['agent_create_party'];
        }

        return $model;
    }
}
