<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class XMatchExpression extends Model
{
    // match expression type
    /**
     * @example left_right
     *
     * @var string
     */
    public $type;

    // metadata field expr
    /**
     * @example app
     *
     * @var string
     */
    public $expr;

    // left character
    /**
     * @example
     *
     * @var string
     */
    public $left;

    // left index
    /**
     * @example
     *
     * @var int
     */
    public $leftIndex;

    /**
     * @example
     *
     * @var string
     */
    public $right;

    /**
     * @example
     *
     * @var string
     */
    public $valueType;
    protected $_name = [
        'type'      => 'type',
        'expr'      => 'expr',
        'left'      => 'left',
        'leftIndex' => 'left_index',
        'right'     => 'right',
        'valueType' => 'value_type',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->expr) {
            $res['expr'] = $this->expr;
        }
        if (null !== $this->left) {
            $res['left'] = $this->left;
        }
        if (null !== $this->leftIndex) {
            $res['left_index'] = $this->leftIndex;
        }
        if (null !== $this->right) {
            $res['right'] = $this->right;
        }
        if (null !== $this->valueType) {
            $res['value_type'] = $this->valueType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return XMatchExpression
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['expr'])) {
            $model->expr = $map['expr'];
        }
        if (isset($map['left'])) {
            $model->left = $map['left'];
        }
        if (isset($map['left_index'])) {
            $model->leftIndex = $map['left_index'];
        }
        if (isset($map['right'])) {
            $model->right = $map['right'];
        }
        if (isset($map['value_type'])) {
            $model->valueType = $map['value_type'];
        }

        return $model;
    }
}
