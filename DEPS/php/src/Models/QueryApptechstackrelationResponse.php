<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\AppTechstackRelation;

class QueryApptechstackrelationResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'appTechstackRelations' => 'app_techstack_relations',
        'currentPage' => 'current_page',
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
        if (null !== $this->appTechstackRelations) {
            $res['app_techstack_relations'] = [];
            if(null !== $this->appTechstackRelations && is_array($this->appTechstackRelations)){
                $n = 0;
                foreach($this->appTechstackRelations as $item){
                    $res['app_techstack_relations'][$n++] = null !== $item ? $item->toMap() : $item;
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
        return $res;
    }
    /**
     * @param array $map
     * @return QueryApptechstackrelationResponse
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
        if(isset($map['app_techstack_relations'])){
            if(!empty($map['app_techstack_relations'])){
                $model->appTechstackRelations = [];
                $n = 0;
                foreach($map['app_techstack_relations'] as $item) {
                    $model->appTechstackRelations[$n++] = null !== $item ? AppTechstackRelation::fromMap($item) : $item;
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

    // app_techstack_relations
    /**
     * @var AppTechstackRelation[]
     */
    public $appTechstackRelations;

    // current_page
    /**
     * @var int
     */
    public $currentPage;

    // page_size
    /**
     * @var int
     */
    public $pageSize;

    // total_count
    /**
     * @var int
     */
    public $totalCount;

}
