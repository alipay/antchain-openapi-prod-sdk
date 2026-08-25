<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ChatAiotdatalinkAntfinanceassistantResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'sessionId' => 'session_id',
        'extParams' => 'ext_params',
        'chatId' => 'chat_id',
        'response' => 'response',
        'score' => 'score',
        'responseTitle' => 'response_title',
        'responseCondition' => 'response_condition',
    ];
    public function validate() {}
    public function toMap() {
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
        if (null !== $this->sessionId) {
            $res['session_id'] = $this->sessionId;
        }
        if (null !== $this->extParams) {
            $res['ext_params'] = $this->extParams;
        }
        if (null !== $this->chatId) {
            $res['chat_id'] = $this->chatId;
        }
        if (null !== $this->response) {
            $res['response'] = $this->response;
        }
        if (null !== $this->score) {
            $res['score'] = $this->score;
        }
        if (null !== $this->responseTitle) {
            $res['response_title'] = $this->responseTitle;
        }
        if (null !== $this->responseCondition) {
            $res['response_condition'] = $this->responseCondition;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ChatAiotdatalinkAntfinanceassistantResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['session_id'])){
            $model->sessionId = $map['session_id'];
        }
        if(isset($map['ext_params'])){
            $model->extParams = $map['ext_params'];
        }
        if(isset($map['chat_id'])){
            $model->chatId = $map['chat_id'];
        }
        if(isset($map['response'])){
            $model->response = $map['response'];
        }
        if(isset($map['score'])){
            $model->score = $map['score'];
        }
        if(isset($map['response_title'])){
            $model->responseTitle = $map['response_title'];
        }
        if(isset($map['response_condition'])){
            $model->responseCondition = $map['response_condition'];
        }
        return $model;
    }
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

    // 会话ID,多轮场景需要回传
    /**
     * @var string
     */
    public $sessionId;

    // 扩展参数（JSON 字符串）
    /**
     * @var string
     */
    public $extParams;

    // 本轮对话唯一ID
    /**
     * @var string
     */
    public $chatId;

    // 响应文本
    /**
     * @var string
     */
    public $response;

    // 回复置信度分数
    /**
     * @var string
     */
    public $score;

    // 响应标题
    /**
     * @var string
     */
    public $responseTitle;

    // 回复生效的条件
    /**
     * @var string
     */
    public $responseCondition;

}
