<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;
use GuzzleHttp\Psr7\Stream;

class PushBlockchainBotIotagentAudioscribeRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fileId' => 'file_id',
        'type' => 'type',
        'messageId' => 'message_id',
        'targetPluginId' => 'target_plugin_id',
        'messageType' => 'message_type',
        'payload' => 'payload',
        'timestamp' => 'timestamp',
    ];
    public function validate() {
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('messageId', $this->messageId, true);
        Model::validateRequired('targetPluginId', $this->targetPluginId, true);
        Model::validateRequired('messageType', $this->messageType, true);
        Model::validateRequired('payload', $this->payload, true);
        Model::validateRequired('timestamp', $this->timestamp, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->fileObject) {
            $res['fileObject'] = $this->fileObject;
        }
        if (null !== $this->fileObjectName) {
            $res['fileObjectName'] = $this->fileObjectName;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->messageId) {
            $res['message_id'] = $this->messageId;
        }
        if (null !== $this->targetPluginId) {
            $res['target_plugin_id'] = $this->targetPluginId;
        }
        if (null !== $this->messageType) {
            $res['message_type'] = $this->messageType;
        }
        if (null !== $this->payload) {
            $res['payload'] = $this->payload;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PushBlockchainBotIotagentAudioscribeRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['fileObject'])){
            $model->fileObject = $map['fileObject'];
        }
        if(isset($map['fileObjectName'])){
            $model->fileObjectName = $map['fileObjectName'];
        }
        if(isset($map['file_id'])){
            $model->fileId = $map['file_id'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['message_id'])){
            $model->messageId = $map['message_id'];
        }
        if(isset($map['target_plugin_id'])){
            $model->targetPluginId = $map['target_plugin_id'];
        }
        if(isset($map['message_type'])){
            $model->messageType = $map['message_type'];
        }
        if(isset($map['payload'])){
            $model->payload = $map['payload'];
        }
        if(isset($map['timestamp'])){
            $model->timestamp = $map['timestamp'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // string
    /**
     * @description 待上传文件
     * @var Stream
     */
    public $fileObject;

    /**
     * @description 待上传文件名
     * @var string
     */
    public $fileObjectName;

    /**
     * @var string
     */
    public $fileId;

    /**
     * @var string
     */
    public $type;

    /**
     * @var string
     */
    public $messageId;

    /**
     * @var string
     */
    public $targetPluginId;

    // 如： audio_push、status_query、detail_query、asr_retry、summary_retry
    /**
     * @var string
     */
    public $messageType;

    // 业务字段，JSON格式
    /**
     * @var string
     */
    public $payload;

    // Unix Epoch 毫秒
    /**
     * @var int
     */
    public $timestamp;

}
