<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QueryRequestTaskRequest extends Model
{
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

    // operatorType
    /**
     * @var string
     */
    public $operatorType;

    // page_size
    /**
     * @var int
     */
    public $pageSize;

    // requestIds
    /**
     * @var string[]
     */
    public $requestIds;

    // request_statuses
    /**
     * @var string[]
     */
    public $requestStatuses;

    // request_types
    /**
     * @var string[]
     */
    public $requestTypes;

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

    // workspace_ids
    /**
     * @var string[]
     */
    public $workspaceIds;
    protected $_name = [
        'authToken'       => 'auth_token',
        'currentPage'     => 'current_page',
        'ids'             => 'ids',
        'maxTime'         => 'max_time',
        'minTime'         => 'min_time',
        'operators'       => 'operators',
        'operatorType'    => 'operator_type',
        'pageSize'        => 'page_size',
        'requestIds'      => 'request_ids',
        'requestStatuses' => 'request_statuses',
        'requestTypes'    => 'request_types',
        'resourceIds'     => 'resource_ids',
        'resourceTypes'   => 'resource_types',
        'statuses'        => 'statuses',
        'workspaceIds'    => 'workspace_ids',
    ];

    public function validate()
    {
        Model::validatePattern('maxTime', $this->maxTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('minTime', $this->minTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
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
        if (null !== $this->requestIds) {
            $res['request_ids'] = $this->requestIds;
        }
        if (null !== $this->requestStatuses) {
            $res['request_statuses'] = $this->requestStatuses;
        }
        if (null !== $this->requestTypes) {
            $res['request_types'] = $this->requestTypes;
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
        if (null !== $this->workspaceIds) {
            $res['workspace_ids'] = $this->workspaceIds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRequestTaskRequest
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
        if (isset($map['request_ids'])) {
            if (!empty($map['request_ids'])) {
                $model->requestIds = $map['request_ids'];
            }
        }
        if (isset($map['request_statuses'])) {
            if (!empty($map['request_statuses'])) {
                $model->requestStatuses = $map['request_statuses'];
            }
        }
        if (isset($map['request_types'])) {
            if (!empty($map['request_types'])) {
                $model->requestTypes = $map['request_types'];
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
        if (isset($map['workspace_ids'])) {
            if (!empty($map['workspace_ids'])) {
                $model->workspaceIds = $map['workspace_ids'];
            }
        }

        return $model;
    }
}
