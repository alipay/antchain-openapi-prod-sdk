<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models;

use AlibabaCloud\Tea\Model;

class ParticipantOutput extends Model
{
    // 授权至项目内的数据源ID
    /**
     * @example "AUTH_DSRC_test00"
     *
     * @var string
     */
    public $authDatasourceId;

    // 输出表名
    /**
     * @example "result"
     *
     * @var string
     */
    public $tableName;

    // 输出类型，本期仅支持FULL
    /**
     * @example "FULL"
     *
     * @var string
     */
    public $writeType;
    protected $_name = [
        'authDatasourceId' => 'auth_datasource_id',
        'tableName'        => 'table_name',
        'writeType'        => 'write_type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authDatasourceId) {
            $res['auth_datasource_id'] = $this->authDatasourceId;
        }
        if (null !== $this->tableName) {
            $res['table_name'] = $this->tableName;
        }
        if (null !== $this->writeType) {
            $res['write_type'] = $this->writeType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ParticipantOutput
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_datasource_id'])) {
            $model->authDatasourceId = $map['auth_datasource_id'];
        }
        if (isset($map['table_name'])) {
            $model->tableName = $map['table_name'];
        }
        if (isset($map['write_type'])) {
            $model->writeType = $map['write_type'];
        }

        return $model;
    }
}
