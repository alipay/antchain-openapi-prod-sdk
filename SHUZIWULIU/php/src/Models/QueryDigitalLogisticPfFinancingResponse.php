<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class QueryDigitalLogisticPfFinancingResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'status' => 'status',
        'desc' => 'desc',
        'financingId' => 'financing_id',
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
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }
        if (null !== $this->financingId) {
            $res['financing_id'] = $this->financingId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryDigitalLogisticPfFinancingResponse
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
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['desc'])){
            $model->desc = $map['desc'];
        }
        if(isset($map['financing_id'])){
            $model->financingId = $map['financing_id'];
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

    // 状态
    /**
     * @var string
     */
    public $status;

    // 描述
    /**
     * @var string
     */
    public $desc;

    // 支用Id
    /**
     * @var string
     */
    public $financingId;

}
