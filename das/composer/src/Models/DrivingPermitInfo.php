<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class DrivingPermitInfo extends Model
{
    // 品牌名称
    /**
     * @example 品牌
     *
     * @var string
     */
    public $brandname;

    // 车身颜色
    /**
     * @example 红色
     *
     * @var string
     */
    public $bodycolor;

    // 使用性质
    /**
     * @example 运营车辆
     *
     * @var string
     */
    public $properties;

    // 车型
    /**
     * @example A1
     *
     * @var string
     */
    public $type;

    // 车辆类型
    /**
     * @example 车辆类型
     *
     * @var string
     */
    public $vehicletype;

    // 发动机号
    /**
     * @example 12345
     *
     * @var string
     */
    public $enginenumber;

    // 发动机型号
    /**
     * @example 型号
     *
     * @var string
     */
    public $enginemodel;

    // 初次登记日期
    /**
     * @example A
     *
     * @var string
     */
    public $firsissuedate;

    // 检验有效期止
    /**
     * @example A
     *
     * @var string
     */
    public $validitydayend;

    // 车辆状态
    /**
     * @example 有效
     *
     * @var string
     */
    public $vehiclestatus;

    // 核定载客数
    /**
     * @example 1
     *
     * @var string
     */
    public $passengers;

    // 强制报废期止
    /**
     * @example A
     *
     * @var string
     */
    public $retirementdate;

    // 燃料种类
    /**
     * @example 燃油
     *
     * @var string
     */
    public $fueltype;

    // 排量
    /**
     * @example 1.5T
     *
     * @var string
     */
    public $cc;

    // 出厂日期
    /**
     * @example A
     *
     * @var string
     */
    public $ppsdate;

    // 最大功率
    /**
     * @example 100
     *
     * @var string
     */
    public $maxjourney;

    // 轴数
    /**
     * @example 轴数
     *
     * @var string
     */
    public $shaft;

    // 轴距
    /**
     * @example 100
     *
     * @var string
     */
    public $wheelbase;

    // 前轮距
    /**
     * @example 100
     *
     * @var string
     */
    public $fronttread;

    // 后轮距
    /**
     * @example 100
     *
     * @var string
     */
    public $reartread;

    // 总重量
    /**
     * @example 1T
     *
     * @var string
     */
    public $crossweight;

    // 整备质量
    /**
     * @example 1T
     *
     * @var string
     */
    public $curbweight;

    // 核定载质量
    /**
     * @example 1T
     *
     * @var string
     */
    public $loadweight;

    // 车架号
    /**
     * @example 12345
     *
     * @var string
     */
    public $vin;

    // 车牌号
    /**
     * @example 12345
     *
     * @var string
     */
    public $plate;

    // 车牌种类
    /**
     * @example 01
     *
     * @var string
     */
    public $platetype;

    // 年检日期
    /**
     * @example A
     *
     * @var string
     */
    public $jianchetime;
    protected $_name = [
        'brandname'      => 'brandname',
        'bodycolor'      => 'bodycolor',
        'properties'     => 'properties',
        'type'           => 'type',
        'vehicletype'    => 'vehicletype',
        'enginenumber'   => 'enginenumber',
        'enginemodel'    => 'enginemodel',
        'firsissuedate'  => 'firsissuedate',
        'validitydayend' => 'validitydayend',
        'vehiclestatus'  => 'vehiclestatus',
        'passengers'     => 'passengers',
        'retirementdate' => 'retirementdate',
        'fueltype'       => 'fueltype',
        'cc'             => 'cc',
        'ppsdate'        => 'ppsdate',
        'maxjourney'     => 'maxjourney',
        'shaft'          => 'shaft',
        'wheelbase'      => 'wheelbase',
        'fronttread'     => 'fronttread',
        'reartread'      => 'reartread',
        'crossweight'    => 'crossweight',
        'curbweight'     => 'curbweight',
        'loadweight'     => 'loadweight',
        'vin'            => 'vin',
        'plate'          => 'plate',
        'platetype'      => 'platetype',
        'jianchetime'    => 'jianchetime',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->brandname) {
            $res['brandname'] = $this->brandname;
        }
        if (null !== $this->bodycolor) {
            $res['bodycolor'] = $this->bodycolor;
        }
        if (null !== $this->properties) {
            $res['properties'] = $this->properties;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->vehicletype) {
            $res['vehicletype'] = $this->vehicletype;
        }
        if (null !== $this->enginenumber) {
            $res['enginenumber'] = $this->enginenumber;
        }
        if (null !== $this->enginemodel) {
            $res['enginemodel'] = $this->enginemodel;
        }
        if (null !== $this->firsissuedate) {
            $res['firsissuedate'] = $this->firsissuedate;
        }
        if (null !== $this->validitydayend) {
            $res['validitydayend'] = $this->validitydayend;
        }
        if (null !== $this->vehiclestatus) {
            $res['vehiclestatus'] = $this->vehiclestatus;
        }
        if (null !== $this->passengers) {
            $res['passengers'] = $this->passengers;
        }
        if (null !== $this->retirementdate) {
            $res['retirementdate'] = $this->retirementdate;
        }
        if (null !== $this->fueltype) {
            $res['fueltype'] = $this->fueltype;
        }
        if (null !== $this->cc) {
            $res['cc'] = $this->cc;
        }
        if (null !== $this->ppsdate) {
            $res['ppsdate'] = $this->ppsdate;
        }
        if (null !== $this->maxjourney) {
            $res['maxjourney'] = $this->maxjourney;
        }
        if (null !== $this->shaft) {
            $res['shaft'] = $this->shaft;
        }
        if (null !== $this->wheelbase) {
            $res['wheelbase'] = $this->wheelbase;
        }
        if (null !== $this->fronttread) {
            $res['fronttread'] = $this->fronttread;
        }
        if (null !== $this->reartread) {
            $res['reartread'] = $this->reartread;
        }
        if (null !== $this->crossweight) {
            $res['crossweight'] = $this->crossweight;
        }
        if (null !== $this->curbweight) {
            $res['curbweight'] = $this->curbweight;
        }
        if (null !== $this->loadweight) {
            $res['loadweight'] = $this->loadweight;
        }
        if (null !== $this->vin) {
            $res['vin'] = $this->vin;
        }
        if (null !== $this->plate) {
            $res['plate'] = $this->plate;
        }
        if (null !== $this->platetype) {
            $res['platetype'] = $this->platetype;
        }
        if (null !== $this->jianchetime) {
            $res['jianchetime'] = $this->jianchetime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DrivingPermitInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['brandname'])) {
            $model->brandname = $map['brandname'];
        }
        if (isset($map['bodycolor'])) {
            $model->bodycolor = $map['bodycolor'];
        }
        if (isset($map['properties'])) {
            $model->properties = $map['properties'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['vehicletype'])) {
            $model->vehicletype = $map['vehicletype'];
        }
        if (isset($map['enginenumber'])) {
            $model->enginenumber = $map['enginenumber'];
        }
        if (isset($map['enginemodel'])) {
            $model->enginemodel = $map['enginemodel'];
        }
        if (isset($map['firsissuedate'])) {
            $model->firsissuedate = $map['firsissuedate'];
        }
        if (isset($map['validitydayend'])) {
            $model->validitydayend = $map['validitydayend'];
        }
        if (isset($map['vehiclestatus'])) {
            $model->vehiclestatus = $map['vehiclestatus'];
        }
        if (isset($map['passengers'])) {
            $model->passengers = $map['passengers'];
        }
        if (isset($map['retirementdate'])) {
            $model->retirementdate = $map['retirementdate'];
        }
        if (isset($map['fueltype'])) {
            $model->fueltype = $map['fueltype'];
        }
        if (isset($map['cc'])) {
            $model->cc = $map['cc'];
        }
        if (isset($map['ppsdate'])) {
            $model->ppsdate = $map['ppsdate'];
        }
        if (isset($map['maxjourney'])) {
            $model->maxjourney = $map['maxjourney'];
        }
        if (isset($map['shaft'])) {
            $model->shaft = $map['shaft'];
        }
        if (isset($map['wheelbase'])) {
            $model->wheelbase = $map['wheelbase'];
        }
        if (isset($map['fronttread'])) {
            $model->fronttread = $map['fronttread'];
        }
        if (isset($map['reartread'])) {
            $model->reartread = $map['reartread'];
        }
        if (isset($map['crossweight'])) {
            $model->crossweight = $map['crossweight'];
        }
        if (isset($map['curbweight'])) {
            $model->curbweight = $map['curbweight'];
        }
        if (isset($map['loadweight'])) {
            $model->loadweight = $map['loadweight'];
        }
        if (isset($map['vin'])) {
            $model->vin = $map['vin'];
        }
        if (isset($map['plate'])) {
            $model->plate = $map['plate'];
        }
        if (isset($map['platetype'])) {
            $model->platetype = $map['platetype'];
        }
        if (isset($map['jianchetime'])) {
            $model->jianchetime = $map['jianchetime'];
        }

        return $model;
    }
}
