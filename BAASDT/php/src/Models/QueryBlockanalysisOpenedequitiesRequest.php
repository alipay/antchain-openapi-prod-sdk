<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryBlockanalysisOpenedequitiesRequest extends Model {
    protected $_name = [
        'chainId' => 'chain_id',
        'count' => 'count',
        'page' => 'page',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->count) {
            $res['count'] = $this->count;
        }
        if (null !== $this->page) {
            $res['page'] = $this->page;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryBlockanalysisOpenedequitiesRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['chain_id'])){
            $model->chainId = $map['chain_id'];
        }
        if(isset($map['count'])){
            $model->count = $map['count'];
        }
        if(isset($map['page'])){
            $model->page = $map['page'];
        }
        return $model;
    }
    /**
     * @description 链ID
     * @example antdao
     * @var string
     */
    public $chainId;

    /**
     * @description 每页数据量
     * @example 10
     * @var integer
     */
    public $count;

    /**
     * @description 页数
     * @example 1
     * @var integer
     */
    public $page;

}
