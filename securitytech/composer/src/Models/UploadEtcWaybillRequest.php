<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class UploadEtcWaybillRequest extends Model
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

    // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位。
    /**
     * @var string
     */
    public $outerOrderNo;

    // 企业侧车辆编号
    /**
     * @var string
     */
    public $corpVehicleId;

    // 车牌号码
    /**
     * @var string
     */
    public $plateNo;

    // 车牌颜色，枚举值
    // 蓝: BLUE
    // 黄: YELLOW
    // 黑: BLACK
    // 白: WHITE
    // 绿: GREEN
    /**
     * @var string
     */
    public $plateColor;

    // 企业运单号，唯一值
    /**
     * @var string
     */
    public $waybillNo;

    // 企业运单状态，枚举值
    // 进行中: IN_PROGRESS
    // 已完成: COMPLETED
    // 已取消: CANCELED
    /**
     * @var string
     */
    public $waybillStatus;

    // 运单开始时间
    // 【必选条件】当传入waybill_status，且waybill_status= IN_PROGRESS时必选
    /**
     * @var string
     */
    public $waybillStartTime;

    // 企业运单结束时间
    // 【必选条件】当传入waybill_status，且waybill_status=COMPLETED时必选
    /**
     * @var string
     */
    public $waybillEndTime;

    // 运单开始地址
    // 【必选条件】当传入waybill_status，且waybill_status= IN_PROGRESS时必选
    /**
     * @var string
     */
    public $waybillStartAddress;

    // 运单结束地址，运单目的地
    // 【必选条件】当传入waybill_status，且waybill_status=COMPLETED时必选
    /**
     * @var string
     */
    public $waybillEndAddress;

    // 运单总费用，单位元，精确到两位小数
    // 【必选条件】当传入waybill_status，且waybill_status=COMPLETED时必选
    /**
     * @var string
     */
    public $waybillFee;

    // 高速通行费用，单位元，精确到两位小数
    /**
     * @var string
     */
    public $highwayFee;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'outerOrderNo'        => 'outer_order_no',
        'corpVehicleId'       => 'corp_vehicle_id',
        'plateNo'             => 'plate_no',
        'plateColor'          => 'plate_color',
        'waybillNo'           => 'waybill_no',
        'waybillStatus'       => 'waybill_status',
        'waybillStartTime'    => 'waybill_start_time',
        'waybillEndTime'      => 'waybill_end_time',
        'waybillStartAddress' => 'waybill_start_address',
        'waybillEndAddress'   => 'waybill_end_address',
        'waybillFee'          => 'waybill_fee',
        'highwayFee'          => 'highway_fee',
    ];

    public function validate()
    {
        Model::validateRequired('outerOrderNo', $this->outerOrderNo, true);
        Model::validateRequired('corpVehicleId', $this->corpVehicleId, true);
        Model::validateRequired('plateNo', $this->plateNo, true);
        Model::validateRequired('plateColor', $this->plateColor, true);
        Model::validateRequired('waybillNo', $this->waybillNo, true);
        Model::validateRequired('waybillStatus', $this->waybillStatus, true);
        Model::validatePattern('waybillStartTime', $this->waybillStartTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('waybillEndTime', $this->waybillEndTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->outerOrderNo) {
            $res['outer_order_no'] = $this->outerOrderNo;
        }
        if (null !== $this->corpVehicleId) {
            $res['corp_vehicle_id'] = $this->corpVehicleId;
        }
        if (null !== $this->plateNo) {
            $res['plate_no'] = $this->plateNo;
        }
        if (null !== $this->plateColor) {
            $res['plate_color'] = $this->plateColor;
        }
        if (null !== $this->waybillNo) {
            $res['waybill_no'] = $this->waybillNo;
        }
        if (null !== $this->waybillStatus) {
            $res['waybill_status'] = $this->waybillStatus;
        }
        if (null !== $this->waybillStartTime) {
            $res['waybill_start_time'] = $this->waybillStartTime;
        }
        if (null !== $this->waybillEndTime) {
            $res['waybill_end_time'] = $this->waybillEndTime;
        }
        if (null !== $this->waybillStartAddress) {
            $res['waybill_start_address'] = $this->waybillStartAddress;
        }
        if (null !== $this->waybillEndAddress) {
            $res['waybill_end_address'] = $this->waybillEndAddress;
        }
        if (null !== $this->waybillFee) {
            $res['waybill_fee'] = $this->waybillFee;
        }
        if (null !== $this->highwayFee) {
            $res['highway_fee'] = $this->highwayFee;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadEtcWaybillRequest
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
        if (isset($map['outer_order_no'])) {
            $model->outerOrderNo = $map['outer_order_no'];
        }
        if (isset($map['corp_vehicle_id'])) {
            $model->corpVehicleId = $map['corp_vehicle_id'];
        }
        if (isset($map['plate_no'])) {
            $model->plateNo = $map['plate_no'];
        }
        if (isset($map['plate_color'])) {
            $model->plateColor = $map['plate_color'];
        }
        if (isset($map['waybill_no'])) {
            $model->waybillNo = $map['waybill_no'];
        }
        if (isset($map['waybill_status'])) {
            $model->waybillStatus = $map['waybill_status'];
        }
        if (isset($map['waybill_start_time'])) {
            $model->waybillStartTime = $map['waybill_start_time'];
        }
        if (isset($map['waybill_end_time'])) {
            $model->waybillEndTime = $map['waybill_end_time'];
        }
        if (isset($map['waybill_start_address'])) {
            $model->waybillStartAddress = $map['waybill_start_address'];
        }
        if (isset($map['waybill_end_address'])) {
            $model->waybillEndAddress = $map['waybill_end_address'];
        }
        if (isset($map['waybill_fee'])) {
            $model->waybillFee = $map['waybill_fee'];
        }
        if (isset($map['highway_fee'])) {
            $model->highwayFee = $map['highway_fee'];
        }

        return $model;
    }
}
