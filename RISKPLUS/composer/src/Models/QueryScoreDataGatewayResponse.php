<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\RISKPLUS\Models\ModelDetails;
use AntChain\RISKPLUS\Models\VariableDetails;

class QueryScoreDataGatewayResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'securityId' => 'security_id',
        'securityResult' => 'security_result',
        'modelDetails' => 'model_details',
        'variableDetails' => 'variable_details',
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
        if (null !== $this->securityId) {
            $res['security_id'] = $this->securityId;
        }
        if (null !== $this->securityResult) {
            $res['security_result'] = $this->securityResult;
        }
        if (null !== $this->modelDetails) {
            $res['model_details'] = null !== $this->modelDetails ? $this->modelDetails->toMap() : null;
        }
        if (null !== $this->variableDetails) {
            $res['variable_details'] = null !== $this->variableDetails ? $this->variableDetails->toMap() : null;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryScoreDataGatewayResponse
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
        if(isset($map['security_id'])){
            $model->securityId = $map['security_id'];
        }
        if(isset($map['security_result'])){
            $model->securityResult = $map['security_result'];
        }
        if(isset($map['model_details'])){
            $model->modelDetails = ModelDetails::fromMap($map['model_details']);
        }
        if(isset($map['variable_details'])){
            $model->variableDetails = VariableDetails::fromMap($map['variable_details']);
        }
        if(isset($map['success'])){
            $model->success = $map['success'];
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

    // 反馈成功之后的id
    /**
     * @var string
     */
    public $securityId;

    // 安全处理结果，枚举值为：reject[拒绝],validate[校验],accept[放过]
    /**
     * @var string
     */
    public $securityResult;

    // 1
    /**
     * @var ModelDetails
     */
    public $modelDetails;

    // 变量
    /**
     * @var VariableDetails
     */
    public $variableDetails;

    // 成功标识
    /**
     * @var bool
     */
    public $success;

}
