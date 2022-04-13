<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class PushFlowRuleResponse extends Model
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

    // 是否灰度环境
    /**
     * @var bool
     */
    public $gray;

    // 推送结果
    /**
     * @var PushRuleResult[]
     */
    public $ruleResultList;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'gray'           => 'gray',
        'ruleResultList' => 'rule_result_list',
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
        if (null !== $this->gray) {
            $res['gray'] = $this->gray;
        }
        if (null !== $this->ruleResultList) {
            $res['rule_result_list'] = [];
            if (null !== $this->ruleResultList && \is_array($this->ruleResultList)) {
                $n = 0;
                foreach ($this->ruleResultList as $item) {
                    $res['rule_result_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushFlowRuleResponse
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
        if (isset($map['gray'])) {
            $model->gray = $map['gray'];
        }
        if (isset($map['rule_result_list'])) {
            if (!empty($map['rule_result_list'])) {
                $model->ruleResultList = [];
                $n                     = 0;
                foreach ($map['rule_result_list'] as $item) {
                    $model->ruleResultList[$n++] = null !== $item ? PushRuleResult::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
