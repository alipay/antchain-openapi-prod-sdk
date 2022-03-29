<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class UpdateSofamqNodeRequest extends Model
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

    // id
    /**
     * @var int
     */
    public $id;

    // cluster
    /**
     * @var string
     */
    public $cluster;

    // data_center
    /**
     * @var string
     */
    public $dataCenter;

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

    // vip
    /**
     * @var string
     */
    public $vip;

    // room
    /**
     * @var string
     */
    public $room;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'id'                => 'id',
        'cluster'           => 'cluster',
        'dataCenter'        => 'data_center',
        'hostname'          => 'hostname',
        'nodeGroup'         => 'node_group',
        'perm'              => 'perm',
        'rip'               => 'rip',
        'vip'               => 'vip',
        'room'              => 'room',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
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
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
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
        if (null !== $this->perm) {
            $res['perm'] = $this->perm;
        }
        if (null !== $this->rip) {
            $res['rip'] = $this->rip;
        }
        if (null !== $this->vip) {
            $res['vip'] = $this->vip;
        }
        if (null !== $this->room) {
            $res['room'] = $this->room;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateSofamqNodeRequest
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
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
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
        if (isset($map['perm'])) {
            $model->perm = $map['perm'];
        }
        if (isset($map['rip'])) {
            $model->rip = $map['rip'];
        }
        if (isset($map['vip'])) {
            $model->vip = $map['vip'];
        }
        if (isset($map['room'])) {
            $model->room = $map['room'];
        }

        return $model;
    }
}
