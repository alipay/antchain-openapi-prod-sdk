<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QuerypushstatusIotagentMessageResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'receiptId' => 'receipt_id',
        'messageId' => 'message_id',
        'clientId' => 'client_id',
        'updateTime' => 'update_time',
        'failedReason' => 'failed_reason',
        'status' => 'status',
    ];
    public function validate() {
        Model::validatePattern('updateTime', $this->updateTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->receiptId) {
            $res['receipt_id'] = $this->receiptId;
        }
        if (null !== $this->messageId) {
            $res['message_id'] = $this->messageId;
        }
        if (null !== $this->clientId) {
            $res['client_id'] = $this->clientId;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }
        if (null !== $this->failedReason) {
            $res['failed_reason'] = $this->failedReason;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QuerypushstatusIotagentMessageResponse
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
        if(isset($map['receipt_id'])){
            $model->receiptId = $map['receipt_id'];
        }
        if(isset($map['message_id'])){
            $model->messageId = $map['message_id'];
        }
        if(isset($map['client_id'])){
            $model->clientId = $map['client_id'];
        }
        if(isset($map['update_time'])){
            $model->updateTime = $map['update_time'];
        }
        if(isset($map['failed_reason'])){
            $model->failedReason = $map['failed_reason'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
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

    // 推送消息的受理标识
    /**
     * @var string
     */
    public $receiptId;

    // 消息ID
    /**
     * @var string
     */
    public $messageId;

    // 客户端ID
    /**
     * @var string
     */
    public $clientId;

    // 最后的状态更新时间
    /**
     * @var string
     */
    public $updateTime;

    // 失败的异常信息
    /**
     * @var string
     */
    public $failedReason;

    // 状态，取值范围：PENDING->已入队；WAITING->等待中（设备离线/忙碌）;EXECUTING->已下发设备、执行中；SUCCEEDED->成功；FAILED->失败；EXPIRED->已过期
    /**
     * @var string
     */
    public $status;

}
