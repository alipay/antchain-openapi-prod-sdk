<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\BuildpackDetail;

class QueryBuildpackResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'buildpacks' => 'buildpacks',
        'currentPage' => 'current_page',
        'pageSize' => 'page_size',
        'totalCount' => 'total_count',
    ];
    public function validate() {
        Model::validateRequired('currentPage', $this->currentPage, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('totalCount', $this->totalCount, true);
    }
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
        if (null !== $this->buildpacks) {
            $res['buildpacks'] = [];
            if(null !== $this->buildpacks && is_array($this->buildpacks)){
                $n = 0;
                foreach($this->buildpacks as $item){
                    $res['buildpacks'][$n++] = null !== $item ? $item->toMap() : $item;
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
     * @return QueryBuildpackResponse
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
        if(isset($map['buildpacks'])){
            if(!empty($map['buildpacks'])){
                $model->buildpacks = [];
                $n = 0;
                foreach($map['buildpacks'] as $item) {
                    $model->buildpacks[$n++] = null !== $item ? BuildpackDetail::fromMap($item) : $item;
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

    // 符合条件的技术栈列表
    /**
     * @var BuildpackDetail[]
     */
    public $buildpacks;

    // 当前页码
    /**
     * @var int
     */
    public $currentPage;

    // 每页的大小
    /**
     * @var int
     */
    public $pageSize;

    // 总数量
    /**
     * @var int
     */
    public $totalCount;

}
