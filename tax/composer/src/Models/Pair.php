<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class Pair extends Model
{
    // left
    /**
     * @example left
     *
     * @var string
     */
    public $left;

    // right
    /**
     * @example right
     *
     * @var Key
     */
    public $right;
    protected $_name = [
        'left'  => 'left',
        'right' => 'right',
    ];

    public function validate()
    {
        Model::validateRequired('left', $this->left, true);
        Model::validateRequired('right', $this->right, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->left) {
            $res['left'] = $this->left;
        }
        if (null !== $this->right) {
            $res['right'] = null !== $this->right ? $this->right->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Pair
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['left'])) {
            $model->left = $map['left'];
        }
        if (isset($map['right'])) {
            $model->right = Key::fromMap($map['right']);
        }

        return $model;
    }
}
