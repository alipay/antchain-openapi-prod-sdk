<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DUANKA\Models;

use AlibabaCloud\Tea\Model;

class QueryDataphinTableinfoRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // projectSpaceName
    /**
     * @var string
     */
    public $projectSpaceName;

    // tableName
    /**
     * @var string
     */
    public $tableName;

    // operator
    /**
     * @var string
     */
    public $operator;
    protected $_name = [
        'authToken'        => 'auth_token',
        'projectSpaceName' => 'project_space_name',
        'tableName'        => 'table_name',
        'operator'         => 'operator',
    ];

    public function validate()
    {
        Model::validateRequired('projectSpaceName', $this->projectSpaceName, true);
        Model::validateRequired('tableName', $this->tableName, true);
        Model::validateRequired('operator', $this->operator, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->projectSpaceName) {
            $res['project_space_name'] = $this->projectSpaceName;
        }
        if (null !== $this->tableName) {
            $res['table_name'] = $this->tableName;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDataphinTableinfoRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['project_space_name'])) {
            $model->projectSpaceName = $map['project_space_name'];
        }
        if (isset($map['table_name'])) {
            $model->tableName = $map['table_name'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }

        return $model;
    }
}
