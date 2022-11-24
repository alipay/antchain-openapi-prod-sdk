<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_39810d10bae548fb846e0b015153901d\Models;

use AlibabaCloud\Tea\Model;

class GetAntchainBbpContractRuleResponse extends Model
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

    // 服务商
    /**
     * @var SpProvider
     */
    public $spProvider;

    // 规则明细
    /**
     * @var RuleDetail[]
     */
    public $ruleDetails;

    // 确认人
    /**
     * @var string
     */
    public $confirmer;

    // 确认状态
    /**
     * @var string
     */
    public $confirmStatus;

    // 确认时间
    /**
     * @var string
     */
    public $confirmDate;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'spProvider'    => 'sp_provider',
        'ruleDetails'   => 'rule_details',
        'confirmer'     => 'confirmer',
        'confirmStatus' => 'confirm_status',
        'confirmDate'   => 'confirm_date',
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
        if (null !== $this->spProvider) {
            $res['sp_provider'] = null !== $this->spProvider ? $this->spProvider->toMap() : null;
        }
        if (null !== $this->ruleDetails) {
            $res['rule_details'] = [];
            if (null !== $this->ruleDetails && \is_array($this->ruleDetails)) {
                $n = 0;
                foreach ($this->ruleDetails as $item) {
                    $res['rule_details'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->confirmer) {
            $res['confirmer'] = $this->confirmer;
        }
        if (null !== $this->confirmStatus) {
            $res['confirm_status'] = $this->confirmStatus;
        }
        if (null !== $this->confirmDate) {
            $res['confirm_date'] = $this->confirmDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetAntchainBbpContractRuleResponse
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
        if (isset($map['sp_provider'])) {
            $model->spProvider = SpProvider::fromMap($map['sp_provider']);
        }
        if (isset($map['rule_details'])) {
            if (!empty($map['rule_details'])) {
                $model->ruleDetails = [];
                $n                  = 0;
                foreach ($map['rule_details'] as $item) {
                    $model->ruleDetails[$n++] = null !== $item ? RuleDetail::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['confirmer'])) {
            $model->confirmer = $map['confirmer'];
        }
        if (isset($map['confirm_status'])) {
            $model->confirmStatus = $map['confirm_status'];
        }
        if (isset($map['confirm_date'])) {
            $model->confirmDate = $map['confirm_date'];
        }

        return $model;
    }
}
