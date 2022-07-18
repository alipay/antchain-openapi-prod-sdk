<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class CreateCustomerEntityRequest extends Model
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

    // 场景码，由蚂蚁提供
    /**
     * @var string
     */
    public $scene;

    // 实体ID，场景内实体ID需要具有唯一性
    /**
     * @var string
     */
    public $entityId;

    // 实体名称, 例如：服务区地理围栏
    /**
     * @var string
     */
    public $entityName;

    // 实体内容 , 类型为字符串
    /**
     * @var string
     */
    public $content;

    // 实体类别 (枚举) ，由蚂蚁提供 ，例如地理围栏：GEOFENCE
    /**
     * @var string
     */
    public $entityType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'scene'             => 'scene',
        'entityId'          => 'entity_id',
        'entityName'        => 'entity_name',
        'content'           => 'content',
        'entityType'        => 'entity_type',
    ];

    public function validate()
    {
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('entityId', $this->entityId, true);
        Model::validateRequired('entityName', $this->entityName, true);
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('entityType', $this->entityType, true);
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
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->entityId) {
            $res['entity_id'] = $this->entityId;
        }
        if (null !== $this->entityName) {
            $res['entity_name'] = $this->entityName;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->entityType) {
            $res['entity_type'] = $this->entityType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateCustomerEntityRequest
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
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['entity_id'])) {
            $model->entityId = $map['entity_id'];
        }
        if (isset($map['entity_name'])) {
            $model->entityName = $map['entity_name'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['entity_type'])) {
            $model->entityType = $map['entity_type'];
        }

        return $model;
    }
}
