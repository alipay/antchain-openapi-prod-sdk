<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class OpsApplicationChain extends Model
{
    // 此运维应用链中包含的应用组列表
    /**
     * @example
     *
     * @var OpsApplicationGroup[]
     */
    public $groups;
    protected $_name = [
        'groups' => 'groups',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->groups) {
            $res['groups'] = [];
            if (null !== $this->groups && \is_array($this->groups)) {
                $n = 0;
                foreach ($this->groups as $item) {
                    $res['groups'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OpsApplicationChain
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['groups'])) {
            if (!empty($map['groups'])) {
                $model->groups = [];
                $n             = 0;
                foreach ($map['groups'] as $item) {
                    $model->groups[$n++] = null !== $item ? OpsApplicationGroup::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
