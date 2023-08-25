<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class SocialIncomeEvaluationFacade extends Model
{
    // 查询结果
    /**
     * @example 00,01
     *
     * @var string
     */
    public $scoreResult;

    // 收入评分
    /**
     * @example 100
     *
     * @var string
     */
    public $rangeScore;

    // 历史稳定性评估
    /**
     * @example 90
     *
     * @var string
     */
    public $historyScore;

    // 近期稳定性评估
    /**
     * @example 80
     *
     * @var string
     */
    public $stabilityScore;
    protected $_name = [
        'scoreResult'    => 'score_result',
        'rangeScore'     => 'range_score',
        'historyScore'   => 'history_score',
        'stabilityScore' => 'stability_score',
    ];

    public function validate()
    {
        Model::validateRequired('scoreResult', $this->scoreResult, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->scoreResult) {
            $res['score_result'] = $this->scoreResult;
        }
        if (null !== $this->rangeScore) {
            $res['range_score'] = $this->rangeScore;
        }
        if (null !== $this->historyScore) {
            $res['history_score'] = $this->historyScore;
        }
        if (null !== $this->stabilityScore) {
            $res['stability_score'] = $this->stabilityScore;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SocialIncomeEvaluationFacade
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['score_result'])) {
            $model->scoreResult = $map['score_result'];
        }
        if (isset($map['range_score'])) {
            $model->rangeScore = $map['range_score'];
        }
        if (isset($map['history_score'])) {
            $model->historyScore = $map['history_score'];
        }
        if (isset($map['stability_score'])) {
            $model->stabilityScore = $map['stability_score'];
        }

        return $model;
    }
}
