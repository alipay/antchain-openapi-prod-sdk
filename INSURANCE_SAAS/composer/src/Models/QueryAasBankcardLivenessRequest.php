<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class QueryAasBankcardLivenessRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productCode' => 'product_code',
        'requestId' => 'request_id',
        'bankCardNo' => 'bank_card_no',
        'bankCardType' => 'bank_card_type',
        'encryptionType' => 'encryption_type',
        'encryptedUserId' => 'encrypted_user_id',
        'queryDate' => 'query_date',
        'extInfo' => 'ext_info',
    ];
    public function validate() {
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('bankCardNo', $this->bankCardNo, true);
        Model::validateRequired('encryptedUserId', $this->encryptedUserId, true);
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
        if (null !== $this->bankCardType) {
            $res['bank_card_type'] = $this->bankCardType;
        }
        if (null !== $this->encryptionType) {
            $res['encryption_type'] = $this->encryptionType;
        }
        if (null !== $this->encryptedUserId) {
            $res['encrypted_user_id'] = $this->encryptedUserId;
        }
        if (null !== $this->queryDate) {
            $res['query_date'] = $this->queryDate;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAasBankcardLivenessRequest
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
        if(isset($map['bank_card_type'])){
            $model->bankCardType = $map['bank_card_type'];
        }
        if(isset($map['encryption_type'])){
            $model->encryptionType = $map['encryption_type'];
        }
        if(isset($map['encrypted_user_id'])){
            $model->encryptedUserId = $map['encrypted_user_id'];
        }
        if(isset($map['query_date'])){
            $model->queryDate = $map['query_date'];
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

    // 请求ID，最大32位字母数字，客户生成保证唯一
    /**
     * @var string
     */
    public $requestId;

    // 银行卡号（AES加密）
    /**
     * @var string
     */
    public $bankCardNo;

    // 银行卡类型：1-借记卡+贷记卡（默认），2-借记卡，3-贷记卡
    /**
     * @var string
     */
    public $bankCardType;

    // 加密类型
    /**
     * @var string
     */
    public $encryptionType;

    // 加密用户ID（身份证号或手机号的AES加密）
    /**
     * @var string
     */
    public $encryptedUserId;

    // 查询日期，格式yyyyMMdd
    /**
     * @var string
     */
    public $queryDate;

    // 扩展信息（JSON字符串）
    /**
     * @var string
     */
    public $extInfo;

}
