<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PARTNER\Models;

use AlibabaCloud\Tea\Model;

class CommodityPolicyRelation extends Model
{
    // 商品code
    /**
     * @example bbdc_pre
     *
     * @var string
     */
    public $commodityCode;

    // 政策ID
    /**
     * @example 12321321433284
     *
     * @var string
     */
    public $policyId;
    protected $_name = [
        'commodityCode' => 'commodity_code',
        'policyId'      => 'policy_id',
    ];

    public function validate()
    {
        Model::validateRequired('commodityCode', $this->commodityCode, true);
        Model::validateRequired('policyId', $this->policyId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->commodityCode) {
            $res['commodity_code'] = $this->commodityCode;
        }
        if (null !== $this->policyId) {
            $res['policy_id'] = $this->policyId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CommodityPolicyRelation
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['commodity_code'])) {
            $model->commodityCode = $map['commodity_code'];
        }
        if (isset($map['policy_id'])) {
            $model->policyId = $map['policy_id'];
        }

        return $model;
    }
}
