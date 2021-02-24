<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class ListRtopCrowdriskRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'activePlaces' => 'active_places',
        'crowdRiskLevels' => 'crowd_risk_levels',
        'crowdRiskTypes' => 'crowd_risk_types',
        'endTime' => 'end_time',
        'pageNum' => 'page_num',
        'pageSize' => 'page_size',
        'placeName' => 'place_name',
        'placeType' => 'place_type',
        'regPlaces' => 'reg_places',
        'sortBy' => 'sort_by',
        'sortType' => 'sort_type',
        'startTime' => 'start_time',
    ];
    public function validate() {
        Model::validatePattern('endTime', $this->endTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('startTime', $this->startTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->activePlaces) {
            $res['active_places'] = $this->activePlaces;
        }
        if (null !== $this->crowdRiskLevels) {
            $res['crowd_risk_levels'] = $this->crowdRiskLevels;
        }
        if (null !== $this->crowdRiskTypes) {
            $res['crowd_risk_types'] = $this->crowdRiskTypes;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->placeName) {
            $res['place_name'] = $this->placeName;
        }
        if (null !== $this->placeType) {
            $res['place_type'] = $this->placeType;
        }
        if (null !== $this->regPlaces) {
            $res['reg_places'] = $this->regPlaces;
        }
        if (null !== $this->sortBy) {
            $res['sort_by'] = $this->sortBy;
        }
        if (null !== $this->sortType) {
            $res['sort_type'] = $this->sortType;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ListRtopCrowdriskRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['active_places'])){
            if(!empty($map['active_places'])){
                $model->activePlaces = $map['active_places'];
            }
        }
        if(isset($map['crowd_risk_levels'])){
            if(!empty($map['crowd_risk_levels'])){
                $model->crowdRiskLevels = $map['crowd_risk_levels'];
            }
        }
        if(isset($map['crowd_risk_types'])){
            if(!empty($map['crowd_risk_types'])){
                $model->crowdRiskTypes = $map['crowd_risk_types'];
            }
        }
        if(isset($map['end_time'])){
            $model->endTime = $map['end_time'];
        }
        if(isset($map['page_num'])){
            $model->pageNum = $map['page_num'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['place_name'])){
            $model->placeName = $map['place_name'];
        }
        if(isset($map['place_type'])){
            $model->placeType = $map['place_type'];
        }
        if(isset($map['reg_places'])){
            if(!empty($map['reg_places'])){
                $model->regPlaces = $map['reg_places'];
            }
        }
        if(isset($map['sort_by'])){
            $model->sortBy = $map['sort_by'];
        }
        if(isset($map['sort_type'])){
            $model->sortType = $map['sort_type'];
        }
        if(isset($map['start_time'])){
            $model->startTime = $map['start_time'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 活跃地筛选
    /**
     * @var string[]
     */
    public $activePlaces;

    // 风险等级
    /**
     * @var string[]
     */
    public $crowdRiskLevels;

    // 风险类型
    /**
     * @var string[]
     */
    public $crowdRiskTypes;

    // 结束时间
    /**
     * @var string
     */
    public $endTime;

    // 页码
    /**
     * @var int
     */
    public $pageNum;

    // 每页条数
    /**
     * @var int
     */
    public $pageSize;

    // 所在地的名称
    /**
     * @var string
     */
    public $placeName;

    // 地区类型
    /**
     * @var string
     */
    public $placeType;

    // 注册地筛选
    /**
     * @var string[]
     */
    public $regPlaces;

    // 排序字段
    /**
     * @var string
     */
    public $sortBy;

    // 排序方式
    /**
     * @var string
     */
    public $sortType;

    // 开始时间
    /**
     * @var string
     */
    public $startTime;

}
