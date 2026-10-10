<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class ConfirmBlockchainBotIotagentWorkspaceResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'fileId' => 'file_id',
        'fileName' => 'file_name',
        'mediaType' => 'media_type',
        'sizeBytes' => 'size_bytes',
        'createdAt' => 'created_at',
    ];
    public function validate() {
        Model::validatePattern('createdAt', $this->createdAt, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->mediaType) {
            $res['media_type'] = $this->mediaType;
        }
        if (null !== $this->sizeBytes) {
            $res['size_bytes'] = $this->sizeBytes;
        }
        if (null !== $this->createdAt) {
            $res['created_at'] = $this->createdAt;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ConfirmBlockchainBotIotagentWorkspaceResponse
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
        if(isset($map['file_id'])){
            $model->fileId = $map['file_id'];
        }
        if(isset($map['file_name'])){
            $model->fileName = $map['file_name'];
        }
        if(isset($map['media_type'])){
            $model->mediaType = $map['media_type'];
        }
        if(isset($map['size_bytes'])){
            $model->sizeBytes = $map['size_bytes'];
        }
        if(isset($map['created_at'])){
            $model->createdAt = $map['created_at'];
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
    public $fileId;

    /**
     * @var string
     */
    public $fileName;

    /**
     * @var string
     */
    public $mediaType;

    /**
     * @var int
     */
    public $sizeBytes;

    /**
     * @var string
     */
    public $createdAt;

}
