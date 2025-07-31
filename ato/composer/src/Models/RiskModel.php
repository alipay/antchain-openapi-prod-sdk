<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class RiskModel extends Model
{
    // 风险场景编码
    /**
     * @example 风险场景编码
     *
     * @var string
     */
    public $sceneCode;

    // 该风险场景的风险分值
    /**
     * @example 该风险场景的风险分值
     *
     * @var string
     */
    public $score;

    // 逾期率
    /**
     * @example 2%
     *
     * @var string
     */
    public $delinquencyRate;

    // 风险建议
    /**
     * @example 风险等级低，建议快速通过
     *
     * @var string
     */
    public $riskAdvice;

    // 风险等级
    /**
     * @example rank1
     *
     * @var string
     */
    public $riskRank;

    // 流程id
    /**
     * @example 10000009000001804441658067824640
     *
     * @var string
     */
    public $flowId;

    // 拒量模型捞回分
    /**
     * @example 0.00570491
     *
     * @var string
     */
    public $mobThreeScore;

    // 拒量模型首逾分
    /**
     * @example 0.00570491
     *
     * @var string
     */
    public $fpdThirtyScore;
    protected $_name = [
        'sceneCode'       => 'scene_code',
        'score'           => 'score',
        'delinquencyRate' => 'delinquency_rate',
        'riskAdvice'      => 'risk_advice',
        'riskRank'        => 'risk_rank',
        'flowId'          => 'flow_id',
        'mobThreeScore'   => 'mob_three_score',
        'fpdThirtyScore'  => 'fpd_thirty_score',
    ];

    public function validate()
    {
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('score', $this->score, true);
        Model::validateRequired('flowId', $this->flowId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->score) {
            $res['score'] = $this->score;
        }
        if (null !== $this->delinquencyRate) {
            $res['delinquency_rate'] = $this->delinquencyRate;
        }
        if (null !== $this->riskAdvice) {
            $res['risk_advice'] = $this->riskAdvice;
        }
        if (null !== $this->riskRank) {
            $res['risk_rank'] = $this->riskRank;
        }
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        if (null !== $this->mobThreeScore) {
            $res['mob_three_score'] = $this->mobThreeScore;
        }
        if (null !== $this->fpdThirtyScore) {
            $res['fpd_thirty_score'] = $this->fpdThirtyScore;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RiskModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['score'])) {
            $model->score = $map['score'];
        }
        if (isset($map['delinquency_rate'])) {
            $model->delinquencyRate = $map['delinquency_rate'];
        }
        if (isset($map['risk_advice'])) {
            $model->riskAdvice = $map['risk_advice'];
        }
        if (isset($map['risk_rank'])) {
            $model->riskRank = $map['risk_rank'];
        }
        if (isset($map['flow_id'])) {
            $model->flowId = $map['flow_id'];
        }
        if (isset($map['mob_three_score'])) {
            $model->mobThreeScore = $map['mob_three_score'];
        }
        if (isset($map['fpd_thirty_score'])) {
            $model->fpdThirtyScore = $map['fpd_thirty_score'];
        }

        return $model;
    }
}
