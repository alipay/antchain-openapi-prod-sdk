<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class CreateSofamqSchemaRequest extends Model
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

    // 创建Schema时的instanceId
    /**
     * @var string
     */
    public $instanceId;

    // SOFAMQ的Topic
    /**
     * @var string
     */
    public $topic;

    // Topic的Schema内容
    /**
     * @var string
     */
    public $schemaContent;

    // Schema的描述信息
    /**
     * @var string
     */
    public $schemaComment;

    // Schema的兼容性策略
    /**
     * @var string
     */
    public $schemaCompatibility;

    // schema的序列化方式
    /**
     * @var string
     */
    public $schemaSerialization;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'instanceId'          => 'instance_id',
        'topic'               => 'topic',
        'schemaContent'       => 'schema_content',
        'schemaComment'       => 'schema_comment',
        'schemaCompatibility' => 'schema_compatibility',
        'schemaSerialization' => 'schema_serialization',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('topic', $this->topic, true);
        Model::validateRequired('schemaContent', $this->schemaContent, true);
        Model::validateRequired('schemaComment', $this->schemaComment, true);
        Model::validateRequired('schemaCompatibility', $this->schemaCompatibility, true);
        Model::validateRequired('schemaSerialization', $this->schemaSerialization, true);
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
        if (null !== $this->topic) {
            $res['topic'] = $this->topic;
        }
        if (null !== $this->schemaContent) {
            $res['schema_content'] = $this->schemaContent;
        }
        if (null !== $this->schemaComment) {
            $res['schema_comment'] = $this->schemaComment;
        }
        if (null !== $this->schemaCompatibility) {
            $res['schema_compatibility'] = $this->schemaCompatibility;
        }
        if (null !== $this->schemaSerialization) {
            $res['schema_serialization'] = $this->schemaSerialization;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateSofamqSchemaRequest
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
        if (isset($map['topic'])) {
            $model->topic = $map['topic'];
        }
        if (isset($map['schema_content'])) {
            $model->schemaContent = $map['schema_content'];
        }
        if (isset($map['schema_comment'])) {
            $model->schemaComment = $map['schema_comment'];
        }
        if (isset($map['schema_compatibility'])) {
            $model->schemaCompatibility = $map['schema_compatibility'];
        }
        if (isset($map['schema_serialization'])) {
            $model->schemaSerialization = $map['schema_serialization'];
        }

        return $model;
    }
}
