<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class PersonalIncomeEvaluationFacade extends Model
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
    public $incomeScore;
    protected $_name = [
        'scoreResult' => 'score_result',
        'incomeScore' => 'income_score',
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
        if (null !== $this->incomeScore) {
            $res['income_score'] = $this->incomeScore;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PersonalIncomeEvaluationFacade
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['score_result'])) {
            $model->scoreResult = $map['score_result'];
        }
        if (isset($map['income_score'])) {
            $model->incomeScore = $map['income_score'];
        }

        return $model;
    }
}
