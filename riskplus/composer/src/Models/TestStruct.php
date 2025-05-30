<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class TestStruct extends Model
{
    // 测试
    /**
     * @example
     *
     * @var SecurityScene[]
     */
    public $testField;
    protected $_name = [
        'testField' => 'test_field',
    ];

    public function validate()
    {
        Model::validateRequired('testField', $this->testField, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->testField) {
            $res['test_field'] = [];
            if (null !== $this->testField && \is_array($this->testField)) {
                $n = 0;
                foreach ($this->testField as $item) {
                    $res['test_field'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TestStruct
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['test_field'])) {
            if (!empty($map['test_field'])) {
                $model->testField = [];
                $n                = 0;
                foreach ($map['test_field'] as $item) {
                    $model->testField[$n++] = null !== $item ? SecurityScene::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
