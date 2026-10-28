<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ExecDatalinkSourceRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'configType' => 'config_type',
        'alias' => 'alias',
        'sql' => 'sql',
    ];
    public function validate() {
        Model::validateRequired('configType', $this->configType, true);
        Model::validateRequired('alias', $this->alias, true);
        Model::validateRequired('sql', $this->sql, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->configType) {
            $res['config_type'] = $this->configType;
        }
        if (null !== $this->alias) {
            $res['alias'] = $this->alias;
        }
        if (null !== $this->sql) {
            $res['sql'] = $this->sql;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecDatalinkSourceRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['config_type'])){
            $model->configType = $map['config_type'];
        }
        if(isset($map['alias'])){
            $model->alias = $map['alias'];
        }
        if(isset($map['sql'])){
            $model->sql = $map['sql'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 数据源类型
    /**
     * @var string
     */
    public $configType;

    // 数据源别称
    /**
     * @var string
     */
    public $alias;

    // 执行查询的SQL
    /**
     * @var string
     */
    public $sql;

}
