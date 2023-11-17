<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models;

use AlibabaCloud\Tea\Model;

class CreateAntchainPdcpDatasetRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 数据集名称，必填
    /**
     * @var string
     */
    public $name;

    // 数据集描述，非必填
    /**
     * @var string
     */
    public $description;

    // 采用数据源配置进行登记时的数据源 id
    // 如果填写了本参数，则可不填写datasourceType和connConfig
    // 如果填写了本参数，将优先采用本参数指定的 datasource 配置
    /**
     * @var string
     */
    public $datasourceId;

    // 数据集数据源类型。
    // 如果填写了datasourceId，则可不传本参数，填写了本参数也将被忽略。
    // 如果未填写datasourceId，则必须同时填写本参数和 connConfig参数。
    // 示例如下：
    // MYSQL,
    // DB2,
    // SQLSERVER,
    // ORACLE,
    // HIVE2,
    // ODPS
    /**
     * @var string
     */
    public $datasourceType;

    // 数据集所属数据源连接信息，与数据源类型一一对应。
    // 如果填写了datasourceId，则可不传本参数，填写本参数也将被忽略。
    // 如果未填写 datasourceId，则必须同时填写本参数和datasourceType参数。
    // 该参数请参考如下对应结构体，定义好后需转成jsonString，具体对应关系如下：
    // MYSQL -> MysqlConnConfig,
    // ORACLE -> OracleConnConfig,
    // SQLSERVER -> SqlServerConnConfig,
    // DB2 -> DbTwoConnConfig,
    // HIVE2 -> HiveTwoConnConfig,
    // ODPS -> OdpsConnConfig
    /**
     * @var string
     */
    public $connConfig;

    // 数据集位置信息的对象转化成的json字符串，如数据表名称等。
    // 该参数请参考如下对应结构体，定义好后需转成jsonString，具体的对应信息如下：
    // MYSQL -> MysqlLocationConfig,
    // ORACLE -> OracleLocationConfig,
    // SQLSERVER -> SqlServerLocationConfig,
    // DB2 -> DbTwoLocationConfig,
    // HIVE2 -> HiveTwoLocationConfig,
    // ODPS -> OdpsLocationConfig
    /**
     * @var string
     */
    public $locationConfig;

    // 数据集格式类型。
    // 示例如下：
    // TABLE
    /**
     * @var string
     */
    public $formatType;

    // 数据集格式信息转化成的json字符串，如 csv 分隔符，数据库主键名称等，必须与数据源类型一一对应。
    // 具体的对应关系如下：
    // 数据表 -> TableFormatConfig
    /**
     * @var string
     */
    public $formatConfig;

    // 数据集 schema 类型。
    // 示例如下：
    // STRUCTURED_DATA
    /**
     * @var string
     */
    public $schemaType;

    // 结构化数据 schema
    // schemaType为STRUCTURED_DATA时必填
    /**
     * @var StructuredDataSchema
     */
    public $structuredDataSchema;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'name'                 => 'name',
        'description'          => 'description',
        'datasourceId'         => 'datasource_id',
        'datasourceType'       => 'datasource_type',
        'connConfig'           => 'conn_config',
        'locationConfig'       => 'location_config',
        'formatType'           => 'format_type',
        'formatConfig'         => 'format_config',
        'schemaType'           => 'schema_type',
        'structuredDataSchema' => 'structured_data_schema',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('locationConfig', $this->locationConfig, true);
        Model::validateRequired('formatType', $this->formatType, true);
        Model::validateRequired('formatConfig', $this->formatConfig, true);
        Model::validateRequired('schemaType', $this->schemaType, true);
        Model::validateMaxLength('name', $this->name, 50);
        Model::validateMaxLength('description', $this->description, 200);
        Model::validateMinLength('name', $this->name, 1);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
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
        if (null !== $this->connConfig) {
            $res['conn_config'] = $this->connConfig;
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
     * @return CreateAntchainPdcpDatasetRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
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
        if (isset($map['conn_config'])) {
            $model->connConfig = $map['conn_config'];
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
