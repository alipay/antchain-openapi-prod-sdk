<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class ActionPlanDetailInfo extends Model
{
    // 场景策略id
    /**
     * @example 1
     *
     * @var int
     */
    public $sceneStrategyId;

    // 场景策略名称
    /**
     * @example 蚂蚁营销
     *
     * @var string
     */
    public $sceneStrategyName;

    // 场景策略状态
    /**
     * @example ONLINE
     *
     * @var string
     */
    public $sceneStrategyStatus;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // 修改时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;

    // 触达媒介参数信息
    /**
     * @example
     *
     * @var ActionParamInfo[]
     */
    public $actionParamInfo;
    protected $_name = [
        'sceneStrategyId'     => 'scene_strategy_id',
        'sceneStrategyName'   => 'scene_strategy_name',
        'sceneStrategyStatus' => 'scene_strategy_status',
        'gmtCreate'           => 'gmt_create',
        'gmtModified'         => 'gmt_modified',
        'actionParamInfo'     => 'action_param_info',
    ];

    public function validate()
    {
        Model::validateRequired('sceneStrategyId', $this->sceneStrategyId, true);
        Model::validateRequired('sceneStrategyName', $this->sceneStrategyName, true);
        Model::validateRequired('sceneStrategyStatus', $this->sceneStrategyStatus, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('actionParamInfo', $this->actionParamInfo, true);
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->sceneStrategyStatus) {
            $res['scene_strategy_status'] = $this->sceneStrategyStatus;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->actionParamInfo) {
            $res['action_param_info'] = [];
            if (null !== $this->actionParamInfo && \is_array($this->actionParamInfo)) {
                $n = 0;
                foreach ($this->actionParamInfo as $item) {
                    $res['action_param_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ActionPlanDetailInfo
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
        if (isset($map['scene_strategy_status'])) {
            $model->sceneStrategyStatus = $map['scene_strategy_status'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['action_param_info'])) {
            if (!empty($map['action_param_info'])) {
                $model->actionParamInfo = [];
                $n                      = 0;
                foreach ($map['action_param_info'] as $item) {
                    $model->actionParamInfo[$n++] = null !== $item ? ActionParamInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
