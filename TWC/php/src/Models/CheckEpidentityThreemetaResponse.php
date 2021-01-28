<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CheckEpidentityThreemetaResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'enterpriseStatus' => 'enterprise_status',
        'openTime' => 'open_time',
        'passed' => 'passed',
        'code' => 'code',
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
        if (null !== $this->enterpriseStatus) {
            $res['enterprise_status'] = $this->enterpriseStatus;
        }
        if (null !== $this->openTime) {
            $res['open_time'] = $this->openTime;
        }
        if (null !== $this->passed) {
            $res['passed'] = $this->passed;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CheckEpidentityThreemetaResponse
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
        if(isset($map['enterprise_status'])){
            $model->enterpriseStatus = $map['enterprise_status'];
        }
        if(isset($map['open_time'])){
            $model->openTime = $map['open_time'];
        }
        if(isset($map['passed'])){
            $model->passed = $map['passed'];
        }
        if(isset($map['code'])){
            $model->code = $map['code'];
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

    // 企业状态。
    /**
     * @var string
     */
    public $enterpriseStatus;

    // 营业期限。
    /**
     * @var string
     */
    public $openTime;

    // 核验是否通过。
    /**
     * @var bool
     */
    public $passed;

    // 0:核验成功 1:企业信息有误 2:企业非正常营业
    /**
     * @var string
     */
    public $code;

}
