<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class NodeDO extends Model
{
    // cluster
    /**
     * @example default
     *
     * @var string
     */
    public $cluster;

    // default
    /**
     * @example default
     *
     * @var string
     */
    public $dataCenter;

    // hostname
    /**
     * @example 1.1.1.1
     *
     * @var string
     */
    public $hostname;

    // node group
    /**
     * @example test
     *
     * @var string
     */
    public $nodeGroup;

    // node type
    /**
     * @example type
     *
     * @var string
     */
    public $nodeType;

    // node perm
    /**
     * @example 6
     *
     * @var string
     */
    public $perm;

    // rip
    /**
     * @example rip
     *
     * @var string
     */
    public $rip;

    // room
    /**
     * @example GZ001
     *
     * @var string
     */
    public $room;

    // vip
    /**
     * @example vip
     *
     * @var string
     */
    public $vip;

    // id
    /**
     * @example
     *
     * @var int
     */
    public $id;

    // gmt_create
    /**
     * @example gmt_create
     *
     * @var string
     */
    public $gmtCreate;

    // gmt_modified
    /**
     * @example gmt_modified
     *
     * @var string
     */
    public $gmtModified;

    // 节点状态 MASTER|SLAVE|OFFLINE
    /**
     * @example MASTER
     *
     * @var string
     */
    public $status;

    // 节点所属环境
    /**
     * @example STABLE
     *
     * @var string
     */
    public $env;

    // 节点所在城市
    /**
     * @example hangzhou
     *
     * @var string
     */
    public $city;
    protected $_name = [
        'cluster'     => 'cluster',
        'dataCenter'  => 'data_center',
        'hostname'    => 'hostname',
        'nodeGroup'   => 'node_group',
        'nodeType'    => 'node_type',
        'perm'        => 'perm',
        'rip'         => 'rip',
        'room'        => 'room',
        'vip'         => 'vip',
        'id'          => 'id',
        'gmtCreate'   => 'gmt_create',
        'gmtModified' => 'gmt_modified',
        'status'      => 'status',
        'env'         => 'env',
        'city'        => 'city',
    ];

    public function validate()
    {
        Model::validateRequired('hostname', $this->hostname, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cluster) {
            $res['cluster'] = $this->cluster;
        }
        if (null !== $this->dataCenter) {
            $res['data_center'] = $this->dataCenter;
        }
        if (null !== $this->hostname) {
            $res['hostname'] = $this->hostname;
        }
        if (null !== $this->nodeGroup) {
            $res['node_group'] = $this->nodeGroup;
        }
        if (null !== $this->nodeType) {
            $res['node_type'] = $this->nodeType;
        }
        if (null !== $this->perm) {
            $res['perm'] = $this->perm;
        }
        if (null !== $this->rip) {
            $res['rip'] = $this->rip;
        }
        if (null !== $this->room) {
            $res['room'] = $this->room;
        }
        if (null !== $this->vip) {
            $res['vip'] = $this->vip;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->env) {
            $res['env'] = $this->env;
        }
        if (null !== $this->city) {
            $res['city'] = $this->city;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NodeDO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cluster'])) {
            $model->cluster = $map['cluster'];
        }
        if (isset($map['data_center'])) {
            $model->dataCenter = $map['data_center'];
        }
        if (isset($map['hostname'])) {
            $model->hostname = $map['hostname'];
        }
        if (isset($map['node_group'])) {
            $model->nodeGroup = $map['node_group'];
        }
        if (isset($map['node_type'])) {
            $model->nodeType = $map['node_type'];
        }
        if (isset($map['perm'])) {
            $model->perm = $map['perm'];
        }
        if (isset($map['rip'])) {
            $model->rip = $map['rip'];
        }
        if (isset($map['room'])) {
            $model->room = $map['room'];
        }
        if (isset($map['vip'])) {
            $model->vip = $map['vip'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['env'])) {
            $model->env = $map['env'];
        }
        if (isset($map['city'])) {
            $model->city = $map['city'];
        }

        return $model;
    }
}
