<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MREACH\Models;

use AlibabaCloud\Tea\Model;

class QuerySmsDomesticRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 消息id
    /**
     * @var string
     */
    public $messageId;

    // 接收短信的手机号码
    /**
     * @var string
     */
    public $phoneNumber;

    // 短信发送日期，支持查询最近 30 天的记录。格式：yyyyMMdd。
    /**
     * @var string
     */
    public $sendDate;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'messageId'         => 'message_id',
        'phoneNumber'       => 'phone_number',
        'sendDate'          => 'send_date',
    ];

    public function validate()
    {
        Model::validateRequired('messageId', $this->messageId, true);
        Model::validateRequired('sendDate', $this->sendDate, true);
    }

    public function toMap()
    {
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
        if (null !== $this->phoneNumber) {
            $res['phone_number'] = $this->phoneNumber;
        }
        if (null !== $this->sendDate) {
            $res['send_date'] = $this->sendDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySmsDomesticRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['message_id'])) {
            $model->messageId = $map['message_id'];
        }
        if (isset($map['phone_number'])) {
            $model->phoneNumber = $map['phone_number'];
        }
        if (isset($map['send_date'])) {
            $model->sendDate = $map['send_date'];
        }

        return $model;
    }
}
