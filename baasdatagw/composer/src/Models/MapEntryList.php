<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class MapEntryList extends Model
{
    // MapEntry列表
    /**
     * @example
     *
     * @var MapEntry[]
     */
    public $element;
    protected $_name = [
        'element' => 'element',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->element) {
            $res['element'] = [];
            if (null !== $this->element && \is_array($this->element)) {
                $n = 0;
                foreach ($this->element as $item) {
                    $res['element'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MapEntryList
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['element'])) {
            if (!empty($map['element'])) {
                $model->element = [];
                $n              = 0;
                foreach ($map['element'] as $item) {
                    $model->element[$n++] = null !== $item ? MapEntry::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
