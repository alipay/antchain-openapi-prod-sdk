<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class AddDrmDrmdataRequest extends Model
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

    // 资源标识
    /**
     * @var string
     */
    public $dataId;

    // 实例id
    /**
     * @var string
     */
    public $instanceId;

    // 推送目标Cell列表,英文逗号隔开
    /**
     * @var string
     */
    public $pushCells;

    // 推送目标类型
    /**
     * @var string
     */
    public $pushTargetType;

    // 数据值
    /**
     * @var string
     */
    public $value;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'dataId'            => 'data_id',
        'instanceId'        => 'instance_id',
        'pushCells'         => 'push_cells',
        'pushTargetType'    => 'push_target_type',
        'value'             => 'value',
    ];

    public function validate()
    {
        Model::validateRequired('dataId', $this->dataId, true);
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
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->pushCells) {
            $res['push_cells'] = $this->pushCells;
        }
        if (null !== $this->pushTargetType) {
            $res['push_target_type'] = $this->pushTargetType;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddDrmDrmdataRequest
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
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['push_cells'])) {
            $model->pushCells = $map['push_cells'];
        }
        if (isset($map['push_target_type'])) {
            $model->pushTargetType = $map['push_target_type'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }

        return $model;
    }
}
