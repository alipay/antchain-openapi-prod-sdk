<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\INDUSTRY\Models;

use AlibabaCloud\Tea\Model;

use AntChain\INDUSTRY\Models\AddressInfo;
use AntChain\INDUSTRY\Models\ContactInfo;
use AntChain\INDUSTRY\Models\SettleRule;
use AntChain\INDUSTRY\Models\CardInfo;

class CreateMerchantSellerRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'source' => 'source',
        'merchantUserId' => 'merchant_user_id',
        'merchantLoginName' => 'merchant_login_name',
        'merchantAliasName' => 'merchant_alias_name',
        'mcc' => 'mcc',
        'legalName' => 'legal_name',
        'legalCertNo' => 'legal_cert_no',
        'businessAddress' => 'business_address',
        'contactInfos' => 'contact_infos',
        'service' => 'service',
        'defaultSettleRule' => 'default_settle_rule',
        'bizCards' => 'biz_cards',
        'requestId' => 'request_id',
    ];
    public function validate() {
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('merchantAliasName', $this->merchantAliasName, true);
        Model::validateRequired('businessAddress', $this->businessAddress, true);
        Model::validateRequired('contactInfos', $this->contactInfos, true);
        Model::validateRequired('service', $this->service, true);
        Model::validateRequired('defaultSettleRule', $this->defaultSettleRule, true);
        Model::validateRequired('requestId', $this->requestId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->merchantUserId) {
            $res['merchant_user_id'] = $this->merchantUserId;
        }
        if (null !== $this->merchantLoginName) {
            $res['merchant_login_name'] = $this->merchantLoginName;
        }
        if (null !== $this->merchantAliasName) {
            $res['merchant_alias_name'] = $this->merchantAliasName;
        }
        if (null !== $this->mcc) {
            $res['mcc'] = $this->mcc;
        }
        if (null !== $this->legalName) {
            $res['legal_name'] = $this->legalName;
        }
        if (null !== $this->legalCertNo) {
            $res['legal_cert_no'] = $this->legalCertNo;
        }
        if (null !== $this->businessAddress) {
            $res['business_address'] = null !== $this->businessAddress ? $this->businessAddress->toMap() : null;
        }
        if (null !== $this->contactInfos) {
            $res['contact_infos'] = [];
            if(null !== $this->contactInfos && is_array($this->contactInfos)){
                $n = 0;
                foreach($this->contactInfos as $item){
                    $res['contact_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->service) {
            $res['service'] = $this->service;
        }
        if (null !== $this->defaultSettleRule) {
            $res['default_settle_rule'] = null !== $this->defaultSettleRule ? $this->defaultSettleRule->toMap() : null;
        }
        if (null !== $this->bizCards) {
            $res['biz_cards'] = null !== $this->bizCards ? $this->bizCards->toMap() : null;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateMerchantSellerRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['source'])){
            $model->source = $map['source'];
        }
        if(isset($map['merchant_user_id'])){
            $model->merchantUserId = $map['merchant_user_id'];
        }
        if(isset($map['merchant_login_name'])){
            $model->merchantLoginName = $map['merchant_login_name'];
        }
        if(isset($map['merchant_alias_name'])){
            $model->merchantAliasName = $map['merchant_alias_name'];
        }
        if(isset($map['mcc'])){
            $model->mcc = $map['mcc'];
        }
        if(isset($map['legal_name'])){
            $model->legalName = $map['legal_name'];
        }
        if(isset($map['legal_cert_no'])){
            $model->legalCertNo = $map['legal_cert_no'];
        }
        if(isset($map['business_address'])){
            $model->businessAddress = AddressInfo::fromMap($map['business_address']);
        }
        if(isset($map['contact_infos'])){
            if(!empty($map['contact_infos'])){
                $model->contactInfos = [];
                $n = 0;
                foreach($map['contact_infos'] as $item) {
                    $model->contactInfos[$n++] = null !== $item ? ContactInfo::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['service'])){
            if(!empty($map['service'])){
                $model->service = $map['service'];
            }
        }
        if(isset($map['default_settle_rule'])){
            $model->defaultSettleRule = SettleRule::fromMap($map['default_settle_rule']);
        }
        if(isset($map['biz_cards'])){
            $model->bizCards = CardInfo::fromMap($map['biz_cards']);
        }
        if(isset($map['request_id'])){
            $model->requestId = $map['request_id'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // source, 由中台为业务方分配, 作为业务来源标识
    /**
     * @var string
     */
    public $source;

    // 平台方下的用户id, 唯一， 跟merchant_login_name不能同时为空
    /**
     * @var string
     */
    public $merchantUserId;

    // 商户登录账号, 跟merchant_user_id不能同时为空
    /**
     * @var string
     */
    public $merchantLoginName;

    // 商户别名, 会展示在账单以及支付结果页中
    /**
     * @var string
     */
    public $merchantAliasName;

    // 商户类别码mcc，参见https://gw.alipayobjects.com/os/bmw-prod/05c9a32e-42d1-436b-ace7-13101d91f672.xlsx
    /**
     * @var string
     */
    public $mcc;

    // 法人姓名，merchant_type = 01时必填
    /**
     * @var string
     */
    public $legalName;

    // 商户法人身份证号码, merchant_type = 01时必填
    /**
     * @var string
     */
    public $legalCertNo;

    // 商户经营地址
    /**
     * @var AddressInfo
     */
    public $businessAddress;

    // 商户联系人信息
    /**
     * @var ContactInfo[]
     */
    public $contactInfos;

    // 商户使用服务 当面付、app支付、wap支付、电脑支付
    /**
     * @var string[]
     */
    public $service;

    // 默认结算规则
    /**
     * @var SettleRule
     */
    public $defaultSettleRule;

    // 银行卡结算信息, 结算到银行卡时必填, 当前仅支持填入一张卡
    /**
     * @var CardInfo
     */
    public $bizCards;

    // 请求单据号，32位。
    /**
     * @var string
     */
    public $requestId;

}
