<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class DeviceTripProperties extends Model
{
    // 上报时间
    /**
     * @example 1765794345159
     *
     * @var string
     */
    public $reportTime;

    // 1
    /**
     * @example 1
     *
     * @var string
     */
    public $powerStatus;

    // 1
    /**
     * @example 1
     *
     * @var string
     */
    public $enduranceMileage;

    // 1
    /**
     * @example 1
     *
     * @var string
     */
    public $totalMileage;

    // 1
    /**
     * @example 1
     *
     * @var string
     */
    public $speed;

    // 1
    /**
     * @example 1
     *
     * @var string
     */
    public $coord;

    // 1
    /**
     * @example 1
     *
     * @var string
     */
    public $location;

    // 1
    /**
     * @example 1
     *
     * @var string
     */
    public $rein;

    // 1
    /**
     * @example 1
     *
     * @var string
     */
    public $spdBd;

    // 1
    /**
     * @example 1
     *
     * @var string
     */
    public $cs;

    // 1
    /**
     * @example 1
     *
     * @var string
     */
    public $eqst;
    protected $_name = [
        'reportTime'       => 'report_time',
        'powerStatus'      => 'power_status',
        'enduranceMileage' => 'endurance_mileage',
        'totalMileage'     => 'total_mileage',
        'speed'            => 'speed',
        'coord'            => 'coord',
        'location'         => 'location',
        'rein'             => 'rein',
        'spdBd'            => 'spd_bd',
        'cs'               => 'cs',
        'eqst'             => 'eqst',
    ];

    public function validate()
    {
        Model::validateRequired('reportTime', $this->reportTime, true);
        Model::validateRequired('powerStatus', $this->powerStatus, true);
        Model::validateRequired('enduranceMileage', $this->enduranceMileage, true);
        Model::validateRequired('totalMileage', $this->totalMileage, true);
        Model::validateRequired('speed', $this->speed, true);
        Model::validateRequired('coord', $this->coord, true);
        Model::validateRequired('location', $this->location, true);
        Model::validateRequired('rein', $this->rein, true);
        Model::validateRequired('spdBd', $this->spdBd, true);
        Model::validateRequired('cs', $this->cs, true);
        Model::validateRequired('eqst', $this->eqst, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reportTime) {
            $res['report_time'] = $this->reportTime;
        }
        if (null !== $this->powerStatus) {
            $res['power_status'] = $this->powerStatus;
        }
        if (null !== $this->enduranceMileage) {
            $res['endurance_mileage'] = $this->enduranceMileage;
        }
        if (null !== $this->totalMileage) {
            $res['total_mileage'] = $this->totalMileage;
        }
        if (null !== $this->speed) {
            $res['speed'] = $this->speed;
        }
        if (null !== $this->coord) {
            $res['coord'] = $this->coord;
        }
        if (null !== $this->location) {
            $res['location'] = $this->location;
        }
        if (null !== $this->rein) {
            $res['rein'] = $this->rein;
        }
        if (null !== $this->spdBd) {
            $res['spd_bd'] = $this->spdBd;
        }
        if (null !== $this->cs) {
            $res['cs'] = $this->cs;
        }
        if (null !== $this->eqst) {
            $res['eqst'] = $this->eqst;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeviceTripProperties
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['report_time'])) {
            $model->reportTime = $map['report_time'];
        }
        if (isset($map['power_status'])) {
            $model->powerStatus = $map['power_status'];
        }
        if (isset($map['endurance_mileage'])) {
            $model->enduranceMileage = $map['endurance_mileage'];
        }
        if (isset($map['total_mileage'])) {
            $model->totalMileage = $map['total_mileage'];
        }
        if (isset($map['speed'])) {
            $model->speed = $map['speed'];
        }
        if (isset($map['coord'])) {
            $model->coord = $map['coord'];
        }
        if (isset($map['location'])) {
            $model->location = $map['location'];
        }
        if (isset($map['rein'])) {
            $model->rein = $map['rein'];
        }
        if (isset($map['spd_bd'])) {
            $model->spdBd = $map['spd_bd'];
        }
        if (isset($map['cs'])) {
            $model->cs = $map['cs'];
        }
        if (isset($map['eqst'])) {
            $model->eqst = $map['eqst'];
        }

        return $model;
    }
}
