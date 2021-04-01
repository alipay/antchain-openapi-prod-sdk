<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class InitIdentificationEnterpriseFaceauthRequest extends Model
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

    // 用于内部统计的参数，外部用户请忽略
    /**
     * @var BizInfo
     */
    public $bizInfo;

    // 回调通知地址
    /**
     * @var string
     */
    public $callBackUrl;

    // 企业名称
    /**
     * @var string
     */
    public $epCertName;

    // 企业证件号
    /**
     * @var string
     */
    public $epCertNo;

    // 企业证件类型（NATIONAL_LEGAL（工商注册号）或 NATIONAL_LEGAL_MERGE （ 社会统一信用代码））
    /**
     * @var string
     */
    public $epCertType;

    // 企业法人姓名
    /**
     * @var string
     */
    public $legalPersonCertName;

    // 企业法人身份证号（目前只支持身份证号）
    /**
     * @var string
     */
    public $legalPersonCertNo;

    // 认证完成后回跳地址
    /**
     * @var string
     */
    public $merchantUrl;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'bizInfo'             => 'biz_info',
        'callBackUrl'         => 'call_back_url',
        'epCertName'          => 'ep_cert_name',
        'epCertNo'            => 'ep_cert_no',
        'epCertType'          => 'ep_cert_type',
        'legalPersonCertName' => 'legal_person_cert_name',
        'legalPersonCertNo'   => 'legal_person_cert_no',
        'merchantUrl'         => 'merchant_url',
    ];

    public function validate()
    {
        Model::validateRequired('epCertName', $this->epCertName, true);
        Model::validateRequired('epCertNo', $this->epCertNo, true);
        Model::validateRequired('epCertType', $this->epCertType, true);
        Model::validateRequired('legalPersonCertName', $this->legalPersonCertName, true);
        Model::validateRequired('legalPersonCertNo', $this->legalPersonCertNo, true);
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
        if (null !== $this->bizInfo) {
            $res['biz_info'] = null !== $this->bizInfo ? $this->bizInfo->toMap() : null;
        }
        if (null !== $this->callBackUrl) {
            $res['call_back_url'] = $this->callBackUrl;
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
        if (null !== $this->merchantUrl) {
            $res['merchant_url'] = $this->merchantUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitIdentificationEnterpriseFaceauthRequest
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
        if (isset($map['biz_info'])) {
            $model->bizInfo = BizInfo::fromMap($map['biz_info']);
        }
        if (isset($map['call_back_url'])) {
            $model->callBackUrl = $map['call_back_url'];
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
        if (isset($map['merchant_url'])) {
            $model->merchantUrl = $map['merchant_url'];
        }

        return $model;
    }
}
