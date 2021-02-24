<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RpcommonResp extends Model {
    protected $_name = [
        'data' => 'data',
        'responseCode' => 'response_code',
        'resultMsg' => 'result_msg',
        'success' => 'success',
    ];
    public function validate() {
        Model::validateRequired('data', $this->data, true);
        Model::validateRequired('responseCode', $this->responseCode, true);
        Model::validateRequired('resultMsg', $this->resultMsg, true);
        Model::validateRequired('success', $this->success, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->responseCode) {
            $res['response_code'] = $this->responseCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return RpcommonResp
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['data'])){
            $model->data = $map['data'];
        }
        if(isset($map['response_code'])){
            $model->responseCode = $map['response_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['success'])){
            $model->success = $map['success'];
        }
        return $model;
    }
    // 具体返回值.jsonString形式
    /**
     * @example {"a":1}
     * @var string
     */
    public $data;

    // 结果码
    /**
     * @example 0
     * @var string
     */
    public $responseCode;

    // 结果描述
    /**
     * @example success
     * @var string
     */
    public $resultMsg;

    // 调用是否成功
    /**
     * @example true, false
     * @var bool
     */
    public $success;

}
