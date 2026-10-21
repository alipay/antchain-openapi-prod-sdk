<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGENT\Models;

use AlibabaCloud\Tea\Model;

class BatchimportKmDocumentResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'successCount' => 'success_count',
        'failedCount' => 'failed_count',
        'skipCount' => 'skip_count',
        'documents' => 'documents',
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
        if (null !== $this->successCount) {
            $res['success_count'] = $this->successCount;
        }
        if (null !== $this->failedCount) {
            $res['failed_count'] = $this->failedCount;
        }
        if (null !== $this->skipCount) {
            $res['skip_count'] = $this->skipCount;
        }
        if (null !== $this->documents) {
            $res['documents'] = $this->documents;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return BatchimportKmDocumentResponse
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
        if(isset($map['success_count'])){
            $model->successCount = $map['success_count'];
        }
        if(isset($map['failed_count'])){
            $model->failedCount = $map['failed_count'];
        }
        if(isset($map['skip_count'])){
            $model->skipCount = $map['skip_count'];
        }
        if(isset($map['documents'])){
            $model->documents = $map['documents'];
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

    // 成功数量
    /**
     * @var int
     */
    public $successCount;

    // 失败数量
    /**
     * @var int
     */
    public $failedCount;

    // 跳过数量(MD5重复)
    /**
     * @var int
     */
    public $skipCount;

    // 入库成功文档JSON数组(KbDocumentDTO字段定义见文档)
    /**
     * @var string
     */
    public $documents;

}
