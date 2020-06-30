<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\BAASDT\Models\EquityDetail;

class ExchangeableEquityList extends Model {
    protected $_name = [
        'endRow' => 'end_row',
        'equityList' => 'equity_list',
        'firstPage' => 'first_page',
        'hasNextPage' => 'has_next_page',
        'hasPreviousPage' => 'has_previous_page',
        'isFirstPage' => 'is_first_page',
        'isLastPage' => 'is_last_page',
        'lastPage' => 'last_page',
        'nextPage' => 'next_page',
        'orderBy' => 'order_by',
        'pages' => 'pages',
        'pageNumber' => 'page_number',
        'pageSize' => 'page_size',
        'prePage' => 'pre_page',
        'size' => 'size',
        'startRow' => 'start_row',
        'total' => 'total',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->endRow) {
            $res['end_row'] = $this->endRow;
        }
        if (null !== $this->equityList) {
            $res['equity_list'] = [];
            if(null !== $this->equityList && is_array($this->equityList)){
                $n = 0;
                foreach($this->equityList as $item){
                    $res['equity_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->firstPage) {
            $res['first_page'] = $this->firstPage;
        }
        if (null !== $this->hasNextPage) {
            $res['has_next_page'] = $this->hasNextPage;
        }
        if (null !== $this->hasPreviousPage) {
            $res['has_previous_page'] = $this->hasPreviousPage;
        }
        if (null !== $this->isFirstPage) {
            $res['is_first_page'] = $this->isFirstPage;
        }
        if (null !== $this->isLastPage) {
            $res['is_last_page'] = $this->isLastPage;
        }
        if (null !== $this->lastPage) {
            $res['last_page'] = $this->lastPage;
        }
        if (null !== $this->nextPage) {
            $res['next_page'] = $this->nextPage;
        }
        if (null !== $this->orderBy) {
            $res['order_by'] = $this->orderBy;
        }
        if (null !== $this->pages) {
            $res['pages'] = $this->pages;
        }
        if (null !== $this->pageNumber) {
            $res['page_number'] = $this->pageNumber;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->prePage) {
            $res['pre_page'] = $this->prePage;
        }
        if (null !== $this->size) {
            $res['size'] = $this->size;
        }
        if (null !== $this->startRow) {
            $res['start_row'] = $this->startRow;
        }
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExchangeableEquityList
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['end_row'])){
            $model->endRow = $map['end_row'];
        }
        if(isset($map['equity_list'])){
            if(!empty($map['equity_list'])){
                $model->equityList = [];
                $n = 0;
                foreach($map['equity_list'] as $item) {
                    $model->equityList[$n++] = null !== $item ? EquityDetail::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['first_page'])){
            $model->firstPage = $map['first_page'];
        }
        if(isset($map['has_next_page'])){
            $model->hasNextPage = $map['has_next_page'];
        }
        if(isset($map['has_previous_page'])){
            $model->hasPreviousPage = $map['has_previous_page'];
        }
        if(isset($map['is_first_page'])){
            $model->isFirstPage = $map['is_first_page'];
        }
        if(isset($map['is_last_page'])){
            $model->isLastPage = $map['is_last_page'];
        }
        if(isset($map['last_page'])){
            $model->lastPage = $map['last_page'];
        }
        if(isset($map['next_page'])){
            $model->nextPage = $map['next_page'];
        }
        if(isset($map['order_by'])){
            $model->orderBy = $map['order_by'];
        }
        if(isset($map['pages'])){
            $model->pages = $map['pages'];
        }
        if(isset($map['page_number'])){
            $model->pageNumber = $map['page_number'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['pre_page'])){
            $model->prePage = $map['pre_page'];
        }
        if(isset($map['size'])){
            $model->size = $map['size'];
        }
        if(isset($map['start_row'])){
            $model->startRow = $map['start_row'];
        }
        if(isset($map['total'])){
            $model->total = $map['total'];
        }
        return $model;
    }
    /**
     * @example 10
     * @description 页面上数据在总数据中的结束位置（第几个数据）
     * @var integer
     */
    public $endRow;

    /**
     * @example 
     * @description 权益信息列表
     * @var array
     */
    public $equityList;

    /**
     * @example 1
     * @description 第一页页码
     * @var integer
     */
    public $firstPage;

    /**
     * @example true, false
     * @description 是否有下一页
     * @var bool
     */
    public $hasNextPage;

    /**
     * @example true, false
     * @description 是否有前一页
     * @var bool
     */
    public $hasPreviousPage;

    /**
     * @example true, false
     * @description 是否第一页
     * @var bool
     */
    public $isFirstPage;

    /**
     * @example true, false
     * @description 是否最后一页
     * @var bool
     */
    public $isLastPage;

    /**
     * @example 2
     * @description 最后一页页码
     * @var integer
     */
    public $lastPage;

    /**
     * @example 2
     * @description 下一页页码
     * @var integer
     */
    public $nextPage;

    /**
     * @example desc
     * @description 排序规则
     * @var string
     */
    public $orderBy;

    /**
     * @example 2
     * @description 可兑换的权益总页数
     * @var integer
     */
    public $pages;

    /**
     * @example 1
     * @description 当前页码
     * @var integer
     */
    public $pageNumber;

    /**
     * @example 10
     * @description 页面大小
     * @var integer
     */
    public $pageSize;

    /**
     * @example 0
     * @description 前一页页码
     * @var integer
     */
    public $prePage;

    /**
     * @example 10
     * @description 页面中实际数量
     * @var integer
     */
    public $size;

    /**
     * @example 1
     * @description 页面上数据在总数据中的开始位置（第几个数据）
     * @var integer
     */
    public $startRow;

    /**
     * @example 15
     * @description 可兑换的权益总数
     * @var integer
     */
    public $total;

}
