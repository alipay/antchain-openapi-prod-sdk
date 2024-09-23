<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class DeliveryDetail extends Model
{
    // 收件人姓名
    /**
     * @example 张三
     *
     * @var string
     */
    public $receiverName;

    // 收件人手机号
    /**
     * @example 13812345678
     *
     * @var string
     */
    public $receiverMobile;

    // 收件人地址
    /**
     * @example xx省xx市xx区xx录xx号xx室
     *
     * @var string
     */
    public $receiverAddress;
    protected $_name = [
        'receiverName'    => 'receiver_name',
        'receiverMobile'  => 'receiver_mobile',
        'receiverAddress' => 'receiver_address',
    ];

    public function validate()
    {
        Model::validateMaxLength('receiverName', $this->receiverName, 32);
        Model::validateMaxLength('receiverMobile', $this->receiverMobile, 32);
        Model::validateMaxLength('receiverAddress', $this->receiverAddress, 256);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->receiverName) {
            $res['receiver_name'] = $this->receiverName;
        }
        if (null !== $this->receiverMobile) {
            $res['receiver_mobile'] = $this->receiverMobile;
        }
        if (null !== $this->receiverAddress) {
            $res['receiver_address'] = $this->receiverAddress;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeliveryDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['receiver_name'])) {
            $model->receiverName = $map['receiver_name'];
        }
        if (isset($map['receiver_mobile'])) {
            $model->receiverMobile = $map['receiver_mobile'];
        }
        if (isset($map['receiver_address'])) {
            $model->receiverAddress = $map['receiver_address'];
        }

        return $model;
    }
}
