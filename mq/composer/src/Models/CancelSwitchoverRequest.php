<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class CancelSwitchoverRequest extends Model
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

    // target zone
    /**
     * @var string
     */
    public $destCell;

    // instance id
    /**
     * @var string
     */
    public $instanceId;

    // source zone
    /**
     * @var string
     */
    public $sourceCell;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'destCell'          => 'dest_cell',
        'instanceId'        => 'instance_id',
        'sourceCell'        => 'source_cell',
    ];

    public function validate()
    {
        Model::validateRequired('destCell', $this->destCell, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('sourceCell', $this->sourceCell, true);
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
        if (null !== $this->destCell) {
            $res['dest_cell'] = $this->destCell;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->sourceCell) {
            $res['source_cell'] = $this->sourceCell;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CancelSwitchoverRequest
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
        if (isset($map['dest_cell'])) {
            $model->destCell = $map['dest_cell'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['source_cell'])) {
            $model->sourceCell = $map['source_cell'];
        }

        return $model;
    }
}
