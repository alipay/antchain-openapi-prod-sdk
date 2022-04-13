<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class LocalSubClusterDetail extends Model
{
    // 可用实例数
    /**
     * @example 1
     *
     * @var int
     */
    public $available;

    // 期望实例数
    /**
     * @example 1
     *
     * @var int
     */
    public $desired;

    // 容器镜像地址
    /**
     * @example nginx:1.0
     *
     * @var string
     */
    public $image;

    // 发布容器带的标签
    /**
     * @example [{"key": "test", "value": "test1"}]
     *
     * @var Label[]
     */
    public $labels;

    // 可能存在的错误信息
    /**
     * @example ""
     *
     * @var string
     */
    public $message;

    // 健康实例数
    /**
     * @example 0
     *
     * @var int
     */
    public $ready;

    // 实际sub cluster 状态
    /**
     * @example online
     *
     * @var string
     */
    public $state;

    // 已更新实例数
    /**
     * @example 0
     *
     * @var int
     */
    public $updated;

    // 容器版本
    /**
     * @example v1.1
     *
     * @var string
     */
    public $version;

    // 多个机房下的覆盖配置项
    /**
     * @example
     *
     * @var SpannerSubClusterOverrides[]
     */
    public $overrides;
    protected $_name = [
        'available' => 'available',
        'desired'   => 'desired',
        'image'     => 'image',
        'labels'    => 'labels',
        'message'   => 'message',
        'ready'     => 'ready',
        'state'     => 'state',
        'updated'   => 'updated',
        'version'   => 'version',
        'overrides' => 'overrides',
    ];

    public function validate()
    {
        Model::validateRequired('image', $this->image, true);
        Model::validateRequired('state', $this->state, true);
        Model::validateRequired('version', $this->version, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->available) {
            $res['available'] = $this->available;
        }
        if (null !== $this->desired) {
            $res['desired'] = $this->desired;
        }
        if (null !== $this->image) {
            $res['image'] = $this->image;
        }
        if (null !== $this->labels) {
            $res['labels'] = [];
            if (null !== $this->labels && \is_array($this->labels)) {
                $n = 0;
                foreach ($this->labels as $item) {
                    $res['labels'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->ready) {
            $res['ready'] = $this->ready;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->updated) {
            $res['updated'] = $this->updated;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->overrides) {
            $res['overrides'] = [];
            if (null !== $this->overrides && \is_array($this->overrides)) {
                $n = 0;
                foreach ($this->overrides as $item) {
                    $res['overrides'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LocalSubClusterDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['available'])) {
            $model->available = $map['available'];
        }
        if (isset($map['desired'])) {
            $model->desired = $map['desired'];
        }
        if (isset($map['image'])) {
            $model->image = $map['image'];
        }
        if (isset($map['labels'])) {
            if (!empty($map['labels'])) {
                $model->labels = [];
                $n             = 0;
                foreach ($map['labels'] as $item) {
                    $model->labels[$n++] = null !== $item ? Label::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['ready'])) {
            $model->ready = $map['ready'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['updated'])) {
            $model->updated = $map['updated'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }
        if (isset($map['overrides'])) {
            if (!empty($map['overrides'])) {
                $model->overrides = [];
                $n                = 0;
                foreach ($map['overrides'] as $item) {
                    $model->overrides[$n++] = null !== $item ? SpannerSubClusterOverrides::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
