<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

class GetBaasPlusTasTransactionattestationResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'ctsr' => 'ctsr',
        'sn' => 'sn',
        'ts' => 'ts',
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
        if (null !== $this->ctsr) {
            $res['ctsr'] = $this->ctsr;
        }
        if (null !== $this->sn) {
            $res['sn'] = $this->sn;
        }
        if (null !== $this->ts) {
            $res['ts'] = $this->ts;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetBaasPlusTasTransactionattestationResponse
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
        if(isset($map['ctsr'])){
            $model->ctsr = $map['ctsr'];
        }
        if(isset($map['sn'])){
            $model->sn = $map['sn'];
        }
        if(isset($map['ts'])){
            $model->ts = $map['ts'];
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

    // 精简后的时间戳完整编码（在校验时需要提交）
    /**
     * @var string
     */
    public $ctsr;

    // serialNumber，凭证编号 （在校验的时需要先填写凭证编号）
    /**
     * @var string
     */
    public $sn;

    // 时间信息，从1970年1月1日起至当前时间的毫秒数(13位数字)
    /**
     * @var string
     */
    public $ts;

}
