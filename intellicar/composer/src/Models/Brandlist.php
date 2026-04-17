<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

use AlibabaCloud\Tea\Model;

class Brandlist extends Model
{
    // 首字母
    /**
     * @example xxxx
     *
     * @var string
     */
    public $letter;

    // 品牌信息列表
    /**
     * @example 123
     *
     * @var LetterInfo[]
     */
    public $list;
    protected $_name = [
        'letter' => 'letter',
        'list'   => 'list',
    ];

    public function validate()
    {
        Model::validateRequired('letter', $this->letter, true);
        Model::validateRequired('list', $this->list, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->letter) {
            $res['letter'] = $this->letter;
        }
        if (null !== $this->list) {
            $res['list'] = [];
            if (null !== $this->list && \is_array($this->list)) {
                $n = 0;
                foreach ($this->list as $item) {
                    $res['list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Brandlist
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['letter'])) {
            $model->letter = $map['letter'];
        }
        if (isset($map['list'])) {
            if (!empty($map['list'])) {
                $model->list = [];
                $n           = 0;
                foreach ($map['list'] as $item) {
                    $model->list[$n++] = null !== $item ? LetterInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
