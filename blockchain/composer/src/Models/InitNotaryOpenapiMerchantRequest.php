<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class InitNotaryOpenapiMerchantRequest extends Model
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

    // 认证来源，PC_AUTH或APP_AUTH
    /**
     * @var string
     */
    public $authType;

    // 认证成功页面回跳地址（只在移动端跳转，PC暂不支持）
    /**
     * @var string
     */
    public $callbackUrl;

    // 企业名称
    /**
     * @var string
     */
    public $epCertName;

    // 企业统一社会信用代码
    /**
     * @var string
     */
    public $epCertNo;

    // 企业证件类型，目前只支持企业营业执照类型，值为NATIONAL_LEGAL_MERGE
    /**
     * @var string
     */
    public $epCertType;

    // 认证类型，目前只支持企业认证信息，值为EP_CERT_INFO
    /**
     * @var string
     */
    public $identityType;

    // 法人姓名
    /**
     * @var string
     */
    public $legalPersonCertName;

    // 法人身份证号
    /**
     * @var string
     */
    public $legalPersonCertNo;

    // 法人认证证件类型，目前只支持身份证，值为IDENTITY_CARD
    /**
     * @var string
     */
    public $legalPersonCertType;

    // 认证成功回调地址
    /**
     * @var string
     */
    public $returnUrl;

    // 商户请求的唯一标志，商户要保证其唯一性。值为32位长度的字母数字下划线组合
    /**
     * @var string
     */
    public $transactionId;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'authType'            => 'auth_type',
        'callbackUrl'         => 'callback_url',
        'epCertName'          => 'ep_cert_name',
        'epCertNo'            => 'ep_cert_no',
        'epCertType'          => 'ep_cert_type',
        'identityType'        => 'identity_type',
        'legalPersonCertName' => 'legal_person_cert_name',
        'legalPersonCertNo'   => 'legal_person_cert_no',
        'legalPersonCertType' => 'legal_person_cert_type',
        'returnUrl'           => 'return_url',
        'transactionId'       => 'transaction_id',
    ];

    public function validate()
    {
        Model::validateRequired('authType', $this->authType, true);
        Model::validateRequired('epCertName', $this->epCertName, true);
        Model::validateRequired('epCertNo', $this->epCertNo, true);
        Model::validateRequired('epCertType', $this->epCertType, true);
        Model::validateRequired('identityType', $this->identityType, true);
        Model::validateRequired('legalPersonCertName', $this->legalPersonCertName, true);
        Model::validateRequired('legalPersonCertNo', $this->legalPersonCertNo, true);
        Model::validateRequired('legalPersonCertType', $this->legalPersonCertType, true);
        Model::validateRequired('transactionId', $this->transactionId, true);
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
        if (null !== $this->authType) {
            $res['auth_type'] = $this->authType;
        }
        if (null !== $this->callbackUrl) {
            $res['callback_url'] = $this->callbackUrl;
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
        if (null !== $this->identityType) {
            $res['identity_type'] = $this->identityType;
        }
        if (null !== $this->legalPersonCertName) {
            $res['legal_person_cert_name'] = $this->legalPersonCertName;
        }
        if (null !== $this->legalPersonCertNo) {
            $res['legal_person_cert_no'] = $this->legalPersonCertNo;
        }
        if (null !== $this->legalPersonCertType) {
            $res['legal_person_cert_type'] = $this->legalPersonCertType;
        }
        if (null !== $this->returnUrl) {
            $res['return_url'] = $this->returnUrl;
        }
        if (null !== $this->transactionId) {
            $res['transaction_id'] = $this->transactionId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitNotaryOpenapiMerchantRequest
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
        if (isset($map['auth_type'])) {
            $model->authType = $map['auth_type'];
        }
        if (isset($map['callback_url'])) {
            $model->callbackUrl = $map['callback_url'];
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
        if (isset($map['identity_type'])) {
            $model->identityType = $map['identity_type'];
        }
        if (isset($map['legal_person_cert_name'])) {
            $model->legalPersonCertName = $map['legal_person_cert_name'];
        }
        if (isset($map['legal_person_cert_no'])) {
            $model->legalPersonCertNo = $map['legal_person_cert_no'];
        }
        if (isset($map['legal_person_cert_type'])) {
            $model->legalPersonCertType = $map['legal_person_cert_type'];
        }
        if (isset($map['return_url'])) {
            $model->returnUrl = $map['return_url'];
        }
        if (isset($map['transaction_id'])) {
            $model->transactionId = $map['transaction_id'];
        }

        return $model;
    }
}
