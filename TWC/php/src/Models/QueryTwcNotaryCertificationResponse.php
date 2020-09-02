<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

use AntChain\TWC\Models\CertificateInfo;

class QueryTwcNotaryCertificationResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'certificateInfo' => 'certificate_info',
        'code' => 'code',
        'message' => 'message',
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
        if (null !== $this->certificateInfo) {
            $res['certificate_info'] = [];
            if(null !== $this->certificateInfo && is_array($this->certificateInfo)){
                $n = 0;
                foreach($this->certificateInfo as $item){
                    $res['certificate_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryTwcNotaryCertificationResponse
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
        if(isset($map['certificate_info'])){
            if(!empty($map['certificate_info'])){
                $model->certificateInfo = [];
                $n = 0;
                foreach($map['certificate_info'] as $item) {
                    $model->certificateInfo[$n++] = null !== $item ? CertificateInfo::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['code'])){
            $model->code = $map['code'];
        }
        if(isset($map['message'])){
            $model->message = $map['message'];
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

    // 存证证明的证书信息列表
    /**
     * @var CertificateInfo[]
     */
    public $certificateInfo;

    // 返回值状态码，0000则为成功
    /**
     * @var string
     */
    public $code;

    // 异常状态时的错误信息
    /**
     * @var string
     */
    public $message;

}
