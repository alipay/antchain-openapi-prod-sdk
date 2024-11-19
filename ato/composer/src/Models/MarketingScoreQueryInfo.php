<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class MarketingScoreQueryInfo extends Model
{
    // 手机号码
    /**
     * @example 16677778888
     *
     * @var string
     */
    public $phoneNum;
    protected $_name = [
        'phoneNum' => 'phone_num',
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MarketingScoreQueryInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['phone_num'])) {
            $model->phoneNum = $map['phone_num'];
        }

        return $model;
    }
}
