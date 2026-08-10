<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class QueryServerWillauthResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'materialInfo' => 'material_info',
        'passed' => 'passed',
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
        if (null !== $this->materialInfo) {
            $res['material_info'] = $this->materialInfo;
        }
        if (null !== $this->passed) {
            $res['passed'] = $this->passed;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryServerWillauthResponse
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
        if(isset($map['material_info'])){
            $model->materialInfo = $map['material_info'];
        }
        if(isset($map['passed'])){
            $model->passed = $map['passed'];
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

    // 认证主体附件信息
    /**
     * @var string
     */
    public $materialInfo;

    // 认证是否通过（活体+比对+意愿全部通过才返回true）
    /**
     * @var bool
     */
    public $passed;

}
