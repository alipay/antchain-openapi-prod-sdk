<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CheckOpenchainCorporateFaceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 企业名称
    /**
     * @var string
     */
    public $epCertName;

    // 企业证件
    /**
     * @var string
     */
    public $epCertNo;

    // 企业证件类型（NATIONAL_LEGAL（工商注册号）或 NATIONAL_LEGAL_MERGE （ 社会统一信用代码））
    /**
     * @var string
     */
    public $epCertType;

    // 企业法人名称
    /**
     * @var string
     */
    public $legalPersonCertName;

    // 法人身份证号
    /**
     * @var string
     */
    public $legalPersonCertNo;

    // 商户code
    /**
     * @var string
     */
    public $merchantCode;

    // 店铺描述
    /**
     * @var string
     */
    public $shopDesc;

    // 店铺图片地址
    /**
     * @var string
     */
    public $shopSitImage;

    // 店铺url地址
    /**
     * @var string
     */
    public $shopWebUrl;

    // 租户code
    /**
     * @var string
     */
    public $tenantId;

    // 网站id，为网站产品唯一标识
    /**
     * @var string
     */
    public $webSitId;

    // 网站域名
    /**
     * @var string
     */
    public $webSitUrl;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'epCertName'          => 'ep_cert_name',
        'epCertNo'            => 'ep_cert_no',
        'epCertType'          => 'ep_cert_type',
        'legalPersonCertName' => 'legal_person_cert_name',
        'legalPersonCertNo'   => 'legal_person_cert_no',
        'merchantCode'        => 'merchant_code',
        'shopDesc'            => 'shop_desc',
        'shopSitImage'        => 'shop_sit_image',
        'shopWebUrl'          => 'shop_web_url',
        'tenantId'            => 'tenant_id',
        'webSitId'            => 'web_sit_id',
        'webSitUrl'           => 'web_sit_url',
    ];

    public function validate()
    {
        Model::validateRequired('epCertName', $this->epCertName, true);
        Model::validateRequired('epCertNo', $this->epCertNo, true);
        Model::validateRequired('epCertType', $this->epCertType, true);
        Model::validateRequired('legalPersonCertName', $this->legalPersonCertName, true);
        Model::validateRequired('legalPersonCertNo', $this->legalPersonCertNo, true);
        Model::validateRequired('merchantCode', $this->merchantCode, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('webSitId', $this->webSitId, true);
        Model::validateRequired('webSitUrl', $this->webSitUrl, true);
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
        if (null !== $this->epCertName) {
            $res['ep_cert_name'] = $this->epCertName;
        }
        if (null !== $this->epCertNo) {
            $res['ep_cert_no'] = $this->epCertNo;
        }
        if (null !== $this->epCertType) {
            $res['ep_cert_type'] = $this->epCertType;
        }
        if (null !== $this->legalPersonCertName) {
            $res['legal_person_cert_name'] = $this->legalPersonCertName;
        }
        if (null !== $this->legalPersonCertNo) {
            $res['legal_person_cert_no'] = $this->legalPersonCertNo;
        }
        if (null !== $this->merchantCode) {
            $res['merchant_code'] = $this->merchantCode;
        }
        if (null !== $this->shopDesc) {
            $res['shop_desc'] = $this->shopDesc;
        }
        if (null !== $this->shopSitImage) {
            $res['shop_sit_image'] = $this->shopSitImage;
        }
        if (null !== $this->shopWebUrl) {
            $res['shop_web_url'] = $this->shopWebUrl;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->webSitId) {
            $res['web_sit_id'] = $this->webSitId;
        }
        if (null !== $this->webSitUrl) {
            $res['web_sit_url'] = $this->webSitUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckOpenchainCorporateFaceRequest
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
        if (isset($map['ep_cert_name'])) {
            $model->epCertName = $map['ep_cert_name'];
        }
        if (isset($map['ep_cert_no'])) {
            $model->epCertNo = $map['ep_cert_no'];
        }
        if (isset($map['ep_cert_type'])) {
            $model->epCertType = $map['ep_cert_type'];
        }
        if (isset($map['legal_person_cert_name'])) {
            $model->legalPersonCertName = $map['legal_person_cert_name'];
        }
        if (isset($map['legal_person_cert_no'])) {
            $model->legalPersonCertNo = $map['legal_person_cert_no'];
        }
        if (isset($map['merchant_code'])) {
            $model->merchantCode = $map['merchant_code'];
        }
        if (isset($map['shop_desc'])) {
            $model->shopDesc = $map['shop_desc'];
        }
        if (isset($map['shop_sit_image'])) {
            $model->shopSitImage = $map['shop_sit_image'];
        }
        if (isset($map['shop_web_url'])) {
            $model->shopWebUrl = $map['shop_web_url'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['web_sit_id'])) {
            $model->webSitId = $map['web_sit_id'];
        }
        if (isset($map['web_sit_url'])) {
            $model->webSitUrl = $map['web_sit_url'];
        }

        return $model;
    }
}
