<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class PromotionScene extends Model
{
    // 租户id
    /**
     * @example VBVKBCHQ
     *
     * @var string
     */
    public $tenantId;

    // 场景码
    /**
     * @example APDKQOWE
     *
     * @var string
     */
    public $sceneCode;

    // 场景名称
    /**
     * @example 场景名称
     *
     * @var string
     */
    public $sceneName;

    // 场景备注
    /**
     * @example 备注内容
     *
     * @var string
     */
    public $sceneRemark;

    // 场景商品数量
    /**
     * @example 20
     *
     * @var int
     */
    public $sceneProductAmount;
    protected $_name = [
        'tenantId'           => 'tenant_id',
        'sceneCode'          => 'scene_code',
        'sceneName'          => 'scene_name',
        'sceneRemark'        => 'scene_remark',
        'sceneProductAmount' => 'scene_product_amount',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
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
        if (null !== $this->sceneProductAmount) {
            $res['scene_product_amount'] = $this->sceneProductAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PromotionScene
     */
    public static function fromMap($map = [])
    {
        $model = new self();
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
        if (isset($map['scene_product_amount'])) {
            $model->sceneProductAmount = $map['scene_product_amount'];
        }

        return $model;
    }
}
