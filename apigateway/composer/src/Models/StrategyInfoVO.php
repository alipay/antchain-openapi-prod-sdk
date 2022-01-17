<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class StrategyInfoVO extends Model
{
    // workspace_id
    /**
     * @example workspace_id
     *
     * @var string
     */
    public $workspaceId;

    // tenant_id
    /**
     * @example tenant_id
     *
     * @var string
     */
    public $tenantId;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // 更新时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;

    // 策略唯一标识
    /**
     * @example strategy_id
     *
     * @var string
     */
    public $strategyId;

    // 策略名称
    /**
     * @example strategy_name
     *
     * @var string
     */
    public $strategyName;

    // 策略状态
    /**
     * @example CLOSED/OPENED
     *
     * @var string
     */
    public $strategyStatus;

    // 操作人
    /**
     * @example operator
     *
     * @var string
     */
    public $operator;

    //
    // API数量
    /**
     * @example api_count
     *
     * @var int
     */
    public $apiCount;

    // 策略描述
    /**
     * @example description
     *
     * @var string
     */
    public $description;

    // 策略类型
    /**
     * @example BLACK/WHITE
     *
     * @var string
     */
    public $strategyType;

    // 名单集合
    /**
     * @example
     *
     * @var string[]
     */
    public $host;

    // true, false
    /**
     * @example true, false
     *
     * @var bool
     */
    public $canDelete;
    protected $_name = [
        'workspaceId'    => 'workspace_id',
        'tenantId'       => 'tenant_id',
        'gmtCreate'      => 'gmt_create',
        'gmtModified'    => 'gmt_modified',
        'strategyId'     => 'strategy_id',
        'strategyName'   => 'strategy_name',
        'strategyStatus' => 'strategy_status',
        'operator'       => 'operator',
        'apiCount'       => 'api_count',
        'description'    => 'description',
        'strategyType'   => 'strategy_type',
        'host'           => 'host',
        'canDelete'      => 'can_delete',
    ];

    public function validate()
    {
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->strategyId) {
            $res['strategy_id'] = $this->strategyId;
        }
        if (null !== $this->strategyName) {
            $res['strategy_name'] = $this->strategyName;
        }
        if (null !== $this->strategyStatus) {
            $res['strategy_status'] = $this->strategyStatus;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->apiCount) {
            $res['api_count'] = $this->apiCount;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->strategyType) {
            $res['strategy_type'] = $this->strategyType;
        }
        if (null !== $this->host) {
            $res['host'] = $this->host;
        }
        if (null !== $this->canDelete) {
            $res['can_delete'] = $this->canDelete;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StrategyInfoVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['strategy_id'])) {
            $model->strategyId = $map['strategy_id'];
        }
        if (isset($map['strategy_name'])) {
            $model->strategyName = $map['strategy_name'];
        }
        if (isset($map['strategy_status'])) {
            $model->strategyStatus = $map['strategy_status'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['api_count'])) {
            $model->apiCount = $map['api_count'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['strategy_type'])) {
            $model->strategyType = $map['strategy_type'];
        }
        if (isset($map['host'])) {
            if (!empty($map['host'])) {
                $model->host = $map['host'];
            }
        }
        if (isset($map['can_delete'])) {
            $model->canDelete = $map['can_delete'];
        }

        return $model;
    }
}
