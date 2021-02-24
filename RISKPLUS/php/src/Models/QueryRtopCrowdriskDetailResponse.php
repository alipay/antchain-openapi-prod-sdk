<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\RISKPLUS\Models\RtopAgeDistribution;
use AntChain\RISKPLUS\Models\RtopCrowdRiskFeatureResp;
use AntChain\RISKPLUS\Models\RtopGenderDistribution;
use AntChain\RISKPLUS\Models\RtopDateDistribution;
use AntChain\RISKPLUS\Models\RtopPopulationDistribution;

class QueryRtopCrowdriskDetailResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'activeCity' => 'active_city',
        'activeCounty' => 'active_county',
        'activeProvince' => 'active_province',
        'ageDistribution' => 'age_distribution',
        'clueTags' => 'clue_tags',
        'conclusion' => 'conclusion',
        'crowdRiskLevel' => 'crowd_risk_level',
        'crowdRiskScore' => 'crowd_risk_score',
        'crowdRiskType' => 'crowd_risk_type',
        'detectedTime' => 'detected_time',
        'features' => 'features',
        'genderDistribution' => 'gender_distribution',
        'lastActiveTime' => 'last_active_time',
        'moneyInvolved' => 'money_involved',
        'moneyInvolvedHistory' => 'money_involved_history',
        'peopleInvolved' => 'people_involved',
        'peopleInvolvedHistory' => 'people_involved_history',
        'populationDistribution' => 'population_distribution',
        'registeredCity' => 'registered_city',
        'registeredCounty' => 'registered_county',
        'registeredProvince' => 'registered_province',
    ];
    public function validate() {
        Model::validatePattern('detectedTime', $this->detectedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('lastActiveTime', $this->lastActiveTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->activeCity) {
            $res['active_city'] = $this->activeCity;
        }
        if (null !== $this->activeCounty) {
            $res['active_county'] = $this->activeCounty;
        }
        if (null !== $this->activeProvince) {
            $res['active_province'] = $this->activeProvince;
        }
        if (null !== $this->ageDistribution) {
            $res['age_distribution'] = [];
            if(null !== $this->ageDistribution && is_array($this->ageDistribution)){
                $n = 0;
                foreach($this->ageDistribution as $item){
                    $res['age_distribution'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->clueTags) {
            $res['clue_tags'] = $this->clueTags;
        }
        if (null !== $this->conclusion) {
            $res['conclusion'] = $this->conclusion;
        }
        if (null !== $this->crowdRiskLevel) {
            $res['crowd_risk_level'] = $this->crowdRiskLevel;
        }
        if (null !== $this->crowdRiskScore) {
            $res['crowd_risk_score'] = $this->crowdRiskScore;
        }
        if (null !== $this->crowdRiskType) {
            $res['crowd_risk_type'] = $this->crowdRiskType;
        }
        if (null !== $this->detectedTime) {
            $res['detected_time'] = $this->detectedTime;
        }
        if (null !== $this->features) {
            $res['features'] = [];
            if(null !== $this->features && is_array($this->features)){
                $n = 0;
                foreach($this->features as $item){
                    $res['features'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->genderDistribution) {
            $res['gender_distribution'] = [];
            if(null !== $this->genderDistribution && is_array($this->genderDistribution)){
                $n = 0;
                foreach($this->genderDistribution as $item){
                    $res['gender_distribution'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->lastActiveTime) {
            $res['last_active_time'] = $this->lastActiveTime;
        }
        if (null !== $this->moneyInvolved) {
            $res['money_involved'] = $this->moneyInvolved;
        }
        if (null !== $this->moneyInvolvedHistory) {
            $res['money_involved_history'] = [];
            if(null !== $this->moneyInvolvedHistory && is_array($this->moneyInvolvedHistory)){
                $n = 0;
                foreach($this->moneyInvolvedHistory as $item){
                    $res['money_involved_history'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->peopleInvolved) {
            $res['people_involved'] = $this->peopleInvolved;
        }
        if (null !== $this->peopleInvolvedHistory) {
            $res['people_involved_history'] = [];
            if(null !== $this->peopleInvolvedHistory && is_array($this->peopleInvolvedHistory)){
                $n = 0;
                foreach($this->peopleInvolvedHistory as $item){
                    $res['people_involved_history'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->populationDistribution) {
            $res['population_distribution'] = [];
            if(null !== $this->populationDistribution && is_array($this->populationDistribution)){
                $n = 0;
                foreach($this->populationDistribution as $item){
                    $res['population_distribution'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->registeredCity) {
            $res['registered_city'] = $this->registeredCity;
        }
        if (null !== $this->registeredCounty) {
            $res['registered_county'] = $this->registeredCounty;
        }
        if (null !== $this->registeredProvince) {
            $res['registered_province'] = $this->registeredProvince;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryRtopCrowdriskDetailResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['active_city'])){
            $model->activeCity = $map['active_city'];
        }
        if(isset($map['active_county'])){
            $model->activeCounty = $map['active_county'];
        }
        if(isset($map['active_province'])){
            $model->activeProvince = $map['active_province'];
        }
        if(isset($map['age_distribution'])){
            if(!empty($map['age_distribution'])){
                $model->ageDistribution = [];
                $n = 0;
                foreach($map['age_distribution'] as $item) {
                    $model->ageDistribution[$n++] = null !== $item ? RtopAgeDistribution::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['clue_tags'])){
            if(!empty($map['clue_tags'])){
                $model->clueTags = $map['clue_tags'];
            }
        }
        if(isset($map['conclusion'])){
            $model->conclusion = $map['conclusion'];
        }
        if(isset($map['crowd_risk_level'])){
            $model->crowdRiskLevel = $map['crowd_risk_level'];
        }
        if(isset($map['crowd_risk_score'])){
            $model->crowdRiskScore = $map['crowd_risk_score'];
        }
        if(isset($map['crowd_risk_type'])){
            $model->crowdRiskType = $map['crowd_risk_type'];
        }
        if(isset($map['detected_time'])){
            $model->detectedTime = $map['detected_time'];
        }
        if(isset($map['features'])){
            if(!empty($map['features'])){
                $model->features = [];
                $n = 0;
                foreach($map['features'] as $item) {
                    $model->features[$n++] = null !== $item ? RtopCrowdRiskFeatureResp::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['gender_distribution'])){
            if(!empty($map['gender_distribution'])){
                $model->genderDistribution = [];
                $n = 0;
                foreach($map['gender_distribution'] as $item) {
                    $model->genderDistribution[$n++] = null !== $item ? RtopGenderDistribution::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['last_active_time'])){
            $model->lastActiveTime = $map['last_active_time'];
        }
        if(isset($map['money_involved'])){
            $model->moneyInvolved = $map['money_involved'];
        }
        if(isset($map['money_involved_history'])){
            if(!empty($map['money_involved_history'])){
                $model->moneyInvolvedHistory = [];
                $n = 0;
                foreach($map['money_involved_history'] as $item) {
                    $model->moneyInvolvedHistory[$n++] = null !== $item ? RtopDateDistribution::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['people_involved'])){
            $model->peopleInvolved = $map['people_involved'];
        }
        if(isset($map['people_involved_history'])){
            if(!empty($map['people_involved_history'])){
                $model->peopleInvolvedHistory = [];
                $n = 0;
                foreach($map['people_involved_history'] as $item) {
                    $model->peopleInvolvedHistory[$n++] = null !== $item ? RtopDateDistribution::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['population_distribution'])){
            if(!empty($map['population_distribution'])){
                $model->populationDistribution = [];
                $n = 0;
                foreach($map['population_distribution'] as $item) {
                    $model->populationDistribution[$n++] = null !== $item ? RtopPopulationDistribution::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['registered_city'])){
            $model->registeredCity = $map['registered_city'];
        }
        if(isset($map['registered_county'])){
            $model->registeredCounty = $map['registered_county'];
        }
        if(isset($map['registered_province'])){
            $model->registeredProvince = $map['registered_province'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $reqMsgId;

    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 活跃市
    /**
     * @var string
     */
    public $activeCity;

    // 活跃县
    /**
     * @var string
     */
    public $activeCounty;

    // 活跃省
    /**
     * @var string
     */
    public $activeProvince;

    // 年龄分布
    /**
     * @var RtopAgeDistribution[]
     */
    public $ageDistribution;

    // 线索标签
    /**
     * @var string[]
     */
    public $clueTags;

    // 报文
    /**
     * @var string
     */
    public $conclusion;

    // 风险等级
    /**
     * @var string
     */
    public $crowdRiskLevel;

    // 涉众风险分析的分数
    /**
     * @var int
     */
    public $crowdRiskScore;

    // 风险类型
    /**
     * @var string
     */
    public $crowdRiskType;

    // 发现时间
    /**
     * @var string
     */
    public $detectedTime;

    // 特征
    /**
     * @var RtopCrowdRiskFeatureResp[]
     */
    public $features;

    // 性别分布
    /**
     * @var RtopGenderDistribution[]
     */
    public $genderDistribution;

    // 上次活跃时间
    /**
     * @var string
     */
    public $lastActiveTime;

    // 涉案金额
    /**
     * @var int
     */
    public $moneyInvolved;

    // 影响金额的历史曲线
    /**
     * @var RtopDateDistribution[]
     */
    public $moneyInvolvedHistory;

    // 涉案人数
    /**
     * @var int
     */
    public $peopleInvolved;

    // 影响人数的历史曲线
    /**
     * @var RtopDateDistribution[]
     */
    public $peopleInvolvedHistory;

    // 影响的人数分布，key为地区城市，value为影响的人数
    /**
     * @var RtopPopulationDistribution[]
     */
    public $populationDistribution;

    // 注册市
    /**
     * @var string
     */
    public $registeredCity;

    // 注册县
    /**
     * @var string
     */
    public $registeredCounty;

    // 注册省
    /**
     * @var string
     */
    public $registeredProvince;

}
