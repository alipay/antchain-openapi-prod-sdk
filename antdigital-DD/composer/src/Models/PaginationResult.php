<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DD\Models\ChargeBillVO;

class PaginationResult extends Model {
    protected $_name = [
        'data' => 'data',
        'currentPage' => 'current_page',
        'pageSize' => 'page_size',
        'totalCount' => 'total_count',
        'success' => 'success',
    ];
    public function validate() {
        Model::validateRequired('data', $this->data, true);
        Model::validateRequired('currentPage', $this->currentPage, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('totalCount', $this->totalCount, true);
        Model::validateRequired('success', $this->success, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->data) {
            $res['data'] = [];
            if(null !== $this->data && is_array($this->data)){
                $n = 0;
                foreach($this->data as $item){
                    $res['data'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PaginationResult
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['data'])){
            if(!empty($map['data'])){
                $model->data = [];
                $n = 0;
                foreach($map['data'] as $item) {
                    $model->data[$n++] = null !== $item ? ChargeBillVO::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['current_page'])){
            $model->currentPage = $map['current_page'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['total_count'])){
            $model->totalCount = $map['total_count'];
        }
        if(isset($map['success'])){
            $model->success = $map['success'];
        }
        return $model;
    }
    // 查询结果
    /**
     * @example 
     * @var ChargeBillVO[]
     */
    public $data;

    // 当前页
    /**
     * @example 1
     * @var int
     */
    public $currentPage;

    // 分页大小
    /**
     * @example 20
     * @var int
     */
    public $pageSize;

    // 查询结果总数
    /**
     * @example 12
     * @var int
     */
    public $totalCount;

    // 状态
    /**
     * @example true, false
     * @var bool
     */
    public $success;

}
