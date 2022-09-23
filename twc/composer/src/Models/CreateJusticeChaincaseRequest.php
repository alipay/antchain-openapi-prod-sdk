<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateJusticeChaincaseRequest extends Model
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
    // LEASE- 租赁
    // HB_FINANCIAL - HB金融,其他不支持
    /**
     * @var string
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

    // 当事人(申请人)ID, 案件填充信息返回
    /**
     * @var int
     */
    public $partyId;

    // 全流程存证信息
    /**
     * @var NotaryFlowDetailQueryReq[]
     */
    public $notaryFlowInfos;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'caseReason'        => 'case_reason',
        'caseType'          => 'case_type',
        'externalBizId'     => 'external_biz_id',
        'caseDesc'          => 'case_desc',
        'partyId'           => 'party_id',
        'notaryFlowInfos'   => 'notary_flow_infos',
    ];

    public function validate()
    {
        Model::validateRequired('caseReason', $this->caseReason, true);
        Model::validateRequired('caseType', $this->caseType, true);
        Model::validateRequired('externalBizId', $this->externalBizId, true);
        Model::validateRequired('partyId', $this->partyId, true);
        Model::validateRequired('notaryFlowInfos', $this->notaryFlowInfos, true);
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
        if (null !== $this->partyId) {
            $res['party_id'] = $this->partyId;
        }
        if (null !== $this->notaryFlowInfos) {
            $res['notary_flow_infos'] = [];
            if (null !== $this->notaryFlowInfos && \is_array($this->notaryFlowInfos)) {
                $n = 0;
                foreach ($this->notaryFlowInfos as $item) {
                    $res['notary_flow_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateJusticeChaincaseRequest
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
        if (isset($map['party_id'])) {
            $model->partyId = $map['party_id'];
        }
        if (isset($map['notary_flow_infos'])) {
            if (!empty($map['notary_flow_infos'])) {
                $model->notaryFlowInfos = [];
                $n                      = 0;
                foreach ($map['notary_flow_infos'] as $item) {
                    $model->notaryFlowInfos[$n++] = null !== $item ? NotaryFlowDetailQueryReq::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
