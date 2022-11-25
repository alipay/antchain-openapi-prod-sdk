<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDIGITAL\Models;

use AlibabaCloud\Tea\Model;

class AliYunDigitalProjectListView extends Model
{
    // 分页编号
    /**
     * @example 1
     *
     * @var int
     */
    public $pageIndex;

    // 单页行数
    /**
     * @example 10
     *
     * @var int
     */
    public $pageSize;

    // 数据总行数
    /**
     * @example 21
     *
     * @var int
     */
    public $totalSize;

    // 查询结果列表
    /**
     * @example
     *
     * @var DigitalProjectList[]
     */
    public $projectList;
    protected $_name = [
        'pageIndex'   => 'page_index',
        'pageSize'    => 'page_size',
        'totalSize'   => 'total_size',
        'projectList' => 'project_list',
    ];

    public function validate()
    {
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
        if (null !== $this->projectList) {
            $res['project_list'] = [];
            if (null !== $this->projectList && \is_array($this->projectList)) {
                $n = 0;
                foreach ($this->projectList as $item) {
                    $res['project_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AliYunDigitalProjectListView
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
        if (isset($map['project_list'])) {
            if (!empty($map['project_list'])) {
                $model->projectList = [];
                $n                  = 0;
                foreach ($map['project_list'] as $item) {
                    $model->projectList[$n++] = null !== $item ? DigitalProjectList::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
