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

    // 省级编码
    /**
     * @example 510000
     *
     * @var string
     */
    public $provCode;
    protected $_name = [
        'cityCode' => 'city_code',
        'provCode' => 'prov_code',
    ];

    public function validate()
    {
        Model::validateRequired('cityCode', $this->cityCode, true);
        Model::validateRequired('provCode', $this->provCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cityCode) {
            $res['city_code'] = $this->cityCode;
        }
        if (null !== $this->provCode) {
            $res['prov_code'] = $this->provCode;
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
        if (isset($map['prov_code'])) {
            $model->provCode = $map['prov_code'];
        }

        return $model;
    }
}
