<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class SchemaMetadataDO extends Model
{
    // app名称
    /**
     * @example appName
     *
     * @var string
     */
    public $app;

    // 兼容性
    /**
     * @example ALWAYS_COMPATIBLE
     *
     * @var string
     */
    public $compatibility;

    // 坐标依赖
    /**
     * @example guava
     *
     * @var string
     */
    public $coordinate;

    // 描述
    /**
     * @example helloworld
     *
     * @var string
     */
    public $description;

    // 名称
    /**
     * @example TP_DS_TEST
     *
     * @var string
     */
    public $name;

    // 命名空间
    /**
     * @example default
     *
     * @var string
     */
    public $namespace;

    // 操作人
    /**
     * @example dongshi
     *
     * @var string
     */
    public $operator;

    // 状态
    /**
     * @example DRAFT
     *
     * @var string
     */
    public $state;

    // 同步站点
    /**
     * @example alibaba
     *
     * @var string
     */
    public $syncSites;

    // 租户
    /**
     * @example alipay
     *
     * @var string
     */
    public $tenant;

    // 创建时间
    /**
     * @example 1570966857000
     *
     * @var int
     */
    public $gmtCreate;

    // 修改时间
    /**
     * @example 1570966857000
     *
     * @var int
     */
    public $gmtModified;

    // Schema指定的序列化方式
    /**
     * @example AVRO
     *
     * @var string
     */
    public $serialization;
    protected $_name = [
        'app'           => 'app',
        'compatibility' => 'compatibility',
        'coordinate'    => 'coordinate',
        'description'   => 'description',
        'name'          => 'name',
        'namespace'     => 'namespace',
        'operator'      => 'operator',
        'state'         => 'state',
        'syncSites'     => 'sync_sites',
        'tenant'        => 'tenant',
        'gmtCreate'     => 'gmt_create',
        'gmtModified'   => 'gmt_modified',
        'serialization' => 'serialization',
    ];

    public function validate()
    {
        Model::validateRequired('app', $this->app, true);
        Model::validateRequired('compatibility', $this->compatibility, true);
        Model::validateRequired('coordinate', $this->coordinate, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('state', $this->state, true);
        Model::validateRequired('syncSites', $this->syncSites, true);
        Model::validateRequired('tenant', $this->tenant, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('serialization', $this->serialization, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->app) {
            $res['app'] = $this->app;
        }
        if (null !== $this->compatibility) {
            $res['compatibility'] = $this->compatibility;
        }
        if (null !== $this->coordinate) {
            $res['coordinate'] = $this->coordinate;
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
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->syncSites) {
            $res['sync_sites'] = $this->syncSites;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->serialization) {
            $res['serialization'] = $this->serialization;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SchemaMetadataDO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app'])) {
            $model->app = $map['app'];
        }
        if (isset($map['compatibility'])) {
            $model->compatibility = $map['compatibility'];
        }
        if (isset($map['coordinate'])) {
            $model->coordinate = $map['coordinate'];
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
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['sync_sites'])) {
            $model->syncSites = $map['sync_sites'];
        }
        if (isset($map['tenant'])) {
            $model->tenant = $map['tenant'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['serialization'])) {
            $model->serialization = $map['serialization'];
        }

        return $model;
    }
}
