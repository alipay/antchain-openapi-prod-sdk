<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DUANKA\Models;

use AlibabaCloud\Tea\Model;

class SubmitDatapinTaskRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // name
    /**
     * @var string
     */
    public $name;

    // 任务描述
    /**
     * @var string
     */
    public $desc;

    // operator
    /**
     * @var string
     */
    public $operator;

    // projectId
    /**
     * @var string
     */
    public $projectId;

    // projectTaskPath
    /**
     * @var string
     */
    public $projectTaskPath;

    // tenantId
    /**
     * @var string
     */
    public $tenantId;

    // params
    /**
     * @var string
     */
    public $params;

    // ossDsId
    /**
     * @var string
     */
    public $ossDsId;

    // ossDsName
    /**
     * @var string
     */
    public $ossDsName;

    // odpsDsId
    /**
     * @var string
     */
    public $odpsDsId;

    // odpsDsName
    /**
     * @var string
     */
    public $odpsDsName;

    // odpsProjectName
    /**
     * @var string
     */
    public $odpsProjectName;

    // odpsTableName
    /**
     * @var string
     */
    public $odpsTableName;

    // odpsGuidTableName
    /**
     * @var string
     */
    public $odpsGuidTableName;

    // partitionCondition
    /**
     * @var string
     */
    public $partitionCondition;

    // where
    /**
     * @var string
     */
    public $where;

    // columnList
    /**
     * @var string[]
     */
    public $columnList;

    // ossPath
    /**
     * @var string
     */
    public $ossPath;

    // ossFilename
    /**
     * @var string
     */
    public $ossFilename;
    protected $_name = [
        'authToken'          => 'auth_token',
        'name'               => 'name',
        'desc'               => 'desc',
        'operator'           => 'operator',
        'projectId'          => 'project_id',
        'projectTaskPath'    => 'project_task_path',
        'tenantId'           => 'tenant_id',
        'params'             => 'params',
        'ossDsId'            => 'oss_ds_id',
        'ossDsName'          => 'oss_ds_name',
        'odpsDsId'           => 'odps_ds_id',
        'odpsDsName'         => 'odps_ds_name',
        'odpsProjectName'    => 'odps_project_name',
        'odpsTableName'      => 'odps_table_name',
        'odpsGuidTableName'  => 'odps_guid_table_name',
        'partitionCondition' => 'partition_condition',
        'where'              => 'where',
        'columnList'         => 'column_list',
        'ossPath'            => 'oss_path',
        'ossFilename'        => 'oss_filename',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('desc', $this->desc, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('projectTaskPath', $this->projectTaskPath, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('params', $this->params, true);
        Model::validateRequired('ossDsName', $this->ossDsName, true);
        Model::validateRequired('odpsDsId', $this->odpsDsId, true);
        Model::validateRequired('odpsProjectName', $this->odpsProjectName, true);
        Model::validateRequired('odpsGuidTableName', $this->odpsGuidTableName, true);
        Model::validateRequired('ossPath', $this->ossPath, true);
        Model::validateRequired('ossFilename', $this->ossFilename, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->projectTaskPath) {
            $res['project_task_path'] = $this->projectTaskPath;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->params) {
            $res['params'] = $this->params;
        }
        if (null !== $this->ossDsId) {
            $res['oss_ds_id'] = $this->ossDsId;
        }
        if (null !== $this->ossDsName) {
            $res['oss_ds_name'] = $this->ossDsName;
        }
        if (null !== $this->odpsDsId) {
            $res['odps_ds_id'] = $this->odpsDsId;
        }
        if (null !== $this->odpsDsName) {
            $res['odps_ds_name'] = $this->odpsDsName;
        }
        if (null !== $this->odpsProjectName) {
            $res['odps_project_name'] = $this->odpsProjectName;
        }
        if (null !== $this->odpsTableName) {
            $res['odps_table_name'] = $this->odpsTableName;
        }
        if (null !== $this->odpsGuidTableName) {
            $res['odps_guid_table_name'] = $this->odpsGuidTableName;
        }
        if (null !== $this->partitionCondition) {
            $res['partition_condition'] = $this->partitionCondition;
        }
        if (null !== $this->where) {
            $res['where'] = $this->where;
        }
        if (null !== $this->columnList) {
            $res['column_list'] = $this->columnList;
        }
        if (null !== $this->ossPath) {
            $res['oss_path'] = $this->ossPath;
        }
        if (null !== $this->ossFilename) {
            $res['oss_filename'] = $this->ossFilename;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitDatapinTaskRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['project_task_path'])) {
            $model->projectTaskPath = $map['project_task_path'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['params'])) {
            $model->params = $map['params'];
        }
        if (isset($map['oss_ds_id'])) {
            $model->ossDsId = $map['oss_ds_id'];
        }
        if (isset($map['oss_ds_name'])) {
            $model->ossDsName = $map['oss_ds_name'];
        }
        if (isset($map['odps_ds_id'])) {
            $model->odpsDsId = $map['odps_ds_id'];
        }
        if (isset($map['odps_ds_name'])) {
            $model->odpsDsName = $map['odps_ds_name'];
        }
        if (isset($map['odps_project_name'])) {
            $model->odpsProjectName = $map['odps_project_name'];
        }
        if (isset($map['odps_table_name'])) {
            $model->odpsTableName = $map['odps_table_name'];
        }
        if (isset($map['odps_guid_table_name'])) {
            $model->odpsGuidTableName = $map['odps_guid_table_name'];
        }
        if (isset($map['partition_condition'])) {
            $model->partitionCondition = $map['partition_condition'];
        }
        if (isset($map['where'])) {
            $model->where = $map['where'];
        }
        if (isset($map['column_list'])) {
            if (!empty($map['column_list'])) {
                $model->columnList = $map['column_list'];
            }
        }
        if (isset($map['oss_path'])) {
            $model->ossPath = $map['oss_path'];
        }
        if (isset($map['oss_filename'])) {
            $model->ossFilename = $map['oss_filename'];
        }

        return $model;
    }
}
