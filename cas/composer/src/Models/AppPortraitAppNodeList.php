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
     * @var AppPortraitAppNodeEcsList
     */
    public $slb;

    // 返回rds节点数据
    /**
     * @example
     *
     * @var AppPortraitAppNodeEcsList
     */
    public $rds;

    // 返回pod节点数据
    /**
     * @example
     *
     * @var AppPortraitAppNodeEcsList
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
            $res['slb'] = null !== $this->slb ? $this->slb->toMap() : null;
        }
        if (null !== $this->rds) {
            $res['rds'] = null !== $this->rds ? $this->rds->toMap() : null;
        }
        if (null !== $this->pod) {
            $res['pod'] = null !== $this->pod ? $this->pod->toMap() : null;
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
            $model->slb = AppPortraitAppNodeEcsList::fromMap($map['slb']);
        }
        if (isset($map['rds'])) {
            $model->rds = AppPortraitAppNodeEcsList::fromMap($map['rds']);
        }
        if (isset($map['pod'])) {
            $model->pod = AppPortraitAppNodeEcsList::fromMap($map['pod']);
        }

        return $model;
    }
}
