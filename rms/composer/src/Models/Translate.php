<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class Translate extends Model
{
    // 列值翻译的默认值
    /**
     * @example N
     *
     * @var string
     */
    public $defaultValue;

    // 列值翻译映射关系
    /**
     * @example
     *
     * @var TranslateMapping[]
     */
    public $mappings;
    protected $_name = [
        'defaultValue' => 'default_value',
        'mappings'     => 'mappings',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->defaultValue) {
            $res['default_value'] = $this->defaultValue;
        }
        if (null !== $this->mappings) {
            $res['mappings'] = [];
            if (null !== $this->mappings && \is_array($this->mappings)) {
                $n = 0;
                foreach ($this->mappings as $item) {
                    $res['mappings'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Translate
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['default_value'])) {
            $model->defaultValue = $map['default_value'];
        }
        if (isset($map['mappings'])) {
            if (!empty($map['mappings'])) {
                $model->mappings = [];
                $n               = 0;
                foreach ($map['mappings'] as $item) {
                    $model->mappings[$n++] = null !== $item ? TranslateMapping::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
