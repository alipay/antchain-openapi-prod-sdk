<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models;

use AlibabaCloud\Tea\Model;

class UpdateAntchainPdcpDatasourceRequest extends Model
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

    // 待更新的数据源 id，必填
    /**
     * @var string
     */
    public $datasourceId;

    // 更新后的数据源名称，非必填，不填则不更新
    /**
     * @var string
     */
    public $name;

    // 更新后的数据源描述，非必填，不填则不更新
    /**
     * @var string
     */
    public $description;

    // 数据源是否可写，非必填，不填则不更新
    /**
     * @var bool
     */
    public $writable;

    // 数据源连接参数，非必填，不填则不更新，注意必须与此数据源创建时的类型一致。
    // 该参数请参考如下对应结构体，定义好后需转成jsonString，对应关系展示如下：
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
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'datasourceId'      => 'datasource_id',
        'name'              => 'name',
        'description'       => 'description',
        'writable'          => 'writable',
        'connConfig'        => 'conn_config',
    ];

    public function validate()
    {
        Model::validateRequired('datasourceId', $this->datasourceId, true);
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->writable) {
            $res['writable'] = $this->writable;
        }
        if (null !== $this->connConfig) {
            $res['conn_config'] = $this->connConfig;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateAntchainPdcpDatasourceRequest
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
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['writable'])) {
            $model->writable = $map['writable'];
        }
        if (isset($map['conn_config'])) {
            $model->connConfig = $map['conn_config'];
        }

        return $model;
    }
}
