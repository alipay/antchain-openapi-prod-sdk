<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ScfLeaseEqpInfo extends Model
{
    // 设备类型
    /**
     * @example 分拣机
     *
     * @var string
     */
    public $deviceType;

    // 运营日期
    /**
     * @example 20210720
     *
     * @var string
     */
    public $operationDate;

    // 修改时间
    /**
     * @example 2021-07-20 14:08:17
     *
     * @var string
     */
    public $gmtModified;

    // 维修金比例
    /**
     * @example 50
     *
     * @var string
     */
    public $maintenanceMoney;

    // 当日设备维修记录
    /**
     * @example error
     *
     * @var string
     */
    public $maintainRecord;

    // 设备识别号
    /**
     * @example 10010100101
     *
     * @var string
     */
    public $deviceNo;

    // 创建时间
    /**
     * @example 2021-07-20 14:08:17
     *
     * @var string
     */
    public $gmtCreate;

    // 当日分拣单数
    /**
     * @example 131222
     *
     * @var string
     */
    public $sortingNum;

    // 当日运营时长,单位分钟
    /**
     * @example 1231321
     *
     * @var string
     */
    public $operationMinute;

    // 04:00-16:00分拣单数/（派件分拣单数）
    /**
     * @example 130012
     *
     * @var string
     */
    public $amNum;

    // 16:00-04:00分拣单数/ （揽件分拣单数)
    /**
     * @example 1210
     *
     * @var string
     */
    public $pmNum;

    // id
    /**
     * @example 3
     *
     * @var string
     */
    public $id;

    // 设备验收日期
    /**
     * @example 2021-07-20 11:33:59
     *
     * @var string
     */
    public $deviceAcceptanceDate;

    // 数据更新时间
    /**
     * @example 2021-07-20 11:32:35
     *
     * @var string
     */
    public $dataUpdateTime;
    protected $_name = [
        'deviceType'           => 'device_type',
        'operationDate'        => 'operation_date',
        'gmtModified'          => 'gmt_modified',
        'maintenanceMoney'     => 'maintenance_money',
        'maintainRecord'       => 'maintain_record',
        'deviceNo'             => 'device_no',
        'gmtCreate'            => 'gmt_create',
        'sortingNum'           => 'sorting_num',
        'operationMinute'      => 'operation_minute',
        'amNum'                => 'am_num',
        'pmNum'                => 'pm_num',
        'id'                   => 'id',
        'deviceAcceptanceDate' => 'device_acceptance_date',
        'dataUpdateTime'       => 'data_update_time',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->deviceType) {
            $res['device_type'] = $this->deviceType;
        }
        if (null !== $this->operationDate) {
            $res['operation_date'] = $this->operationDate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->maintenanceMoney) {
            $res['maintenance_money'] = $this->maintenanceMoney;
        }
        if (null !== $this->maintainRecord) {
            $res['maintain_record'] = $this->maintainRecord;
        }
        if (null !== $this->deviceNo) {
            $res['device_no'] = $this->deviceNo;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->sortingNum) {
            $res['sorting_num'] = $this->sortingNum;
        }
        if (null !== $this->operationMinute) {
            $res['operation_minute'] = $this->operationMinute;
        }
        if (null !== $this->amNum) {
            $res['am_num'] = $this->amNum;
        }
        if (null !== $this->pmNum) {
            $res['pm_num'] = $this->pmNum;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->deviceAcceptanceDate) {
            $res['device_acceptance_date'] = $this->deviceAcceptanceDate;
        }
        if (null !== $this->dataUpdateTime) {
            $res['data_update_time'] = $this->dataUpdateTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ScfLeaseEqpInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['device_type'])) {
            $model->deviceType = $map['device_type'];
        }
        if (isset($map['operation_date'])) {
            $model->operationDate = $map['operation_date'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['maintenance_money'])) {
            $model->maintenanceMoney = $map['maintenance_money'];
        }
        if (isset($map['maintain_record'])) {
            $model->maintainRecord = $map['maintain_record'];
        }
        if (isset($map['device_no'])) {
            $model->deviceNo = $map['device_no'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['sorting_num'])) {
            $model->sortingNum = $map['sorting_num'];
        }
        if (isset($map['operation_minute'])) {
            $model->operationMinute = $map['operation_minute'];
        }
        if (isset($map['am_num'])) {
            $model->amNum = $map['am_num'];
        }
        if (isset($map['pm_num'])) {
            $model->pmNum = $map['pm_num'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['device_acceptance_date'])) {
            $model->deviceAcceptanceDate = $map['device_acceptance_date'];
        }
        if (isset($map['data_update_time'])) {
            $model->dataUpdateTime = $map['data_update_time'];
        }

        return $model;
    }
}
