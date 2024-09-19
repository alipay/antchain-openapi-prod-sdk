<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class GwFundRouterResult extends Model
{
    // 资金方代码
    /**
     * @example D2024082100001
     *
     * @var string
     */
    public $fundCode;

    // 资金方简称
    /**
     * @example 杭银消金
     *
     * @var string
     */
    public $abbreFundName;
    protected $_name = [
        'fundCode'      => 'fund_code',
        'abbreFundName' => 'abbre_fund_name',
    ];

    public function validate()
    {
        Model::validateRequired('fundCode', $this->fundCode, true);
        Model::validateRequired('abbreFundName', $this->abbreFundName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->fundCode) {
            $res['fund_code'] = $this->fundCode;
        }
        if (null !== $this->abbreFundName) {
            $res['abbre_fund_name'] = $this->abbreFundName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GwFundRouterResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['fund_code'])) {
            $model->fundCode = $map['fund_code'];
        }
        if (isset($map['abbre_fund_name'])) {
            $model->abbreFundName = $map['abbre_fund_name'];
        }

        return $model;
    }
}
