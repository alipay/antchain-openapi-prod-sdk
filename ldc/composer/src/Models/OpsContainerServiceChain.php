<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class OpsContainerServiceChain extends Model
{
    // 运维容器分组列表
    /**
     * @example [{"container_services": [{"namespace":"default", "name": "test"}]}]
     *
     * @var OpsContainerServiceGroup[]
     */
    public $groups;
    protected $_name = [
        'groups' => 'groups',
    ];

    public function validate()
    {
        Model::validateRequired('groups', $this->groups, true);
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
     * @return OpsContainerServiceChain
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['groups'])) {
            if (!empty($map['groups'])) {
                $model->groups = [];
                $n             = 0;
                foreach ($map['groups'] as $item) {
                    $model->groups[$n++] = null !== $item ? OpsContainerServiceGroup::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
