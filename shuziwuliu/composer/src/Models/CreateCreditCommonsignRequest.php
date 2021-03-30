<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class CreateCreditCommonsignRequest extends Model
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

    // 账户号，account_type=ACCOUNT_BANK_NO时填写外部银行卡号， account_type=ACCOUNT_CLOUD_FUND时填写云资金商户ID
    /**
     * @var string
     */
    public $accountId;

    // 账户类型，ACCOUNT_BANK_NO:外部银行卡，ACCOUNT_CLOUD_FUND:云资金商户ID
    /**
     * @var string
     */
    public $accountType;

    // 开户行联行号，当帐户类型为ACCOUNT_BANK_NO时必填
    /**
     * @var string
     */
    public $bankCnaps;

    // 开户行名称，当帐户类型为ACCOUNT_BANK_NO时必填
    /**
     * @var string
     */
    public $bankName;

    // 签约结果回调地址
    /**
     * @var string
     */
    public $callbackUrl;

    // 驾驶证号码，当帐户类型为ACCOUNT_BANK_NO且签约方sign_did类型为个人时必填
    /**
     * @var string
     */
    public $drivingLicense;

    // 驾驶证影像件ID，当帐户类型为ACCOUNT_BANK_NO且签约方sign_did类型为个人时必填
    /**
     * @var string
     */
    public $drivingLicenseFileId;

    // 集团平台did
    /**
     * @var string
     */
    public $groupPlatformDid;

    // 法定代表人名称，签约方sign_did类型为企业时必填
    /**
     * @var string
     */
    public $legalName;

    // 产品id
    /**
     * @var string
     */
    public $productId;

    // 签约方did
    /**
     * @var string
     */
    public $signDid;

    // 行驶证号码，当帐户类型为ACCOUNT_BANK_NO且签约方sign_did类型为个人时必填
    /**
     * @var string
     */
    public $vehicleLicense;

    // 行驶证影像件ID，当帐户类型为ACCOUNT_BANK_NO且签约方sign_did类型为个人时必填
    /**
     * @var string
     */
    public $vehicleLicenseFileId;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'accountId'            => 'account_id',
        'accountType'          => 'account_type',
        'bankCnaps'            => 'bank_cnaps',
        'bankName'             => 'bank_name',
        'callbackUrl'          => 'callback_url',
        'drivingLicense'       => 'driving_license',
        'drivingLicenseFileId' => 'driving_license_file_id',
        'groupPlatformDid'     => 'group_platform_did',
        'legalName'            => 'legal_name',
        'productId'            => 'product_id',
        'signDid'              => 'sign_did',
        'vehicleLicense'       => 'vehicle_license',
        'vehicleLicenseFileId' => 'vehicle_license_file_id',
    ];

    public function validate()
    {
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('accountType', $this->accountType, true);
        Model::validateRequired('callbackUrl', $this->callbackUrl, true);
        Model::validateRequired('groupPlatformDid', $this->groupPlatformDid, true);
        Model::validateRequired('productId', $this->productId, true);
        Model::validateRequired('signDid', $this->signDid, true);
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
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->accountType) {
            $res['account_type'] = $this->accountType;
        }
        if (null !== $this->bankCnaps) {
            $res['bank_cnaps'] = $this->bankCnaps;
        }
        if (null !== $this->bankName) {
            $res['bank_name'] = $this->bankName;
        }
        if (null !== $this->callbackUrl) {
            $res['callback_url'] = $this->callbackUrl;
        }
        if (null !== $this->drivingLicense) {
            $res['driving_license'] = $this->drivingLicense;
        }
        if (null !== $this->drivingLicenseFileId) {
            $res['driving_license_file_id'] = $this->drivingLicenseFileId;
        }
        if (null !== $this->groupPlatformDid) {
            $res['group_platform_did'] = $this->groupPlatformDid;
        }
        if (null !== $this->legalName) {
            $res['legal_name'] = $this->legalName;
        }
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }
        if (null !== $this->signDid) {
            $res['sign_did'] = $this->signDid;
        }
        if (null !== $this->vehicleLicense) {
            $res['vehicle_license'] = $this->vehicleLicense;
        }
        if (null !== $this->vehicleLicenseFileId) {
            $res['vehicle_license_file_id'] = $this->vehicleLicenseFileId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateCreditCommonsignRequest
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
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['account_type'])) {
            $model->accountType = $map['account_type'];
        }
        if (isset($map['bank_cnaps'])) {
            $model->bankCnaps = $map['bank_cnaps'];
        }
        if (isset($map['bank_name'])) {
            $model->bankName = $map['bank_name'];
        }
        if (isset($map['callback_url'])) {
            $model->callbackUrl = $map['callback_url'];
        }
        if (isset($map['driving_license'])) {
            $model->drivingLicense = $map['driving_license'];
        }
        if (isset($map['driving_license_file_id'])) {
            $model->drivingLicenseFileId = $map['driving_license_file_id'];
        }
        if (isset($map['group_platform_did'])) {
            $model->groupPlatformDid = $map['group_platform_did'];
        }
        if (isset($map['legal_name'])) {
            $model->legalName = $map['legal_name'];
        }
        if (isset($map['product_id'])) {
            $model->productId = $map['product_id'];
        }
        if (isset($map['sign_did'])) {
            $model->signDid = $map['sign_did'];
        }
        if (isset($map['vehicle_license'])) {
            $model->vehicleLicense = $map['vehicle_license'];
        }
        if (isset($map['vehicle_license_file_id'])) {
            $model->vehicleLicenseFileId = $map['vehicle_license_file_id'];
        }

        return $model;
    }
}
