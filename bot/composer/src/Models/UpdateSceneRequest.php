<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class UpdateSceneRequest extends Model
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

    // 主键Id
    /**
     * @var int
     */
    public $id;

    // 是否跳过中台数据校验处理
    /**
     * @var bool
     */
    public $skipPegasus;

    // 场景名称
    //
    /**
     * @var string
     */
    public $sceneName;

    // 租户
    //
    /**
     * @var string
     */
    public $tenantName;

    // 场景类型
    //
    /**
     * @var string
     */
    public $sceneType;

    // 定制数据处理类 , 使用用逗号分隔
    /**
     * @var string
     */
    public $customerProcessor;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'id'                => 'id',
        'skipPegasus'       => 'skip_pegasus',
        'sceneName'         => 'scene_name',
        'tenantName'        => 'tenant_name',
        'sceneType'         => 'scene_type',
        'customerProcessor' => 'customer_processor',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('skipPegasus', $this->skipPegasus, true);
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
        if (null !== $this->skipPegasus) {
            $res['skip_pegasus'] = $this->skipPegasus;
        }
        if (null !== $this->sceneName) {
            $res['scene_name'] = $this->sceneName;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->sceneType) {
            $res['scene_type'] = $this->sceneType;
        }
        if (null !== $this->customerProcessor) {
            $res['customer_processor'] = $this->customerProcessor;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateSceneRequest
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
        if (isset($map['skip_pegasus'])) {
            $model->skipPegasus = $map['skip_pegasus'];
        }
        if (isset($map['scene_name'])) {
            $model->sceneName = $map['scene_name'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }
        if (isset($map['scene_type'])) {
            $model->sceneType = $map['scene_type'];
        }
        if (isset($map['customer_processor'])) {
            $model->customerProcessor = $map['customer_processor'];
        }

        return $model;
    }
}
