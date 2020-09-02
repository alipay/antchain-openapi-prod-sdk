<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

class InitBaasPlusCaCertificateResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'certSn' => 'cert_sn',
        'p10' => 'p10',
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
        if (null !== $this->certSn) {
            $res['cert_sn'] = $this->certSn;
        }
        if (null !== $this->p10) {
            $res['p10'] = $this->p10;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return InitBaasPlusCaCertificateResponse
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
        if(isset($map['cert_sn'])){
            $model->certSn = $map['cert_sn'];
        }
        if(isset($map['p10'])){
            $model->p10 = $map['p10'];
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

    // 证书序列号
    /**
     * @var string
     */
    public $certSn;

    // 证书内容
    /**
     * @var string
     */
    public $p10;

}
