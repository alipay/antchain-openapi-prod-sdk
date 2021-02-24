<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\RISKPLUS\Models\RtopRiskGeneNode;

class ListRtopCompanyRelatedResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'companies' => 'companies',
        'responseCode' => 'response_code',
        'success' => 'success',
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
        if (null !== $this->companies) {
            $res['companies'] = [];
            if(null !== $this->companies && is_array($this->companies)){
                $n = 0;
                foreach($this->companies as $item){
                    $res['companies'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->responseCode) {
            $res['response_code'] = $this->responseCode;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ListRtopCompanyRelatedResponse
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
        if(isset($map['companies'])){
            if(!empty($map['companies'])){
                $model->companies = [];
                $n = 0;
                foreach($map['companies'] as $item) {
                    $model->companies[$n++] = null !== $item ? RtopRiskGeneNode::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['response_code'])){
            $model->responseCode = $map['response_code'];
        }
        if(isset($map['success'])){
            $model->success = $map['success'];
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

    // node
    /**
     * @var RtopRiskGeneNode[]
     */
    public $companies;

    // 返回码
    // 
    /**
     * @var string
     */
    public $responseCode;

    // 是否调用成功
    // 
    /**
     * @var bool
     */
    public $success;

}
