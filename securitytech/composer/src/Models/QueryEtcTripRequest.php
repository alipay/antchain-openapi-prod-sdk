<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class QueryEtcTripRequest extends Model
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

    // 车牌颜色，蓝: BLUE 黄: YELLOW 黑: BLACK 白: WHITE 绿: GREEN
    /**
     * @var string
     */
    public $plateColor;

    // 企业运单号，唯一值
    /**
     * @var string
     */
    public $waybillNo;

    // 当前页码
    // 【必选条件】当需要进行按时间段（跨度不超过2天）筛选时需要传入，不传入时默认至多返回最新20条数据
    /**
     * @var int
     */
    public $pageNum;

    // 每页数据条数
    // 【必选条件】当需要进行按时间段（跨度不超过2天）筛选时需要传入，不传入时默认至多返回最新20条数据
    /**
     * @var int
     */
    public $pageSize;

    // 行程查询开始时间
    // 【必选条件】当需要进行按时间段（跨度不超过2天）筛选时需要传入，不传入时默认至多返回最新20条数据
    /**
     * @var string
     */
    public $startTime;

    // 行程查询结束时间
    // 【必选条件】当需要进行按时间段（跨度不超过2天）筛选时需要传入，不传入时默认至多返回最新20条数据
    //
    /**
     * @var string
     */
    public $endTime;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'outerOrderNo'      => 'outer_order_no',
        'corpVehicleId'     => 'corp_vehicle_id',
        'plateNo'           => 'plate_no',
        'plateColor'        => 'plate_color',
        'waybillNo'         => 'waybill_no',
        'pageNum'           => 'page_num',
        'pageSize'          => 'page_size',
        'startTime'         => 'start_time',
        'endTime'           => 'end_time',
    ];

    public function validate()
    {
        Model::validateRequired('outerOrderNo', $this->outerOrderNo, true);
        Model::validateRequired('corpVehicleId', $this->corpVehicleId, true);
        Model::validateRequired('plateNo', $this->plateNo, true);
        Model::validateRequired('plateColor', $this->plateColor, true);
        Model::validateRequired('waybillNo', $this->waybillNo, true);
        Model::validatePattern('startTime', $this->startTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('endTime', $this->endTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryEtcTripRequest
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
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }

        return $model;
    }
}
