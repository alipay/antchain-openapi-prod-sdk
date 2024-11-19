<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class MarketingScoreInfo extends Model
{
    // 手机号
    /**
     * @example 16677778888
     *
     * @var string
     */
    public $phoneNum;

    // 营销分
    /**
     * @example 55.5
     *
     * @var string
     */
    public $score;
    protected $_name = [
        'phoneNum' => 'phone_num',
        'score'    => 'score',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->phoneNum) {
            $res['phone_num'] = $this->phoneNum;
        }
        if (null !== $this->score) {
            $res['score'] = $this->score;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MarketingScoreInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['phone_num'])) {
            $model->phoneNum = $map['phone_num'];
        }
        if (isset($map['score'])) {
            $model->score = $map['score'];
        }

        return $model;
    }
}
