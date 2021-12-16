<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class PolicyCommodity extends Model
{
    // 政策id
    /**
     * @example 202103240P00072593
     *
     * @var string
     */
    public $policyId;

    // 商品code
    /**
     * @example mpaas_basic
     *
     * @var string
     */
    public $commodityCode;

    // 商品名称
    /**
     * @example mpaas基础版
     *
     * @var string
     */
    public $commodityName;

    // 商品描述
    /**
     * @example 这是mpaas的基础版
     *
     * @var string
     */
    public $commodityDesc;
    protected $_name = [
        'policyId'      => 'policy_id',
        'commodityCode' => 'commodity_code',
        'commodityName' => 'commodity_name',
        'commodityDesc' => 'commodity_desc',
    ];

    public function validate()
    {
        Model::validateRequired('policyId', $this->policyId, true);
        Model::validateRequired('commodityCode', $this->commodityCode, true);
        Model::validateRequired('commodityName', $this->commodityName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->policyId) {
            $res['policy_id'] = $this->policyId;
        }
        if (null !== $this->commodityCode) {
            $res['commodity_code'] = $this->commodityCode;
        }
        if (null !== $this->commodityName) {
            $res['commodity_name'] = $this->commodityName;
        }
        if (null !== $this->commodityDesc) {
            $res['commodity_desc'] = $this->commodityDesc;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PolicyCommodity
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['policy_id'])) {
            $model->policyId = $map['policy_id'];
        }
        if (isset($map['commodity_code'])) {
            $model->commodityCode = $map['commodity_code'];
        }
        if (isset($map['commodity_name'])) {
            $model->commodityName = $map['commodity_name'];
        }
        if (isset($map['commodity_desc'])) {
            $model->commodityDesc = $map['commodity_desc'];
        }

        return $model;
    }
}
