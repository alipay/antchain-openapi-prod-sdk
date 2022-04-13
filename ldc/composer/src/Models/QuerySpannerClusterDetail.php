<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class QuerySpannerClusterDetail extends Model
{
    // 用于描述联邦spanner 集群内容器实例采用内网还是外网
    /**
     * @example 内网
     *
     * @var string
     */
    public $addressType;

    // cpu 核数
    /**
     * @example 1
     *
     * @var int
     */
    public $cpu;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $createTimestamp;

    // 盘大小
    /**
     * @example 20
     *
     * @var int
     */
    public $disk;

    // 将cpu,mem,disk按照单位拼接起来
    /**
     * @example 1C1G40G
     *
     * @var string
     */
    public $flavor;

    // 描述集群容器是否采用了host网络
    //
    /**
     * @example true, false
     *
     * @var bool
     */
    public $hostNetwork;

    // 集群id
    /**
     * @example 001
     *
     * @var string
     */
    public $id;

    // 关联的实例数
    /**
     * @example 1
     *
     * @var int
     */
    public $instances;

    // mem 大小
    /**
     * @example 1
     *
     * @var int
     */
    public $mem;

    // 可能存在的错误信息
    /**
     * @example ""
     *
     * @var string
     */
    public $message;

    // 集群名称
    /**
     * @example hello
     *
     * @var string
     */
    public $name;

    // 描述集群状态
    //
    /**
     * @example 已上线
     *
     * @var string
     */
    public $state;

    // 租户名称
    /**
     * @example lili
     *
     * @var string
     */
    public $tenant;

    // 最后更新的时间戳
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $updateTimestamp;

    // 工作空间组
    /**
     * @example cn-shangh-01
     *
     * @var string
     */
    public $workspaceGroup;

    // 期望集群状态
    /**
     * @example ONLINE
     *
     * @var string
     */
    public $expectClusterState;
    protected $_name = [
        'addressType'        => 'address_type',
        'cpu'                => 'cpu',
        'createTimestamp'    => 'create_timestamp',
        'disk'               => 'disk',
        'flavor'             => 'flavor',
        'hostNetwork'        => 'host_network',
        'id'                 => 'id',
        'instances'          => 'instances',
        'mem'                => 'mem',
        'message'            => 'message',
        'name'               => 'name',
        'state'              => 'state',
        'tenant'             => 'tenant',
        'updateTimestamp'    => 'update_timestamp',
        'workspaceGroup'     => 'workspace_group',
        'expectClusterState' => 'expect_cluster_state',
    ];

    public function validate()
    {
        Model::validateRequired('addressType', $this->addressType, true);
        Model::validateRequired('flavor', $this->flavor, true);
        Model::validateRequired('hostNetwork', $this->hostNetwork, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('instances', $this->instances, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('state', $this->state, true);
        Model::validateRequired('tenant', $this->tenant, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
        Model::validatePattern('createTimestamp', $this->createTimestamp, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('updateTimestamp', $this->updateTimestamp, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validateMaxLength('id', $this->id, 256);
        Model::validateMaxLength('name', $this->name, 63);
        Model::validateMaxLength('state', $this->state, 63);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->addressType) {
            $res['address_type'] = $this->addressType;
        }
        if (null !== $this->cpu) {
            $res['cpu'] = $this->cpu;
        }
        if (null !== $this->createTimestamp) {
            $res['create_timestamp'] = $this->createTimestamp;
        }
        if (null !== $this->disk) {
            $res['disk'] = $this->disk;
        }
        if (null !== $this->flavor) {
            $res['flavor'] = $this->flavor;
        }
        if (null !== $this->hostNetwork) {
            $res['host_network'] = $this->hostNetwork;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->instances) {
            $res['instances'] = $this->instances;
        }
        if (null !== $this->mem) {
            $res['mem'] = $this->mem;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->updateTimestamp) {
            $res['update_timestamp'] = $this->updateTimestamp;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->expectClusterState) {
            $res['expect_cluster_state'] = $this->expectClusterState;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySpannerClusterDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['address_type'])) {
            $model->addressType = $map['address_type'];
        }
        if (isset($map['cpu'])) {
            $model->cpu = $map['cpu'];
        }
        if (isset($map['create_timestamp'])) {
            $model->createTimestamp = $map['create_timestamp'];
        }
        if (isset($map['disk'])) {
            $model->disk = $map['disk'];
        }
        if (isset($map['flavor'])) {
            $model->flavor = $map['flavor'];
        }
        if (isset($map['host_network'])) {
            $model->hostNetwork = $map['host_network'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['instances'])) {
            $model->instances = $map['instances'];
        }
        if (isset($map['mem'])) {
            $model->mem = $map['mem'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['tenant'])) {
            $model->tenant = $map['tenant'];
        }
        if (isset($map['update_timestamp'])) {
            $model->updateTimestamp = $map['update_timestamp'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }
        if (isset($map['expect_cluster_state'])) {
            $model->expectClusterState = $map['expect_cluster_state'];
        }

        return $model;
    }
}
