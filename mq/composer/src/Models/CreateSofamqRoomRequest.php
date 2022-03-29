<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class CreateSofamqRoomRequest extends Model
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

    // region
    /**
     * @var string
     */
    public $region;

    // room
    /**
     * @var string
     */
    public $room;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'cluster'           => 'cluster',
        'endpoint'          => 'endpoint',
        'endpointType'      => 'endpoint_type',
        'region'            => 'region',
        'room'              => 'room',
    ];

    public function validate()
    {
        Model::validateRequired('cluster', $this->cluster, true);
        Model::validateRequired('room', $this->room, true);
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateSofamqRoomRequest
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

        return $model;
    }
}
