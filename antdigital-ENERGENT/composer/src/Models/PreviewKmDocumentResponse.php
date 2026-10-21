<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGENT\Models;

use AlibabaCloud\Tea\Model;

class PreviewKmDocumentResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'documentId' => 'document_id',
        'documentName' => 'document_name',
        'fileType' => 'file_type',
        'content' => 'content',
        'ossPreviewUrl' => 'oss_preview_url',
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
        if (null !== $this->documentId) {
            $res['document_id'] = $this->documentId;
        }
        if (null !== $this->documentName) {
            $res['document_name'] = $this->documentName;
        }
        if (null !== $this->fileType) {
            $res['file_type'] = $this->fileType;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->ossPreviewUrl) {
            $res['oss_preview_url'] = $this->ossPreviewUrl;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PreviewKmDocumentResponse
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
        if(isset($map['document_id'])){
            $model->documentId = $map['document_id'];
        }
        if(isset($map['document_name'])){
            $model->documentName = $map['document_name'];
        }
        if(isset($map['file_type'])){
            $model->fileType = $map['file_type'];
        }
        if(isset($map['content'])){
            $model->content = $map['content'];
        }
        if(isset($map['oss_preview_url'])){
            $model->ossPreviewUrl = $map['oss_preview_url'];
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

    // 文档ID
    /**
     * @var string
     */
    public $documentId;

    // 文档名
    /**
     * @var string
     */
    public $documentName;

    // 文件类型
    /**
     * @var string
     */
    public $fileType;

    // 文档Markdown正文
    /**
     * @var string
     */
    public $content;

    // OSS预览地址
    /**
     * @var string
     */
    public $ossPreviewUrl;

}
