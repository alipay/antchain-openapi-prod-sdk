<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MREACH\Models;

use AlibabaCloud\Tea\Model;

class SmsSendDetail extends Model
{
    // 错误码
    /**
     * @example null
     *
     * @var string
     */
    public $errCode;

    // 接受日期
    /**
     * @example 2026-04-21T09:47:51Z
     *
     * @var string
     */
    public $receiveDate;

    // 发送日期
    /**
     * @example 2026-04-21T09:47:44Z
     *
     * @var string
     */
    public $sendDate;

    // 接收短信的手机号码
    /**
     * @example 155xxxxxxxx
     *
     * @var string
     */
    public $phoneNumber;

    // 短信内容
    /**
     * @example 蚂蚁数字科技】您的订单已发货,请查收。
     *
     * @var string
     */
    public $content;

    // 模板id
    /**
     * @example SMS_xxxx
     *
     * @var string
     */
    public $templateId;

    // 短信发送状态：1-等待回执，2-发送失败，3-发送成功。
    /**
     * @example 3
     *
     * @var int
     */
    public $status;
    protected $_name = [
        'errCode'     => 'err_code',
        'receiveDate' => 'receive_date',
        'sendDate'    => 'send_date',
        'phoneNumber' => 'phone_number',
        'content'     => 'content',
        'templateId'  => 'template_id',
        'status'      => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('errCode', $this->errCode, true);
        Model::validateRequired('receiveDate', $this->receiveDate, true);
        Model::validateRequired('sendDate', $this->sendDate, true);
        Model::validateRequired('phoneNumber', $this->phoneNumber, true);
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('templateId', $this->templateId, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->errCode) {
            $res['err_code'] = $this->errCode;
        }
        if (null !== $this->receiveDate) {
            $res['receive_date'] = $this->receiveDate;
        }
        if (null !== $this->sendDate) {
            $res['send_date'] = $this->sendDate;
        }
        if (null !== $this->phoneNumber) {
            $res['phone_number'] = $this->phoneNumber;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->templateId) {
            $res['template_id'] = $this->templateId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SmsSendDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['err_code'])) {
            $model->errCode = $map['err_code'];
        }
        if (isset($map['receive_date'])) {
            $model->receiveDate = $map['receive_date'];
        }
        if (isset($map['send_date'])) {
            $model->sendDate = $map['send_date'];
        }
        if (isset($map['phone_number'])) {
            $model->phoneNumber = $map['phone_number'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['template_id'])) {
            $model->templateId = $map['template_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
