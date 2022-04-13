<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class FedSecretOverrideList extends Model
{
    // fed configmap override list
    /**
     * @example
     *
     * @var FedSecretOverride[]
     */
    public $list;
    protected $_name = [
        'list' => 'list',
    ];

    public function validate()
    {
        Model::validateRequired('list', $this->list, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->list) {
            $res['list'] = [];
            if (null !== $this->list && \is_array($this->list)) {
                $n = 0;
                foreach ($this->list as $item) {
                    $res['list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FedSecretOverrideList
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['list'])) {
            if (!empty($map['list'])) {
                $model->list = [];
                $n           = 0;
                foreach ($map['list'] as $item) {
                    $model->list[$n++] = null !== $item ? FedSecretOverride::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
