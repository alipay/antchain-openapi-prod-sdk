<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGYTOOL\Models;

use AlibabaCloud\Tea\Model;

use AntChain\ENERGYTOOL\Models\DocumentInfoDTO;
use AntChain\ENERGYTOOL\Models\DocumentProcessingDataDTO;

class SyncKmDocumentResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'documentInfo' => 'document_info',
        'docMapId' => 'doc_map_id',
        'processedData' => 'processed_data',
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
        if (null !== $this->documentInfo) {
            $res['document_info'] = null !== $this->documentInfo ? $this->documentInfo->toMap() : null;
        }
        if (null !== $this->docMapId) {
            $res['doc_map_id'] = $this->docMapId;
        }
        if (null !== $this->processedData) {
            $res['processed_data'] = null !== $this->processedData ? $this->processedData->toMap() : null;
        }
        if (null !== $this->ossPreviewUrl) {
            $res['oss_preview_url'] = $this->ossPreviewUrl;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SyncKmDocumentResponse
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
        if(isset($map['document_info'])){
            $model->documentInfo = DocumentInfoDTO::fromMap($map['document_info']);
        }
        if(isset($map['doc_map_id'])){
            $model->docMapId = $map['doc_map_id'];
        }
        if(isset($map['processed_data'])){
            $model->processedData = DocumentProcessingDataDTO::fromMap($map['processed_data']);
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

    // 文档基础信息
    /**
     * @var DocumentInfoDTO
     */
    public $documentInfo;

    // 向量文档id
    /**
     * @var string
     */
    public $docMapId;

    // 加工后的文档数据
    /**
     * @var DocumentProcessingDataDTO
     */
    public $processedData;

    // oss预览地址
    /**
     * @var string
     */
    public $ossPreviewUrl;

}
