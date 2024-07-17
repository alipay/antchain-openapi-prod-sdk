<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_a050edd0f07344eabd879166e7187ce5\Models;

use AlibabaCloud\Tea\Model;

class Page extends Model
{
    // 页码
    /**
     * @example
     *
     * @var int
     */
    public $currenyPage;

    // 每页数据个数
    /**
     * @example
     *
     * @var int
     */
    public $pageSize;

    // 总页数
    /**
     * @example
     *
     * @var int
     */
    public $total;
    protected $_name = [
        'currenyPage' => 'curreny_page',
        'pageSize'    => 'page_size',
        'total'       => 'total',
    ];

    public function validate()
    {
        Model::validateRequired('currenyPage', $this->currenyPage, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('total', $this->total, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->currenyPage) {
            $res['curreny_page'] = $this->currenyPage;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->total) {
            $res['total'] = $this->total;
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
        if (isset($map['curreny_page'])) {
            $model->currenyPage = $map['curreny_page'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }

        return $model;
    }
}
