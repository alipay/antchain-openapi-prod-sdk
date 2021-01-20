<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\Computer;

class QueryApplicationComputerResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'computers' => 'computers',
        'pageNum' => 'page_num',
        'pageSize' => 'page_size',
        'totalCount' => 'total_count',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->computers) {
            $res['computers'] = [];
            if(null !== $this->computers && is_array($this->computers)){
                $n = 0;
                foreach($this->computers as $item){
                    $res['computers'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryApplicationComputerResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['computers'])){
            if(!empty($map['computers'])){
                $model->computers = [];
                $n = 0;
                foreach($map['computers'] as $item) {
                    $model->computers[$n++] = null !== $item ? Computer::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['page_num'])){
            $model->pageNum = $map['page_num'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['total_count'])){
            $model->totalCount = $map['total_count'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $reqMsgId;

    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 资源列表
    /**
     * @var Computer[]
     */
    public $computers;

    // 当前页码
    /**
     * @var int
     */
    public $pageNum;

    // 分页大小
    /**
     * @var int
     */
    public $pageSize;

    // 资源总数
    /**
     * @var int
     */
    public $totalCount;

}
