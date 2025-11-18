<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class NewCarInfo extends Model
{
    // 车系
    /**
     * @example xx
     *
     * @var string
     */
    public $carSeries;

    // 金融方案
    /**
     * @example xxx
     *
     * @var string
     */
    public $finaicalPlan;

    // 车系id
    /**
     * @example xxx
     *
     * @var string
     */
    public $carSeriesId;

    // 请求提交唯一id
    /**
     * @example xxxx
     *
     * @var string
     */
    public $submitId;

    // 预计购买时间
    /**
     * @example 1
     *
     * @var string
     */
    public $purcharseTime;

    // 用户信息
    /**
     * @example
     *
     * @var CarUserInfo
     */
    public $userInfo;

    // 懂车帝或者汽车之家
    /**
     * @example DCD/QC
     *
     * @var string
     */
    public $matchSource;

    // 汽车之家车型id
    /**
     * @example 123
     *
     * @var string
     */
    public $qcCarSeriesId;
    protected $_name = [
        'carSeries'     => 'car_series',
        'finaicalPlan'  => 'finaical_plan',
        'carSeriesId'   => 'car_series_id',
        'submitId'      => 'submit_id',
        'purcharseTime' => 'purcharse_time',
        'userInfo'      => 'user_info',
        'matchSource'   => 'match_source',
        'qcCarSeriesId' => 'qc_car_series_id',
    ];

    public function validate()
    {
        Model::validateRequired('carSeries', $this->carSeries, true);
        Model::validateRequired('userInfo', $this->userInfo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->carSeries) {
            $res['car_series'] = $this->carSeries;
        }
        if (null !== $this->finaicalPlan) {
            $res['finaical_plan'] = $this->finaicalPlan;
        }
        if (null !== $this->carSeriesId) {
            $res['car_series_id'] = $this->carSeriesId;
        }
        if (null !== $this->submitId) {
            $res['submit_id'] = $this->submitId;
        }
        if (null !== $this->purcharseTime) {
            $res['purcharse_time'] = $this->purcharseTime;
        }
        if (null !== $this->userInfo) {
            $res['user_info'] = null !== $this->userInfo ? $this->userInfo->toMap() : null;
        }
        if (null !== $this->matchSource) {
            $res['match_source'] = $this->matchSource;
        }
        if (null !== $this->qcCarSeriesId) {
            $res['qc_car_series_id'] = $this->qcCarSeriesId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NewCarInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['car_series'])) {
            $model->carSeries = $map['car_series'];
        }
        if (isset($map['finaical_plan'])) {
            $model->finaicalPlan = $map['finaical_plan'];
        }
        if (isset($map['car_series_id'])) {
            $model->carSeriesId = $map['car_series_id'];
        }
        if (isset($map['submit_id'])) {
            $model->submitId = $map['submit_id'];
        }
        if (isset($map['purcharse_time'])) {
            $model->purcharseTime = $map['purcharse_time'];
        }
        if (isset($map['user_info'])) {
            $model->userInfo = CarUserInfo::fromMap($map['user_info']);
        }
        if (isset($map['match_source'])) {
            $model->matchSource = $map['match_source'];
        }
        if (isset($map['qc_car_series_id'])) {
            $model->qcCarSeriesId = $map['qc_car_series_id'];
        }

        return $model;
    }
}
