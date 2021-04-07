<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QueryRequestRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // current_page
    /**
     * @var int
     */
    public $currentPage;

    // ids
    /**
     * @var string[]
     */
    public $ids;

    // max_time
    /**
     * @var string
     */
    public $maxTime;

    // min_time
    /**
     * @var string
     */
    public $minTime;

    // operators
    /**
     * @var string[]
     */
    public $operators;

    // operator_type
    /**
     * @var string
     */
    public $operatorType;

    // page_size
    /**
     * @var int
     */
    public $pageSize;

    // parent_ids
    /**
     * @var string[]
     */
    public $parentIds;

    // resource_ids
    /**
     * @var string[]
     */
    public $resourceIds;

    // resource_types
    /**
     * @var string[]
     */
    public $resourceTypes;

    // statuses
    /**
     * @var string[]
     */
    public $statuses;

    // task_statuses
    /**
     * @var string[]
     */
    public $taskStatuses;

    // tokens
    /**
     * @var string[]
     */
    public $tokens;

    // types
    /**
     * @var string[]
     */
    public $types;

    // workspace_ids
    /**
     * @var string[]
     */
    public $workspaceIds;
    protected $_name = [
        'authToken'     => 'auth_token',
        'currentPage'   => 'current_page',
        'ids'           => 'ids',
        'maxTime'       => 'max_time',
        'minTime'       => 'min_time',
        'operators'     => 'operators',
        'operatorType'  => 'operator_type',
        'pageSize'      => 'page_size',
        'parentIds'     => 'parent_ids',
        'resourceIds'   => 'resource_ids',
        'resourceTypes' => 'resource_types',
        'statuses'      => 'statuses',
        'taskStatuses'  => 'task_statuses',
        'tokens'        => 'tokens',
        'types'         => 'types',
        'workspaceIds'  => 'workspace_ids',
    ];

    public function validate()
    {
        Model::validatePattern('maxTime', $this->maxTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('minTime', $this->minTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->ids) {
            $res['ids'] = $this->ids;
        }
        if (null !== $this->maxTime) {
            $res['max_time'] = $this->maxTime;
        }
        if (null !== $this->minTime) {
            $res['min_time'] = $this->minTime;
        }
        if (null !== $this->operators) {
            $res['operators'] = $this->operators;
        }
        if (null !== $this->operatorType) {
            $res['operator_type'] = $this->operatorType;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->parentIds) {
            $res['parent_ids'] = $this->parentIds;
        }
        if (null !== $this->resourceIds) {
            $res['resource_ids'] = $this->resourceIds;
        }
        if (null !== $this->resourceTypes) {
            $res['resource_types'] = $this->resourceTypes;
        }
        if (null !== $this->statuses) {
            $res['statuses'] = $this->statuses;
        }
        if (null !== $this->taskStatuses) {
            $res['task_statuses'] = $this->taskStatuses;
        }
        if (null !== $this->tokens) {
            $res['tokens'] = $this->tokens;
        }
        if (null !== $this->types) {
            $res['types'] = $this->types;
        }
        if (null !== $this->workspaceIds) {
            $res['workspace_ids'] = $this->workspaceIds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRequestRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['ids'])) {
            if (!empty($map['ids'])) {
                $model->ids = $map['ids'];
            }
        }
        if (isset($map['max_time'])) {
            $model->maxTime = $map['max_time'];
        }
        if (isset($map['min_time'])) {
            $model->minTime = $map['min_time'];
        }
        if (isset($map['operators'])) {
            if (!empty($map['operators'])) {
                $model->operators = $map['operators'];
            }
        }
        if (isset($map['operator_type'])) {
            $model->operatorType = $map['operator_type'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['parent_ids'])) {
            if (!empty($map['parent_ids'])) {
                $model->parentIds = $map['parent_ids'];
            }
        }
        if (isset($map['resource_ids'])) {
            if (!empty($map['resource_ids'])) {
                $model->resourceIds = $map['resource_ids'];
            }
        }
        if (isset($map['resource_types'])) {
            if (!empty($map['resource_types'])) {
                $model->resourceTypes = $map['resource_types'];
            }
        }
        if (isset($map['statuses'])) {
            if (!empty($map['statuses'])) {
                $model->statuses = $map['statuses'];
            }
        }
        if (isset($map['task_statuses'])) {
            if (!empty($map['task_statuses'])) {
                $model->taskStatuses = $map['task_statuses'];
            }
        }
        if (isset($map['tokens'])) {
            if (!empty($map['tokens'])) {
                $model->tokens = $map['tokens'];
            }
        }
        if (isset($map['types'])) {
            if (!empty($map['types'])) {
                $model->types = $map['types'];
            }
        }
        if (isset($map['workspace_ids'])) {
            if (!empty($map['workspace_ids'])) {
                $model->workspaceIds = $map['workspace_ids'];
            }
        }

        return $model;
    }
}
