<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\RISKPLUS\Models\FlowRunOutput;

class QueryFlowRunResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'runNo' => 'run_no',
        'flowCode' => 'flow_code',
        'status' => 'status',
        'outputs' => 'outputs',
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
        if (null !== $this->runNo) {
            $res['run_no'] = $this->runNo;
        }
        if (null !== $this->flowCode) {
            $res['flow_code'] = $this->flowCode;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->outputs) {
            $res['outputs'] = [];
            if(null !== $this->outputs && is_array($this->outputs)){
                $n = 0;
                foreach($this->outputs as $item){
                    $res['outputs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryFlowRunResponse
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
        if(isset($map['run_no'])){
            $model->runNo = $map['run_no'];
        }
        if(isset($map['flow_code'])){
            $model->flowCode = $map['flow_code'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['outputs'])){
            if(!empty($map['outputs'])){
                $model->outputs = [];
                $n = 0;
                foreach($map['outputs'] as $item) {
                    $model->outputs[$n++] = null !== $item ? FlowRunOutput::fromMap($item) : $item;
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

    // 内部 flow 执行单号，Flow 执行单号，问题定位时使用。
    /**
     * @var string
     */
    public $runNo;

    // 本次执行对应的 Flow code。
    /**
     * @var string
     */
    public $flowCode;

    // Flow 状态，仅支持 RUNNING、SUCCESS、FAILED。
    /**
     * @var string
     */
    public $status;

    // Flow 执行产出列表，每个元素为 FlowRunOutput 结构。仅当 status=SUCCESS 时返回产出内容；可包含文本、数字、布尔值、JSON 和文件。FILE 类型的 value 为短期有效的 HTTPS 下载地址。存在多个产出或多个文件时返回多个列表元素；RUNNING 或 FAILED 状态下返回空列表。
    /**
     * @var FlowRunOutput[]
     */
    public $outputs;

}
