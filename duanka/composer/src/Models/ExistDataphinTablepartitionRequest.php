<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DUANKA\Models;

use AlibabaCloud\Tea\Model;

class ExistDataphinTablepartitionRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // operator操作人
    /**
     * @var string
     */
    public $operator;

    // project项目空间
    /**
     * @var string
     */
    public $project;

    // tableName
    /**
     * @var string
     */
    public $tableName;

    // 分区
    /**
     * @var string
     */
    public $partition;
    protected $_name = [
        'authToken' => 'auth_token',
        'operator'  => 'operator',
        'project'   => 'project',
        'tableName' => 'table_name',
        'partition' => 'partition',
    ];

    public function validate()
    {
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('project', $this->project, true);
        Model::validateRequired('tableName', $this->tableName, true);
        Model::validateRequired('partition', $this->partition, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->project) {
            $res['project'] = $this->project;
        }
        if (null !== $this->tableName) {
            $res['table_name'] = $this->tableName;
        }
        if (null !== $this->partition) {
            $res['partition'] = $this->partition;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExistDataphinTablepartitionRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['project'])) {
            $model->project = $map['project'];
        }
        if (isset($map['table_name'])) {
            $model->tableName = $map['table_name'];
        }
        if (isset($map['partition'])) {
            $model->partition = $map['partition'];
        }

        return $model;
    }
}
