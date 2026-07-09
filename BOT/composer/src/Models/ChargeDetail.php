<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ChargeDetail extends Model
{
    // 开始时间
    /**
     * @example 2018-10-10 10:10:00
     *
     * @var string
     */
    public $detailStartTime;

    // 结束时间
    /**
     * @example 2018-10-10 10:10:00
     *
     * @var string
     */
    public $detailEndTime;

    // 时段电价，小数点后4位
    /**
     * @example 10.1010
     *
     * @var string
     */
    public $elecPrice;

    // 时段服务费价格，小数点后4位
    /**
     * @example 12.6222
     *
     * @var string
     */
    public $servicePrice;

    // 时段充电量，单位：度，小数点后2位
    /**
     * @example 12.12
     *
     * @var string
     */
    public $detailPower;

    // 时段电费，小数点后2位
    /**
     * @example 10.10
     *
     * @var string
     */
    public $detailElecMoney;

    // 时段服务费，小数点后2位
    /**
     * @example 10.10
     *
     * @var string
     */
    public $detailServiceMoney;
    protected $_name = [
        'detailStartTime'    => 'detail_start_time',
        'detailEndTime'      => 'detail_end_time',
        'elecPrice'          => 'elec_price',
        'servicePrice'       => 'service_price',
        'detailPower'        => 'detail_power',
        'detailElecMoney'    => 'detail_elec_money',
        'detailServiceMoney' => 'detail_service_money',
    ];

    public function validate()
    {
        Model::validateRequired('detailStartTime', $this->detailStartTime, true);
        Model::validateRequired('detailEndTime', $this->detailEndTime, true);
        Model::validateRequired('detailPower', $this->detailPower, true);
        Model::validatePattern('detailStartTime', $this->detailStartTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('detailEndTime', $this->detailEndTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->detailStartTime) {
            $res['detail_start_time'] = $this->detailStartTime;
        }
        if (null !== $this->detailEndTime) {
            $res['detail_end_time'] = $this->detailEndTime;
        }
        if (null !== $this->elecPrice) {
            $res['elec_price'] = $this->elecPrice;
        }
        if (null !== $this->servicePrice) {
            $res['service_price'] = $this->servicePrice;
        }
        if (null !== $this->detailPower) {
            $res['detail_power'] = $this->detailPower;
        }
        if (null !== $this->detailElecMoney) {
            $res['detail_elec_money'] = $this->detailElecMoney;
        }
        if (null !== $this->detailServiceMoney) {
            $res['detail_service_money'] = $this->detailServiceMoney;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChargeDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['detail_start_time'])) {
            $model->detailStartTime = $map['detail_start_time'];
        }
        if (isset($map['detail_end_time'])) {
            $model->detailEndTime = $map['detail_end_time'];
        }
        if (isset($map['elec_price'])) {
            $model->elecPrice = $map['elec_price'];
        }
        if (isset($map['service_price'])) {
            $model->servicePrice = $map['service_price'];
        }
        if (isset($map['detail_power'])) {
            $model->detailPower = $map['detail_power'];
        }
        if (isset($map['detail_elec_money'])) {
            $model->detailElecMoney = $map['detail_elec_money'];
        }
        if (isset($map['detail_service_money'])) {
            $model->detailServiceMoney = $map['detail_service_money'];
        }

        return $model;
    }
}
