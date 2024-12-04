<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class EtcTripInfo extends Model
{
    // 发行方扣款订单号
    /**
     * @example 56789123456
     *
     * @var string
     */
    public $outOrderId;

    // 行程开始时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $tripStartTime;

    // 行程结束时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $tripEndTime;

    // 1、收费站入口名称 2、格式为省份+收费站名，比如“黑龙江瓦盆窑西站”
    /**
     * @example 黑龙江瓦盆窑西站
     *
     * @var string
     */
    public $startStationName;

    // 1、收费站出口名称 2、格式为省份+收费站名，比如“黑龙江瓦盆窑西站”
    /**
     * @example 黑龙江瓦盆窑西站
     *
     * @var string
     */
    public $endStationName;

    // HIGHWAY_TYPE：高速交易场景类型，对应具体交易场景[ETC_HIGHWAY,ETC_HIGHWAY_OPEN] EXPAND_TYPE：拓展消费交易类型，对应具体交易场景 [ETC_PARKING,ETC_GAS,ETC_SERVICE_AREA,ETC_MUNICIPAL_SERVICE]
    /**
     * @example HIGHWAY_TYPE
     *
     * @var string
     */
    public $subType;

    // ETC_HIGHWAY：ETC封闭式高速公路； ETC_HIGHWAY_OPEN：ETC开放式高速公路； ETC_PARKING：ETC停车场； ETC_GAS：ETC加油站； ETC_SERVICE_AREA：ETC服务区； ETC_MUNICIPAL_SERVICE：ETC市政服务
    /**
     * @example ETC_HIGHWAY
     *
     * @var string
     */
    public $subScene;

    // 商户扣费的总金额：单位为元，精确到小数点后两位
    /**
     * @example 4.50
     *
     * @var string
     */
    public $totalAmount;

    // 行程id
    /**
     * @example 230390390303
     *
     * @var string
     */
    public $tripId;

    // 交易单号
    /**
     * @example 20230916988938938393
     *
     * @var string
     */
    public $tradeNo;
    protected $_name = [
        'outOrderId'       => 'out_order_id',
        'tripStartTime'    => 'trip_start_time',
        'tripEndTime'      => 'trip_end_time',
        'startStationName' => 'start_station_name',
        'endStationName'   => 'end_station_name',
        'subType'          => 'sub_type',
        'subScene'         => 'sub_scene',
        'totalAmount'      => 'total_amount',
        'tripId'           => 'trip_id',
        'tradeNo'          => 'trade_no',
    ];

    public function validate()
    {
        Model::validatePattern('tripStartTime', $this->tripStartTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('tripEndTime', $this->tripEndTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->outOrderId) {
            $res['out_order_id'] = $this->outOrderId;
        }
        if (null !== $this->tripStartTime) {
            $res['trip_start_time'] = $this->tripStartTime;
        }
        if (null !== $this->tripEndTime) {
            $res['trip_end_time'] = $this->tripEndTime;
        }
        if (null !== $this->startStationName) {
            $res['start_station_name'] = $this->startStationName;
        }
        if (null !== $this->endStationName) {
            $res['end_station_name'] = $this->endStationName;
        }
        if (null !== $this->subType) {
            $res['sub_type'] = $this->subType;
        }
        if (null !== $this->subScene) {
            $res['sub_scene'] = $this->subScene;
        }
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }
        if (null !== $this->tripId) {
            $res['trip_id'] = $this->tripId;
        }
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EtcTripInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['out_order_id'])) {
            $model->outOrderId = $map['out_order_id'];
        }
        if (isset($map['trip_start_time'])) {
            $model->tripStartTime = $map['trip_start_time'];
        }
        if (isset($map['trip_end_time'])) {
            $model->tripEndTime = $map['trip_end_time'];
        }
        if (isset($map['start_station_name'])) {
            $model->startStationName = $map['start_station_name'];
        }
        if (isset($map['end_station_name'])) {
            $model->endStationName = $map['end_station_name'];
        }
        if (isset($map['sub_type'])) {
            $model->subType = $map['sub_type'];
        }
        if (isset($map['sub_scene'])) {
            $model->subScene = $map['sub_scene'];
        }
        if (isset($map['total_amount'])) {
            $model->totalAmount = $map['total_amount'];
        }
        if (isset($map['trip_id'])) {
            $model->tripId = $map['trip_id'];
        }
        if (isset($map['trade_no'])) {
            $model->tradeNo = $map['trade_no'];
        }

        return $model;
    }
}
