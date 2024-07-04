<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryQmpActionplanDetailRequest extends Model
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

    // 场景策略id
    /**
     * @var int[]
     */
    public $sceneStrategyId;

    // 分流字段，行业标签区分哈啰流量归属于umkt或qmp
    /**
     * @var string
     */
    public $industryTag;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'sceneStrategyId'   => 'scene_strategy_id',
        'industryTag'       => 'industry_tag',
    ];

    public function validate()
    {
        Model::validateRequired('sceneStrategyId', $this->sceneStrategyId, true);
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
        if (null !== $this->industryTag) {
            $res['industry_tag'] = $this->industryTag;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchqueryQmpActionplanDetailRequest
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
            if (!empty($map['scene_strategy_id'])) {
                $model->sceneStrategyId = $map['scene_strategy_id'];
            }
        }
        if (isset($map['industry_tag'])) {
            $model->industryTag = $map['industry_tag'];
        }

        return $model;
    }
}
