<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models;

use AlibabaCloud\Tea\Model;

class LocalDataset extends Model
{
    // 数据集id
    /**
     * @example DSET_20231020232623_r28UaMiu
     *
     * @var string
     */
    public $id;

    // 数据集名称
    /**
     * @example dataset_0
     *
     * @var string
     */
    public $name;

    // 数据集描述
    /**
     * @example 一段数据集描述信息
     *
     * @var string
     */
    public $description;

    // 数据集所属的数据源 id
    /**
     * @example DSET_20231020154808_9pQz4P1I
     *
     * @var string
     */
    public $datasourceId;

    // 数据源类型。
    // 示例如下：
    // MYSQL,
    // DB2,
    // SQLSERVER,
    // ORACLE,
    // HIVE2,
    // ODPS
    /**
     * @example MYSQL
     *
     * @var string
     */
    public $datasourceType;

    // 数据源连接参数转化成的json字符串，必须与数据源类型一一对应。
    // 该参数请参考如下对应结构体，定义好后需转成jsonString，具体的对应信息如下：
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
    public $datasourceConnConfig;

    // 数据集在数据源中的位置信息转化成的json字符串，如数据表名称等，必须和数据源类型一一对应。
    // 该参数请参考如下对应结构体，定义好后需转成jsonString，具体的对应关系如下：
    // MYSQL -> MysqlLocationConfig,
    // ORACLE -> OracleLocationConfig,
    // SQLSERVER -> SqlServerLocationConfig,
    // DB2 -> DbTwoLocationConfig,
    // HIVE2 -> HiveTwoLocationConfig,
    // ODPS -> OdpsLocationConfig
    /**
     * @example MysqlLocationConfig对象转化成的json字符串
     *
     * @var string
     */
    public $locationConfig;

    // 数据集格式类型。
    // 示例如下：
    // TABLE
    /**
     * @example TABLE
     *
     * @var string
     */
    public $formatType;

    // 数据集格式信息，如 csv 分隔符，数据库主键名称等，与数据集类型一一对应。
    // 该参数请参考如下对应结构体，定义好后需转成jsonString，当前支持的类型展示如下：
    // 数据表 -> TableFormatConfig
    /**
     * @example TableFormatConfig转化成的json字符串
     *
     * @var string
     */
    public $formatConfig;

    // 数据集 schema 类型。
    // 示例如下：
    // STRUCTURED_DATA
    /**
     * @example STRUCTURED_DATA
     *
     * @var string
     */
    public $schemaType;

    // 结构化数据 schema，schema_type为STRUCTURED_DATA时必填
    /**
     * @example
     *
     * @var StructuredDataSchema
     */
    public $structuredDataSchema;
    protected $_name = [
        'id'                   => 'id',
        'name'                 => 'name',
        'description'          => 'description',
        'datasourceId'         => 'datasource_id',
        'datasourceType'       => 'datasource_type',
        'datasourceConnConfig' => 'datasource_conn_config',
        'locationConfig'       => 'location_config',
        'formatType'           => 'format_type',
        'formatConfig'         => 'format_config',
        'schemaType'           => 'schema_type',
        'structuredDataSchema' => 'structured_data_schema',
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
        if (null !== $this->datasourceId) {
            $res['datasource_id'] = $this->datasourceId;
        }
        if (null !== $this->datasourceType) {
            $res['datasource_type'] = $this->datasourceType;
        }
        if (null !== $this->datasourceConnConfig) {
            $res['datasource_conn_config'] = $this->datasourceConnConfig;
        }
        if (null !== $this->locationConfig) {
            $res['location_config'] = $this->locationConfig;
        }
        if (null !== $this->formatType) {
            $res['format_type'] = $this->formatType;
        }
        if (null !== $this->formatConfig) {
            $res['format_config'] = $this->formatConfig;
        }
        if (null !== $this->schemaType) {
            $res['schema_type'] = $this->schemaType;
        }
        if (null !== $this->structuredDataSchema) {
            $res['structured_data_schema'] = null !== $this->structuredDataSchema ? $this->structuredDataSchema->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LocalDataset
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
        if (isset($map['datasource_id'])) {
            $model->datasourceId = $map['datasource_id'];
        }
        if (isset($map['datasource_type'])) {
            $model->datasourceType = $map['datasource_type'];
        }
        if (isset($map['datasource_conn_config'])) {
            $model->datasourceConnConfig = $map['datasource_conn_config'];
        }
        if (isset($map['location_config'])) {
            $model->locationConfig = $map['location_config'];
        }
        if (isset($map['format_type'])) {
            $model->formatType = $map['format_type'];
        }
        if (isset($map['format_config'])) {
            $model->formatConfig = $map['format_config'];
        }
        if (isset($map['schema_type'])) {
            $model->schemaType = $map['schema_type'];
        }
        if (isset($map['structured_data_schema'])) {
            $model->structuredDataSchema = StructuredDataSchema::fromMap($map['structured_data_schema']);
        }

        return $model;
    }
}
