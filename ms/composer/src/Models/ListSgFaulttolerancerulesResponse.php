<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class ListSgFaulttolerancerulesResponse extends Model
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

    // rule列表
    /**
     * @var FaultToleranceRuleModel[]
     */
    public $ruleModels;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'ruleModels' => 'rule_models',
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
        if (null !== $this->ruleModels) {
            $res['rule_models'] = [];
            if (null !== $this->ruleModels && \is_array($this->ruleModels)) {
                $n = 0;
                foreach ($this->ruleModels as $item) {
                    $res['rule_models'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListSgFaulttolerancerulesResponse
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
        if (isset($map['rule_models'])) {
            if (!empty($map['rule_models'])) {
                $model->ruleModels = [];
                $n                 = 0;
                foreach ($map['rule_models'] as $item) {
                    $model->ruleModels[$n++] = null !== $item ? FaultToleranceRuleModel::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
