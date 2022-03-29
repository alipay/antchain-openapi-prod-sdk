<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class RoomDO extends Model
{
    // cluster
    /**
     * @example cluster
     *
     * @var string
     */
    public $cluster;

    // endpoint
    /**
     * @example endpoint
     *
     * @var string
     */
    public $endpoint;

    // endpoint_type
    /**
     * @example endpoint_type
     *
     * @var string
     */
    public $endpointType;

    // region
    /**
     * @example region
     *
     * @var string
     */
    public $region;

    // room
    /**
     * @example room
     *
     * @var string
     */
    public $room;

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
    protected $_name = [
        'cluster'      => 'cluster',
        'endpoint'     => 'endpoint',
        'endpointType' => 'endpoint_type',
        'region'       => 'region',
        'room'         => 'room',
        'id'           => 'id',
        'gmtCreate'    => 'gmt_create',
        'gmtModified'  => 'gmt_modified',
    ];

    public function validate()
    {
        Model::validateRequired('cluster', $this->cluster, true);
        Model::validateRequired('room', $this->room, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cluster) {
            $res['cluster'] = $this->cluster;
        }
        if (null !== $this->endpoint) {
            $res['endpoint'] = $this->endpoint;
        }
        if (null !== $this->endpointType) {
            $res['endpoint_type'] = $this->endpointType;
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }
        if (null !== $this->room) {
            $res['room'] = $this->room;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RoomDO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cluster'])) {
            $model->cluster = $map['cluster'];
        }
        if (isset($map['endpoint'])) {
            $model->endpoint = $map['endpoint'];
        }
        if (isset($map['endpoint_type'])) {
            $model->endpointType = $map['endpoint_type'];
        }
        if (isset($map['region'])) {
            $model->region = $map['region'];
        }
        if (isset($map['room'])) {
            $model->room = $map['room'];
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

        return $model;
    }
}
