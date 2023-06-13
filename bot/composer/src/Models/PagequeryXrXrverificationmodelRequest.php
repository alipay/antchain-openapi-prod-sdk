<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class PagequeryXrXrverificationmodelRequest extends Model
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

    // 唯一ID，对应线下场code
    /**
     * @var string
     */
    public $resourceId;

    // 唯一ID，对应线下场名称
    /**
     * @var string
     */
    public $resourceName;

    // 设备sn
    /**
     * @var string
     */
    public $instanceName;

    // 设备did
    /**
     * @var string
     */
    public $instanceId;

    // 当前页
    /**
     * @var int
     */
    public $current;

    // 每页大小
    /**
     * @var int
     */
    public $pageSize;

    // 业务类型
    /**
     * @var string
     */
    public $bizScene;

    // 核销类型
    /**
     * @var string
     */
    public $type;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'resourceId'        => 'resource_id',
        'resourceName'      => 'resource_name',
        'instanceName'      => 'instance_name',
        'instanceId'        => 'instance_id',
        'current'           => 'current',
        'pageSize'          => 'page_size',
        'bizScene'          => 'biz_scene',
        'type'              => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('current', $this->current, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('bizScene', $this->bizScene, true);
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
        if (null !== $this->resourceId) {
            $res['resource_id'] = $this->resourceId;
        }
        if (null !== $this->resourceName) {
            $res['resource_name'] = $this->resourceName;
        }
        if (null !== $this->instanceName) {
            $res['instance_name'] = $this->instanceName;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->current) {
            $res['current'] = $this->current;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->bizScene) {
            $res['biz_scene'] = $this->bizScene;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryXrXrverificationmodelRequest
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
        if (isset($map['resource_id'])) {
            $model->resourceId = $map['resource_id'];
        }
        if (isset($map['resource_name'])) {
            $model->resourceName = $map['resource_name'];
        }
        if (isset($map['instance_name'])) {
            $model->instanceName = $map['instance_name'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['current'])) {
            $model->current = $map['current'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['biz_scene'])) {
            $model->bizScene = $map['biz_scene'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
