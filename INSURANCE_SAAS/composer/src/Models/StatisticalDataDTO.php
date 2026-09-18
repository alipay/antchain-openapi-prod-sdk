<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\INSURANCE_SAAS\Models\ConversionDataDTO;

class StatisticalDataDTO extends Model {
    protected $_name = [
        'project' => 'project',
        'dimensionId' => 'dimension_id',
        'timePeriod' => 'time_period',
        'startTime' => 'start_time',
        'endTime' => 'end_time',
        'costMoney' => 'cost_money',
        'mediaImpressionCount' => 'media_impression_count',
        'mediaClickCount' => 'media_click_count',
        'conversionDataList' => 'conversion_data_list',
    ];
    public function validate() {
        Model::validateRequired('project', $this->project, true);
        Model::validateRequired('dimensionId', $this->dimensionId, true);
        Model::validateRequired('timePeriod', $this->timePeriod, true);
        Model::validateRequired('startTime', $this->startTime, true);
        Model::validateRequired('endTime', $this->endTime, true);
        Model::validateRequired('costMoney', $this->costMoney, true);
        Model::validateRequired('mediaImpressionCount', $this->mediaImpressionCount, true);
        Model::validateRequired('mediaClickCount', $this->mediaClickCount, true);
        Model::validateRequired('conversionDataList', $this->conversionDataList, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->project) {
            $res['project'] = $this->project;
        }
        if (null !== $this->dimensionId) {
            $res['dimension_id'] = $this->dimensionId;
        }
        if (null !== $this->timePeriod) {
            $res['time_period'] = $this->timePeriod;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->costMoney) {
            $res['cost_money'] = $this->costMoney;
        }
        if (null !== $this->mediaImpressionCount) {
            $res['media_impression_count'] = $this->mediaImpressionCount;
        }
        if (null !== $this->mediaClickCount) {
            $res['media_click_count'] = $this->mediaClickCount;
        }
        if (null !== $this->conversionDataList) {
            $res['conversion_data_list'] = [];
            if(null !== $this->conversionDataList && is_array($this->conversionDataList)){
                $n = 0;
                foreach($this->conversionDataList as $item){
                    $res['conversion_data_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return StatisticalDataDTO
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['project'])){
            $model->project = $map['project'];
        }
        if(isset($map['dimension_id'])){
            $model->dimensionId = $map['dimension_id'];
        }
        if(isset($map['time_period'])){
            $model->timePeriod = $map['time_period'];
        }
        if(isset($map['start_time'])){
            $model->startTime = $map['start_time'];
        }
        if(isset($map['end_time'])){
            $model->endTime = $map['end_time'];
        }
        if(isset($map['cost_money'])){
            $model->costMoney = $map['cost_money'];
        }
        if(isset($map['media_impression_count'])){
            $model->mediaImpressionCount = $map['media_impression_count'];
        }
        if(isset($map['media_click_count'])){
            $model->mediaClickCount = $map['media_click_count'];
        }
        if(isset($map['conversion_data_list'])){
            if(!empty($map['conversion_data_list'])){
                $model->conversionDataList = [];
                $n = 0;
                foreach($map['conversion_data_list'] as $item) {
                    $model->conversionDataList[$n++] = null !== $item ? ConversionDataDTO::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // 项目标识
    /**
     * @example 2026072000000138312001
     * @var string
     */
    public $project;

    // 统计维度id
    /**
     * @example 2026072000000138312001
     * @var string
     */
    public $dimensionId;

    // 时间维度
    /**
     * @example hour
     * @var string
     */
    public $timePeriod;

    // 开始时间
    /**
     * @example yyyy-MM-dd HH:mm
     * @var string
     */
    public $startTime;

    // 结束时间
    /**
     * @example yyyy-MM-dd HH:mm
     * @var string
     */
    public $endTime;

    // 花费金额
    /**
     * @example 6666.66
     * @var string
     */
    public $costMoney;

    // 曝光量
    /**
     * @example 100
     * @var int
     */
    public $mediaImpressionCount;

    // 点击量
    /**
     * @example 100
     * @var int
     */
    public $mediaClickCount;

    // 目标转化量相关数据
    /**
     * @example undefined
     * @var ConversionDataDTO[]
     */
    public $conversionDataList;

}
