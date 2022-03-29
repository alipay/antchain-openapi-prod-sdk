<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class TopicDTO extends Model
{
    // 集群名称
    /**
     * @example single
     *
     * @var string
     */
    public $cluster;

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

    // 数据库 ID
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 实例 ID
    /**
     * @example 000001
     *
     * @var string
     */
    public $instanceId;

    // 消息类型。取值说明如下：
    //
    // 0：普通消息
    // 1：分区顺序消息
    // 2：全局顺序消息
    // 4：事务消息
    // 5：定时/延时消息
    /**
     * @example 0:顺序消息
     *
     * @var int
     */
    public $messageType;

    // 创建人
    /**
     * @example alipay
     *
     * @var string
     */
    public $operator;

    // 设置该 Topic 的读写模式。取值说明如下：
    //
    // 6：同时支持读写
    // 4：禁写
    // 2：禁读
    /**
     * @example 6
     *
     * @var int
     */
    public $perm;

    // 读分区数
    /**
     * @example 8
     *
     * @var int
     */
    public $readQueueNum;

    // Topic 备注信息
    /**
     * @example desc
     *
     * @var string
     */
    public $remark;

    // Topic 名称
    /**
     * @example TP_TEST
     *
     * @var string
     */
    public $topic;

    // 写分区数
    /**
     * @example 8
     *
     * @var int
     */
    public $writeQueueNum;

    // 生效范围
    /**
     * @example {"envs":["PREPUB"]}
     *
     * @var string
     */
    public $scope;

    // 版本号
    /**
     * @example 1
     *
     * @var int
     */
    public $version;

    // 删除标志
    /**
     * @example DEL
     *
     * @var string
     */
    public $deleteMark;

    // true标识该topic带有schema，否则不带schema
    /**
     * @example true
     *
     * @var bool
     */
    public $schemaMark;

    // Topic对应Schema配置的序列化方式
    /**
     * @example AVRO
     *
     * @var string
     */
    public $schemaSerialization;

    // Topic对应的Schema的兼容性策略
    /**
     * @example FULL
     *
     * @var string
     */
    public $schemaCompatibility;

    // Topic 所属的应用名称，要求 app name 在 zappinfo 上可查
    /**
     * @example sofamqbroker
     *
     * @var string
     */
    public $owner;
    protected $_name = [
        'cluster'             => 'cluster',
        'gmtCreate'           => 'gmt_create',
        'gmtModified'         => 'gmt_modified',
        'id'                  => 'id',
        'instanceId'          => 'instance_id',
        'messageType'         => 'message_type',
        'operator'            => 'operator',
        'perm'                => 'perm',
        'readQueueNum'        => 'read_queue_num',
        'remark'              => 'remark',
        'topic'               => 'topic',
        'writeQueueNum'       => 'write_queue_num',
        'scope'               => 'scope',
        'version'             => 'version',
        'deleteMark'          => 'delete_mark',
        'schemaMark'          => 'schema_mark',
        'schemaSerialization' => 'schema_serialization',
        'schemaCompatibility' => 'schema_compatibility',
        'owner'               => 'owner',
    ];

    public function validate()
    {
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('messageType', $this->messageType, true);
        Model::validateRequired('perm', $this->perm, true);
        Model::validateRequired('remark', $this->remark, true);
        Model::validateRequired('topic', $this->topic, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cluster) {
            $res['cluster'] = $this->cluster;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->messageType) {
            $res['message_type'] = $this->messageType;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->perm) {
            $res['perm'] = $this->perm;
        }
        if (null !== $this->readQueueNum) {
            $res['read_queue_num'] = $this->readQueueNum;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }
        if (null !== $this->topic) {
            $res['topic'] = $this->topic;
        }
        if (null !== $this->writeQueueNum) {
            $res['write_queue_num'] = $this->writeQueueNum;
        }
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->deleteMark) {
            $res['delete_mark'] = $this->deleteMark;
        }
        if (null !== $this->schemaMark) {
            $res['schema_mark'] = $this->schemaMark;
        }
        if (null !== $this->schemaSerialization) {
            $res['schema_serialization'] = $this->schemaSerialization;
        }
        if (null !== $this->schemaCompatibility) {
            $res['schema_compatibility'] = $this->schemaCompatibility;
        }
        if (null !== $this->owner) {
            $res['owner'] = $this->owner;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TopicDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cluster'])) {
            $model->cluster = $map['cluster'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['message_type'])) {
            $model->messageType = $map['message_type'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['perm'])) {
            $model->perm = $map['perm'];
        }
        if (isset($map['read_queue_num'])) {
            $model->readQueueNum = $map['read_queue_num'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }
        if (isset($map['topic'])) {
            $model->topic = $map['topic'];
        }
        if (isset($map['write_queue_num'])) {
            $model->writeQueueNum = $map['write_queue_num'];
        }
        if (isset($map['scope'])) {
            $model->scope = $map['scope'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }
        if (isset($map['delete_mark'])) {
            $model->deleteMark = $map['delete_mark'];
        }
        if (isset($map['schema_mark'])) {
            $model->schemaMark = $map['schema_mark'];
        }
        if (isset($map['schema_serialization'])) {
            $model->schemaSerialization = $map['schema_serialization'];
        }
        if (isset($map['schema_compatibility'])) {
            $model->schemaCompatibility = $map['schema_compatibility'];
        }
        if (isset($map['owner'])) {
            $model->owner = $map['owner'];
        }

        return $model;
    }
}
