<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class PushBlockchainBotIotagentAudioscribeResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'type' => 'type',
        'messageId' => 'message_id',
        'targetPluginId' => 'target_plugin_id',
        'messageType' => 'message_type',
        'payload' => 'payload',
        'timestamp' => 'timestamp',
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
     * @return PushBlockchainBotIotagentAudioscribeResponse
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
    public $type;

    /**
     * @var string
     */
    public $messageId;

    /**
     * @var string
     */
    public $targetPluginId;

    /**
     * @var string
     */
    public $messageType;

    // 业务响应，json格式
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
