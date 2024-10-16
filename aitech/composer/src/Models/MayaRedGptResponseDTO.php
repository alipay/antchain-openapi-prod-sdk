<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class MayaRedGptResponseDTO extends Model
{
    // 消息的ID
    /**
     * @example 123123
     *
     * @var string
     */
    public $messageId;

    // 请求ID
    /**
     * @example 4564546
     *
     * @var string
     */
    public $requestId;

    // 会话ID
    /**
     * @example 312414124
     *
     * @var string
     */
    public $sessionId;

    // 应答内容
    /**
     * @example 你可以问我信息安全的问题
     *
     * @var string
     */
    public $answer;

    // 应答内容格式
    /**
     * @example PLAINTEXT
     *
     * @var string
     */
    public $answerFormat;

    // 是否回答结束
    /**
     * @example true, false
     *
     * @var bool
     */
    public $answerEnd;

    // 是否问题有风险
    /**
     * @example true, false
     *
     * @var bool
     */
    public $safe;
    protected $_name = [
        'messageId'    => 'message_id',
        'requestId'    => 'request_id',
        'sessionId'    => 'session_id',
        'answer'       => 'answer',
        'answerFormat' => 'answer_format',
        'answerEnd'    => 'answer_end',
        'safe'         => 'safe',
    ];

    public function validate()
    {
        Model::validateRequired('messageId', $this->messageId, true);
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('sessionId', $this->sessionId, true);
        Model::validateRequired('answer', $this->answer, true);
        Model::validateRequired('answerFormat', $this->answerFormat, true);
        Model::validateRequired('answerEnd', $this->answerEnd, true);
        Model::validateRequired('safe', $this->safe, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->messageId) {
            $res['message_id'] = $this->messageId;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->sessionId) {
            $res['session_id'] = $this->sessionId;
        }
        if (null !== $this->answer) {
            $res['answer'] = $this->answer;
        }
        if (null !== $this->answerFormat) {
            $res['answer_format'] = $this->answerFormat;
        }
        if (null !== $this->answerEnd) {
            $res['answer_end'] = $this->answerEnd;
        }
        if (null !== $this->safe) {
            $res['safe'] = $this->safe;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MayaRedGptResponseDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['message_id'])) {
            $model->messageId = $map['message_id'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['session_id'])) {
            $model->sessionId = $map['session_id'];
        }
        if (isset($map['answer'])) {
            $model->answer = $map['answer'];
        }
        if (isset($map['answer_format'])) {
            $model->answerFormat = $map['answer_format'];
        }
        if (isset($map['answer_end'])) {
            $model->answerEnd = $map['answer_end'];
        }
        if (isset($map['safe'])) {
            $model->safe = $map['safe'];
        }

        return $model;
    }
}
