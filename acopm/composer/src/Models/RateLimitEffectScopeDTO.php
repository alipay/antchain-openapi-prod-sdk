<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM\Models;

use AlibabaCloud\Tea\Model;

class RateLimitEffectScopeDTO extends Model
{
    // RateLimitEffectScopeValueDTO list
    /**
     * @example RateLimitEffectScopeValueDTO
     *
     * @var RateLimitEffectScopeValueDTO[]
     */
    public $values;
    protected $_name = [
        'values' => 'values',
    ];

    public function validate()
    {
        Model::validateRequired('values', $this->values, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->values) {
            $res['values'] = [];
            if (null !== $this->values && \is_array($this->values)) {
                $n = 0;
                foreach ($this->values as $item) {
                    $res['values'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RateLimitEffectScopeDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['values'])) {
            if (!empty($map['values'])) {
                $model->values = [];
                $n             = 0;
                foreach ($map['values'] as $item) {
                    $model->values[$n++] = null !== $item ? RateLimitEffectScopeValueDTO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
