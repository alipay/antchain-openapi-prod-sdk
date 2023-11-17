<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models;

use AlibabaCloud\Tea\Model;

class UpdateAntchainPdcpDatasetRequest extends Model
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

    // 采用数据源配置进行登记时的数据源 id，非必填，不填则不更新
    // 如果填写了本参数，则可不填写datasourceType和connConfig
    // 如果填写了本参数，将优先采用本参数指定的datasource配置
    /**
     * @var string
     */
    public $datasourceId;

    // 待更新的数据集 id，必填
    /**
     * @var string
     */
    public $datasetId;

    // 数据集数据源类型，非必填，不填则不更新。
    // 如果填写了datasourceId，则可不传本参数，填写了本参数也将被忽略。
    // 如果未填写datasourceId，则必须同时填写本参数和connConfig参数。
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

    // 更新后的数据集名称，非必填，不填则不更新
    /**
     * @var string
     */
    public $name;

    // 更新后的数据集描述，非必填，不填则不更新
    /**
     * @var string
     */
    public $description;

    // 数据集数据源连接信息转化的json字符串，非必填，不填则不更新。
    // 如果填写了datasourceId，则可不传本参数，填写本参数也将被忽略。
    // 如果未填写datasourceId，则必须同时填写本参数和datasourceType参数。
    // 该参数请参考如下对应结构体，定义好后需转成jsonString，对应信息如下：
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

    // 数据集位置信息转化的json字符串，如数据表名称等，非必填，不填则不更新。
    // 如果填写了datasourceId，则本参数必填且根据 datasourceId 对应的数据源类型进行解析。
    // 如果未填写datasourceId且填写了 connConfig，则本参数必填且根据datasourceType进行解析。
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

    // 数据集格式类型，非必填，不填则不更新，如果填写，则format_config也必须填写。
    // 示例：TABLE
    /**
     * @var string
     */
    public $formatType;

    // 数据集数据源格式信息，如 csv 分隔符，数据库主键名称等，非必填，不填则不更新
    // 如果填写，则formatType也必须填写
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
        'datasetId'         => 'dataset_id',
        'datasourceType'    => 'datasource_type',
        'name'              => 'name',
        'description'       => 'description',
        'connConfig'        => 'conn_config',
        'locationConfig'    => 'location_config',
        'formatType'        => 'format_type',
        'formatConfig'      => 'format_config',
    ];

    public function validate()
    {
        Model::validateRequired('datasetId', $this->datasetId, true);
        Model::validateMaxLength('name', $this->name, 50);
        Model::validateMaxLength('description', $this->description, 200);
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
        if (null !== $this->datasetId) {
            $res['dataset_id'] = $this->datasetId;
        }
        if (null !== $this->datasourceType) {
            $res['datasource_type'] = $this->datasourceType;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
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
     * @return UpdateAntchainPdcpDatasetRequest
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
        if (isset($map['dataset_id'])) {
            $model->datasetId = $map['dataset_id'];
        }
        if (isset($map['datasource_type'])) {
            $model->datasourceType = $map['datasource_type'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
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
