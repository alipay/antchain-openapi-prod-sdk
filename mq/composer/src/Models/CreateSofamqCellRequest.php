<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class CreateSofamqCellRequest extends Model
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

    // cell
    /**
     * @var string
     */
    public $cell;

    // cell_type
    /**
     * @var string
     */
    public $cellType;

    // default
    /**
     * @var string
     */
    public $datacenter;

    // endpoint
    /**
     * @var string
     */
    public $endpoint;

    // endpoint_type
    /**
     * @var string
     */
    public $endpointType;

    // ns id
    /**
     * @var string
     */
    public $instanceId;

    // room
    /**
     * @var string
     */
    public $room;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'cell'              => 'cell',
        'cellType'          => 'cell_type',
        'datacenter'        => 'datacenter',
        'endpoint'          => 'endpoint',
        'endpointType'      => 'endpoint_type',
        'instanceId'        => 'instance_id',
        'room'              => 'room',
    ];

    public function validate()
    {
        Model::validateRequired('cell', $this->cell, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
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
     * @return CreateSofamqCellRequest
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
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['room'])) {
            $model->room = $map['room'];
        }

        return $model;
    }
}
