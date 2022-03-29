<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class CellDO extends Model
{
    // cell
    /**
     * @example cell
     *
     * @var string
     */
    public $cell;

    // cell type
    /**
     * @example cell type
     *
     * @var string
     */
    public $cellType;

    // default
    /**
     * @example default
     *
     * @var string
     */
    public $datacenter;

    // endpoint
    /**
     * @example endpoint
     *
     * @var string
     */
    public $endpoint;

    // endpoint type
    /**
     * @example endpoint type
     *
     * @var string
     */
    public $endpointType;

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

    // id
    /**
     * @example
     *
     * @var int
     */
    public $id;

    // instance_id
    /**
     * @example instance_id
     *
     * @var string
     */
    public $instanceId;

    // room
    /**
     * @example room
     *
     * @var string
     */
    public $room;
    protected $_name = [
        'cell'         => 'cell',
        'cellType'     => 'cell_type',
        'datacenter'   => 'datacenter',
        'endpoint'     => 'endpoint',
        'endpointType' => 'endpoint_type',
        'gmtCreate'    => 'gmt_create',
        'gmtModified'  => 'gmt_modified',
        'id'           => 'id',
        'instanceId'   => 'instance_id',
        'room'         => 'room',
    ];

    public function validate()
    {
        Model::validateRequired('cell', $this->cell, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('id', $this->id, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cell) {
            $res['cell'] = $this->cell;
        }
        if (null !== $this->cellType) {
            $res['cell_type'] = $this->cellType;
        }
        if (null !== $this->datacenter) {
            $res['datacenter'] = $this->datacenter;
        }
        if (null !== $this->endpoint) {
            $res['endpoint'] = $this->endpoint;
        }
        if (null !== $this->endpointType) {
            $res['endpoint_type'] = $this->endpointType;
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
        if (null !== $this->room) {
            $res['room'] = $this->room;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CellDO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cell'])) {
            $model->cell = $map['cell'];
        }
        if (isset($map['cell_type'])) {
            $model->cellType = $map['cell_type'];
        }
        if (isset($map['datacenter'])) {
            $model->datacenter = $map['datacenter'];
        }
        if (isset($map['endpoint'])) {
            $model->endpoint = $map['endpoint'];
        }
        if (isset($map['endpoint_type'])) {
            $model->endpointType = $map['endpoint_type'];
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
        if (isset($map['room'])) {
            $model->room = $map['room'];
        }

        return $model;
    }
}
