<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class ExecFlowRunResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'runNo' => 'run_no',
        'flowCode' => 'flow_code',
        'status' => 'status',
        'userNotice' => 'user_notice',
        'bizOrderNo' => 'biz_order_no',
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
        if (null !== $this->userNotice) {
            $res['user_notice'] = $this->userNotice;
        }
        if (null !== $this->bizOrderNo) {
            $res['biz_order_no'] = $this->bizOrderNo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecFlowRunResponse
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
        if(isset($map['user_notice'])){
            $model->userNotice = $map['user_notice'];
        }
        if(isset($map['biz_order_no'])){
            $model->bizOrderNo = $map['biz_order_no'];
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

    // 生成的 Flow 执行单号，用于后续内部执行和问题排查。
    /**
     * @var string
     */
    public $runNo;

    // 本次执行对应的已发布 Flow 编码。
    /**
     * @var string
     */
    public $flowCode;

    // 创建完成后的执行状态，固定返回 RUNNING。
    /**
     * @var string
     */
    public $status;

    // 用户须知，用于展示本平台的使用须知。
    /**
     * @var string
     */
    public $userNotice;

    // 平台生成的计费业务订单号，用于计费查询、对账和问题排查。同一次执行的启动与查询接口返回相同值；与调用方传入的 client_order_no、执行单号 run_no 不同。未生成计费单时可能为空。
    /**
     * @var string
     */
    public $bizOrderNo;

}
