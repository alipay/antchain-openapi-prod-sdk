<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ContainerStatus extends Model
{
    // container id
    /**
     * @example docker://020066114b989a2c789c8eeee8bfb1f9b64bfdd2d7d48b3a738fa6f91246cb67
     *
     * @var string
     */
    public $containerId;

    // image
    /**
     * @example nginx:latest
     *
     * @var string
     */
    public $image;

    // 上一次启动时间
    /**
     * @example 2019-12-05
     *
     * @var string
     */
    public $lastStartTime;

    // container name
    /**
     * @example nginx
     *
     * @var string
     */
    public $name;

    // 是否ready
    /**
     * @example true, false
     *
     * @var bool
     */
    public $ready;

    // 重启次数
    /**
     * @example 1
     *
     * @var int
     */
    public $restartCount;

    // container state
    /**
     * @example {}
     *
     * @var ContainerState
     */
    public $state;
    protected $_name = [
        'containerId'   => 'container_id',
        'image'         => 'image',
        'lastStartTime' => 'last_start_time',
        'name'          => 'name',
        'ready'         => 'ready',
        'restartCount'  => 'restart_count',
        'state'         => 'state',
    ];

    public function validate()
    {
        Model::validateRequired('containerId', $this->containerId, true);
        Model::validateRequired('image', $this->image, true);
        Model::validateRequired('lastStartTime', $this->lastStartTime, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('ready', $this->ready, true);
        Model::validateRequired('restartCount', $this->restartCount, true);
        Model::validateRequired('state', $this->state, true);
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
        if (null !== $this->ready) {
            $res['ready'] = $this->ready;
        }
        if (null !== $this->restartCount) {
            $res['restart_count'] = $this->restartCount;
        }
        if (null !== $this->state) {
            $res['state'] = null !== $this->state ? $this->state->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContainerStatus
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
        if (isset($map['ready'])) {
            $model->ready = $map['ready'];
        }
        if (isset($map['restart_count'])) {
            $model->restartCount = $map['restart_count'];
        }
        if (isset($map['state'])) {
            $model->state = ContainerState::fromMap($map['state']);
        }

        return $model;
    }
}
