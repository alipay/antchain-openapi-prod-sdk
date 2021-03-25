<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateContractRegisterzftRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'address' => 'address',
        'agentAccountId' => 'agent_account_id',
        'aliasName' => 'alias_name',
        'alipayLogonId' => 'alipay_logon_id',
        'applyTime' => 'apply_time',
        'bindingAlipayLogonId' => 'binding_alipay_logon_id',
        'cardAliasNo' => 'card_alias_no',
        'certImage' => 'cert_image',
        'certNo' => 'cert_no',
        'certType' => 'cert_type',
        'cityCode' => 'city_code',
        'contactEmail' => 'contact_email',
        'contactMobile' => 'contact_mobile',
        'contactName' => 'contact_name',
        'contactPhone' => 'contact_phone',
        'contactTag' => 'contact_tag',
        'contactType' => 'contact_type',
        'districtCode' => 'district_code',
        'extInfo' => 'ext_info',
        'ipRoleId' => 'ip_role_id',
        'legalCertBackImage' => 'legal_cert_back_image',
        'legalCertFrontImage' => 'legal_cert_front_image',
        'legalCertNo' => 'legal_cert_no',
        'legalName' => 'legal_name',
        'mcc' => 'mcc',
        'merchantName' => 'merchant_name',
        'merchantType' => 'merchant_type',
        'name' => 'name',
        'orderId' => 'order_id',
        'outBizNo' => 'out_biz_no',
        'outDoorImage' => 'out_door_image',
        'platformTuid' => 'platform_tuid',
        'provinceCode' => 'province_code',
        'service' => 'service',
        'servicePhone' => 'service_phone',
        'signTimeWithIsv' => 'sign_time_with_isv',
        'siteName' => 'site_name',
        'siteType' => 'site_type',
        'siteUrl' => 'site_url',
        'smid' => 'smid',
        'status' => 'status',
        'update' => 'update',
    ];
    public function validate() {
        Model::validateRequired('address', $this->address, true);
        Model::validateRequired('aliasName', $this->aliasName, true);
        Model::validateRequired('alipayLogonId', $this->alipayLogonId, true);
        Model::validateRequired('applyTime', $this->applyTime, true);
        Model::validateRequired('bindingAlipayLogonId', $this->bindingAlipayLogonId, true);
        Model::validateRequired('certImage', $this->certImage, true);
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('certType', $this->certType, true);
        Model::validateRequired('cityCode', $this->cityCode, true);
        Model::validateRequired('contactEmail', $this->contactEmail, true);
        Model::validateRequired('contactMobile', $this->contactMobile, true);
        Model::validateRequired('contactName', $this->contactName, true);
        Model::validateRequired('contactPhone', $this->contactPhone, true);
        Model::validateRequired('contactTag', $this->contactTag, true);
        Model::validateRequired('contactType', $this->contactType, true);
        Model::validateRequired('districtCode', $this->districtCode, true);
        Model::validateRequired('extInfo', $this->extInfo, true);
        Model::validateRequired('ipRoleId', $this->ipRoleId, true);
        Model::validateRequired('legalCertBackImage', $this->legalCertBackImage, true);
        Model::validateRequired('legalCertFrontImage', $this->legalCertFrontImage, true);
        Model::validateRequired('legalCertNo', $this->legalCertNo, true);
        Model::validateRequired('legalName', $this->legalName, true);
        Model::validateRequired('mcc', $this->mcc, true);
        Model::validateRequired('merchantName', $this->merchantName, true);
        Model::validateRequired('merchantType', $this->merchantType, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('outBizNo', $this->outBizNo, true);
        Model::validateRequired('outDoorImage', $this->outDoorImage, true);
        Model::validateRequired('platformTuid', $this->platformTuid, true);
        Model::validateRequired('provinceCode', $this->provinceCode, true);
        Model::validateRequired('service', $this->service, true);
        Model::validateRequired('servicePhone', $this->servicePhone, true);
        Model::validateRequired('signTimeWithIsv', $this->signTimeWithIsv, true);
        Model::validateRequired('siteName', $this->siteName, true);
        Model::validateRequired('siteType', $this->siteType, true);
        Model::validateRequired('siteUrl', $this->siteUrl, true);
        Model::validateRequired('smid', $this->smid, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('update', $this->update, true);
        Model::validatePattern('applyTime', $this->applyTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->agentAccountId) {
            $res['agent_account_id'] = $this->agentAccountId;
        }
        if (null !== $this->aliasName) {
            $res['alias_name'] = $this->aliasName;
        }
        if (null !== $this->alipayLogonId) {
            $res['alipay_logon_id'] = $this->alipayLogonId;
        }
        if (null !== $this->applyTime) {
            $res['apply_time'] = $this->applyTime;
        }
        if (null !== $this->bindingAlipayLogonId) {
            $res['binding_alipay_logon_id'] = $this->bindingAlipayLogonId;
        }
        if (null !== $this->cardAliasNo) {
            $res['card_alias_no'] = $this->cardAliasNo;
        }
        if (null !== $this->certImage) {
            $res['cert_image'] = $this->certImage;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->cityCode) {
            $res['city_code'] = $this->cityCode;
        }
        if (null !== $this->contactEmail) {
            $res['contact_email'] = $this->contactEmail;
        }
        if (null !== $this->contactMobile) {
            $res['contact_mobile'] = $this->contactMobile;
        }
        if (null !== $this->contactName) {
            $res['contact_name'] = $this->contactName;
        }
        if (null !== $this->contactPhone) {
            $res['contact_phone'] = $this->contactPhone;
        }
        if (null !== $this->contactTag) {
            $res['contact_tag'] = $this->contactTag;
        }
        if (null !== $this->contactType) {
            $res['contact_type'] = $this->contactType;
        }
        if (null !== $this->districtCode) {
            $res['district_code'] = $this->districtCode;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }
        if (null !== $this->ipRoleId) {
            $res['ip_role_id'] = $this->ipRoleId;
        }
        if (null !== $this->legalCertBackImage) {
            $res['legal_cert_back_image'] = $this->legalCertBackImage;
        }
        if (null !== $this->legalCertFrontImage) {
            $res['legal_cert_front_image'] = $this->legalCertFrontImage;
        }
        if (null !== $this->legalCertNo) {
            $res['legal_cert_no'] = $this->legalCertNo;
        }
        if (null !== $this->legalName) {
            $res['legal_name'] = $this->legalName;
        }
        if (null !== $this->mcc) {
            $res['mcc'] = $this->mcc;
        }
        if (null !== $this->merchantName) {
            $res['merchant_name'] = $this->merchantName;
        }
        if (null !== $this->merchantType) {
            $res['merchant_type'] = $this->merchantType;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->outBizNo) {
            $res['out_biz_no'] = $this->outBizNo;
        }
        if (null !== $this->outDoorImage) {
            $res['out_door_image'] = $this->outDoorImage;
        }
        if (null !== $this->platformTuid) {
            $res['platform_tuid'] = $this->platformTuid;
        }
        if (null !== $this->provinceCode) {
            $res['province_code'] = $this->provinceCode;
        }
        if (null !== $this->service) {
            $res['service'] = $this->service;
        }
        if (null !== $this->servicePhone) {
            $res['service_phone'] = $this->servicePhone;
        }
        if (null !== $this->signTimeWithIsv) {
            $res['sign_time_with_isv'] = $this->signTimeWithIsv;
        }
        if (null !== $this->siteName) {
            $res['site_name'] = $this->siteName;
        }
        if (null !== $this->siteType) {
            $res['site_type'] = $this->siteType;
        }
        if (null !== $this->siteUrl) {
            $res['site_url'] = $this->siteUrl;
        }
        if (null !== $this->smid) {
            $res['smid'] = $this->smid;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->update) {
            $res['update'] = $this->update;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateContractRegisterzftRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['address'])){
            $model->address = $map['address'];
        }
        if(isset($map['agent_account_id'])){
            $model->agentAccountId = $map['agent_account_id'];
        }
        if(isset($map['alias_name'])){
            $model->aliasName = $map['alias_name'];
        }
        if(isset($map['alipay_logon_id'])){
            $model->alipayLogonId = $map['alipay_logon_id'];
        }
        if(isset($map['apply_time'])){
            $model->applyTime = $map['apply_time'];
        }
        if(isset($map['binding_alipay_logon_id'])){
            $model->bindingAlipayLogonId = $map['binding_alipay_logon_id'];
        }
        if(isset($map['card_alias_no'])){
            $model->cardAliasNo = $map['card_alias_no'];
        }
        if(isset($map['cert_image'])){
            $model->certImage = $map['cert_image'];
        }
        if(isset($map['cert_no'])){
            $model->certNo = $map['cert_no'];
        }
        if(isset($map['cert_type'])){
            $model->certType = $map['cert_type'];
        }
        if(isset($map['city_code'])){
            $model->cityCode = $map['city_code'];
        }
        if(isset($map['contact_email'])){
            $model->contactEmail = $map['contact_email'];
        }
        if(isset($map['contact_mobile'])){
            $model->contactMobile = $map['contact_mobile'];
        }
        if(isset($map['contact_name'])){
            $model->contactName = $map['contact_name'];
        }
        if(isset($map['contact_phone'])){
            $model->contactPhone = $map['contact_phone'];
        }
        if(isset($map['contact_tag'])){
            $model->contactTag = $map['contact_tag'];
        }
        if(isset($map['contact_type'])){
            $model->contactType = $map['contact_type'];
        }
        if(isset($map['district_code'])){
            $model->districtCode = $map['district_code'];
        }
        if(isset($map['ext_info'])){
            $model->extInfo = $map['ext_info'];
        }
        if(isset($map['ip_role_id'])){
            $model->ipRoleId = $map['ip_role_id'];
        }
        if(isset($map['legal_cert_back_image'])){
            $model->legalCertBackImage = $map['legal_cert_back_image'];
        }
        if(isset($map['legal_cert_front_image'])){
            $model->legalCertFrontImage = $map['legal_cert_front_image'];
        }
        if(isset($map['legal_cert_no'])){
            $model->legalCertNo = $map['legal_cert_no'];
        }
        if(isset($map['legal_name'])){
            $model->legalName = $map['legal_name'];
        }
        if(isset($map['mcc'])){
            $model->mcc = $map['mcc'];
        }
        if(isset($map['merchant_name'])){
            $model->merchantName = $map['merchant_name'];
        }
        if(isset($map['merchant_type'])){
            $model->merchantType = $map['merchant_type'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['order_id'])){
            $model->orderId = $map['order_id'];
        }
        if(isset($map['out_biz_no'])){
            $model->outBizNo = $map['out_biz_no'];
        }
        if(isset($map['out_door_image'])){
            $model->outDoorImage = $map['out_door_image'];
        }
        if(isset($map['platform_tuid'])){
            $model->platformTuid = $map['platform_tuid'];
        }
        if(isset($map['province_code'])){
            $model->provinceCode = $map['province_code'];
        }
        if(isset($map['service'])){
            $model->service = $map['service'];
        }
        if(isset($map['service_phone'])){
            $model->servicePhone = $map['service_phone'];
        }
        if(isset($map['sign_time_with_isv'])){
            $model->signTimeWithIsv = $map['sign_time_with_isv'];
        }
        if(isset($map['site_name'])){
            $model->siteName = $map['site_name'];
        }
        if(isset($map['site_type'])){
            $model->siteType = $map['site_type'];
        }
        if(isset($map['site_url'])){
            $model->siteUrl = $map['site_url'];
        }
        if(isset($map['smid'])){
            $model->smid = $map['smid'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['update'])){
            $model->update = $map['update'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 地址。商户详细经营地址或人员所在地点
    /**
     * @var string
     */
    public $address;

    // 代理商户的账户
    /**
     * @var string
     */
    public $agentAccountId;

    // 商户别名
    /**
     * @var string
     */
    public $aliasName;

    // 商户支付宝账户
    /**
     * @var string
     */
    public $alipayLogonId;

    // 申请时间
    /**
     * @var string
     */
    public $applyTime;

    // 二级商户支付宝账户，用于协议确认。目前商业场景（除医疗、中小学教育等）下必填。本字段要求与商户名称name同名，且是实名认证支付宝账户
    /**
     * @var string
     */
    public $bindingAlipayLogonId;

    // 结算卡id
    /**
     * @var string
     */
    public $cardAliasNo;

    // 营业执照图片url，本业务接口中，如果是特殊行业必填。其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。
    /**
     * @var string
     */
    public $certImage;

    // 商户社会信用码
    /**
     * @var string
     */
    public $certNo;

    // 商户证件类型，取值范围：201：营业执照；2011:营业执照(统一社会信用代码)；204：民办非企业登记证书；206：社会团体法人登记证书；218：事业单位法人证书；219：党政机关批准设立文件/行政执法主体资格证；100：个人商户身份证
    /**
     * @var string
     */
    public $certType;

    // 城市编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。
    // （参考资料：
    // http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）
    /**
     * @var string
     */
    public $cityCode;

    // 电子邮箱
    /**
     * @var string
     */
    public $contactEmail;

    // 商户联系人信息
    /**
     * @var string
     */
    public $contactMobile;

    // 联系人名字
    /**
     * @var string
     */
    public $contactName;

    // 商户联系人电话信息
    /**
     * @var string
     */
    public $contactPhone;

    // 商户联系人业务标识枚举，表示商户联系人的职责。异议处理接口人:02;商户关键联系人:06;数据反馈接口人:11;服务联动接口人:08
    /**
     * @var string
     */
    public $contactTag;

    // 联系人类型，取值范围：LEGAL_PERSON：法人；CONTROLLER：实际控制人；AGENT：代理人；OTHER：其他
    /**
     * @var string
     */
    public $contactType;

    // 区县编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。
    // （参考资料：
    // http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）
    /**
     * @var string
     */
    public $districtCode;

    // 返回申请单相关参数。当前返回内容有cardAliasNo，smid
    /**
     * @var string
     */
    public $extInfo;

    // 商户角色id。审核通过后生成。间连商户或平台商二级商户业务中，本字段表示smid
    /**
     * @var string
     */
    public $ipRoleId;

    // 法人身份证反面url，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。本业务接口中，如果是特殊行业必填
    /**
     * @var string
     */
    public $legalCertBackImage;

    // 法人身份证正面url，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。本业务接口中，如果是特殊行业必填
    /**
     * @var string
     */
    public $legalCertFrontImage;

    // 法人身份证号
    /**
     * @var string
     */
    public $legalCertNo;

    // 法人名称
    /**
     * @var string
     */
    public $legalName;

    // 商户类别码mcc，参见附件描述中的“类目code” https://gw.alipayobjects.com/os/basement_prod/82cb70f7-abbd-417a-91ba-73c1849f07ea.xlsx 如果要求资质一栏不为空，表明是特殊行业，会有人工审核。注：文档更新可能有滞后性，以实际为准
    /**
     * @var string
     */
    public $mcc;

    // 蚂蚁金服（杭*****术有限公司
    /**
     * @var string
     */
    public $merchantName;

    // 商家类型：01：企业；02：事业单位；03：民办非企业组织；04：社会团体；05：党政及国家机关；06：个人商户；07：个体工商户
    /**
     * @var string
     */
    public $merchantType;

    // 商户名称
    /**
     * @var string
     */
    public $name;

    // 申请单id
    /**
     * @var string
     */
    public $orderId;

    // 外部业务号。比如某种业务标准外部订单号,比如交易外部订单号，代表服务商端自己订单号。用于做并发控制，防止一笔外部订单发起两次进件。非必要场景禁止传入本字段，如要使用务必理清场景及字段生成规则，与蚂蚁金服对接人咨询。
    /**
     * @var string
     */
    public $outBizNo;

    // 门头照，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。如果使用当面付服务则必填
    /**
     * @var string
     */
    public $outDoorImage;

    // 商户在智能合同平台唯一id
    /**
     * @var string
     */
    public $platformTuid;

    // 省份编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。
    // （参考资料：
    // http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）
    /**
     * @var string
     */
    public $provinceCode;

    // 商户使用服务，可选值有：当面付、app支付、wap支付、电脑支付
    /**
     * @var string
     */
    public $service;

    // 客服电话
    /**
     * @var string
     */
    public $servicePhone;

    // 二级商户与服务商的签约时间
    /**
     * @var string
     */
    public $signTimeWithIsv;

    // 站点名称
    /**
     * @var string
     */
    public $siteName;

    // 网站：01
    // APP : 02
    // 服务窗:03
    // 公众号:04
    // 其他:05
    // 支付宝小程序:06
    /**
     * @var string
     */
    public $siteType;

    // 站点地址
    /**
     * @var string
     */
    public $siteUrl;

    // 二级商户id
    /**
     * @var string
     */
    public $smid;

    // 申请单状态。99:已完结;-1:失败;031:已提交审核
    /**
     * @var string
     */
    public $status;

    // 0表示不更新，1表示强制更新
    /**
     * @var int
     */
    public $update;

}
