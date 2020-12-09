<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

use AntChain\SHUZIWULIU\Models\StatementInfo;

class QueryDigitalLogisticCreditStatementResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'pageNum' => 'page_num',
        'pageSize' => 'page_size',
        'statementInfos' => 'statement_infos',
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
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->statementInfos) {
            $res['statement_infos'] = [];
            if(null !== $this->statementInfos && is_array($this->statementInfos)){
                $n = 0;
                foreach($this->statementInfos as $item){
                    $res['statement_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryDigitalLogisticCreditStatementResponse
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
        if(isset($map['page_num'])){
            $model->pageNum = $map['page_num'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['statement_infos'])){
            if(!empty($map['statement_infos'])){
                $model->statementInfos = [];
                $n = 0;
                foreach($map['statement_infos'] as $item) {
                    $model->statementInfos[$n++] = null !== $item ? StatementInfo::fromMap($item) : $item;
                }
            }
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

    // 页数 从1开始
    /**
     * @var int
     */
    public $pageNum;

    // 每页显示数量
    /**
     * @var int
     */
    public $pageSize;

    // 流水列表
    /**
     * @var StatementInfo[]
     */
    public $statementInfos;

    // 数据总量
    /**
     * @var int
     */
    public $totalCount;

}
