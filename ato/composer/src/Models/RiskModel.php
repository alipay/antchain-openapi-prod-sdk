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
    protected $_name = [
        'sceneCode'       => 'scene_code',
        'score'           => 'score',
        'delinquencyRate' => 'delinquency_rate',
        'riskAdvice'      => 'risk_advice',
        'riskRank'        => 'risk_rank',
    ];

    public function validate()
    {
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('score', $this->score, true);
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

        return $model;
    }
}
