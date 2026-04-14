<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

use AlibabaCloud\Tea\Model;

class TagBean extends Model
{
    // 标签编码
    /**
     * @example 01qe000
     *
     * @var string
     */
    public $tid;

    // 标签类目
    /**
     * @example xxxx
     *
     * @var string
     */
    public $category;

    // 标签名称
    /**
     * @example xxxx
     *
     * @var string
     */
    public $tname;

    // 标签值名称
    /**
     * @example xxxx
     *
     * @var string
     */
    public $tvname;
    protected $_name = [
        'tid'      => 'tid',
        'category' => 'category',
        'tname'    => 'tname',
        'tvname'   => 'tvname',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->tid) {
            $res['tid'] = $this->tid;
        }
        if (null !== $this->category) {
            $res['category'] = $this->category;
        }
        if (null !== $this->tname) {
            $res['tname'] = $this->tname;
        }
        if (null !== $this->tvname) {
            $res['tvname'] = $this->tvname;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TagBean
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['tid'])) {
            $model->tid = $map['tid'];
        }
        if (isset($map['category'])) {
            $model->category = $map['category'];
        }
        if (isset($map['tname'])) {
            $model->tname = $map['tname'];
        }
        if (isset($map['tvname'])) {
            $model->tvname = $map['tvname'];
        }

        return $model;
    }
}
