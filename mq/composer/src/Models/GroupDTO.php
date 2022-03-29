<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class GroupDTO extends Model
{
    // 集群名
    /**
     * @example SINGLE
     *
     * @var string
     */
    public $cluster;

    // 删除标志
    /**
     * @example DEL
     *
     * @var string
     */
    public $deleteMark;

    // 创建时间
    /**
     * @example
     *
     * @var int
     */
    public $gmtCreate;

    // 修改时间
    /**
     * @example
     *
     * @var int
     */
    public $gmtModified;

    // Group ID
    /**
     * @example test_group_id
     *
     * @var string
     */
    public $groupId;

    // 查询的 Group ID 适用的协议。TCP 协议和 HTTP 协议的 Group ID 不可以共用，需要分别创建。取值说明如下：
    //
    // tcp：表示该 Group ID 仅适用于 TCP 协议的消息收发。
    // http：表示该 Group ID 仅适用于 HTTP 协议的消息收发。
    /**
     * @example tcp
     *
     * @var string
     */
    public $groupType;

    // 数据库 ID
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 实例 ID
    /**
     * @example SOFAMQ_INSTANCE_000001
     *
     * @var string
     */
    public $instanceId;

    // 操作人
    /**
     * @example alipay
     *
     * @var string
     */
    public $operator;

    // 读权限
    /**
     * @example true
     *
     * @var bool
     */
    public $readEnable;

    // Group 备注信息
    /**
     * @example test
     *
     * @var string
     */
    public $remark;

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

    // retry topic读队列数
    /**
     * @example 8
     *
     * @var int
     */
    public $retryReadQueueNum;

    // retry topic写队列数
    /**
     * @example 8
     *
     * @var int
     */
    public $retryWriteQueueNum;

    // retry topic读写权限
    /**
     * @example 6
     *
     * @var int
     */
    public $retryPerm;

    // Group 所属的应用名称，要求应用名在 zappinfo 上可查
    /**
     * @example sofamqbroker
     *
     * @var string
     */
    public $owner;
    protected $_name = [
        'cluster'            => 'cluster',
        'deleteMark'         => 'delete_mark',
        'gmtCreate'          => 'gmt_create',
        'gmtModified'        => 'gmt_modified',
        'groupId'            => 'group_id',
        'groupType'          => 'group_type',
        'id'                 => 'id',
        'instanceId'         => 'instance_id',
        'operator'           => 'operator',
        'readEnable'         => 'read_enable',
        'remark'             => 'remark',
        'scope'              => 'scope',
        'version'            => 'version',
        'retryReadQueueNum'  => 'retry_read_queue_num',
        'retryWriteQueueNum' => 'retry_write_queue_num',
        'retryPerm'          => 'retry_perm',
        'owner'              => 'owner',
    ];

    public function validate()
    {
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('groupId', $this->groupId, true);
        Model::validateRequired('groupType', $this->groupType, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('remark', $this->remark, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cluster) {
            $res['cluster'] = $this->cluster;
        }
        if (null !== $this->deleteMark) {
            $res['delete_mark'] = $this->deleteMark;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->groupId) {
            $res['group_id'] = $this->groupId;
        }
        if (null !== $this->groupType) {
            $res['group_type'] = $this->groupType;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->readEnable) {
            $res['read_enable'] = $this->readEnable;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->retryReadQueueNum) {
            $res['retry_read_queue_num'] = $this->retryReadQueueNum;
        }
        if (null !== $this->retryWriteQueueNum) {
            $res['retry_write_queue_num'] = $this->retryWriteQueueNum;
        }
        if (null !== $this->retryPerm) {
            $res['retry_perm'] = $this->retryPerm;
        }
        if (null !== $this->owner) {
            $res['owner'] = $this->owner;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GroupDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cluster'])) {
            $model->cluster = $map['cluster'];
        }
        if (isset($map['delete_mark'])) {
            $model->deleteMark = $map['delete_mark'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['group_id'])) {
            $model->groupId = $map['group_id'];
        }
        if (isset($map['group_type'])) {
            $model->groupType = $map['group_type'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['read_enable'])) {
            $model->readEnable = $map['read_enable'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }
        if (isset($map['scope'])) {
            $model->scope = $map['scope'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }
        if (isset($map['retry_read_queue_num'])) {
            $model->retryReadQueueNum = $map['retry_read_queue_num'];
        }
        if (isset($map['retry_write_queue_num'])) {
            $model->retryWriteQueueNum = $map['retry_write_queue_num'];
        }
        if (isset($map['retry_perm'])) {
            $model->retryPerm = $map['retry_perm'];
        }
        if (isset($map['owner'])) {
            $model->owner = $map['owner'];
        }

        return $model;
    }
}
