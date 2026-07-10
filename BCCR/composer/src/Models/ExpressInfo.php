<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class ExpressInfo extends Model
{
    // 材料类型
    /**
     * @example PAPER纸质，ELECTRIC电子
     *
     * @var string
     */
    public $type;

    // 收件人姓名
    /**
     * @example 张三
     *
     * @var string
     */
    public $name;

    // 收件人电话号码
    /**
     * @example 13000000000
     *
     * @var string
     */
    public $phone;

    // 邮箱地址
    /**
     * @example xxx@xx.com
     *
     * @var string
     */
    public $email;

    // 快递名称
    /**
     * @example 快递名称
     *
     * @var string
     */
    public $expressName;

    // 快递单号
    /**
     * @example 快递单号
     *
     * @var string
     */
    public $trackingNumber;

    // 材料发出时间戳
    /**
     * @example
     *
     * @var int
     */
    public $sendTime;
    protected $_name = [
        'type'           => 'type',
        'name'           => 'name',
        'phone'          => 'phone',
        'email'          => 'email',
        'expressName'    => 'express_name',
        'trackingNumber' => 'tracking_number',
        'sendTime'       => 'send_time',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('phone', $this->phone, true);
        Model::validateRequired('email', $this->email, true);
        Model::validateRequired('expressName', $this->expressName, true);
        Model::validateRequired('trackingNumber', $this->trackingNumber, true);
        Model::validateRequired('sendTime', $this->sendTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->phone) {
            $res['phone'] = $this->phone;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->expressName) {
            $res['express_name'] = $this->expressName;
        }
        if (null !== $this->trackingNumber) {
            $res['tracking_number'] = $this->trackingNumber;
        }
        if (null !== $this->sendTime) {
            $res['send_time'] = $this->sendTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExpressInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['phone'])) {
            $model->phone = $map['phone'];
        }
        if (isset($map['email'])) {
            $model->email = $map['email'];
        }
        if (isset($map['express_name'])) {
            $model->expressName = $map['express_name'];
        }
        if (isset($map['tracking_number'])) {
            $model->trackingNumber = $map['tracking_number'];
        }
        if (isset($map['send_time'])) {
            $model->sendTime = $map['send_time'];
        }

        return $model;
    }
}
