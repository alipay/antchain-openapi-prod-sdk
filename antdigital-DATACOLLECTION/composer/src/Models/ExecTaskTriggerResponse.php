<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DATACOLLECTION\Models;

use AlibabaCloud\Tea\Model;

class ExecTaskTriggerResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'code' => 'code',
        'msg' => 'msg',
        'instId' => 'inst_id',
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
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->msg) {
            $res['msg'] = $this->msg;
        }
        if (null !== $this->instId) {
            $res['inst_id'] = $this->instId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecTaskTriggerResponse
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
        if(isset($map['code'])){
            $model->code = $map['code'];
        }
        if(isset($map['msg'])){
            $model->msg = $map['msg'];
        }
        if(isset($map['inst_id'])){
            $model->instId = $map['inst_id'];
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

    // code码
    /**
     * @var string
     */
    public $code;

    // 描述
    /**
     * @var string
     */
    public $msg;

    // inst触发 id
    /**
     * @var string
     */
    public $instId;

}
