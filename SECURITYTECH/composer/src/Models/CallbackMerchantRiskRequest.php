<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class CallbackMerchantRiskRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'sourceType' => 'source_type',
        'applyNo' => 'apply_no',
        'merchantId' => 'merchant_id',
        'riskStatus' => 'risk_status',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'extraInfo' => 'extra_info',
        'scene' => 'scene',
    ];
    public function validate() {
        Model::validateRequired('sourceType', $this->sourceType, true);
        Model::validateRequired('applyNo', $this->applyNo, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('riskStatus', $this->riskStatus, true);
        Model::validateRequired('scene', $this->scene, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->sourceType) {
            $res['source_type'] = $this->sourceType;
        }
        if (null !== $this->applyNo) {
            $res['apply_no'] = $this->applyNo;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->riskStatus) {
            $res['risk_status'] = $this->riskStatus;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CallbackMerchantRiskRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['source_type'])){
            $model->sourceType = $map['source_type'];
        }
        if(isset($map['apply_no'])){
            $model->applyNo = $map['apply_no'];
        }
        if(isset($map['merchant_id'])){
            $model->merchantId = $map['merchant_id'];
        }
        if(isset($map['risk_status'])){
            $model->riskStatus = $map['risk_status'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['extra_info'])){
            $model->extraInfo = $map['extra_info'];
        }
        if(isset($map['scene'])){
            $model->scene = $map['scene'];
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

    // 来源类型
    /**
     * @var string
     */
    public $sourceType;

    // 申请单号
    /**
     * @var string
     */
    public $applyNo;

    // 商户号
    /**
     * @var string
     */
    public $merchantId;

    // 风控结果
    /**
     * @var string
     */
    public $riskStatus;

    // 风控结果码
    /**
     * @var string
     */
    public $resultCode;

    // 风控结果说明
    /**
     * @var string
     */
    public $resultMsg;

    // 拓展字段
    /**
     * @var string
     */
    public $extraInfo;

    // 入驻场景
    /**
     * @var string
     */
    public $scene;

}
