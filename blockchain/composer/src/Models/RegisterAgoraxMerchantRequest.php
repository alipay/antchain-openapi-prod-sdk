<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class RegisterAgoraxMerchantRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 商户别名。支付宝收银台及账单中的商户名称会展示此处设置的别名。如果涉及支付宝APP内的支付，支付结果页也会展示该别名；如果涉及线下当面付场景，请填写线下店铺名称
    /**
     * @var string
     */
    public $aliasName;

    // 进件的二级商户名称，需与收款支付宝账户名称一致
    /**
     * @var string
     */
    public $name;

    // 应用授权码
    /**
     * @var string
     */
    public $appAuthToken;

    // 商家类型。01：企业，07：个体工商户，06：个人商户
    /**
     * @var string
     */
    public $merchantType;

    // 联系人信息
    /**
     * @var ContactInfo
     */
    public $contactInfos;

    // 默认结算规则
    /**
     * @var DefaultSettleRule
     */
    public $defaultSettleRule;

    // 使用服务，当面付: 当面付，jsapi支付: jsapi支付
    /**
     * @var string[]
     */
    public $service;

    // 商户类别码
    /**
     * @var string
     */
    public $mcc;

    // 商户证件编号
    /**
     * @var string
     */
    public $certNo;

    // 商户证件类型
    /**
     * @var string
     */
    public $certType;

    // 个体工商户营业执照上的名称
    /**
     * @var string
     */
    public $certName;

    // 营业执照图片，file_id
    /**
     * @var string
     */
    public $certImage;

    // 法人名称
    /**
     * @var string
     */
    public $legalName;

    // 法人身份证号
    /**
     * @var string
     */
    public $legalCertNo;

    // 商户支付宝账号，用作结算账号
    /**
     * @var string
     */
    public $alipayLogonId;

    // 二级商户支付宝账户，用于签约、协议确认
    /**
     * @var string
     */
    public $bindingAlipayLogonId;

    // 结算银行卡信息
    /**
     * @var SettleCardInfo
     */
    public $bizCards;

    // 经营地址
    /**
     * @var AddressInfo
     */
    public $businessAddress;

    // 门头照
    /**
     * @var string
     */
    public $outDoorImages;

    // 内景照
    /**
     * @var string
     */
    public $inDoorImages;

    // 授权函（图片）
    /**
     * @var string
     */
    public $licenseAuthLetterImage;

    // 商户站点信息
    /**
     * @var SiteInfo
     */
    public $sites;

    // 商户行业资质
    /**
     * @var IndustryQualificationInfo[]
     */
    public $qualifications;

    // 法人身份证正面图
    /**
     * @var string
     */
    public $legalCertFrontImage;

    // 法人身份证反面图
    /**
     * @var string
     */
    public $legalCertBackImage;

    // 信息关联的openId
    /**
     * @var string
     */
    public $infoSourceOpenId;
    protected $_name = [
        'authToken'              => 'auth_token',
        'productInstanceId'      => 'product_instance_id',
        'aliasName'              => 'alias_name',
        'name'                   => 'name',
        'appAuthToken'           => 'app_auth_token',
        'merchantType'           => 'merchant_type',
        'contactInfos'           => 'contact_infos',
        'defaultSettleRule'      => 'default_settle_rule',
        'service'                => 'service',
        'mcc'                    => 'mcc',
        'certNo'                 => 'cert_no',
        'certType'               => 'cert_type',
        'certName'               => 'cert_name',
        'certImage'              => 'cert_image',
        'legalName'              => 'legal_name',
        'legalCertNo'            => 'legal_cert_no',
        'alipayLogonId'          => 'alipay_logon_id',
        'bindingAlipayLogonId'   => 'binding_alipay_logon_id',
        'bizCards'               => 'biz_cards',
        'businessAddress'        => 'business_address',
        'outDoorImages'          => 'out_door_images',
        'inDoorImages'           => 'in_door_images',
        'licenseAuthLetterImage' => 'license_auth_letter_image',
        'sites'                  => 'sites',
        'qualifications'         => 'qualifications',
        'legalCertFrontImage'    => 'legal_cert_front_image',
        'legalCertBackImage'     => 'legal_cert_back_image',
        'infoSourceOpenId'       => 'info_source_open_id',
    ];

    public function validate()
    {
        Model::validateRequired('aliasName', $this->aliasName, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('appAuthToken', $this->appAuthToken, true);
        Model::validateRequired('merchantType', $this->merchantType, true);
        Model::validateRequired('contactInfos', $this->contactInfos, true);
        Model::validateRequired('defaultSettleRule', $this->defaultSettleRule, true);
        Model::validateRequired('service', $this->service, true);
        Model::validateRequired('mcc', $this->mcc, true);
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('certType', $this->certType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->aliasName) {
            $res['alias_name'] = $this->aliasName;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->appAuthToken) {
            $res['app_auth_token'] = $this->appAuthToken;
        }
        if (null !== $this->merchantType) {
            $res['merchant_type'] = $this->merchantType;
        }
        if (null !== $this->contactInfos) {
            $res['contact_infos'] = null !== $this->contactInfos ? $this->contactInfos->toMap() : null;
        }
        if (null !== $this->defaultSettleRule) {
            $res['default_settle_rule'] = null !== $this->defaultSettleRule ? $this->defaultSettleRule->toMap() : null;
        }
        if (null !== $this->service) {
            $res['service'] = $this->service;
        }
        if (null !== $this->mcc) {
            $res['mcc'] = $this->mcc;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->certName) {
            $res['cert_name'] = $this->certName;
        }
        if (null !== $this->certImage) {
            $res['cert_image'] = $this->certImage;
        }
        if (null !== $this->legalName) {
            $res['legal_name'] = $this->legalName;
        }
        if (null !== $this->legalCertNo) {
            $res['legal_cert_no'] = $this->legalCertNo;
        }
        if (null !== $this->alipayLogonId) {
            $res['alipay_logon_id'] = $this->alipayLogonId;
        }
        if (null !== $this->bindingAlipayLogonId) {
            $res['binding_alipay_logon_id'] = $this->bindingAlipayLogonId;
        }
        if (null !== $this->bizCards) {
            $res['biz_cards'] = null !== $this->bizCards ? $this->bizCards->toMap() : null;
        }
        if (null !== $this->businessAddress) {
            $res['business_address'] = null !== $this->businessAddress ? $this->businessAddress->toMap() : null;
        }
        if (null !== $this->outDoorImages) {
            $res['out_door_images'] = $this->outDoorImages;
        }
        if (null !== $this->inDoorImages) {
            $res['in_door_images'] = $this->inDoorImages;
        }
        if (null !== $this->licenseAuthLetterImage) {
            $res['license_auth_letter_image'] = $this->licenseAuthLetterImage;
        }
        if (null !== $this->sites) {
            $res['sites'] = null !== $this->sites ? $this->sites->toMap() : null;
        }
        if (null !== $this->qualifications) {
            $res['qualifications'] = [];
            if (null !== $this->qualifications && \is_array($this->qualifications)) {
                $n = 0;
                foreach ($this->qualifications as $item) {
                    $res['qualifications'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->legalCertFrontImage) {
            $res['legal_cert_front_image'] = $this->legalCertFrontImage;
        }
        if (null !== $this->legalCertBackImage) {
            $res['legal_cert_back_image'] = $this->legalCertBackImage;
        }
        if (null !== $this->infoSourceOpenId) {
            $res['info_source_open_id'] = $this->infoSourceOpenId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RegisterAgoraxMerchantRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['alias_name'])) {
            $model->aliasName = $map['alias_name'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['app_auth_token'])) {
            $model->appAuthToken = $map['app_auth_token'];
        }
        if (isset($map['merchant_type'])) {
            $model->merchantType = $map['merchant_type'];
        }
        if (isset($map['contact_infos'])) {
            $model->contactInfos = ContactInfo::fromMap($map['contact_infos']);
        }
        if (isset($map['default_settle_rule'])) {
            $model->defaultSettleRule = DefaultSettleRule::fromMap($map['default_settle_rule']);
        }
        if (isset($map['service'])) {
            if (!empty($map['service'])) {
                $model->service = $map['service'];
            }
        }
        if (isset($map['mcc'])) {
            $model->mcc = $map['mcc'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['cert_name'])) {
            $model->certName = $map['cert_name'];
        }
        if (isset($map['cert_image'])) {
            $model->certImage = $map['cert_image'];
        }
        if (isset($map['legal_name'])) {
            $model->legalName = $map['legal_name'];
        }
        if (isset($map['legal_cert_no'])) {
            $model->legalCertNo = $map['legal_cert_no'];
        }
        if (isset($map['alipay_logon_id'])) {
            $model->alipayLogonId = $map['alipay_logon_id'];
        }
        if (isset($map['binding_alipay_logon_id'])) {
            $model->bindingAlipayLogonId = $map['binding_alipay_logon_id'];
        }
        if (isset($map['biz_cards'])) {
            $model->bizCards = SettleCardInfo::fromMap($map['biz_cards']);
        }
        if (isset($map['business_address'])) {
            $model->businessAddress = AddressInfo::fromMap($map['business_address']);
        }
        if (isset($map['out_door_images'])) {
            $model->outDoorImages = $map['out_door_images'];
        }
        if (isset($map['in_door_images'])) {
            $model->inDoorImages = $map['in_door_images'];
        }
        if (isset($map['license_auth_letter_image'])) {
            $model->licenseAuthLetterImage = $map['license_auth_letter_image'];
        }
        if (isset($map['sites'])) {
            $model->sites = SiteInfo::fromMap($map['sites']);
        }
        if (isset($map['qualifications'])) {
            if (!empty($map['qualifications'])) {
                $model->qualifications = [];
                $n                     = 0;
                foreach ($map['qualifications'] as $item) {
                    $model->qualifications[$n++] = null !== $item ? IndustryQualificationInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['legal_cert_front_image'])) {
            $model->legalCertFrontImage = $map['legal_cert_front_image'];
        }
        if (isset($map['legal_cert_back_image'])) {
            $model->legalCertBackImage = $map['legal_cert_back_image'];
        }
        if (isset($map['info_source_open_id'])) {
            $model->infoSourceOpenId = $map['info_source_open_id'];
        }

        return $model;
    }
}
