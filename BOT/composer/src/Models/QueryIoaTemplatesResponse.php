<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\BOT\Models\AgentInfoVO;

class QueryIoaTemplatesResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'templateAgentList' => 'template_agent_list',
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
        if (null !== $this->templateAgentList) {
            $res['template_agent_list'] = [];
            if(null !== $this->templateAgentList && is_array($this->templateAgentList)){
                $n = 0;
                foreach($this->templateAgentList as $item){
                    $res['template_agent_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryIoaTemplatesResponse
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
        if(isset($map['template_agent_list'])){
            if(!empty($map['template_agent_list'])){
                $model->templateAgentList = [];
                $n = 0;
                foreach($map['template_agent_list'] as $item) {
                    $model->templateAgentList[$n++] = null !== $item ? AgentInfoVO::fromMap($item) : $item;
                }
            }
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

    // 智能体模板 VO集合
    /**
     * @var AgentInfoVO[]
     */
    public $templateAgentList;

}
