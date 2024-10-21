<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE\Models;

use AlibabaCloud\Tea\Model;

class InstitutionPageData extends Model
{
    // 总记录
    /**
     * @example 1
     *
     * @var int
     */
    public $total;

    // 总页数
    /**
     * @example 10
     *
     * @var int
     */
    public $pageCount;

    // 当前页码
    /**
     * @example 1
     *
     * @var int
     */
    public $pageNum;

    // 每页数量
    /**
     * @example 10
     *
     * @var int
     */
    public $pageSize;

    // 机构列表
    /**
     * @example
     *
     * @var InstitutionVO[]
     */
    public $records;
    protected $_name = [
        'total'     => 'total',
        'pageCount' => 'page_count',
        'pageNum'   => 'page_num',
        'pageSize'  => 'page_size',
        'records'   => 'records',
    ];

    public function validate()
    {
        Model::validateRequired('total', $this->total, true);
        Model::validateRequired('pageCount', $this->pageCount, true);
        Model::validateRequired('pageNum', $this->pageNum, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('records', $this->records, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }
        if (null !== $this->pageCount) {
            $res['page_count'] = $this->pageCount;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->records) {
            $res['records'] = [];
            if (null !== $this->records && \is_array($this->records)) {
                $n = 0;
                foreach ($this->records as $item) {
                    $res['records'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InstitutionPageData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }
        if (isset($map['page_count'])) {
            $model->pageCount = $map['page_count'];
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['records'])) {
            if (!empty($map['records'])) {
                $model->records = [];
                $n              = 0;
                foreach ($map['records'] as $item) {
                    $model->records[$n++] = null !== $item ? InstitutionVO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
