<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DUANKA\Models;

use AlibabaCloud\Tea\Model;

class ImportDataphinFileRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // orderId
    /**
     * @var string
     */
    public $orderId;

    // operator
    /**
     * @var string
     */
    public $operator;

    // userId
    /**
     * @var string
     */
    public $userId;

    // fileKey
    /**
     * @var string
     */
    public $fileKey;

    // headerList
    /**
     * @var string[]
     */
    public $headerList;

    // targetList
    /**
     * @var string[]
     */
    public $targetList;

    // tableProject
    /**
     * @var string
     */
    public $tableProject;

    // tableName
    /**
     * @var string
     */
    public $tableName;

    // partition
    /**
     * @var string
     */
    public $partition;

    // OcDataphinProjectEnum枚举
    /**
     * @var string
     */
    public $project;
    protected $_name = [
        'authToken'    => 'auth_token',
        'orderId'      => 'order_id',
        'operator'     => 'operator',
        'userId'       => 'user_id',
        'fileKey'      => 'file_key',
        'headerList'   => 'header_list',
        'targetList'   => 'target_list',
        'tableProject' => 'table_project',
        'tableName'    => 'table_name',
        'partition'    => 'partition',
        'project'      => 'project',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('fileKey', $this->fileKey, true);
        Model::validateRequired('headerList', $this->headerList, true);
        Model::validateRequired('targetList', $this->targetList, true);
        Model::validateRequired('tableProject', $this->tableProject, true);
        Model::validateRequired('tableName', $this->tableName, true);
        Model::validateRequired('partition', $this->partition, true);
        Model::validateRequired('project', $this->project, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->fileKey) {
            $res['file_key'] = $this->fileKey;
        }
        if (null !== $this->headerList) {
            $res['header_list'] = $this->headerList;
        }
        if (null !== $this->targetList) {
            $res['target_list'] = $this->targetList;
        }
        if (null !== $this->tableProject) {
            $res['table_project'] = $this->tableProject;
        }
        if (null !== $this->tableName) {
            $res['table_name'] = $this->tableName;
        }
        if (null !== $this->partition) {
            $res['partition'] = $this->partition;
        }
        if (null !== $this->project) {
            $res['project'] = $this->project;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportDataphinFileRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['file_key'])) {
            $model->fileKey = $map['file_key'];
        }
        if (isset($map['header_list'])) {
            if (!empty($map['header_list'])) {
                $model->headerList = $map['header_list'];
            }
        }
        if (isset($map['target_list'])) {
            if (!empty($map['target_list'])) {
                $model->targetList = $map['target_list'];
            }
        }
        if (isset($map['table_project'])) {
            $model->tableProject = $map['table_project'];
        }
        if (isset($map['table_name'])) {
            $model->tableName = $map['table_name'];
        }
        if (isset($map['partition'])) {
            $model->partition = $map['partition'];
        }
        if (isset($map['project'])) {
            $model->project = $map['project'];
        }

        return $model;
    }
}
