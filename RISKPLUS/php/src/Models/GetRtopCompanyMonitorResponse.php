<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\RISKPLUS\Models\RtopMonitorCompanyFeature;

class GetRtopCompanyMonitorResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'activeCity' => 'active_city',
        'companyCategory' => 'company_category',
        'crowdRiskType' => 'crowd_risk_type',
        'features' => 'features',
        'moneyInvolved' => 'money_involved',
        'monitorRiskTags' => 'monitor_risk_tags',
        'monitorScore' => 'monitor_score',
        'peopleInvolved' => 'people_involved',
        'registeredCity' => 'registered_city',
    ];
    public function validate() {
        Model::validateRequired('activeCity', $this->activeCity, true);
        Model::validateRequired('crowdRiskType', $this->crowdRiskType, true);
        Model::validateRequired('features', $this->features, true);
        Model::validateRequired('moneyInvolved', $this->moneyInvolved, true);
        Model::validateRequired('monitorRiskTags', $this->monitorRiskTags, true);
        Model::validateRequired('monitorScore', $this->monitorScore, true);
        Model::validateRequired('peopleInvolved', $this->peopleInvolved, true);
        Model::validateRequired('registeredCity', $this->registeredCity, true);
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
        if (null !== $this->companyCategory) {
            $res['company_category'] = $this->companyCategory;
        }
        if (null !== $this->crowdRiskType) {
            $res['crowd_risk_type'] = $this->crowdRiskType;
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
        if (null !== $this->moneyInvolved) {
            $res['money_involved'] = $this->moneyInvolved;
        }
        if (null !== $this->monitorRiskTags) {
            $res['monitor_risk_tags'] = $this->monitorRiskTags;
        }
        if (null !== $this->monitorScore) {
            $res['monitor_score'] = $this->monitorScore;
        }
        if (null !== $this->peopleInvolved) {
            $res['people_involved'] = $this->peopleInvolved;
        }
        if (null !== $this->registeredCity) {
            $res['registered_city'] = $this->registeredCity;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetRtopCompanyMonitorResponse
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
        if(isset($map['company_category'])){
            $model->companyCategory = $map['company_category'];
        }
        if(isset($map['crowd_risk_type'])){
            $model->crowdRiskType = $map['crowd_risk_type'];
        }
        if(isset($map['features'])){
            if(!empty($map['features'])){
                $model->features = [];
                $n = 0;
                foreach($map['features'] as $item) {
                    $model->features[$n++] = null !== $item ? RtopMonitorCompanyFeature::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['money_involved'])){
            $model->moneyInvolved = $map['money_involved'];
        }
        if(isset($map['monitor_risk_tags'])){
            if(!empty($map['monitor_risk_tags'])){
                $model->monitorRiskTags = $map['monitor_risk_tags'];
            }
        }
        if(isset($map['monitor_score'])){
            $model->monitorScore = $map['monitor_score'];
        }
        if(isset($map['people_involved'])){
            $model->peopleInvolved = $map['people_involved'];
        }
        if(isset($map['registered_city'])){
            $model->registeredCity = $map['registered_city'];
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

    // 活跃市，不带国家和地区的代码
    /**
     * @var string
     */
    public $activeCity;

    // 监测企业的行业
    /**
     * @var string
     */
    public $companyCategory;

    // 涉众风险类型
    /**
     * @var string
     */
    public $crowdRiskType;

    /**
     * @var RtopMonitorCompanyFeature[]
     */
    public $features;

    // 影响金额
    /**
     * @var int
     */
    public $moneyInvolved;

    /**
     * @var string[]
     */
    public $monitorRiskTags;

    // 监测企业的评分
    /**
     * @var int
     */
    public $monitorScore;

    // 影响人数
    /**
     * @var int
     */
    public $peopleInvolved;

    // 注册市，不带国家和地区的代码
    /**
     * @var string
     */
    public $registeredCity;

}
