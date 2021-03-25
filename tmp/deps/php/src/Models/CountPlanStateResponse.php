<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class CountPlanStateResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'stateCounts' => 'state_counts',
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
        if (null !== $this->stateCounts) {
            $res['state_counts'] = $this->stateCounts;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CountPlanStateResponse
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
        if(isset($map['state_counts'])){
            if(!empty($map['state_counts'])){
                $model->stateCounts = $map['state_counts'];
            }
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

    // state_counts
    /**
     * @var string[]
     */
    public $stateCounts;

}
