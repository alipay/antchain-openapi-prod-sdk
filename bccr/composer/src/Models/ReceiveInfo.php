<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class ReceiveInfo extends Model
{
    // 纸质公证书份数
    /**
     * @example 2
     *
     * @var int
     */
    public $copies;

    // 公证书类型
    /**
     * @example PAPER:纸质公证书 E-PAPER:电子公证书 BOTH:纸质+电子公证书
     *
     * @var string
     */
    public $orderType;

    // 收件人信息
    /**
     * @example
     *
     * @var DeliveryInfo
     */
    public $deliveryInfo;
    protected $_name = [
        'copies'       => 'copies',
        'orderType'    => 'order_type',
        'deliveryInfo' => 'delivery_info',
    ];

    public function validate()
    {
        Model::validateRequired('orderType', $this->orderType, true);
        Model::validateRequired('deliveryInfo', $this->deliveryInfo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->copies) {
            $res['copies'] = $this->copies;
        }
        if (null !== $this->orderType) {
            $res['order_type'] = $this->orderType;
        }
        if (null !== $this->deliveryInfo) {
            $res['delivery_info'] = null !== $this->deliveryInfo ? $this->deliveryInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ReceiveInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['copies'])) {
            $model->copies = $map['copies'];
        }
        if (isset($map['order_type'])) {
            $model->orderType = $map['order_type'];
        }
        if (isset($map['delivery_info'])) {
            $model->deliveryInfo = DeliveryInfo::fromMap($map['delivery_info']);
        }

        return $model;
    }
}
