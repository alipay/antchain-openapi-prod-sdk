<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUQING\Models;

use AlibabaCloud\Tea\Model;

class HotspotTask extends Model
{
    // 任务ID
    /**
     * @example 1
     *
     * @var string
     */
    public $taskId;

    // 数量
    /**
     * @example
     *
     * @var int
     */
    public $count;

    // 当前页
    /**
     * @example
     *
     * @var int
     */
    public $pageNow;

    // 每页数量
    /**
     * @example
     *
     * @var int
     */
    public $pageSize;

    // 数据
    /**
     * @example
     *
     * @var HotspotMessage[]
     */
    public $pages;
    protected $_name = [
        'taskId'   => 'task_id',
        'count'    => 'count',
        'pageNow'  => 'page_now',
        'pageSize' => 'page_size',
        'pages'    => 'pages',
    ];

    public function validate()
    {
        Model::validateRequired('taskId', $this->taskId, true);
        Model::validateRequired('count', $this->count, true);
        Model::validateRequired('pageNow', $this->pageNow, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('pages', $this->pages, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->count) {
            $res['count'] = $this->count;
        }
        if (null !== $this->pageNow) {
            $res['page_now'] = $this->pageNow;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->pages) {
            $res['pages'] = [];
            if (null !== $this->pages && \is_array($this->pages)) {
                $n = 0;
                foreach ($this->pages as $item) {
                    $res['pages'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return HotspotTask
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['task_id'])) {
            $model->taskId = $map['task_id'];
        }
        if (isset($map['count'])) {
            $model->count = $map['count'];
        }
        if (isset($map['page_now'])) {
            $model->pageNow = $map['page_now'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['pages'])) {
            if (!empty($map['pages'])) {
                $model->pages = [];
                $n            = 0;
                foreach ($map['pages'] as $item) {
                    $model->pages[$n++] = null !== $item ? HotspotMessage::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
