<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryMetricsRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 开始时间
    /**
     * @var int
     */
    public $start;

    // 结束时间
    /**
     * @var int
     */
    public $end;

    // 插件类型
    /**
     * @var string
     */
    public $plugin;

    // 监控指标 ID
    /**
     * @var string
     */
    public $dsId;

    // contentType
    /**
     * @var string
     */
    public $contentType;

    // 工作空间
    /**
     * @var string
     */
    public $workspaceName;

    // //采集频率
    /**
     * @var string
     */
    public $periodType;

    // 查询目标列
    /**
     * @var string[]
     */
    public $fields;

    // 查询条件
    /**
     * @var KeySet[]
     */
    public $where;
    protected $_name = [
        'authToken'     => 'auth_token',
        'start'         => 'start',
        'end'           => 'end',
        'plugin'        => 'plugin',
        'dsId'          => 'ds_id',
        'contentType'   => 'content_type',
        'workspaceName' => 'workspace_name',
        'periodType'    => 'period_type',
        'fields'        => 'fields',
        'where'         => 'where',
    ];

    public function validate()
    {
        Model::validateRequired('start', $this->start, true);
        Model::validateRequired('end', $this->end, true);
        Model::validateRequired('plugin', $this->plugin, true);
        Model::validateRequired('dsId', $this->dsId, true);
        Model::validateRequired('workspaceName', $this->workspaceName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->start) {
            $res['start'] = $this->start;
        }
        if (null !== $this->end) {
            $res['end'] = $this->end;
        }
        if (null !== $this->plugin) {
            $res['plugin'] = $this->plugin;
        }
        if (null !== $this->dsId) {
            $res['ds_id'] = $this->dsId;
        }
        if (null !== $this->contentType) {
            $res['content_type'] = $this->contentType;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        if (null !== $this->periodType) {
            $res['period_type'] = $this->periodType;
        }
        if (null !== $this->fields) {
            $res['fields'] = $this->fields;
        }
        if (null !== $this->where) {
            $res['where'] = [];
            if (null !== $this->where && \is_array($this->where)) {
                $n = 0;
                foreach ($this->where as $item) {
                    $res['where'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryMetricsRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['start'])) {
            $model->start = $map['start'];
        }
        if (isset($map['end'])) {
            $model->end = $map['end'];
        }
        if (isset($map['plugin'])) {
            $model->plugin = $map['plugin'];
        }
        if (isset($map['ds_id'])) {
            $model->dsId = $map['ds_id'];
        }
        if (isset($map['content_type'])) {
            $model->contentType = $map['content_type'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }
        if (isset($map['period_type'])) {
            $model->periodType = $map['period_type'];
        }
        if (isset($map['fields'])) {
            if (!empty($map['fields'])) {
                $model->fields = $map['fields'];
            }
        }
        if (isset($map['where'])) {
            if (!empty($map['where'])) {
                $model->where = [];
                $n            = 0;
                foreach ($map['where'] as $item) {
                    $model->where[$n++] = null !== $item ? KeySet::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
