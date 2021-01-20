<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\BuildpackCompositeVO;

class QueryBuildpackFindidversionpairsbyversionResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'buildpackCompositeVOs' => 'buildpack_composite_v_os',
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
        if (null !== $this->buildpackCompositeVOs) {
            $res['buildpack_composite_v_os'] = [];
            if(null !== $this->buildpackCompositeVOs && is_array($this->buildpackCompositeVOs)){
                $n = 0;
                foreach($this->buildpackCompositeVOs as $item){
                    $res['buildpack_composite_v_os'][$n++] = null !== $item ? $item->toMap() : $item;
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
     * @return QueryBuildpackFindidversionpairsbyversionResponse
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
        if(isset($map['buildpack_composite_v_os'])){
            if(!empty($map['buildpack_composite_v_os'])){
                $model->buildpackCompositeVOs = [];
                $n = 0;
                foreach($map['buildpack_composite_v_os'] as $item) {
                    $model->buildpackCompositeVOs[$n++] = null !== $item ? BuildpackCompositeVO::fromMap($item) : $item;
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

    // buildpack_composite_v_os
    /**
     * @var BuildpackCompositeVO[]
     */
    public $buildpackCompositeVOs;

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
