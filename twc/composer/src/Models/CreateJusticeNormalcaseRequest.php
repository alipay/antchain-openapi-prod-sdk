<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateJusticeNormalcaseRequest extends Model
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

    // 业务类型
    // 1- 租赁
    // 2 - 金融
    /**
     * @var int
     */
    public $caseType;

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

    // 针对对应业务类型的证据要素补充.
    /**
     * @var string
     */
    public $caseBizElementInfo;

    // 当事人(申请人)ID, 案件填充信息返回
    /**
     * @var int
     */
    public $partyId;

    // 答辩人类型, 目前仅支持个人.
    // PERSON , 个人
    // ORG , 机构
    /**
     * @var string
     */
    public $pleaderType;

    // 答辩人(自然人)信息, 类型为个人时必填
    /**
     * @var JudicialPersonInfo
     */
    public $pleaderPersonInfo;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'caseReason'         => 'case_reason',
        'caseType'           => 'case_type',
        'externalBizId'      => 'external_biz_id',
        'caseDesc'           => 'case_desc',
        'caseBizElementInfo' => 'case_biz_element_info',
        'partyId'            => 'party_id',
        'pleaderType'        => 'pleader_type',
        'pleaderPersonInfo'  => 'pleader_person_info',
    ];

    public function validate()
    {
        Model::validateRequired('caseReason', $this->caseReason, true);
        Model::validateRequired('caseType', $this->caseType, true);
        Model::validateRequired('externalBizId', $this->externalBizId, true);
        Model::validateRequired('caseBizElementInfo', $this->caseBizElementInfo, true);
        Model::validateRequired('partyId', $this->partyId, true);
        Model::validateRequired('pleaderType', $this->pleaderType, true);
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
        if (null !== $this->caseType) {
            $res['case_type'] = $this->caseType;
        }
        if (null !== $this->externalBizId) {
            $res['external_biz_id'] = $this->externalBizId;
        }
        if (null !== $this->caseDesc) {
            $res['case_desc'] = $this->caseDesc;
        }
        if (null !== $this->caseBizElementInfo) {
            $res['case_biz_element_info'] = $this->caseBizElementInfo;
        }
        if (null !== $this->partyId) {
            $res['party_id'] = $this->partyId;
        }
        if (null !== $this->pleaderType) {
            $res['pleader_type'] = $this->pleaderType;
        }
        if (null !== $this->pleaderPersonInfo) {
            $res['pleader_person_info'] = null !== $this->pleaderPersonInfo ? $this->pleaderPersonInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateJusticeNormalcaseRequest
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
        if (isset($map['case_type'])) {
            $model->caseType = $map['case_type'];
        }
        if (isset($map['external_biz_id'])) {
            $model->externalBizId = $map['external_biz_id'];
        }
        if (isset($map['case_desc'])) {
            $model->caseDesc = $map['case_desc'];
        }
        if (isset($map['case_biz_element_info'])) {
            $model->caseBizElementInfo = $map['case_biz_element_info'];
        }
        if (isset($map['party_id'])) {
            $model->partyId = $map['party_id'];
        }
        if (isset($map['pleader_type'])) {
            $model->pleaderType = $map['pleader_type'];
        }
        if (isset($map['pleader_person_info'])) {
            $model->pleaderPersonInfo = JudicialPersonInfo::fromMap($map['pleader_person_info']);
        }

        return $model;
    }
}
