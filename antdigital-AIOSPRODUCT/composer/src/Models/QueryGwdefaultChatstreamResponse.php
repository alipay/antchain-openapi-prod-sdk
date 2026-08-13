<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AIOSPRODUCT\Models;

use AlibabaCloud\Tea\Model;

class QueryGwdefaultChatstreamResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'sessionId' => 'session_id',
        'success' => 'success',
        'type' => 'type',
        'queryId' => 'query_id',
        'hasStream' => 'has_stream',
        'chatList' => 'chat_list',
        'sugList' => 'sug_list',
        'refList' => 'ref_list',
        'footerList' => 'footer_list',
        'callBackInfo' => 'call_back_info',
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
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->queryId) {
            $res['query_id'] = $this->queryId;
        }
        if (null !== $this->hasStream) {
            $res['has_stream'] = $this->hasStream;
        }
        if (null !== $this->chatList) {
            $res['chat_list'] = $this->chatList;
        }
        if (null !== $this->sugList) {
            $res['sug_list'] = $this->sugList;
        }
        if (null !== $this->refList) {
            $res['ref_list'] = $this->refList;
        }
        if (null !== $this->footerList) {
            $res['footer_list'] = $this->footerList;
        }
        if (null !== $this->callBackInfo) {
            $res['call_back_info'] = $this->callBackInfo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryGwdefaultChatstreamResponse
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
        if(isset($map['success'])){
            $model->success = $map['success'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['query_id'])){
            $model->queryId = $map['query_id'];
        }
        if(isset($map['has_stream'])){
            $model->hasStream = $map['has_stream'];
        }
        if(isset($map['chat_list'])){
            $model->chatList = $map['chat_list'];
        }
        if(isset($map['sug_list'])){
            $model->sugList = $map['sug_list'];
        }
        if(isset($map['ref_list'])){
            $model->refList = $map['ref_list'];
        }
        if(isset($map['footer_list'])){
            $model->footerList = $map['footer_list'];
        }
        if(isset($map['call_back_info'])){
            $model->callBackInfo = $map['call_back_info'];
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

    // 会话id
    /**
     * @var string
     */
    public $sessionId;

    // 整体成功标志，默认 true
    /**
     * @var bool
     */
    public $success;

    // 固定chat_result
    /**
     * @var string
     */
    public $type;

    // 查询 ID；多为空串
    /**
     * @var string
     */
    public $queryId;

    // true=流式中间批次；false=收尾批次
    /**
     * @var bool
     */
    public $hasStream;

    // 正文流
    /**
     * @var string
     */
    public $chatList;

    // 推荐问题（SUG），仅收尾批次非空
    /**
     * @var string
     */
    public $sugList;

    // 全量引用（REF），仅收尾批次非空
    /**
     * @var string
     */
    public $refList;

    // 页脚卡片（FOOTER_CARD 已改写为 CARD），仅收尾批次非空
    /**
     * @var string
     */
    public $footerList;

    // token/耗时信息；仅携带 callbackInfo 的批次才有
    /**
     * @var string
     */
    public $callBackInfo;

}
