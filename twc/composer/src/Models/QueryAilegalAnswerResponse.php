<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryAilegalAnswerResponse extends Model
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

    // 返回问题id，全局唯一
    /**
     * @var string
     */
    public $questionId;

    // 问题答案
    /**
     * @var string
     */
    public $answer;

    // 是否支持反馈(true 是,false 否)
    /**
     * @var bool
     */
    public $canFeedback;

    // 是否回答结束(true 是,false 否)
    /**
     * @var bool
     */
    public $end;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'questionId'  => 'question_id',
        'answer'      => 'answer',
        'canFeedback' => 'can_feedback',
        'end'         => 'end',
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
        if (null !== $this->questionId) {
            $res['question_id'] = $this->questionId;
        }
        if (null !== $this->answer) {
            $res['answer'] = $this->answer;
        }
        if (null !== $this->canFeedback) {
            $res['can_feedback'] = $this->canFeedback;
        }
        if (null !== $this->end) {
            $res['end'] = $this->end;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAilegalAnswerResponse
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
        if (isset($map['question_id'])) {
            $model->questionId = $map['question_id'];
        }
        if (isset($map['answer'])) {
            $model->answer = $map['answer'];
        }
        if (isset($map['can_feedback'])) {
            $model->canFeedback = $map['can_feedback'];
        }
        if (isset($map['end'])) {
            $model->end = $map['end'];
        }

        return $model;
    }
}
