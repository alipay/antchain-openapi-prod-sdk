<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryUmktRtMarketingRequest extends Model
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

    // 场景营销策略id
    /**
     * @var int
     */
    public $sceneStrategyId;

    // 用户列表传输模版
    /**
     * @var string
     */
    public $queryTemplate;

    // 用户查询凭证列表
    /**
     * @var string[]
     */
    public $customerKeys;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'sceneStrategyId'   => 'scene_strategy_id',
        'queryTemplate'     => 'query_template',
        'customerKeys'      => 'customer_keys',
    ];

    public function validate()
    {
        Model::validateRequired('sceneStrategyId', $this->sceneStrategyId, true);
        Model::validateRequired('customerKeys', $this->customerKeys, true);
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
        if (null !== $this->sceneStrategyId) {
            $res['scene_strategy_id'] = $this->sceneStrategyId;
        }
        if (null !== $this->queryTemplate) {
            $res['query_template'] = $this->queryTemplate;
        }
        if (null !== $this->customerKeys) {
            $res['customer_keys'] = $this->customerKeys;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchqueryUmktRtMarketingRequest
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
        if (isset($map['scene_strategy_id'])) {
            $model->sceneStrategyId = $map['scene_strategy_id'];
        }
        if (isset($map['query_template'])) {
            $model->queryTemplate = $map['query_template'];
        }
        if (isset($map['customer_keys'])) {
            if (!empty($map['customer_keys'])) {
                $model->customerKeys = $map['customer_keys'];
            }
        }

        return $model;
    }
}
