<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models;

use AlibabaCloud\Tea\Model;

class LocalDatasource extends Model
{
    // 数据源id
    /**
     * @example DSET_20231020154808_9pQz4P1I
     *
     * @var string
     */
    public $id;

    // 数据源名称
    /**
     * @example datasource_0
     *
     * @var string
     */
    public $name;

    // 数据源描述信息
    /**
     * @example 一段数据源描述信息
     *
     * @var string
     */
    public $description;

    // 当前数据源是否支持写入
    /**
     * @example true, false
     *
     * @var bool
     */
    public $writable;

    // 用于描述数据源类型的枚举。
    // 示例如下：
    // MYSQL,
    // DB2,
    // SQLSERVER,
    // ORACLE,
    // HIVE2,
    // ODPS
    //
    /**
     * @example MYSQL
     *
     * @var string
     */
    public $type;

    // 用于描述数据源的连接信息，为描述连接信息的数据对象转化为的json字符串，与type指定的数据源类型必须一一对应。
    // 该参数请参考如下对应结构体，定义好后需转成jsonString，对应关系展示如下：
    // MYSQL -> MysqlConnConfig,
    // ORACLE -> OracleConnConfig,
    // SQLSERVER -> SqlServerConnConfig,
    // DB2 -> DbTwoConnConfig,
    // HIVE2 -> HiveTwoConnConfig,
    // ODPS -> OdpsConnConfig
    /**
     * @example MysqlConnConfig对象转化成的json字符串
     *
     * @var string
     */
    public $connConfig;
    protected $_name = [
        'id'          => 'id',
        'name'        => 'name',
        'description' => 'description',
        'writable'    => 'writable',
        'type'        => 'type',
        'connConfig'  => 'conn_config',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->writable) {
            $res['writable'] = $this->writable;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->connConfig) {
            $res['conn_config'] = $this->connConfig;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LocalDatasource
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['writable'])) {
            $model->writable = $map['writable'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['conn_config'])) {
            $model->connConfig = $map['conn_config'];
        }

        return $model;
    }
}
