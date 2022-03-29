<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class CreateSchemaAdminmetadataRequest extends Model
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

    // SOFAMQ实例ID
    /**
     * @var string
     */
    public $instanceId;

    // 应用名称
    /**
     * @var string
     */
    public $app;

    // 兼容性策略
    /**
     * @var string
     */
    public $compatibility;

    // 描述
    //
    /**
     * @var string
     */
    public $description;

    // 名称
    /**
     * @var string
     */
    public $name;

    // 命名空间
    /**
     * @var string
     */
    public $namespace;

    // 租户
    /**
     * @var string
     */
    public $schemaTenant;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'instanceId'        => 'instance_id',
        'app'               => 'app',
        'compatibility'     => 'compatibility',
        'description'       => 'description',
        'name'              => 'name',
        'namespace'         => 'namespace',
        'schemaTenant'      => 'schema_tenant',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('app', $this->app, true);
        Model::validateRequired('compatibility', $this->compatibility, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('name', $this->name, true);
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
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->app) {
            $res['app'] = $this->app;
        }
        if (null !== $this->compatibility) {
            $res['compatibility'] = $this->compatibility;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->schemaTenant) {
            $res['schema_tenant'] = $this->schemaTenant;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateSchemaAdminmetadataRequest
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
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['app'])) {
            $model->app = $map['app'];
        }
        if (isset($map['compatibility'])) {
            $model->compatibility = $map['compatibility'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['schema_tenant'])) {
            $model->schemaTenant = $map['schema_tenant'];
        }

        return $model;
    }
}
