<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class TaskVO extends Model
{
    // context
    /**
     * @example context
     *
     * @var string
     */
    public $context;

    // execution_times
    /**
     * @example
     *
     * @var int
     */
    public $executionTimes;

    // id
    /**
     * @example id
     *
     * @var string
     */
    public $id;

    // request
    /**
     * @example
     *
     * @var TaskRequest
     */
    public $request;

    // resource_id
    /**
     * @example resource_id
     *
     * @var string
     */
    public $resourceId;

    // resource_type
    /**
     * @example resource_type
     *
     * @var string
     */
    public $resourceType;

    // status
    /**
     * @example status
     *
     * @var string
     */
    public $status;

    // utc_create
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcCreate;

    // utc_modified
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcModified;

    // workspace_id
    /**
     * @example workspace_id
     *
     * @var string
     */
    public $workspaceId;

    // resource
    /**
     * @example
     *
     * @var resource
     */
    public $resource;
    protected $_name = [
        'context'        => 'context',
        'executionTimes' => 'execution_times',
        'id'             => 'id',
        'request'        => 'request',
        'resourceId'     => 'resource_id',
        'resourceType'   => 'resource_type',
        'status'         => 'status',
        'utcCreate'      => 'utc_create',
        'utcModified'    => 'utc_modified',
        'workspaceId'    => 'workspace_id',
        'resource'       => 'resource',
    ];

    public function validate()
    {
        Model::validateRequired('context', $this->context, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('workspaceId', $this->workspaceId, true);
        Model::validateRequired('resource', $this->resource, true);
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('utcModified', $this->utcModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->context) {
            $res['context'] = $this->context;
        }
        if (null !== $this->executionTimes) {
            $res['execution_times'] = $this->executionTimes;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->request) {
            $res['request'] = null !== $this->request ? $this->request->toMap() : null;
        }
        if (null !== $this->resourceId) {
            $res['resource_id'] = $this->resourceId;
        }
        if (null !== $this->resourceType) {
            $res['resource_type'] = $this->resourceType;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->utcCreate) {
            $res['utc_create'] = $this->utcCreate;
        }
        if (null !== $this->utcModified) {
            $res['utc_modified'] = $this->utcModified;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->resource) {
            $res['resource'] = null !== $this->resource ? $this->resource->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TaskVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['context'])) {
            $model->context = $map['context'];
        }
        if (isset($map['execution_times'])) {
            $model->executionTimes = $map['execution_times'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['request'])) {
            $model->request = TaskRequest::fromMap($map['request']);
        }
        if (isset($map['resource_id'])) {
            $model->resourceId = $map['resource_id'];
        }
        if (isset($map['resource_type'])) {
            $model->resourceType = $map['resource_type'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['utc_create'])) {
            $model->utcCreate = $map['utc_create'];
        }
        if (isset($map['utc_modified'])) {
            $model->utcModified = $map['utc_modified'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['resource'])) {
            $model->resource = Resource::fromMap($map['resource']);
        }

        return $model;
    }
}
