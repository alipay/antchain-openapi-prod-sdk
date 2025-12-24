<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class UpdateInnerPromotionsceneRequest extends Model
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

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 场景码
    /**
     * @var string
     */
    public $sceneCode;

    // 场景名称
    /**
     * @var string
     */
    public $sceneName;

    // 场景备注
    /**
     * @var string
     */
    public $sceneRemark;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId'          => 'tenant_id',
        'sceneCode'         => 'scene_code',
        'sceneName'         => 'scene_name',
        'sceneRemark'       => 'scene_remark',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('sceneCode', $this->sceneCode, true);
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
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->sceneName) {
            $res['scene_name'] = $this->sceneName;
        }
        if (null !== $this->sceneRemark) {
            $res['scene_remark'] = $this->sceneRemark;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateInnerPromotionsceneRequest
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
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['scene_name'])) {
            $model->sceneName = $map['scene_name'];
        }
        if (isset($map['scene_remark'])) {
            $model->sceneRemark = $map['scene_remark'];
        }

        return $model;
    }
}
