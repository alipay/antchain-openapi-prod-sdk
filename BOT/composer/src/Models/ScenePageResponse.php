<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ScenePageResponse extends Model
{
    // 页数
    //
    /**
     * @example 1
     *
     * @var int
     */
    public $pageIndex;

    // 页码
    //
    /**
     * @example 10
     *
     * @var int
     */
    public $pageSize;

    // 总记录数
    //
    /**
     * @example 100
     *
     * @var int
     */
    public $totalSize;

    // 总页数
    //
    /**
     * @example 10
     *
     * @var int
     */
    public $totalPages;

    // 数据
    /**
     * @example {...}
     *
     * @var SceneModel[]
     */
    public $pageData;
    protected $_name = [
        'pageIndex'  => 'page_index',
        'pageSize'   => 'page_size',
        'totalSize'  => 'total_size',
        'totalPages' => 'total_pages',
        'pageData'   => 'page_data',
    ];

    public function validate()
    {
        Model::validateRequired('pageIndex', $this->pageIndex, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('totalSize', $this->totalSize, true);
        Model::validateRequired('totalPages', $this->totalPages, true);
        Model::validateRequired('pageData', $this->pageData, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->pageIndex) {
            $res['page_index'] = $this->pageIndex;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->totalSize) {
            $res['total_size'] = $this->totalSize;
        }
        if (null !== $this->totalPages) {
            $res['total_pages'] = $this->totalPages;
        }
        if (null !== $this->pageData) {
            $res['page_data'] = [];
            if (null !== $this->pageData && \is_array($this->pageData)) {
                $n = 0;
                foreach ($this->pageData as $item) {
                    $res['page_data'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ScenePageResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['page_index'])) {
            $model->pageIndex = $map['page_index'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['total_size'])) {
            $model->totalSize = $map['total_size'];
        }
        if (isset($map['total_pages'])) {
            $model->totalPages = $map['total_pages'];
        }
        if (isset($map['page_data'])) {
            if (!empty($map['page_data'])) {
                $model->pageData = [];
                $n               = 0;
                foreach ($map['page_data'] as $item) {
                    $model->pageData[$n++] = null !== $item ? SceneModel::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
