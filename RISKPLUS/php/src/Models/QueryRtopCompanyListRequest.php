<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryRtopCompanyListRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'activeAreas' => 'active_areas',
        'categories' => 'categories',
        'companyStates' => 'company_states',
        'feedback' => 'feedback',
        'maxRiskScore' => 'max_risk_score',
        'maxRiskScoreWeeklyFloat' => 'max_risk_score_weekly_float',
        'maxSpreadNumber' => 'max_spread_number',
        'minRiskScore' => 'min_risk_score',
        'minRiskScoreWeeklyFloat' => 'min_risk_score_weekly_float',
        'minSpreadNumber' => 'min_spread_number',
        'normalOperation' => 'normal_operation',
        'operateAreas' => 'operate_areas',
        'pageNo' => 'page_no',
        'pageSize' => 'page_size',
        'platformStates' => 'platform_states',
        'registerAreas' => 'register_areas',
        'riskyDimensions' => 'risky_dimensions',
        'riskTags' => 'risk_tags',
        'riskTypes' => 'risk_types',
        'sortField' => 'sort_field',
        'sortType' => 'sort_type',
        'userPlace' => 'user_place',
        'userPlaceType' => 'user_place_type',
    ];
    public function validate() {
        Model::validateRequired('pageNo', $this->pageNo, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('userPlace', $this->userPlace, true);
        Model::validateRequired('userPlaceType', $this->userPlaceType, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->activeAreas) {
            $res['active_areas'] = $this->activeAreas;
        }
        if (null !== $this->categories) {
            $res['categories'] = $this->categories;
        }
        if (null !== $this->companyStates) {
            $res['company_states'] = $this->companyStates;
        }
        if (null !== $this->feedback) {
            $res['feedback'] = $this->feedback;
        }
        if (null !== $this->maxRiskScore) {
            $res['max_risk_score'] = $this->maxRiskScore;
        }
        if (null !== $this->maxRiskScoreWeeklyFloat) {
            $res['max_risk_score_weekly_float'] = $this->maxRiskScoreWeeklyFloat;
        }
        if (null !== $this->maxSpreadNumber) {
            $res['max_spread_number'] = $this->maxSpreadNumber;
        }
        if (null !== $this->minRiskScore) {
            $res['min_risk_score'] = $this->minRiskScore;
        }
        if (null !== $this->minRiskScoreWeeklyFloat) {
            $res['min_risk_score_weekly_float'] = $this->minRiskScoreWeeklyFloat;
        }
        if (null !== $this->minSpreadNumber) {
            $res['min_spread_number'] = $this->minSpreadNumber;
        }
        if (null !== $this->normalOperation) {
            $res['normal_operation'] = $this->normalOperation;
        }
        if (null !== $this->operateAreas) {
            $res['operate_areas'] = $this->operateAreas;
        }
        if (null !== $this->pageNo) {
            $res['page_no'] = $this->pageNo;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->platformStates) {
            $res['platform_states'] = $this->platformStates;
        }
        if (null !== $this->registerAreas) {
            $res['register_areas'] = $this->registerAreas;
        }
        if (null !== $this->riskyDimensions) {
            $res['risky_dimensions'] = $this->riskyDimensions;
        }
        if (null !== $this->riskTags) {
            $res['risk_tags'] = $this->riskTags;
        }
        if (null !== $this->riskTypes) {
            $res['risk_types'] = $this->riskTypes;
        }
        if (null !== $this->sortField) {
            $res['sort_field'] = $this->sortField;
        }
        if (null !== $this->sortType) {
            $res['sort_type'] = $this->sortType;
        }
        if (null !== $this->userPlace) {
            $res['user_place'] = $this->userPlace;
        }
        if (null !== $this->userPlaceType) {
            $res['user_place_type'] = $this->userPlaceType;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryRtopCompanyListRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['active_areas'])){
            if(!empty($map['active_areas'])){
                $model->activeAreas = $map['active_areas'];
            }
        }
        if(isset($map['categories'])){
            if(!empty($map['categories'])){
                $model->categories = $map['categories'];
            }
        }
        if(isset($map['company_states'])){
            if(!empty($map['company_states'])){
                $model->companyStates = $map['company_states'];
            }
        }
        if(isset($map['feedback'])){
            if(!empty($map['feedback'])){
                $model->feedback = $map['feedback'];
            }
        }
        if(isset($map['max_risk_score'])){
            $model->maxRiskScore = $map['max_risk_score'];
        }
        if(isset($map['max_risk_score_weekly_float'])){
            $model->maxRiskScoreWeeklyFloat = $map['max_risk_score_weekly_float'];
        }
        if(isset($map['max_spread_number'])){
            $model->maxSpreadNumber = $map['max_spread_number'];
        }
        if(isset($map['min_risk_score'])){
            $model->minRiskScore = $map['min_risk_score'];
        }
        if(isset($map['min_risk_score_weekly_float'])){
            $model->minRiskScoreWeeklyFloat = $map['min_risk_score_weekly_float'];
        }
        if(isset($map['min_spread_number'])){
            $model->minSpreadNumber = $map['min_spread_number'];
        }
        if(isset($map['normal_operation'])){
            $model->normalOperation = $map['normal_operation'];
        }
        if(isset($map['operate_areas'])){
            if(!empty($map['operate_areas'])){
                $model->operateAreas = $map['operate_areas'];
            }
        }
        if(isset($map['page_no'])){
            $model->pageNo = $map['page_no'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['platform_states'])){
            if(!empty($map['platform_states'])){
                $model->platformStates = $map['platform_states'];
            }
        }
        if(isset($map['register_areas'])){
            if(!empty($map['register_areas'])){
                $model->registerAreas = $map['register_areas'];
            }
        }
        if(isset($map['risky_dimensions'])){
            if(!empty($map['risky_dimensions'])){
                $model->riskyDimensions = $map['risky_dimensions'];
            }
        }
        if(isset($map['risk_tags'])){
            if(!empty($map['risk_tags'])){
                $model->riskTags = $map['risk_tags'];
            }
        }
        if(isset($map['risk_types'])){
            if(!empty($map['risk_types'])){
                $model->riskTypes = $map['risk_types'];
            }
        }
        if(isset($map['sort_field'])){
            $model->sortField = $map['sort_field'];
        }
        if(isset($map['sort_type'])){
            $model->sortType = $map['sort_type'];
        }
        if(isset($map['user_place'])){
            $model->userPlace = $map['user_place'];
        }
        if(isset($map['user_place_type'])){
            $model->userPlaceType = $map['user_place_type'];
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

    // 活跃地区
    /**
     * @var string[]
     */
    public $activeAreas;

    // 企业类型
    /**
     * @var string[]
     */
    public $categories;

    // 企业状态
    /**
     * @var string[]
     */
    public $companyStates;

    // 反馈
    /**
     * @var string[]
     */
    public $feedback;

    // 风险指数最大值
    /**
     * @var int
     */
    public $maxRiskScore;

    // 指数周波动最大值
    /**
     * @var string
     */
    public $maxRiskScoreWeeklyFloat;

    // 传播人次最大值
    /**
     * @var int
     */
    public $maxSpreadNumber;

    // 风险指数最小值
    /**
     * @var int
     */
    public $minRiskScore;

    // 指数周波动最小值
    /**
     * @var string
     */
    public $minRiskScoreWeeklyFloat;

    // 传播人次最小值
    /**
     * @var int
     */
    public $minSpreadNumber;

    // 正常营运状态
    /**
     * @var bool
     */
    public $normalOperation;

    // 经营地区
    /**
     * @var string[]
     */
    public $operateAreas;

    // 当前是第几页
    /**
     * @var int
     */
    public $pageNo;

    // 每一页的记录条数
    /**
     * @var int
     */
    public $pageSize;

    // 平台状态
    /**
     * @var string[]
     */
    public $platformStates;

    // 注册地区
    /**
     * @var string[]
     */
    public $registerAreas;

    // 高风险维度
    /**
     * @var string[]
     */
    public $riskyDimensions;

    // 风险标签
    /**
     * @var string[]
     */
    public $riskTags;

    // 风险定性
    /**
     * @var string[]
     */
    public $riskTypes;

    // 排序字段
    /**
     * @var string
     */
    public $sortField;

    // 排序类型
    /**
     * @var string
     */
    public $sortType;

    // 用户属地
    /**
     * @var string
     */
    public $userPlace;

    // 用户所在地类型
    /**
     * @var string
     */
    public $userPlaceType;

}
