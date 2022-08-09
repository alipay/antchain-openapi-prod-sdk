<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Eb193ab60ccc42ddb781f570a741c3fa\Models;

use AlibabaCloud\Tea\Model;

class TestStruct extends Model
{
    // x
    /**
     * @example x
     *
     * @var string
     */
    public $x;

    // y
    /**
     * @example y
     *
     * @var DemoClass
     */
    public $y;

    // z
    /**
     * @example
     *
     * @var DemoClass[]
     */
    public $z;
    protected $_name = [
        'x' => 'x',
        'y' => 'y',
        'z' => 'z',
    ];

    public function validate()
    {
        Model::validateRequired('x', $this->x, true);
        Model::validateRequired('y', $this->y, true);
        Model::validateRequired('z', $this->z, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->x) {
            $res['x'] = $this->x;
        }
        if (null !== $this->y) {
            $res['y'] = null !== $this->y ? $this->y->toMap() : null;
        }
        if (null !== $this->z) {
            $res['z'] = [];
            if (null !== $this->z && \is_array($this->z)) {
                $n = 0;
                foreach ($this->z as $item) {
                    $res['z'][$n++] = null !== $item ? $item->toMap() : $item;
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
        if (isset($map['x'])) {
            $model->x = $map['x'];
        }
        if (isset($map['y'])) {
            $model->y = DemoClass::fromMap($map['y']);
        }
        if (isset($map['z'])) {
            if (!empty($map['z'])) {
                $model->z = [];
                $n        = 0;
                foreach ($map['z'] as $item) {
                    $model->z[$n++] = null !== $item ? DemoClass::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
