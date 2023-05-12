<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class CreateBiztypeRelationRequest extends Model
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

    // 参与者名称数组
    /**
     * @var string[]
     */
    public $actionArray;

    // app
    /**
     * @var string
     */
    public $appName;

    // biztype
    /**
     * @var string
     */
    public $bizType;

    // 一句话描述
    /**
     * @var string
     */
    public $desc;

    // 00001
    /**
     * @var string
     */
    public $instanceId;

    // add  /  modify
    /**
     * @var string
     */
    public $state;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'actionArray'       => 'action_array',
        'appName'           => 'app_name',
        'bizType'           => 'biz_type',
        'desc'              => 'desc',
        'instanceId'        => 'instance_id',
        'state'             => 'state',
    ];

    public function validate()
    {
        Model::validateRequired('actionArray', $this->actionArray, true);
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('desc', $this->desc, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('state', $this->state, true);
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
        if (null !== $this->actionArray) {
            $res['action_array'] = $this->actionArray;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateBiztypeRelationRequest
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
        if (isset($map['action_array'])) {
            if (!empty($map['action_array'])) {
                $model->actionArray = $map['action_array'];
            }
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }

        return $model;
    }
}
