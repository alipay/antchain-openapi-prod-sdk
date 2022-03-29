<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class CreateSofamqDatacenterRequest extends Model
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

    // datacenter
    /**
     * @var string
     */
    public $datacenter;

    // room
    /**
     * @var string
     */
    public $room;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'cluster'           => 'cluster',
        'datacenter'        => 'datacenter',
        'room'              => 'room',
    ];

    public function validate()
    {
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
        if (null !== $this->datacenter) {
            $res['datacenter'] = $this->datacenter;
        }
        if (null !== $this->room) {
            $res['room'] = $this->room;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateSofamqDatacenterRequest
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
        if (isset($map['datacenter'])) {
            $model->datacenter = $map['datacenter'];
        }
        if (isset($map['room'])) {
            $model->room = $map['room'];
        }

        return $model;
    }
}
