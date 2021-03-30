<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class OrderInfo extends Model
{
    // 运单号
    /**
     * @example 132134
     *
     * @var string
     */
    public $orderNo;

    // 船名
    /**
     * @example 运龙号
     *
     * @var string
     */
    public $shipName;

    // 航次
    /**
     * @example 98-fx
     *
     * @var string
     */
    public $voyageNo;

    // 起始地
    /**
     * @example 大连
     *
     * @var string
     */
    public $originalPlace;

    // 目的地
    /**
     * @example 上海
     *
     * @var string
     */
    public $destPlace;

    // 离港时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $leaveDate;

    // 预计到港时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $estArriDate;

    // 实际到港时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $actualArriDate;

    // 运单重量
    /**
     * @example 1000t
     *
     * @var string
     */
    public $waybillWeight;

    // 船运箱子详情列表
    /**
     * @example
     *
     * @var CargoTank[]
     */
    public $cargoTankList;

    // 委托人信息
    /**
     * @example
     *
     * @var string[]
     */
    public $grantorInfo;

    // 收货人信息
    /**
     * @example
     *
     * @var string[]
     */
    public $consigneeInfo;

    // 运单附件
    /**
     * @example xxx.jpg
     *
     * @var string
     */
    public $attachment;

    // 物流状态:
    // 1-->已离开港口;
    // 2-->已到达港口;
    /**
     * @example 1
     *
     * @var int
     */
    public $logisticsStatus;
    protected $_name = [
        'orderNo'         => 'order_no',
        'shipName'        => 'ship_name',
        'voyageNo'        => 'voyage_no',
        'originalPlace'   => 'original_place',
        'destPlace'       => 'dest_place',
        'leaveDate'       => 'leave_date',
        'estArriDate'     => 'est_arri_date',
        'actualArriDate'  => 'actual_arri_date',
        'waybillWeight'   => 'waybill_weight',
        'cargoTankList'   => 'cargo_tank_list',
        'grantorInfo'     => 'grantor_info',
        'consigneeInfo'   => 'consignee_info',
        'attachment'      => 'attachment',
        'logisticsStatus' => 'logistics_status',
    ];

    public function validate()
    {
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('shipName', $this->shipName, true);
        Model::validateRequired('voyageNo', $this->voyageNo, true);
        Model::validateRequired('originalPlace', $this->originalPlace, true);
        Model::validateRequired('destPlace', $this->destPlace, true);
        Model::validateRequired('leaveDate', $this->leaveDate, true);
        Model::validateRequired('waybillWeight', $this->waybillWeight, true);
        Model::validateRequired('cargoTankList', $this->cargoTankList, true);
        Model::validateRequired('grantorInfo', $this->grantorInfo, true);
        Model::validateRequired('consigneeInfo', $this->consigneeInfo, true);
        Model::validateRequired('attachment', $this->attachment, true);
        Model::validateRequired('logisticsStatus', $this->logisticsStatus, true);
        Model::validatePattern('leaveDate', $this->leaveDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('estArriDate', $this->estArriDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('actualArriDate', $this->actualArriDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->shipName) {
            $res['ship_name'] = $this->shipName;
        }
        if (null !== $this->voyageNo) {
            $res['voyage_no'] = $this->voyageNo;
        }
        if (null !== $this->originalPlace) {
            $res['original_place'] = $this->originalPlace;
        }
        if (null !== $this->destPlace) {
            $res['dest_place'] = $this->destPlace;
        }
        if (null !== $this->leaveDate) {
            $res['leave_date'] = $this->leaveDate;
        }
        if (null !== $this->estArriDate) {
            $res['est_arri_date'] = $this->estArriDate;
        }
        if (null !== $this->actualArriDate) {
            $res['actual_arri_date'] = $this->actualArriDate;
        }
        if (null !== $this->waybillWeight) {
            $res['waybill_weight'] = $this->waybillWeight;
        }
        if (null !== $this->cargoTankList) {
            $res['cargo_tank_list'] = [];
            if (null !== $this->cargoTankList && \is_array($this->cargoTankList)) {
                $n = 0;
                foreach ($this->cargoTankList as $item) {
                    $res['cargo_tank_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->grantorInfo) {
            $res['grantor_info'] = $this->grantorInfo;
        }
        if (null !== $this->consigneeInfo) {
            $res['consignee_info'] = $this->consigneeInfo;
        }
        if (null !== $this->attachment) {
            $res['attachment'] = $this->attachment;
        }
        if (null !== $this->logisticsStatus) {
            $res['logistics_status'] = $this->logisticsStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OrderInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['ship_name'])) {
            $model->shipName = $map['ship_name'];
        }
        if (isset($map['voyage_no'])) {
            $model->voyageNo = $map['voyage_no'];
        }
        if (isset($map['original_place'])) {
            $model->originalPlace = $map['original_place'];
        }
        if (isset($map['dest_place'])) {
            $model->destPlace = $map['dest_place'];
        }
        if (isset($map['leave_date'])) {
            $model->leaveDate = $map['leave_date'];
        }
        if (isset($map['est_arri_date'])) {
            $model->estArriDate = $map['est_arri_date'];
        }
        if (isset($map['actual_arri_date'])) {
            $model->actualArriDate = $map['actual_arri_date'];
        }
        if (isset($map['waybill_weight'])) {
            $model->waybillWeight = $map['waybill_weight'];
        }
        if (isset($map['cargo_tank_list'])) {
            if (!empty($map['cargo_tank_list'])) {
                $model->cargoTankList = [];
                $n                    = 0;
                foreach ($map['cargo_tank_list'] as $item) {
                    $model->cargoTankList[$n++] = null !== $item ? CargoTank::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['grantor_info'])) {
            if (!empty($map['grantor_info'])) {
                $model->grantorInfo = $map['grantor_info'];
            }
        }
        if (isset($map['consignee_info'])) {
            if (!empty($map['consignee_info'])) {
                $model->consigneeInfo = $map['consignee_info'];
            }
        }
        if (isset($map['attachment'])) {
            $model->attachment = $map['attachment'];
        }
        if (isset($map['logistics_status'])) {
            $model->logisticsStatus = $map['logistics_status'];
        }

        return $model;
    }
}
