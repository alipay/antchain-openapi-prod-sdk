<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class RejectRiskModel extends Model
{
    // 拒量模型捞回分
    /**
     * @example 0.00570491
     *
     * @var string
     */
    public $mobThreeScore;

    // 拒量模型首逾分
    /**
     * @example 0.62764417
     *
     * @var string
     */
    public $fpdThirtyScore;
    protected $_name = [
        'mobThreeScore'  => 'mob_three_score',
        'fpdThirtyScore' => 'fpd_thirty_score',
    ];

    public function validate()
    {
        Model::validateRequired('mobThreeScore', $this->mobThreeScore, true);
        Model::validateRequired('fpdThirtyScore', $this->fpdThirtyScore, true);
    }

    public function toMap()
    {
        $res = [];
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
     * @return RejectRiskModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['mob_three_score'])) {
            $model->mobThreeScore = $map['mob_three_score'];
        }
        if (isset($map['fpd_thirty_score'])) {
            $model->fpdThirtyScore = $map['fpd_thirty_score'];
        }

        return $model;
    }
}
