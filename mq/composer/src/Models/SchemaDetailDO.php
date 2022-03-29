<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class SchemaDetailDO extends Model
{
    // 注释
    /**
     * @example helloworld
     *
     * @var string
     */
    public $comment;

    // schema内容
    /**
     * @example {"type":"record","name":"User","namespace":"com.alipay.openmeta.common","fields":[{"name":"name","type":"string"},{"name":"age","type":"int"},{"name":"male","type":"boolean"}]}
     *
     * @var string
     */
    public $content;

    // 值校验规则
    /**
     * @example a.groovy
     *
     * @var string
     */
    public $fieldValidateRule;

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

    // 序列化类型
    /**
     * @example AVRO
     *
     * @var string
     */
    public $serialization;

    // 状态
    /**
     * @example DRAFT
     *
     * @var string
     */
    public $state;

    // 租户
    /**
     * @example alipay
     *
     * @var string
     */
    public $tenant;

    // schema类型
    /**
     * @example AVRO
     *
     * @var string
     */
    public $type;

    // 唯一ID
    /**
     * @example sasasa
     *
     * @var string
     */
    public $uniqId;

    // 版本
    /**
     * @example 1
     *
     * @var int
     */
    public $version;

    // 操作人
    /**
     * @example dongshi
     *
     * @var string
     */
    public $operator;

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
    protected $_name = [
        'comment'           => 'comment',
        'content'           => 'content',
        'fieldValidateRule' => 'field_validate_rule',
        'name'              => 'name',
        'namespace'         => 'namespace',
        'serialization'     => 'serialization',
        'state'             => 'state',
        'tenant'            => 'tenant',
        'type'              => 'type',
        'uniqId'            => 'uniq_id',
        'version'           => 'version',
        'operator'          => 'operator',
        'gmtCreate'         => 'gmt_create',
        'gmtModified'       => 'gmt_modified',
    ];

    public function validate()
    {
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('serialization', $this->serialization, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('operator', $this->operator, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->comment) {
            $res['comment'] = $this->comment;
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
        if (null !== $this->serialization) {
            $res['serialization'] = $this->serialization;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->uniqId) {
            $res['uniq_id'] = $this->uniqId;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SchemaDetailDO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['comment'])) {
            $model->comment = $map['comment'];
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
        if (isset($map['serialization'])) {
            $model->serialization = $map['serialization'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['tenant'])) {
            $model->tenant = $map['tenant'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['uniq_id'])) {
            $model->uniqId = $map['uniq_id'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }

        return $model;
    }
}
