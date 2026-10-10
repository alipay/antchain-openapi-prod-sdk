<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\IOTAGENT\Models\AgentInfo;

class ListBlockchainBotIotagentAgentResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'agentInfoList' => 'agent_info_list',
        'pages' => 'pages',
        'total' => 'total',
        'pageIndex' => 'page_index',
        'pageSize' => 'page_size',
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
        if (null !== $this->agentInfoList) {
            $res['agent_info_list'] = [];
            if(null !== $this->agentInfoList && is_array($this->agentInfoList)){
                $n = 0;
                foreach($this->agentInfoList as $item){
                    $res['agent_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->pages) {
            $res['pages'] = $this->pages;
        }
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }
        if (null !== $this->pageIndex) {
            $res['page_index'] = $this->pageIndex;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ListBlockchainBotIotagentAgentResponse
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
        if(isset($map['agent_info_list'])){
            if(!empty($map['agent_info_list'])){
                $model->agentInfoList = [];
                $n = 0;
                foreach($map['agent_info_list'] as $item) {
                    $model->agentInfoList[$n++] = null !== $item ? AgentInfo::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['pages'])){
            $model->pages = $map['pages'];
        }
        if(isset($map['total'])){
            $model->total = $map['total'];
        }
        if(isset($map['page_index'])){
            $model->pageIndex = $map['page_index'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        return $model;
    }
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 智能体列表
    /**
     * @var AgentInfo[]
     */
    public $agentInfoList;

    // 总页数
    /**
     * @var int
     */
    public $pages;

    // 总数
    /**
     * @var int
     */
    public $total;

    // 当前页
    /**
     * @var int
     */
    public $pageIndex;

    // 页面大小
    /**
     * @var int
     */
    public $pageSize;

}
