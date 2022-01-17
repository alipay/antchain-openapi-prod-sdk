<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class ApiflowMachineDefVO extends Model
{
    //
    // api数
    /**
     * @example
     *
     * @var int
     */
    public $apiCount;

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

    // instance_id
    /**
     * @example instance_id
     *
     * @var string
     */
    public $instanceId;

    // can_delete
    /**
     * @example true, false
     *
     * @var bool
     */
    public $canDelete;

    // id
    /**
     * @example id
     *
     * @var string
     */
    public $id;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // app_name
    /**
     * @example app_name
     *
     * @var string
     */
    public $appName;

    // type
    /**
     * @example type
     *
     * @var string
     */
    public $type;

    // comment
    /**
     * @example comment
     *
     * @var string
     */
    public $comment;

    // ver
    /**
     * @example ver
     *
     * @var string
     */
    public $ver;

    // gmt_create
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // status
    /**
     * @example status
     *
     * @var string
     */
    public $status;

    // recover_strategy
    /**
     * @example recover_strategy
     *
     * @var string
     */
    public $recoverStrategy;

    // content
    /**
     * @example content
     *
     * @var string
     */
    public $content;

    // machine_status
    /**
     * @example machine_status
     *
     * @var string
     */
    public $machineStatus;

    // field_mapping
    /**
     * @example field_mapping
     *
     * @var string
     */
    public $fieldMapping;
    protected $_name = [
        'apiCount'        => 'api_count',
        'workspaceId'     => 'workspace_id',
        'tenantId'        => 'tenant_id',
        'instanceId'      => 'instance_id',
        'canDelete'       => 'can_delete',
        'id'              => 'id',
        'name'            => 'name',
        'appName'         => 'app_name',
        'type'            => 'type',
        'comment'         => 'comment',
        'ver'             => 'ver',
        'gmtCreate'       => 'gmt_create',
        'status'          => 'status',
        'recoverStrategy' => 'recover_strategy',
        'content'         => 'content',
        'machineStatus'   => 'machine_status',
        'fieldMapping'    => 'field_mapping',
    ];

    public function validate()
    {
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->apiCount) {
            $res['api_count'] = $this->apiCount;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->canDelete) {
            $res['can_delete'] = $this->canDelete;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->comment) {
            $res['comment'] = $this->comment;
        }
        if (null !== $this->ver) {
            $res['ver'] = $this->ver;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->recoverStrategy) {
            $res['recover_strategy'] = $this->recoverStrategy;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->machineStatus) {
            $res['machine_status'] = $this->machineStatus;
        }
        if (null !== $this->fieldMapping) {
            $res['field_mapping'] = $this->fieldMapping;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApiflowMachineDefVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['api_count'])) {
            $model->apiCount = $map['api_count'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['can_delete'])) {
            $model->canDelete = $map['can_delete'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['comment'])) {
            $model->comment = $map['comment'];
        }
        if (isset($map['ver'])) {
            $model->ver = $map['ver'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['recover_strategy'])) {
            $model->recoverStrategy = $map['recover_strategy'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['machine_status'])) {
            $model->machineStatus = $map['machine_status'];
        }
        if (isset($map['field_mapping'])) {
            $model->fieldMapping = $map['field_mapping'];
        }

        return $model;
    }
}
