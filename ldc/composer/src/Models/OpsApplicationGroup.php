<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class OpsApplicationGroup extends Model
{
    // 此运维应用组中包含的应用列表
    /**
     * @example
     *
     * @var OpsApplication[]
     */
    public $applications;
    protected $_name = [
        'applications' => 'applications',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->applications) {
            $res['applications'] = [];
            if (null !== $this->applications && \is_array($this->applications)) {
                $n = 0;
                foreach ($this->applications as $item) {
                    $res['applications'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OpsApplicationGroup
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['applications'])) {
            if (!empty($map['applications'])) {
                $model->applications = [];
                $n                   = 0;
                foreach ($map['applications'] as $item) {
                    $model->applications[$n++] = null !== $item ? OpsApplication::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
