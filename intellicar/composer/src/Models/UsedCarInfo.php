<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

use AlibabaCloud\Tea\Model;

class UsedCarInfo extends Model
{
    // 渠道方线索业务id
    /**
     * @example xxxx
     *
     * @var string
     */
    public $leadId;

    // 城市名称
    /**
     * @example xxx
     *
     * @var string
     */
    public $cityName;

    // 省份id
    /**
     * @example xxxx
     *
     * @var string
     */
    public $pid;

    // 城市id
    /**
     * @example xxxx
     *
     * @var string
     */
    public $cid;

    // 品牌名称
    /**
     * @example xxxx
     *
     * @var string
     */
    public $brandName;

    // 车系名称
    /**
     * @example xxx
     *
     * @var string
     */
    public $seriesName;

    // 汽车之家车型id
    /**
     * @example xxx
     *
     * @var string
     */
    public $specId;

    // 车型名称
    /**
     * @example xxxx
     *
     * @var string
     */
    public $specName;

    // 首次上牌时间格式 yyyy/MM/dd
    /**
     * @example 2020/01/01
     *
     * @var string
     */
    public $firstRegTime;

    // 行驶公里数(km)
    /**
     * @example 12345.67
     *
     * @var string
     */
    public $mileage;
    protected $_name = [
        'leadId'       => 'lead_id',
        'cityName'     => 'city_name',
        'pid'          => 'pid',
        'cid'          => 'cid',
        'brandName'    => 'brand_name',
        'seriesName'   => 'series_name',
        'specId'       => 'spec_id',
        'specName'     => 'spec_name',
        'firstRegTime' => 'first_reg_time',
        'mileage'      => 'mileage',
    ];

    public function validate()
    {
        Model::validateRequired('leadId', $this->leadId, true);
        Model::validateRequired('cityName', $this->cityName, true);
        Model::validateRequired('pid', $this->pid, true);
        Model::validateRequired('cid', $this->cid, true);
        Model::validateRequired('specId', $this->specId, true);
        Model::validateRequired('firstRegTime', $this->firstRegTime, true);
        Model::validateRequired('mileage', $this->mileage, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->leadId) {
            $res['lead_id'] = $this->leadId;
        }
        if (null !== $this->cityName) {
            $res['city_name'] = $this->cityName;
        }
        if (null !== $this->pid) {
            $res['pid'] = $this->pid;
        }
        if (null !== $this->cid) {
            $res['cid'] = $this->cid;
        }
        if (null !== $this->brandName) {
            $res['brand_name'] = $this->brandName;
        }
        if (null !== $this->seriesName) {
            $res['series_name'] = $this->seriesName;
        }
        if (null !== $this->specId) {
            $res['spec_id'] = $this->specId;
        }
        if (null !== $this->specName) {
            $res['spec_name'] = $this->specName;
        }
        if (null !== $this->firstRegTime) {
            $res['first_reg_time'] = $this->firstRegTime;
        }
        if (null !== $this->mileage) {
            $res['mileage'] = $this->mileage;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UsedCarInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['lead_id'])) {
            $model->leadId = $map['lead_id'];
        }
        if (isset($map['city_name'])) {
            $model->cityName = $map['city_name'];
        }
        if (isset($map['pid'])) {
            $model->pid = $map['pid'];
        }
        if (isset($map['cid'])) {
            $model->cid = $map['cid'];
        }
        if (isset($map['brand_name'])) {
            $model->brandName = $map['brand_name'];
        }
        if (isset($map['series_name'])) {
            $model->seriesName = $map['series_name'];
        }
        if (isset($map['spec_id'])) {
            $model->specId = $map['spec_id'];
        }
        if (isset($map['spec_name'])) {
            $model->specName = $map['spec_name'];
        }
        if (isset($map['first_reg_time'])) {
            $model->firstRegTime = $map['first_reg_time'];
        }
        if (isset($map['mileage'])) {
            $model->mileage = $map['mileage'];
        }

        return $model;
    }
}
