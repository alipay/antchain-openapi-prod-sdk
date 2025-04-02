<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class TenantActionPlanInfo extends Model
{
    // 场景策略id
    /**
     * @example 1
     *
     * @var int
     */
    public $sceneStrategyId;

    // 营销名称
    /**
     * @example 蚂蚁营销
     *
     * @var string
     */
    public $sceneStrategyName;

    // 营销状态
    /**
     * @example PASS
     *
     * @var string
     */
    public $sceneStrategyStatus;

    // 渠道id
    /**
     * @example 3
     *
     * @var int
     */
    public $actionDriverCode;

    // 渠道类型
    /**
     * @example ROBOT_CALL
     *
     * @var string
     */
    public $channelCode;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // 修改时间
    /**
     * @example
     *
     * @var string
     */
    public $gmtModified;

    // 场景策略入参名
    /**
     * @example
     *
     * @var string[]
     */
    public $actionParamInfo;

    // 参数查询是否完成
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isParamQueryDone;
    protected $_name = [
        'sceneStrategyId'     => 'scene_strategy_id',
        'sceneStrategyName'   => 'scene_strategy_name',
        'sceneStrategyStatus' => 'scene_strategy_status',
        'actionDriverCode'    => 'action_driver_code',
        'channelCode'         => 'channel_code',
        'gmtCreate'           => 'gmt_create',
        'gmtModified'         => 'gmt_modified',
        'actionParamInfo'     => 'action_param_info',
        'isParamQueryDone'    => 'is_param_query_done',
    ];

    public function validate()
    {
        Model::validateRequired('sceneStrategyId', $this->sceneStrategyId, true);
        Model::validateRequired('sceneStrategyName', $this->sceneStrategyName, true);
        Model::validateRequired('sceneStrategyStatus', $this->sceneStrategyStatus, true);
        Model::validateRequired('actionDriverCode', $this->actionDriverCode, true);
        Model::validateRequired('channelCode', $this->channelCode, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
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
        if (null !== $this->actionDriverCode) {
            $res['action_driver_code'] = $this->actionDriverCode;
        }
        if (null !== $this->channelCode) {
            $res['channel_code'] = $this->channelCode;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->actionParamInfo) {
            $res['action_param_info'] = $this->actionParamInfo;
        }
        if (null !== $this->isParamQueryDone) {
            $res['is_param_query_done'] = $this->isParamQueryDone;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TenantActionPlanInfo
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
        if (isset($map['action_driver_code'])) {
            $model->actionDriverCode = $map['action_driver_code'];
        }
        if (isset($map['channel_code'])) {
            $model->channelCode = $map['channel_code'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['action_param_info'])) {
            if (!empty($map['action_param_info'])) {
                $model->actionParamInfo = $map['action_param_info'];
            }
        }
        if (isset($map['is_param_query_done'])) {
            $model->isParamQueryDone = $map['is_param_query_done'];
        }

        return $model;
    }
}
