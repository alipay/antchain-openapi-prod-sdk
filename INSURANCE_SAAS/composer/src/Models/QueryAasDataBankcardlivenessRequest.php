<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class QueryAasDataBankcardlivenessRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productCode' => 'product_code',
        'requestId' => 'request_id',
        'idNumber' => 'id_number',
        'idType' => 'id_type',
        'mobileNo' => 'mobile_no',
        'certName' => 'cert_name',
        'bankCode' => 'bank_code',
        'bankCardType' => 'bank_card_type',
        'externParam' => 'extern_param',
    ];
    public function validate() {
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('bankCode', $this->bankCode, true);
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
        if (null !== $this->idNumber) {
            $res['id_number'] = $this->idNumber;
        }
        if (null !== $this->idType) {
            $res['id_type'] = $this->idType;
        }
        if (null !== $this->mobileNo) {
            $res['mobile_no'] = $this->mobileNo;
        }
        if (null !== $this->certName) {
            $res['cert_name'] = $this->certName;
        }
        if (null !== $this->bankCode) {
            $res['bank_code'] = $this->bankCode;
        }
        if (null !== $this->bankCardType) {
            $res['bank_card_type'] = $this->bankCardType;
        }
        if (null !== $this->externParam) {
            $res['extern_param'] = $this->externParam;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAasDataBankcardlivenessRequest
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
        if(isset($map['id_number'])){
            $model->idNumber = $map['id_number'];
        }
        if(isset($map['id_type'])){
            $model->idType = $map['id_type'];
        }
        if(isset($map['mobile_no'])){
            $model->mobileNo = $map['mobile_no'];
        }
        if(isset($map['cert_name'])){
            $model->certName = $map['cert_name'];
        }
        if(isset($map['bank_code'])){
            $model->bankCode = $map['bank_code'];
        }
        if(isset($map['bank_card_type'])){
            $model->bankCardType = $map['bank_card_type'];
        }
        if(isset($map['extern_param'])){
            $model->externParam = $map['extern_param'];
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

    // 身份证号（AES加密），与mobile_no二选一
    /**
     * @var string
     */
    public $idNumber;

    // 身份类型：ID_CARD（默认）/PASSPORT
    /**
     * @var string
     */
    public $idType;

    // 手机号（AES加密），与id_number二选一
    /**
     * @var string
     */
    public $mobileNo;

    // 姓名（AES加密）
    /**
     * @var string
     */
    public $certName;

    // 银行编码列表（JSONArray字符串）
    /**
     * @var string
     */
    public $bankCode;

    // 查询卡种：1-借记卡+贷记卡（默认），2-借记卡，3-贷记卡
    /**
     * @var string
     */
    public $bankCardType;

    // 扩展字段-版本号
    /**
     * @var string
     */
    public $externParam;

}
