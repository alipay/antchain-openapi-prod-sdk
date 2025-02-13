<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class Paginator extends Model
{
    // 当前页
    /**
     * @example
     *
     * @var int
     */
    public $page;

    // 单页项数
    /**
     * @example
     *
     * @var int
     */
    public $itemsPerPage;

    // 总项数
    /**
     * @example
     *
     * @var int
     */
    public $items;
    protected $_name = [
        'page'         => 'page',
        'itemsPerPage' => 'items_per_page',
        'items'        => 'items',
    ];

    public function validate()
    {
        Model::validateRequired('page', $this->page, true);
        Model::validateRequired('itemsPerPage', $this->itemsPerPage, true);
        Model::validateRequired('items', $this->items, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->page) {
            $res['page'] = $this->page;
        }
        if (null !== $this->itemsPerPage) {
            $res['items_per_page'] = $this->itemsPerPage;
        }
        if (null !== $this->items) {
            $res['items'] = $this->items;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Paginator
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['page'])) {
            $model->page = $map['page'];
        }
        if (isset($map['items_per_page'])) {
            $model->itemsPerPage = $map['items_per_page'];
        }
        if (isset($map['items'])) {
            $model->items = $map['items'];
        }

        return $model;
    }
}
