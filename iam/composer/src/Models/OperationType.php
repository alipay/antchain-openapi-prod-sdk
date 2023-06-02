<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class OperationType extends Model
{
    // 操作描述
    /**
     * @example 用户登录事件
     *
     * @var string
     */
    public $description;

    // 展示名称
    /**
     * @example xxx
     *
     * @var string
     */
    public $displayName;

    // 是否启用
    /**
     * @example true, false
     *
     * @var string
     */
    public $enabled;

    // 操作名称
    /**
     * @example antcloud.iam.xxx
     *
     * @var string
     */
    public $name;

    // 产品码
    /**
     * @example IAM
     *
     * @var string
     */
    public $product;

    // 操作来源
    /**
     * @example OpenAPI
     *
     * @var string
     */
    public $source;

    // Onex接口额外信息
    /**
     * @example
     *
     * @var OnexExtraInfo
     */
    public $onexExtraInfo;

    // 资源类型
    /**
     * @example  iam.role
     *
     * @var string
     */
    public $resourceType;

    // 资源表达式
    /**
     * @example res.data
     *
     * @var string
     */
    public $resourceExp;
    protected $_name = [
        'description'   => 'description',
        'displayName'   => 'display_name',
        'enabled'       => 'enabled',
        'name'          => 'name',
        'product'       => 'product',
        'source'        => 'source',
        'onexExtraInfo' => 'onex_extra_info',
        'resourceType'  => 'resource_type',
        'resourceExp'   => 'resource_exp',
    ];

    public function validate()
    {
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('displayName', $this->displayName, true);
        Model::validateRequired('enabled', $this->enabled, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('product', $this->product, true);
        Model::validateRequired('source', $this->source, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->enabled) {
            $res['enabled'] = $this->enabled;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->product) {
            $res['product'] = $this->product;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->onexExtraInfo) {
            $res['onex_extra_info'] = null !== $this->onexExtraInfo ? $this->onexExtraInfo->toMap() : null;
        }
        if (null !== $this->resourceType) {
            $res['resource_type'] = $this->resourceType;
        }
        if (null !== $this->resourceExp) {
            $res['resource_exp'] = $this->resourceExp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperationType
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }
        if (isset($map['enabled'])) {
            $model->enabled = $map['enabled'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['product'])) {
            $model->product = $map['product'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['onex_extra_info'])) {
            $model->onexExtraInfo = OnexExtraInfo::fromMap($map['onex_extra_info']);
        }
        if (isset($map['resource_type'])) {
            $model->resourceType = $map['resource_type'];
        }
        if (isset($map['resource_exp'])) {
            $model->resourceExp = $map['resource_exp'];
        }

        return $model;
    }
}
