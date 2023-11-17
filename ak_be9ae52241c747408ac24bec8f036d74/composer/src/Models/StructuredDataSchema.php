<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models;

use AlibabaCloud\Tea\Model;

class StructuredDataSchema extends Model
{
    // 结构化数据字段列表
    /**
     * @example
     *
     * @var StructuredDataField[]
     */
    public $fieldList;
    protected $_name = [
        'fieldList' => 'field_list',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->fieldList) {
            $res['field_list'] = [];
            if (null !== $this->fieldList && \is_array($this->fieldList)) {
                $n = 0;
                foreach ($this->fieldList as $item) {
                    $res['field_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StructuredDataSchema
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['field_list'])) {
            if (!empty($map['field_list'])) {
                $model->fieldList = [];
                $n                = 0;
                foreach ($map['field_list'] as $item) {
                    $model->fieldList[$n++] = null !== $item ? StructuredDataField::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
