<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class AppPortraitAppNodeList extends Model
{
    // 返回ecs节点数据
    /**
     * @example
     *
     * @var AppPortraitAppNodeEcsList[]
     */
    public $ecs;

    // 返回slb节点数据
    /**
     * @example
     *
     * @var AppPortraitAppNodeEcsList[]
     */
    public $slb;

    // 返回rds节点数据
    /**
     * @example
     *
     * @var AppPortraitAppNodeEcsList[]
     */
    public $rds;

    // 返回pod节点数据
    /**
     * @example
     *
     * @var AppPortraitAppNodeEcsList[]
     */
    public $pod;
    protected $_name = [
        'ecs' => 'ecs',
        'slb' => 'slb',
        'rds' => 'rds',
        'pod' => 'pod',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->ecs) {
            $res['ecs'] = [];
            if (null !== $this->ecs && \is_array($this->ecs)) {
                $n = 0;
                foreach ($this->ecs as $item) {
                    $res['ecs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->slb) {
            $res['slb'] = [];
            if (null !== $this->slb && \is_array($this->slb)) {
                $n = 0;
                foreach ($this->slb as $item) {
                    $res['slb'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->rds) {
            $res['rds'] = [];
            if (null !== $this->rds && \is_array($this->rds)) {
                $n = 0;
                foreach ($this->rds as $item) {
                    $res['rds'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->pod) {
            $res['pod'] = [];
            if (null !== $this->pod && \is_array($this->pod)) {
                $n = 0;
                foreach ($this->pod as $item) {
                    $res['pod'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppPortraitAppNodeList
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ecs'])) {
            if (!empty($map['ecs'])) {
                $model->ecs = [];
                $n          = 0;
                foreach ($map['ecs'] as $item) {
                    $model->ecs[$n++] = null !== $item ? AppPortraitAppNodeEcsList::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['slb'])) {
            if (!empty($map['slb'])) {
                $model->slb = [];
                $n          = 0;
                foreach ($map['slb'] as $item) {
                    $model->slb[$n++] = null !== $item ? AppPortraitAppNodeEcsList::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['rds'])) {
            if (!empty($map['rds'])) {
                $model->rds = [];
                $n          = 0;
                foreach ($map['rds'] as $item) {
                    $model->rds[$n++] = null !== $item ? AppPortraitAppNodeEcsList::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['pod'])) {
            if (!empty($map['pod'])) {
                $model->pod = [];
                $n          = 0;
                foreach ($map['pod'] as $item) {
                    $model->pod[$n++] = null !== $item ? AppPortraitAppNodeEcsList::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
