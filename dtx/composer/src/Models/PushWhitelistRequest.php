<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class PushWhitelistRequest extends Model
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

    // instance_id
    /**
     * @var string
     */
    public $instanceId;

    // ref _id
    /**
     * @var int
     */
    public $refId;

    // 1按照服务器推送 2按照集群推送
    /**
     * @var int
     */
    public $type;

    // 如果按照服务器推送 传多个ip的数组，逗号分割。如果是按照集群推送，传zone数组，一个不传就默认全部
    /**
     * @var string[]
     */
    public $pushTarget;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'instanceId'        => 'instance_id',
        'refId'             => 'ref_id',
        'type'              => 'type',
        'pushTarget'        => 'push_target',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('refId', $this->refId, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('pushTarget', $this->pushTarget, true);
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
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->refId) {
            $res['ref_id'] = $this->refId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->pushTarget) {
            $res['push_target'] = $this->pushTarget;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushWhitelistRequest
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
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['ref_id'])) {
            $model->refId = $map['ref_id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['push_target'])) {
            if (!empty($map['push_target'])) {
                $model->pushTarget = $map['push_target'];
            }
        }

        return $model;
    }
}
