<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MREACH\Models;

use AlibabaCloud\Tea\Model;

class CradSmsSendDetail extends Model
{
    // 消息ID
    /**
     * @example 123456
     *
     * @var string
     */
    public $messageId;

    // 接收手机号
    /**
     * @example 155xxxxxxxx
     *
     * @var string
     */
    public $phoneNumber;

    // 卡片短信模板ID
    /**
     * @example CARD_SMS_xxxx
     *
     * @var string
     */
    public $templateId;

    // 最终接收类型: CARD_SMS-卡片短信送达, SMS-回落为普通短信送达。
    /**
     * @example CARD_SMS
     *
     * @var string
     */
    public $finalReceiveType;

    // 短信发送状态。1-等待回执，2-发送失败，3-发送成功。
    /**
     * @example 1
     *
     * @var int
     */
    public $status;

    // 错误码（发送失败时返回）
    /**
     * @example FAIL
     *
     * @var string
     */
    public $errorCode;

    // 错误描述（发送失败时返回）
    /**
     * @example analysis fail
     *
     * @var string
     */
    public $errorMessage;

    // 回执时间,yyyy-MM-dd HH:mm:ss格式
    /**
     * @example 1971-01-01 00:00:00
     *
     * @var string
     */
    public $reportTime;

    // 回落短信正文（仅 finalReceiveType=SMS 时有值）
    /**
     * @example content
     *
     * @var string
     */
    public $content;
    protected $_name = [
        'messageId'        => 'message_id',
        'phoneNumber'      => 'phone_number',
        'templateId'       => 'template_id',
        'finalReceiveType' => 'final_receive_type',
        'status'           => 'status',
        'errorCode'        => 'error_code',
        'errorMessage'     => 'error_message',
        'reportTime'       => 'report_time',
        'content'          => 'content',
    ];

    public function validate()
    {
        Model::validateRequired('messageId', $this->messageId, true);
        Model::validateRequired('phoneNumber', $this->phoneNumber, true);
        Model::validateRequired('templateId', $this->templateId, true);
        Model::validateRequired('finalReceiveType', $this->finalReceiveType, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('errorCode', $this->errorCode, true);
        Model::validateRequired('errorMessage', $this->errorMessage, true);
        Model::validateRequired('reportTime', $this->reportTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->messageId) {
            $res['message_id'] = $this->messageId;
        }
        if (null !== $this->phoneNumber) {
            $res['phone_number'] = $this->phoneNumber;
        }
        if (null !== $this->templateId) {
            $res['template_id'] = $this->templateId;
        }
        if (null !== $this->finalReceiveType) {
            $res['final_receive_type'] = $this->finalReceiveType;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }
        if (null !== $this->errorMessage) {
            $res['error_message'] = $this->errorMessage;
        }
        if (null !== $this->reportTime) {
            $res['report_time'] = $this->reportTime;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CradSmsSendDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['message_id'])) {
            $model->messageId = $map['message_id'];
        }
        if (isset($map['phone_number'])) {
            $model->phoneNumber = $map['phone_number'];
        }
        if (isset($map['template_id'])) {
            $model->templateId = $map['template_id'];
        }
        if (isset($map['final_receive_type'])) {
            $model->finalReceiveType = $map['final_receive_type'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['error_code'])) {
            $model->errorCode = $map['error_code'];
        }
        if (isset($map['error_message'])) {
            $model->errorMessage = $map['error_message'];
        }
        if (isset($map['report_time'])) {
            $model->reportTime = $map['report_time'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }

        return $model;
    }
}
