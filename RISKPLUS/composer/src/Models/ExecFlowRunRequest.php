<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class ExecFlowRunRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'flowCode' => 'flow_code',
        'clientOrderNo' => 'client_order_no',
        'inputJson' => 'input_json',
    ];
    public function validate() {
        Model::validateRequired('flowCode', $this->flowCode, true);
        Model::validateRequired('clientOrderNo', $this->clientOrderNo, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->flowCode) {
            $res['flow_code'] = $this->flowCode;
        }
        if (null !== $this->clientOrderNo) {
            $res['client_order_no'] = $this->clientOrderNo;
        }
        if (null !== $this->inputJson) {
            $res['input_json'] = $this->inputJson;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecFlowRunRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['flow_code'])){
            $model->flowCode = $map['flow_code'];
        }
        if(isset($map['client_order_no'])){
            $model->clientOrderNo = $map['client_order_no'];
        }
        if(isset($map['input_json'])){
            $model->inputJson = $map['input_json'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 需要执行的任务唯一 code
    /**
     * @var string
     */
    public $flowCode;

    // 调用方生成的业务订单号，用于请求幂等。同一云租户内必须唯一；请求重试时须使用相同订单号。可使用调用方已有业务单号或 UUID。大小写敏感，建议统一使用大写。
    /**
     * @var string
     */
    public $clientOrderNo;

    // Flow 执行入参，使用 JSON 字符串传递，顶层必须为 JSON Object。具体字段、类型和必填要求由已发布 Flow 的输入定义决定。无入参的 Flow 可不传或传 {}，未传时服务端按 {} 处理；如果 Flow 定义了必填字段但实际未提供，将返回参数校验错误。
    /**
     * @var string
     */
    public $inputJson;

}
