<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class CreateSchemaAdmindetailRequest extends Model
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

    // 内容
    /**
     * @var string
     */
    public $content;

    // 值校验
    /**
     * @var string
     */
    public $fieldValidateRule;

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

    // 序列化方式
    /**
     * @var string
     */
    public $serialization;

    // 类型
    /**
     * @var string
     */
    public $schemaType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'instanceId'        => 'instance_id',
        'content'           => 'content',
        'fieldValidateRule' => 'field_validate_rule',
        'name'              => 'name',
        'namespace'         => 'namespace',
        'schemaTenant'      => 'schema_tenant',
        'serialization'     => 'serialization',
        'schemaType'        => 'schema_type',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('serialization', $this->serialization, true);
        Model::validateRequired('schemaType', $this->schemaType, true);
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
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->fieldValidateRule) {
            $res['field_validate_rule'] = $this->fieldValidateRule;
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
        if (null !== $this->serialization) {
            $res['serialization'] = $this->serialization;
        }
        if (null !== $this->schemaType) {
            $res['schema_type'] = $this->schemaType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateSchemaAdmindetailRequest
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
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['field_validate_rule'])) {
            $model->fieldValidateRule = $map['field_validate_rule'];
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
        if (isset($map['serialization'])) {
            $model->serialization = $map['serialization'];
        }
        if (isset($map['schema_type'])) {
            $model->schemaType = $map['schema_type'];
        }

        return $model;
    }
}
