<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class LogisticsInfo extends Model
{
    // 发货时间
    /**
     * @example 2021-05-07
     *
     * @var string
     */
    public $deliveryTime;

    // 快递物流公司
    /**
     * @example 圆通速递
     *
     * @var string
     */
    public $expressLogisticsCompany;

    // 快递单号
    /**
     * @example 127974979371979
     *
     * @var string
     */
    public $courierNumber;

    // 签收时间
    /**
     * @example 2021-06-01
     *
     * @var string
     */
    public $signTime;
    protected $_name = [
        'deliveryTime'            => 'delivery_time',
        'expressLogisticsCompany' => 'express_logistics_company',
        'courierNumber'           => 'courier_number',
        'signTime'                => 'sign_time',
    ];

    public function validate()
    {
        Model::validateRequired('deliveryTime', $this->deliveryTime, true);
        Model::validateRequired('expressLogisticsCompany', $this->expressLogisticsCompany, true);
        Model::validateRequired('courierNumber', $this->courierNumber, true);
        Model::validateRequired('signTime', $this->signTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->deliveryTime) {
            $res['delivery_time'] = $this->deliveryTime;
        }
        if (null !== $this->expressLogisticsCompany) {
            $res['express_logistics_company'] = $this->expressLogisticsCompany;
        }
        if (null !== $this->courierNumber) {
            $res['courier_number'] = $this->courierNumber;
        }
        if (null !== $this->signTime) {
            $res['sign_time'] = $this->signTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LogisticsInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['delivery_time'])) {
            $model->deliveryTime = $map['delivery_time'];
        }
        if (isset($map['express_logistics_company'])) {
            $model->expressLogisticsCompany = $map['express_logistics_company'];
        }
        if (isset($map['courier_number'])) {
            $model->courierNumber = $map['courier_number'];
        }
        if (isset($map['sign_time'])) {
            $model->signTime = $map['sign_time'];
        }

        return $model;
    }
}
