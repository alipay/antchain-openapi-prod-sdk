<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RtopCrowdRiskSummaryResp extends Model
{
    // 活跃市
    /**
     * @example 杭州市
     *
     * @var string
     */
    public $activeCity;

    // 活跃县
    /**
     * @example 西湖区
     *
     * @var string
     */
    public $activeCounty;

    // 活跃省
    /**
     * @example 浙江省
     *
     * @var string
     */
    public $activeProvince;

    // 风险标签
    /**
     * @example
     *
     * @var string[]
     */
    public $clueTags;

    // 企业ID
    /**
     * @example 123456789
     *
     * @var string
     */
    public $companyId;

    // 企业名称
    /**
     * @example XXXXX有限公司
     *
     * @var string
     */
    public $companyName;

    // 风险等级
    /**
     * @example EX_HIGH_RISK
     *
     * @var string
     */
    public $crowdRiskLevel;

    // 涉众风险分数
    /**
     * @example 80
     *
     * @var int
     */
    public $crowdRiskScore;

    // 涉众风险类型
    /**
     * @example MLM
     *
     * @var string
     */
    public $crowdRiskType;

    // 发现时间
    /**
     * @example 2018-07-15
     *
     * @var string
     */
    public $detectedTime;

    // 影响金额
    /**
     * @example 100
     *
     * @var int
     */
    public $moneyInvolved;

    // 影响人数
    /**
     * @example 100
     *
     * @var int
     */
    public $peopleInvolved;

    // 注册市
    /**
     * @example 杭州市
     *
     * @var string
     */
    public $registeredCity;

    // 注册县
    /**
     * @example 西湖区
     *
     * @var string
     */
    public $registeredCounty;

    // 注册省
    /**
     * @example 浙江省
     *
     * @var string
     */
    public $registeredProvince;
    protected $_name = [
        'activeCity'         => 'active_city',
        'activeCounty'       => 'active_county',
        'activeProvince'     => 'active_province',
        'clueTags'           => 'clue_tags',
        'companyId'          => 'company_id',
        'companyName'        => 'company_name',
        'crowdRiskLevel'     => 'crowd_risk_level',
        'crowdRiskScore'     => 'crowd_risk_score',
        'crowdRiskType'      => 'crowd_risk_type',
        'detectedTime'       => 'detected_time',
        'moneyInvolved'      => 'money_involved',
        'peopleInvolved'     => 'people_involved',
        'registeredCity'     => 'registered_city',
        'registeredCounty'   => 'registered_county',
        'registeredProvince' => 'registered_province',
    ];

    public function validate()
    {
        Model::validateRequired('companyId', $this->companyId, true);
        Model::validateRequired('companyName', $this->companyName, true);
        Model::validatePattern('detectedTime', $this->detectedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->activeCity) {
            $res['active_city'] = $this->activeCity;
        }
        if (null !== $this->activeCounty) {
            $res['active_county'] = $this->activeCounty;
        }
        if (null !== $this->activeProvince) {
            $res['active_province'] = $this->activeProvince;
        }
        if (null !== $this->clueTags) {
            $res['clue_tags'] = $this->clueTags;
        }
        if (null !== $this->companyId) {
            $res['company_id'] = $this->companyId;
        }
        if (null !== $this->companyName) {
            $res['company_name'] = $this->companyName;
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
        if (null !== $this->moneyInvolved) {
            $res['money_involved'] = $this->moneyInvolved;
        }
        if (null !== $this->peopleInvolved) {
            $res['people_involved'] = $this->peopleInvolved;
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
     *
     * @return RtopCrowdRiskSummaryResp
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['active_city'])) {
            $model->activeCity = $map['active_city'];
        }
        if (isset($map['active_county'])) {
            $model->activeCounty = $map['active_county'];
        }
        if (isset($map['active_province'])) {
            $model->activeProvince = $map['active_province'];
        }
        if (isset($map['clue_tags'])) {
            if (!empty($map['clue_tags'])) {
                $model->clueTags = $map['clue_tags'];
            }
        }
        if (isset($map['company_id'])) {
            $model->companyId = $map['company_id'];
        }
        if (isset($map['company_name'])) {
            $model->companyName = $map['company_name'];
        }
        if (isset($map['crowd_risk_level'])) {
            $model->crowdRiskLevel = $map['crowd_risk_level'];
        }
        if (isset($map['crowd_risk_score'])) {
            $model->crowdRiskScore = $map['crowd_risk_score'];
        }
        if (isset($map['crowd_risk_type'])) {
            $model->crowdRiskType = $map['crowd_risk_type'];
        }
        if (isset($map['detected_time'])) {
            $model->detectedTime = $map['detected_time'];
        }
        if (isset($map['money_involved'])) {
            $model->moneyInvolved = $map['money_involved'];
        }
        if (isset($map['people_involved'])) {
            $model->peopleInvolved = $map['people_involved'];
        }
        if (isset($map['registered_city'])) {
            $model->registeredCity = $map['registered_city'];
        }
        if (isset($map['registered_county'])) {
            $model->registeredCounty = $map['registered_county'];
        }
        if (isset($map['registered_province'])) {
            $model->registeredProvince = $map['registered_province'];
        }

        return $model;
    }
}
