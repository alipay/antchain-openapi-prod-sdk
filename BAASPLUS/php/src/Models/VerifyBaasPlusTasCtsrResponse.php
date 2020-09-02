<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

class VerifyBaasPlusTasCtsrResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'appName' => 'app_name',
        'companyName' => 'company_name',
        'desc' => 'desc',
        'hashValue' => 'hash_value',
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
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->companyName) {
            $res['company_name'] = $this->companyName;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }
        if (null !== $this->hashValue) {
            $res['hash_value'] = $this->hashValue;
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
     * @return VerifyBaasPlusTasCtsrResponse
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
        if(isset($map['app_name'])){
            $model->appName = $map['app_name'];
        }
        if(isset($map['company_name'])){
            $model->companyName = $map['company_name'];
        }
        if(isset($map['desc'])){
            $model->desc = $map['desc'];
        }
        if(isset($map['hash_value'])){
            $model->hashValue = $map['hash_value'];
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

    // 应用名
    /**
     * @var string
     */
    public $appName;

    // 公司名
    /**
     * @var string
     */
    public $companyName;

    // 事务步骤的描述
    /**
     * @var string
     */
    public $desc;

    // 请求时间凭证时传入的事物hash
    /**
     * @var string
     */
    public $hashValue;

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
