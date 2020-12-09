<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class PushDigitalLogisticPfPledgeResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'desc' => 'desc',
        'pledgeId' => 'pledge_id',
        'status' => 'status',
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
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }
        if (null !== $this->pledgeId) {
            $res['pledge_id'] = $this->pledgeId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PushDigitalLogisticPfPledgeResponse
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
        if(isset($map['desc'])){
            $model->desc = $map['desc'];
        }
        if(isset($map['pledge_id'])){
            $model->pledgeId = $map['pledge_id'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
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

    // 描述
    /**
     * @var string
     */
    public $desc;

    // 质押标识，用于账单质押推送状态查询
    /**
     * @var string
     */
    public $pledgeId;

    // 质押推送状态；applied：已申请；failure：失败；由于质押推送过程为异步，若通过了前期的业务校验，将返回已申请状态；后续可使用质押Id查询质押推送终态
    /**
     * @var string
     */
    public $status;

}
