<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models;

use AlibabaCloud\Tea\Model;

class RecognizeAntchainPdcpDatasetSchemaRequest extends Model
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

    // 采用数据源配置进行登记时的数据源 id
    // 如果填写了本参数，则可不填写datasourceType和connConfig
    // 如果填写了本参数，将优先采用本参数指定的 datasource 配置
    /**
     * @var string
     */
    public $datasourceId;

    // 数据资产数据源类型
    // 如果填写了datasourceId，则可不传本参数，填写了本参数也将被忽略
    // 如果未填写datasourceId，则必须同时填写本参数和connConfig参数
    /**
     * @var string
     */
    public $datasourceType;

    // 数据资产数据源连接信息，与数据源类型必须一一对应。
    // 如果填写了datasourceId，则可不传本参数，填写本参数也将被忽略。
    // 如果未填写datasourceId，则必须同时填写本参数和datasourceType参数。
    // 该参数请参考如下对应结构体，定义好后需转成jsonString，具体的对应信息如下：
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

    // 数据集位置配置，如数据表名称等。
    // 如果填写了datasourceId，则根据datasourceId对应的数据源类型进行解析。
    // 如果未填写datasourceId，则根据datasourceType进行解析。
    // 该参数请参考如下对应结构体，定义好后需转成jsonString，对应信息如下：
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

    // 数据集格式类型，如TABLE。
    /**
     * @var string
     */
    public $formatType;

    // 数据集所属的数据源格式信息，如 csv 分隔符，数据库主键名称等。
    // 该参数请参考如下对应结构体，定义好后需转成jsonString，对应关系如下：
    // 数据表 -> TableFormatConfig，
    /**
     * @var string
     */
    public $formatConfig;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'datasourceId'      => 'datasource_id',
        'datasourceType'    => 'datasource_type',
        'connConfig'        => 'conn_config',
        'locationConfig'    => 'location_config',
        'formatType'        => 'format_type',
        'formatConfig'      => 'format_config',
    ];

    public function validate()
    {
        Model::validateRequired('locationConfig', $this->locationConfig, true);
        Model::validateRequired('formatType', $this->formatType, true);
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RecognizeAntchainPdcpDatasetSchemaRequest
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

        return $model;
    }
}
