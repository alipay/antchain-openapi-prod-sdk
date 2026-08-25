<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class PushIotagentMessageRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'messageId' => 'message_id',
        'operationType' => 'operation_type',
        'instruction' => 'instruction',
        'source' => 'source',
        'outUserId' => 'out_user_id',
        'outUserType' => 'out_user_type',
        'extraInfo' => 'extra_info',
        'expireTime' => 'expire_time',
    ];
    public function validate() {
        Model::validateRequired('messageId', $this->messageId, true);
        Model::validateRequired('operationType', $this->operationType, true);
        Model::validateRequired('instruction', $this->instruction, true);
        Model::validateRequired('expireTime', $this->expireTime, true);
        Model::validatePattern('expireTime', $this->expireTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->messageId) {
            $res['message_id'] = $this->messageId;
        }
        if (null !== $this->operationType) {
            $res['operation_type'] = $this->operationType;
        }
        if (null !== $this->instruction) {
            $res['instruction'] = $this->instruction;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->outUserId) {
            $res['out_user_id'] = $this->outUserId;
        }
        if (null !== $this->outUserType) {
            $res['out_user_type'] = $this->outUserType;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }
        if (null !== $this->expireTime) {
            $res['expire_time'] = $this->expireTime;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PushIotagentMessageRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['message_id'])){
            $model->messageId = $map['message_id'];
        }
        if(isset($map['operation_type'])){
            $model->operationType = $map['operation_type'];
        }
        if(isset($map['instruction'])){
            $model->instruction = $map['instruction'];
        }
        if(isset($map['source'])){
            $model->source = $map['source'];
        }
        if(isset($map['out_user_id'])){
            $model->outUserId = $map['out_user_id'];
        }
        if(isset($map['out_user_type'])){
            $model->outUserType = $map['out_user_type'];
        }
        if(isset($map['extra_info'])){
            $model->extraInfo = $map['extra_info'];
        }
        if(isset($map['expire_time'])){
            $model->expireTime = $map['expire_time'];
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

    // 消息ID，用于幂等
    /**
     * @var string
     */
    public $messageId;

    // 指令类型。消息播报用 AUDIO_BROADCAST；未来可扩展其他指令
    /**
     * @var string
     */
    public $operationType;

    // 播报/指令文案
    /**
     * @var string
     */
    public $instruction;

    // 已解析的设备身份（tenantId/agentId/clientType/clientId/sessionId），非aiotdatalink调用时，需传；
    // aiotdatalink调用时，不传。
    /**
     * @var string
     */
    public $source;

    // 用户身份ID，source 没传时用，当aiotdatalink调用时必传
    /**
     * @var string
     */
    public $outUserId;

    // 用户身份类型，source没传时用，当aiotdatalink调用时必传
    // 取值范围：ALIPAY_UID->支付宝UID;
    /**
     * @var string
     */
    public $outUserType;

    // 业务扩展信息宽字段，值是有效的json。aiotdatalink调用时的AntFinanceAssistant业务消息字段（screenText/screenTip/messageType/generatedTime/contextId/contextExpireTime/priority 等）放这里
    /**
     * @var string
     */
    public $extraInfo;

    // 最晚允许播放时间。超时消息不播报
    /**
     * @var string
     */
    public $expireTime;

}
