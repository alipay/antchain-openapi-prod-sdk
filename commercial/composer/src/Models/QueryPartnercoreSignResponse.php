<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class QueryPartnercoreSignResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 合同信息
    /**
     * @var PartnerPolicyRelation
     */
    public $partnerPolicyRelation;

    // 政策信息扩展
    /**
     * @var PolicyDTO
     */
    public $policyDto;
    protected $_name = [
        'reqMsgId'              => 'req_msg_id',
        'resultCode'            => 'result_code',
        'resultMsg'             => 'result_msg',
        'partnerPolicyRelation' => 'partner_policy_relation',
        'policyDto'             => 'policy_dto',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->partnerPolicyRelation) {
            $res['partner_policy_relation'] = null !== $this->partnerPolicyRelation ? $this->partnerPolicyRelation->toMap() : null;
        }
        if (null !== $this->policyDto) {
            $res['policy_dto'] = null !== $this->policyDto ? $this->policyDto->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryPartnercoreSignResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['partner_policy_relation'])) {
            $model->partnerPolicyRelation = PartnerPolicyRelation::fromMap($map['partner_policy_relation']);
        }
        if (isset($map['policy_dto'])) {
            $model->policyDto = PolicyDTO::fromMap($map['policy_dto']);
        }

        return $model;
    }
}
