<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AICLAIM\Models;

use AlibabaCloud\Tea\Model;

class Page extends Model
{
    // 边界框坐标[x1,y1,x2,y2]
    /**
     * @example [0,0,999,999]
     *
     * @var int[]
     */
    public $bbox;

    // 图片文件名
    /**
     * @example 检验报告.jpg
     *
     * @var string
     */
    public $image;

    // 页面索引
    /**
     * @example 0
     *
     * @var int
     */
    public $pageIndex;
    protected $_name = [
        'bbox'      => 'bbox',
        'image'     => 'image',
        'pageIndex' => 'page_index',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bbox) {
            $res['bbox'] = $this->bbox;
        }
        if (null !== $this->image) {
            $res['image'] = $this->image;
        }
        if (null !== $this->pageIndex) {
            $res['page_index'] = $this->pageIndex;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Page
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['bbox'])) {
            if (!empty($map['bbox'])) {
                $model->bbox = $map['bbox'];
            }
        }
        if (isset($map['image'])) {
            $model->image = $map['image'];
        }
        if (isset($map['page_index'])) {
            $model->pageIndex = $map['page_index'];
        }

        return $model;
    }
}
