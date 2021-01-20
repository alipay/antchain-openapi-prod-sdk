<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class PageQuery extends Model {
    protected $_name = [
        'pageSize' => 'page_size',
        'pageIndex' => 'page_index',
        'curIndex' => 'cur_index',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->pageIndex) {
            $res['page_index'] = $this->pageIndex;
        }
        if (null !== $this->curIndex) {
            $res['cur_index'] = $this->curIndex;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PageQuery
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['page_index'])){
            $model->pageIndex = $map['page_index'];
        }
        if(isset($map['cur_index'])){
            $model->curIndex = $map['cur_index'];
        }
        return $model;
    }
    // page_size
    /**
     * @example page_size
     * @var int
     */
    public $pageSize;

    // page_index
    /**
     * @example page_index
     * @var int
     */
    public $pageIndex;

    // cur_index
    /**
     * @example cur_index
     * @var int
     */
    public $curIndex;

}
