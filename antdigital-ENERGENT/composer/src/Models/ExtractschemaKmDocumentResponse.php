<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGENT\Models;

use AlibabaCloud\Tea\Model;

class ExtractschemaKmDocumentResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'schemaJson' => 'schema_json',
        'fileContent' => 'file_content',
        'success' => 'success',
        'errorMsg' => 'error_msg',
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
        if (null !== $this->schemaJson) {
            $res['schema_json'] = $this->schemaJson;
        }
        if (null !== $this->fileContent) {
            $res['file_content'] = $this->fileContent;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->errorMsg) {
            $res['error_msg'] = $this->errorMsg;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExtractschemaKmDocumentResponse
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
        if(isset($map['schema_json'])){
            $model->schemaJson = $map['schema_json'];
        }
        if(isset($map['file_content'])){
            $model->fileContent = $map['file_content'];
        }
        if(isset($map['success'])){
            $model->success = $map['success'];
        }
        if(isset($map['error_msg'])){
            $model->errorMsg = $map['error_msg'];
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

    // 生成的本体Schema JSON
    /**
     * @var string
     */
    public $schemaJson;

    // 文件内容摘要
    /**
     * @var string
     */
    public $fileContent;

    // 是否成功
    /**
     * @var bool
     */
    public $success;

    // 失败原因
    /**
     * @var string
     */
    public $errorMsg;

}
