<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class RegisterBclMerchantRequest extends Model
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

    // 商家实体名称
    // 要与证件的名称相同，会在用户签署代扣协议时或者支付宝扣款账单中展示，请规范填写，最大长度：128
    /**
     * @var string
     */
    public $name;

    // 商家实体别名
    // 会在用户签署代扣协议时或者支付宝扣款账单中展示，请规范填写，最大长度：128
    // 如果need_proxy_withholding为true则必填
    /**
     * @var string
     */
    public $aliasName;

    // 商家实体类型：
    // 1.企业：ENTERPRISE
    // 当前暂时只支持企业
    /**
     * @var string
     */
    public $merchantType;

    // 商家营业执照号
    // 最大长度20
    /**
     * @var string
     */
    public $certNo;

    // 法人名称
    // 最大长度64
    /**
     * @var string
     */
    public $legalName;

    // 法人身份证号
    // 最大长度：18
    // 当前暂时只支持中国大陆个人身份证
    /**
     * @var string
     */
    public $legalCertNo;

    // 商户联系人信息
    // 当前只支持一个联系人
    // 如果need_proxy_withholding为true则必填
    /**
     * @var BclContactInfo[]
     */
    public $contactInfos;

    // 商家实体支付宝账号
    // 用作结算账号。本字段支付宝账号实名信息要求与商户名称cert_name同名，且是实名认证支付宝企业账户，最大长度：64
    // 如果need_proxy_withholding为true则必填
    /**
     * @var string
     */
    public $alipayLogonId;

    // 租赁经营类型
    // 1.数码/娱乐设备租赁：DIGITAL_LEASE
    // 2.共享充电宝及其他共享租赁：SHARE_LEASE
    // 3.汽车租赁：CAR_LEASE
    /**
     * @var string
     */
    public $managementType;

    // 是否需要使用租赁代扣
    // true 为需要使用
    // false 为不需要使用
    /**
     * @var bool
     */
    public $needProxyWithholding;

    // 客户端token：
    // 幂等号，用来保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。更多详情，请参见如何保证幂等性。
    /**
     * @var string
     */
    public $clientToken;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'name'                 => 'name',
        'aliasName'            => 'alias_name',
        'merchantType'         => 'merchant_type',
        'certNo'               => 'cert_no',
        'legalName'            => 'legal_name',
        'legalCertNo'          => 'legal_cert_no',
        'contactInfos'         => 'contact_infos',
        'alipayLogonId'        => 'alipay_logon_id',
        'managementType'       => 'management_type',
        'needProxyWithholding' => 'need_proxy_withholding',
        'clientToken'          => 'client_token',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('merchantType', $this->merchantType, true);
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('legalName', $this->legalName, true);
        Model::validateRequired('legalCertNo', $this->legalCertNo, true);
        Model::validateRequired('managementType', $this->managementType, true);
        Model::validateRequired('needProxyWithholding', $this->needProxyWithholding, true);
        Model::validateRequired('clientToken', $this->clientToken, true);
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->aliasName) {
            $res['alias_name'] = $this->aliasName;
        }
        if (null !== $this->merchantType) {
            $res['merchant_type'] = $this->merchantType;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->legalName) {
            $res['legal_name'] = $this->legalName;
        }
        if (null !== $this->legalCertNo) {
            $res['legal_cert_no'] = $this->legalCertNo;
        }
        if (null !== $this->contactInfos) {
            $res['contact_infos'] = [];
            if (null !== $this->contactInfos && \is_array($this->contactInfos)) {
                $n = 0;
                foreach ($this->contactInfos as $item) {
                    $res['contact_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->alipayLogonId) {
            $res['alipay_logon_id'] = $this->alipayLogonId;
        }
        if (null !== $this->managementType) {
            $res['management_type'] = $this->managementType;
        }
        if (null !== $this->needProxyWithholding) {
            $res['need_proxy_withholding'] = $this->needProxyWithholding;
        }
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RegisterBclMerchantRequest
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
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['alias_name'])) {
            $model->aliasName = $map['alias_name'];
        }
        if (isset($map['merchant_type'])) {
            $model->merchantType = $map['merchant_type'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['legal_name'])) {
            $model->legalName = $map['legal_name'];
        }
        if (isset($map['legal_cert_no'])) {
            $model->legalCertNo = $map['legal_cert_no'];
        }
        if (isset($map['contact_infos'])) {
            if (!empty($map['contact_infos'])) {
                $model->contactInfos = [];
                $n                   = 0;
                foreach ($map['contact_infos'] as $item) {
                    $model->contactInfos[$n++] = null !== $item ? BclContactInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['alipay_logon_id'])) {
            $model->alipayLogonId = $map['alipay_logon_id'];
        }
        if (isset($map['management_type'])) {
            $model->managementType = $map['management_type'];
        }
        if (isset($map['need_proxy_withholding'])) {
            $model->needProxyWithholding = $map['need_proxy_withholding'];
        }
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }

        return $model;
    }
}
