<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class EtcVehicleInfo extends Model
{
    // 车辆id
    /**
     * @example 2039029939
     *
     * @var string
     */
    public $vehicleId;

    // etc申请单号
    /**
     * @example 20212424231413243
     *
     * @var string
     */
    public $orderId;

    // etc平台扣款协议号
    /**
     * @example 20211232213232
     *
     * @var string
     */
    public $bizAgreementNo;

    // etc申请单状态
    // ORDER_CREATE:订单创建;ORDER_SYNCED:订单已同步;SUCCESS_ACTIVATE:订单已激活;UNMOUNTING:注销中;UNMOUNTED:已注销;
    /**
     * @example ORDER_CREATE
     *
     * @var string
     */
    public $orderStatus;

    // 用户ETC设备OBU号，当order_status为SUCCESS_ACTIVATE及以后状态时，必选
    /**
     * @example 32432def
     *
     * @var string
     */
    public $deviceNo;

    // 代扣签约状态，当传入waybill_no且匹配到对应运单时，deduct_sign_status必选
    // 待签约: WAIT_SIGN
    // 已签约: SIGNED
    // 已解约: UNSIGN
    /**
     * @example WAIT_SIGN
     *
     * @var string
     */
    public $deductSignStatus;

    // 设备首次激活时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $firstActivedTime;

    // 合约到期时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $serviceExp;

    // etc设备状态，USABLE-设备激活可用（可上高速正常使用）PENDING-设备激活挂起（限制消费） UNUSABLE-设备异常不可用
    /**
     * @example USABLE
     *
     * @var string
     */
    public $deviceStatus;

    // 设备状态明细，能清楚说明etc设备此时状态（/卡签注销/卡签挂失/已过户/维修中/黑名单/卡过期/欠费/标签脱落/设备报警/正常/ETC停用等）
    /**
     * @example 卡签挂起
     *
     * @var string
     */
    public $deviceStatusDetail;

    // 设备状态触发的具体时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $deviceBizTime;
    protected $_name = [
        'vehicleId'          => 'vehicle_id',
        'orderId'            => 'order_id',
        'bizAgreementNo'     => 'biz_agreement_no',
        'orderStatus'        => 'order_status',
        'deviceNo'           => 'device_no',
        'deductSignStatus'   => 'deduct_sign_status',
        'firstActivedTime'   => 'first_actived_time',
        'serviceExp'         => 'service_exp',
        'deviceStatus'       => 'device_status',
        'deviceStatusDetail' => 'device_status_detail',
        'deviceBizTime'      => 'device_biz_time',
    ];

    public function validate()
    {
        Model::validateRequired('vehicleId', $this->vehicleId, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('bizAgreementNo', $this->bizAgreementNo, true);
        Model::validateRequired('orderStatus', $this->orderStatus, true);
        Model::validatePattern('firstActivedTime', $this->firstActivedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('serviceExp', $this->serviceExp, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('deviceBizTime', $this->deviceBizTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->vehicleId) {
            $res['vehicle_id'] = $this->vehicleId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->bizAgreementNo) {
            $res['biz_agreement_no'] = $this->bizAgreementNo;
        }
        if (null !== $this->orderStatus) {
            $res['order_status'] = $this->orderStatus;
        }
        if (null !== $this->deviceNo) {
            $res['device_no'] = $this->deviceNo;
        }
        if (null !== $this->deductSignStatus) {
            $res['deduct_sign_status'] = $this->deductSignStatus;
        }
        if (null !== $this->firstActivedTime) {
            $res['first_actived_time'] = $this->firstActivedTime;
        }
        if (null !== $this->serviceExp) {
            $res['service_exp'] = $this->serviceExp;
        }
        if (null !== $this->deviceStatus) {
            $res['device_status'] = $this->deviceStatus;
        }
        if (null !== $this->deviceStatusDetail) {
            $res['device_status_detail'] = $this->deviceStatusDetail;
        }
        if (null !== $this->deviceBizTime) {
            $res['device_biz_time'] = $this->deviceBizTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EtcVehicleInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['vehicle_id'])) {
            $model->vehicleId = $map['vehicle_id'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['biz_agreement_no'])) {
            $model->bizAgreementNo = $map['biz_agreement_no'];
        }
        if (isset($map['order_status'])) {
            $model->orderStatus = $map['order_status'];
        }
        if (isset($map['device_no'])) {
            $model->deviceNo = $map['device_no'];
        }
        if (isset($map['deduct_sign_status'])) {
            $model->deductSignStatus = $map['deduct_sign_status'];
        }
        if (isset($map['first_actived_time'])) {
            $model->firstActivedTime = $map['first_actived_time'];
        }
        if (isset($map['service_exp'])) {
            $model->serviceExp = $map['service_exp'];
        }
        if (isset($map['device_status'])) {
            $model->deviceStatus = $map['device_status'];
        }
        if (isset($map['device_status_detail'])) {
            $model->deviceStatusDetail = $map['device_status_detail'];
        }
        if (isset($map['device_biz_time'])) {
            $model->deviceBizTime = $map['device_biz_time'];
        }

        return $model;
    }
}
