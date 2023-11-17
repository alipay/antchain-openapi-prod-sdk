<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models;

use AlibabaCloud\Tea\Model;

class CreateAntchainPdcpDatasourceRequest extends Model
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

    // 数据源名称，必填，长度不超过50个字符
    /**
     * @var string
     */
    public $name;

    // 数据源的描述，数据量，作用域等等。
    // 非必填，长度不超过200个字符。
    /**
     * @var string
     */
    public $description;

    // 描述当前数据源是否支持写入。
    // true表示支持写入。
    /**
     * @var bool
     */
    public $writable;

    // 描述数据源类型的枚举，必填。
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
    public $type;

    // 数据源连接信息的对象体转化为的json字符串。
    // 要求连接信息的类型必须与type指定的一致。
    // 该参数请参考如下的对应结构体，定义好后转化成jsonstring，对应信息如下：
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
        'name'              => 'name',
        'description'       => 'description',
        'writable'          => 'writable',
        'type'              => 'type',
        'connConfig'        => 'conn_config',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('writable', $this->writable, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('connConfig', $this->connConfig, true);
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
     * @return CreateAntchainPdcpDatasourceRequest
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
