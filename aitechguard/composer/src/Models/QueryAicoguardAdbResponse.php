<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECHGUARD\Models;

use AlibabaCloud\Tea\Model;

class QueryAicoguardAdbResponse extends Model
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

    // 查询向量库的提问内容
    /**
     * @var string
     */
    public $question;

    // 向量库匹配到的代答结果
    /**
     * @var string
     */
    public $answer;

    // 本次匹配分数
    /**
     * @var string
     */
    public $score;

    // 本次查询adb的请求id
    /**
     * @var string
     */
    public $requestId;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'question'   => 'question',
        'answer'     => 'answer',
        'score'      => 'score',
        'requestId'  => 'request_id',
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
        if (null !== $this->question) {
            $res['question'] = $this->question;
        }
        if (null !== $this->answer) {
            $res['answer'] = $this->answer;
        }
        if (null !== $this->score) {
            $res['score'] = $this->score;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAicoguardAdbResponse
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
        if (isset($map['question'])) {
            $model->question = $map['question'];
        }
        if (isset($map['answer'])) {
            $model->answer = $map['answer'];
        }
        if (isset($map['score'])) {
            $model->score = $map['score'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }

        return $model;
    }
}
