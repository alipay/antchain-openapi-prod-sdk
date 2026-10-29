<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\RISKPLUS\Models\ModelDetail;
use AntChain\RISKPLUS\Models\VariableDetail;

class QueryRiskDataScoreResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'success' => 'success',
        'bizId' => 'biz_id',
        'businessCode' => 'business_code',
        'modelDetail' => 'model_detail',
        'variableDetail' => 'variable_detail',
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
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->businessCode) {
            $res['business_code'] = $this->businessCode;
        }
        if (null !== $this->modelDetail) {
            $res['model_detail'] = [];
            if(null !== $this->modelDetail && is_array($this->modelDetail)){
                $n = 0;
                foreach($this->modelDetail as $item){
                    $res['model_detail'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->variableDetail) {
            $res['variable_detail'] = [];
            if(null !== $this->variableDetail && is_array($this->variableDetail)){
                $n = 0;
                foreach($this->variableDetail as $item){
                    $res['variable_detail'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryRiskDataScoreResponse
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
        if(isset($map['success'])){
            $model->success = $map['success'];
        }
        if(isset($map['biz_id'])){
            $model->bizId = $map['biz_id'];
        }
        if(isset($map['business_code'])){
            $model->businessCode = $map['business_code'];
        }
        if(isset($map['model_detail'])){
            if(!empty($map['model_detail'])){
                $model->modelDetail = [];
                $n = 0;
                foreach($map['model_detail'] as $item) {
                    $model->modelDetail[$n++] = null !== $item ? ModelDetail::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['variable_detail'])){
            if(!empty($map['variable_detail'])){
                $model->variableDetail = [];
                $n = 0;
                foreach($map['variable_detail'] as $item) {
                    $model->variableDetail[$n++] = null !== $item ? VariableDetail::fromMap($item) : $item;
                }
            }
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

    // 请求成功标识
    /**
     * @var bool
     */
    public $success;

    // 业务入参回显
    /**
     * @var string
     */
    public $bizId;

    // 授权码
    /**
     * @var string
     */
    public $businessCode;

    // 详细评分列表
    /**
     * @var ModelDetail[]
     */
    public $modelDetail;

    // 变量类型
    /**
     * @var VariableDetail[]
     */
    public $variableDetail;

}
