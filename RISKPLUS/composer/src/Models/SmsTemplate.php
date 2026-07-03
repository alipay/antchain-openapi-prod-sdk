<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class SmsTemplate extends Model
{
    // 场景策略ID
    /**
     * @example 5617
     *
     * @var string
     */
    public $sceneStrategyId;

    // 计划名称
    /**
     * @example 测试计划名称
     *
     * @var string
     */
    public $sceneStrategyName;

    // 模板内容
    /**
     * @example 测试模版内容
     *
     * @var string
     */
    public $templateContent;
    protected $_name = [
        'sceneStrategyId'   => 'scene_strategy_id',
        'sceneStrategyName' => 'scene_strategy_name',
        'templateContent'   => 'template_content',
    ];

    public function validate()
    {
        Model::validateRequired('sceneStrategyId', $this->sceneStrategyId, true);
        Model::validateRequired('sceneStrategyName', $this->sceneStrategyName, true);
        Model::validateRequired('templateContent', $this->templateContent, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->sceneStrategyId) {
            $res['scene_strategy_id'] = $this->sceneStrategyId;
        }
        if (null !== $this->sceneStrategyName) {
            $res['scene_strategy_name'] = $this->sceneStrategyName;
        }
        if (null !== $this->templateContent) {
            $res['template_content'] = $this->templateContent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SmsTemplate
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['scene_strategy_id'])) {
            $model->sceneStrategyId = $map['scene_strategy_id'];
        }
        if (isset($map['scene_strategy_name'])) {
            $model->sceneStrategyName = $map['scene_strategy_name'];
        }
        if (isset($map['template_content'])) {
            $model->templateContent = $map['template_content'];
        }

        return $model;
    }
}
