<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class QuerySecurityAnswerResponse extends Model
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

    // 代表风险等级和建议的处置结论，PASS：安全无风险，BLOCK：绝对风险，建议直接拦截，SECURITY_ANSWER：泛风险，回答内容存在敏感要素
    /**
     * @var string
     */
    public $actionCode;

    // 风险标签
    /**
     * @var LabelModel[]
     */
    public $labels;

    // 命中的自定义黑词列表
    /**
     * @var string[]
     */
    public $customizeRiskWord;

    // 针对流式输入的处理状态，针对流式输入的处理状态，当请求参数 flowDetect=Y 时返回，结果信息如下：
    // 1. processing：等待处理中，暂无风险检测结果，可能是输入的文本信息不足一句
    // 2. done：处理完成，请参考actionCode及对应的风险标签信息
    /**
     * @var string
     */
    public $flowProcessState;

    // 流式内容ID
    /**
     * @var string
     */
    public $flowMsgId;

    // 表示是同一个Q&A
    /**
     * @var string
     */
    public $messageId;

    // 兜底话术
    /**
     * @var string
     */
    public $securityAnswer;
    protected $_name = [
        'reqMsgId'          => 'req_msg_id',
        'resultCode'        => 'result_code',
        'resultMsg'         => 'result_msg',
        'actionCode'        => 'action_code',
        'labels'            => 'labels',
        'customizeRiskWord' => 'customize_risk_word',
        'flowProcessState'  => 'flow_process_state',
        'flowMsgId'         => 'flow_msg_id',
        'messageId'         => 'message_id',
        'securityAnswer'    => 'security_answer',
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
        if (null !== $this->actionCode) {
            $res['action_code'] = $this->actionCode;
        }
        if (null !== $this->labels) {
            $res['labels'] = [];
            if (null !== $this->labels && \is_array($this->labels)) {
                $n = 0;
                foreach ($this->labels as $item) {
                    $res['labels'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->customizeRiskWord) {
            $res['customize_risk_word'] = $this->customizeRiskWord;
        }
        if (null !== $this->flowProcessState) {
            $res['flow_process_state'] = $this->flowProcessState;
        }
        if (null !== $this->flowMsgId) {
            $res['flow_msg_id'] = $this->flowMsgId;
        }
        if (null !== $this->messageId) {
            $res['message_id'] = $this->messageId;
        }
        if (null !== $this->securityAnswer) {
            $res['security_answer'] = $this->securityAnswer;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySecurityAnswerResponse
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
        if (isset($map['action_code'])) {
            $model->actionCode = $map['action_code'];
        }
        if (isset($map['labels'])) {
            if (!empty($map['labels'])) {
                $model->labels = [];
                $n             = 0;
                foreach ($map['labels'] as $item) {
                    $model->labels[$n++] = null !== $item ? LabelModel::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['customize_risk_word'])) {
            if (!empty($map['customize_risk_word'])) {
                $model->customizeRiskWord = $map['customize_risk_word'];
            }
        }
        if (isset($map['flow_process_state'])) {
            $model->flowProcessState = $map['flow_process_state'];
        }
        if (isset($map['flow_msg_id'])) {
            $model->flowMsgId = $map['flow_msg_id'];
        }
        if (isset($map['message_id'])) {
            $model->messageId = $map['message_id'];
        }
        if (isset($map['security_answer'])) {
            $model->securityAnswer = $map['security_answer'];
        }

        return $model;
    }
}
