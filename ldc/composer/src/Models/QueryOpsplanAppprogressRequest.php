<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class QueryOpsplanAppprogressRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 应用id
    /**
     * @var string
     */
    public $id;

    // 运维单id
    /**
     * @var string
     */
    public $timeSeriesId;

    // 批次stage的id
    /**
     * @var string
     */
    public $stageId;

    // [huanyu场景使用] 是否需要返回affected_cell_pods
    /**
     * @var bool
     */
    public $needExportCellPods;

    // [huanyu场景使用] 返回给opscloud的变更对象类型。如果为NONE，则不返回变更对象信息
    /**
     * @var string
     */
    public $opscloudChangeTargetType;
    protected $_name = [
        'authToken'                => 'auth_token',
        'id'                       => 'id',
        'timeSeriesId'             => 'time_series_id',
        'stageId'                  => 'stage_id',
        'needExportCellPods'       => 'need_export_cell_pods',
        'opscloudChangeTargetType' => 'opscloud_change_target_type',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->timeSeriesId) {
            $res['time_series_id'] = $this->timeSeriesId;
        }
        if (null !== $this->stageId) {
            $res['stage_id'] = $this->stageId;
        }
        if (null !== $this->needExportCellPods) {
            $res['need_export_cell_pods'] = $this->needExportCellPods;
        }
        if (null !== $this->opscloudChangeTargetType) {
            $res['opscloud_change_target_type'] = $this->opscloudChangeTargetType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryOpsplanAppprogressRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['time_series_id'])) {
            $model->timeSeriesId = $map['time_series_id'];
        }
        if (isset($map['stage_id'])) {
            $model->stageId = $map['stage_id'];
        }
        if (isset($map['need_export_cell_pods'])) {
            $model->needExportCellPods = $map['need_export_cell_pods'];
        }
        if (isset($map['opscloud_change_target_type'])) {
            $model->opscloudChangeTargetType = $map['opscloud_change_target_type'];
        }

        return $model;
    }
}
