<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class UploadBlockchainBotIotsuccessProductKnowledgebaseContentResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'kbId' => 'kb_id',
        'docId' => 'doc_id',
        'parseTaskId' => 'parse_task_id',
        'status' => 'status',
        'errorMessage' => 'error_message',
    ];
    public function validate() {
        Model::validateRequired('kbId', $this->kbId, true);
        Model::validateRequired('docId', $this->docId, true);
        Model::validateRequired('parseTaskId', $this->parseTaskId, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('errorMessage', $this->errorMessage, true);
    }
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
        if (null !== $this->kbId) {
            $res['kb_id'] = $this->kbId;
        }
        if (null !== $this->docId) {
            $res['doc_id'] = $this->docId;
        }
        if (null !== $this->parseTaskId) {
            $res['parse_task_id'] = $this->parseTaskId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->errorMessage) {
            $res['error_message'] = $this->errorMessage;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UploadBlockchainBotIotsuccessProductKnowledgebaseContentResponse
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
        if(isset($map['kb_id'])){
            $model->kbId = $map['kb_id'];
        }
        if(isset($map['doc_id'])){
            $model->docId = $map['doc_id'];
        }
        if(isset($map['parse_task_id'])){
            $model->parseTaskId = $map['parse_task_id'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['error_message'])){
            $model->errorMessage = $map['error_message'];
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

    /**
     * @var string
     */
    public $kbId;

    // 已有ai_knowledge_document.doc_id
    /**
     * @var string
     */
    public $docId;

    // 已有解析任务关联，接纳时可能尚未分配
    /**
     * @var string
     */
    public $parseTaskId;

    // 枚举:PENDING,PROCESSING,COMPLETED,FAILED
    /**
     * @var string
     */
    public $status;

    // 现有文档error_message，脱敏返回
    /**
     * @var string
     */
    public $errorMessage;

}
