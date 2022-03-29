<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class UniqueDim extends Model
{
    // 列名称
    /**
     * @example MQ
     *
     * @var string
     */
    public $name;

    // 左起第几个
    /**
     * @example 0
     *
     * @var int
     */
    public $leftIndex;

    // 左起字符串
    /**
     * @example ,
     *
     * @var string
     */
    public $left;

    // 右至字符串
    /**
     * @example ,
     *
     * @var string
     */
    public $right;

    // 列值翻译
    /**
     * @example
     *
     * @var Translate
     */
    public $translate;
    protected $_name = [
        'name'      => 'name',
        'leftIndex' => 'left_index',
        'left'      => 'left',
        'right'     => 'right',
        'translate' => 'translate',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('leftIndex', $this->leftIndex, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->leftIndex) {
            $res['left_index'] = $this->leftIndex;
        }
        if (null !== $this->left) {
            $res['left'] = $this->left;
        }
        if (null !== $this->right) {
            $res['right'] = $this->right;
        }
        if (null !== $this->translate) {
            $res['translate'] = null !== $this->translate ? $this->translate->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UniqueDim
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['left_index'])) {
            $model->leftIndex = $map['left_index'];
        }
        if (isset($map['left'])) {
            $model->left = $map['left'];
        }
        if (isset($map['right'])) {
            $model->right = $map['right'];
        }
        if (isset($map['translate'])) {
            $model->translate = Translate::fromMap($map['translate']);
        }

        return $model;
    }
}
