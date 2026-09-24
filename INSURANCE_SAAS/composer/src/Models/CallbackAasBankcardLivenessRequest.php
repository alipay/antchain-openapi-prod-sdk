<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class CallbackAasBankcardLivenessRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productCode' => 'product_code',
        'requestId' => 'request_id',
        'bankCardNo' => 'bank_card_no',
        'encryptedUserId' => 'encrypted_user_id',
        'livenessResult' => 'liveness_result',
        'livenessScore' => 'liveness_score',
        'queryDate' => 'query_date',
        'callbackTime' => 'callback_time',
        'extInfo' => 'ext_info',
    ];
    public function validate() {
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('bankCardNo', $this->bankCardNo, true);
        Model::validateRequired('encryptedUserId', $this->encryptedUserId, true);
        Model::validateRequired('livenessResult', $this->livenessResult, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->bankCardNo) {
            $res['bank_card_no'] = $this->bankCardNo;
        }
        if (null !== $this->encryptedUserId) {
            $res['encrypted_user_id'] = $this->encryptedUserId;
        }
        if (null !== $this->livenessResult) {
            $res['liveness_result'] = $this->livenessResult;
        }
        if (null !== $this->livenessScore) {
            $res['liveness_score'] = $this->livenessScore;
        }
        if (null !== $this->queryDate) {
            $res['query_date'] = $this->queryDate;
        }
        if (null !== $this->callbackTime) {
            $res['callback_time'] = $this->callbackTime;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CallbackAasBankcardLivenessRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_code'])){
            $model->productCode = $map['product_code'];
        }
        if(isset($map['request_id'])){
            $model->requestId = $map['request_id'];
        }
        if(isset($map['bank_card_no'])){
            $model->bankCardNo = $map['bank_card_no'];
        }
        if(isset($map['encrypted_user_id'])){
            $model->encryptedUserId = $map['encrypted_user_id'];
        }
        if(isset($map['liveness_result'])){
            $model->livenessResult = $map['liveness_result'];
        }
        if(isset($map['liveness_score'])){
            $model->livenessScore = $map['liveness_score'];
        }
        if(isset($map['query_date'])){
            $model->queryDate = $map['query_date'];
        }
        if(isset($map['callback_time'])){
            $model->callbackTime = $map['callback_time'];
        }
        if(isset($map['ext_info'])){
            $model->extInfo = $map['ext_info'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 产品码：BANKCARD_LIVENESS
    /**
     * @var string
     */
    public $productCode;

    // 请求ID，最大32位字母数字
    /**
     * @var string
     */
    public $requestId;

    // 银行卡号（AES加密）
    /**
     * @var string
     */
    public $bankCardNo;

    // 加密用户ID（身份证号或手机号的AES加密）
    /**
     * @var string
     */
    public $encryptedUserId;

    // 活跃度结果
    /**
     * @var string
     */
    public $livenessResult;

    // 活跃度评分（0-100）
    /**
     * @var string
     */
    public $livenessScore;

    // 原查询日期，格式yyyyMMdd
    /**
     * @var string
     */
    public $queryDate;

    // 回调时间，格式yyyyMMddHHmmss
    /**
     * @var string
     */
    public $callbackTime;

    // 扩展信息（JSON字符串）
    /**
     * @var string
     */
    public $extInfo;

}
