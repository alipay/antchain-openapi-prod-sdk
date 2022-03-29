<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ListSchemaAdminmetadataRequest extends Model
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

    // SOFAMQ的实例ID
    /**
     * @var string
     */
    public $instanceId;

    // 名称
    /**
     * @var string
     */
    public $name;

    // 页号
    /**
     * @var int
     */
    public $pageNum;

    // 页大小
    /**
     * @var int
     */
    public $pageSize;

    // schema的租户信息
    /**
     * @var string
     */
    public $schemaTenant;

    // schema的命名空间
    /**
     * @var string
     */
    public $schemaNamespace;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'instanceId'        => 'instance_id',
        'name'              => 'name',
        'pageNum'           => 'page_num',
        'pageSize'          => 'page_size',
        'schemaTenant'      => 'schema_tenant',
        'schemaNamespace'   => 'schema_namespace',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('pageNum', $this->pageNum, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->schemaTenant) {
            $res['schema_tenant'] = $this->schemaTenant;
        }
        if (null !== $this->schemaNamespace) {
            $res['schema_namespace'] = $this->schemaNamespace;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListSchemaAdminmetadataRequest
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
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['schema_tenant'])) {
            $model->schemaTenant = $map['schema_tenant'];
        }
        if (isset($map['schema_namespace'])) {
            $model->schemaNamespace = $map['schema_namespace'];
        }

        return $model;
    }
}
