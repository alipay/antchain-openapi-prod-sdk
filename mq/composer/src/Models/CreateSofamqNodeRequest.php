<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class CreateSofamqNodeRequest extends Model
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

    // cluster
    /**
     * @var string
     */
    public $cluster;

    // hostname
    /**
     * @var string
     */
    public $hostname;

    // node_group
    /**
     * @var string
     */
    public $nodeGroup;

    // node_type
    /**
     * @var string
     */
    public $nodeType;

    // perm
    /**
     * @var string
     */
    public $perm;

    // rip
    /**
     * @var string
     */
    public $rip;

    // room
    /**
     * @var string
     */
    public $room;

    // vip
    /**
     * @var string
     */
    public $vip;

    // default
    /**
     * @var string
     */
    public $dataCenter;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'cluster'           => 'cluster',
        'hostname'          => 'hostname',
        'nodeGroup'         => 'node_group',
        'nodeType'          => 'node_type',
        'perm'              => 'perm',
        'rip'               => 'rip',
        'room'              => 'room',
        'vip'               => 'vip',
        'dataCenter'        => 'data_center',
    ];

    public function validate()
    {
        Model::validateRequired('hostname', $this->hostname, true);
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
        if (null !== $this->cluster) {
            $res['cluster'] = $this->cluster;
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
        if (null !== $this->dataCenter) {
            $res['data_center'] = $this->dataCenter;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateSofamqNodeRequest
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
        if (isset($map['cluster'])) {
            $model->cluster = $map['cluster'];
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
        if (isset($map['data_center'])) {
            $model->dataCenter = $map['data_center'];
        }

        return $model;
    }
}
