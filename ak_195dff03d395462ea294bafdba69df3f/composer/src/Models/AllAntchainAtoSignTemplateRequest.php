<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class AllAntchainAtoSignTemplateRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 合同类型，如果不传则返回所有
    /**
     * @var string
     */
    public $contractType;

    // ● FINANCE 融资
    // ● NON_FINANCE 非融资
    /**
     * @var string
     */
    public $fundType;

    // 查询融资类型时，需要传入资方统一社会信用代码
    /**
     * @var string
     */
    public $fundId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'contractType'      => 'contract_type',
        'fundType'          => 'fund_type',
        'fundId'            => 'fund_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->contractType) {
            $res['contract_type'] = $this->contractType;
        }
        if (null !== $this->fundType) {
            $res['fund_type'] = $this->fundType;
        }
        if (null !== $this->fundId) {
            $res['fund_id'] = $this->fundId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AllAntchainAtoSignTemplateRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['contract_type'])) {
            $model->contractType = $map['contract_type'];
        }
        if (isset($map['fund_type'])) {
            $model->fundType = $map['fund_type'];
        }
        if (isset($map['fund_id'])) {
            $model->fundId = $map['fund_id'];
        }

        return $model;
    }
}
