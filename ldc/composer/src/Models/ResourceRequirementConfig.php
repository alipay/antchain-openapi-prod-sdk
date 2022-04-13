<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ResourceRequirementConfig extends Model
{
    // limits
    /**
     * @example
     *
     * @var MapResourceNameToValue[]
     */
    public $limits;

    // requests
    /**
     * @example
     *
     * @var MapResourceNameToValue[]
     */
    public $requests;
    protected $_name = [
        'limits'   => 'limits',
        'requests' => 'requests',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->limits) {
            $res['limits'] = [];
            if (null !== $this->limits && \is_array($this->limits)) {
                $n = 0;
                foreach ($this->limits as $item) {
                    $res['limits'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->requests) {
            $res['requests'] = [];
            if (null !== $this->requests && \is_array($this->requests)) {
                $n = 0;
                foreach ($this->requests as $item) {
                    $res['requests'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ResourceRequirementConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['limits'])) {
            if (!empty($map['limits'])) {
                $model->limits = [];
                $n             = 0;
                foreach ($map['limits'] as $item) {
                    $model->limits[$n++] = null !== $item ? MapResourceNameToValue::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['requests'])) {
            if (!empty($map['requests'])) {
                $model->requests = [];
                $n               = 0;
                foreach ($map['requests'] as $item) {
                    $model->requests[$n++] = null !== $item ? MapResourceNameToValue::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
