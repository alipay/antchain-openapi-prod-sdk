<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ContainerInfo extends Model
{
    // 容器id
    /**
     * @example 0123456789
     *
     * @var string
     */
    public $containerId;

    // 容器镜像
    /**
     * @example nginx:latest
     *
     * @var string
     */
    public $image;

    // 最后启动时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $lastStartTime;

    // 容器镜像
    /**
     * @example nginx
     *
     * @var string
     */
    public $name;

    // 重启次数
    /**
     * @example 1
     *
     * @var int
     */
    public $restartCount;

    // 容器运行状态
    /**
     * @example 运行中
     *
     * @var string
     */
    public $state;

    // 容器spec配置。
    /**
     * @example {}
     *
     * @var ContainerSpec
     */
    public $spec;
    protected $_name = [
        'containerId'   => 'container_id',
        'image'         => 'image',
        'lastStartTime' => 'last_start_time',
        'name'          => 'name',
        'restartCount'  => 'restart_count',
        'state'         => 'state',
        'spec'          => 'spec',
    ];

    public function validate()
    {
        Model::validateRequired('containerId', $this->containerId, true);
        Model::validateRequired('image', $this->image, true);
        Model::validateRequired('lastStartTime', $this->lastStartTime, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('restartCount', $this->restartCount, true);
        Model::validateRequired('state', $this->state, true);
        Model::validateRequired('spec', $this->spec, true);
        Model::validatePattern('lastStartTime', $this->lastStartTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->containerId) {
            $res['container_id'] = $this->containerId;
        }
        if (null !== $this->image) {
            $res['image'] = $this->image;
        }
        if (null !== $this->lastStartTime) {
            $res['last_start_time'] = $this->lastStartTime;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->restartCount) {
            $res['restart_count'] = $this->restartCount;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->spec) {
            $res['spec'] = null !== $this->spec ? $this->spec->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContainerInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['container_id'])) {
            $model->containerId = $map['container_id'];
        }
        if (isset($map['image'])) {
            $model->image = $map['image'];
        }
        if (isset($map['last_start_time'])) {
            $model->lastStartTime = $map['last_start_time'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['restart_count'])) {
            $model->restartCount = $map['restart_count'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['spec'])) {
            $model->spec = ContainerSpec::fromMap($map['spec']);
        }

        return $model;
    }
}
