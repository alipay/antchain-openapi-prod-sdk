<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_aafd16538edd4fc0ab50acd01355adb6\Models;

use AlibabaCloud\Tea\Model;

class RiskEvaluationDistrictExtRequest extends Model
{
    // 地区编码
    /**
     * @example  4301000
     *
     * @var string
     */
    public $cityCode;
    protected $_name = [
        'cityCode' => 'city_code',
    ];

    public function validate()
    {
        Model::validateRequired('cityCode', $this->cityCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cityCode) {
            $res['city_code'] = $this->cityCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RiskEvaluationDistrictExtRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['city_code'])) {
            $model->cityCode = $map['city_code'];
        }

        return $model;
    }
}
