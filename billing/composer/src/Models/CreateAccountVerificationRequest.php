<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BILLING\Models;

use AlibabaCloud\Tea\Model;

class CreateAccountVerificationRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 出账验证主键id
    /**
     * @var int
     */
    public $id;

    // 计量域code
    /**
     * @var string
     */
    public $domainCode;

    // 计量域名称
    /**
     * @var string
     */
    public $domainName;

    // 计量域版本
    /**
     * @var string
     */
    public $domainVersion;

    // 业务产品code
    /**
     * @var string
     */
    public $productCode;

    // 业务产品名称
    /**
     * @var string
     */
    public $productName;

    // 渠道产品code
    /**
     * @var string
     */
    public $serviceCode;

    // 渠道产品名称
    /**
     * @var string
     */
    public $serviceName;

    // 商品code
    /**
     * @var string
     */
    public $offerCode;

    // 商品名称
    /**
     * @var string
     */
    public $offerName;

    // 验证的计量数据
    /**
     * @var string
     */
    public $omsData;

    // 计量数据业务幂等号
    /**
     * @var string
     */
    public $omsBizNo;

    // 缓存报文
    /**
     * @var string
     */
    public $verificationCache;

    // 缓存链接
    /**
     * @var string
     */
    public $verificationUrl;

    // 审批流id
    /**
     * @var string
     */
    public $bpmsId;

    // 配置报文
    /**
     * @var string
     */
    public $configData;

    // 状态
    /**
     * @var string
     */
    public $status;

    // 创建人
    /**
     * @var string
     */
    public $creator;

    // 修改人
    /**
     * @var string
     */
    public $modifor;
    protected $_name = [
        'authToken'         => 'auth_token',
        'id'                => 'id',
        'domainCode'        => 'domain_code',
        'domainName'        => 'domain_name',
        'domainVersion'     => 'domain_version',
        'productCode'       => 'product_code',
        'productName'       => 'product_name',
        'serviceCode'       => 'service_code',
        'serviceName'       => 'service_name',
        'offerCode'         => 'offer_code',
        'offerName'         => 'offer_name',
        'omsData'           => 'oms_data',
        'omsBizNo'          => 'oms_biz_no',
        'verificationCache' => 'verification_cache',
        'verificationUrl'   => 'verification_url',
        'bpmsId'            => 'bpms_id',
        'configData'        => 'config_data',
        'status'            => 'status',
        'creator'           => 'creator',
        'modifor'           => 'modifor',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('domainCode', $this->domainCode, true);
        Model::validateRequired('domainName', $this->domainName, true);
        Model::validateRequired('domainVersion', $this->domainVersion, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('productName', $this->productName, true);
        Model::validateRequired('serviceCode', $this->serviceCode, true);
        Model::validateRequired('serviceName', $this->serviceName, true);
        Model::validateRequired('offerCode', $this->offerCode, true);
        Model::validateRequired('offerName', $this->offerName, true);
        Model::validateRequired('omsData', $this->omsData, true);
        Model::validateRequired('omsBizNo', $this->omsBizNo, true);
        Model::validateRequired('verificationCache', $this->verificationCache, true);
        Model::validateRequired('verificationUrl', $this->verificationUrl, true);
        Model::validateRequired('bpmsId', $this->bpmsId, true);
        Model::validateRequired('configData', $this->configData, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('creator', $this->creator, true);
        Model::validateRequired('modifor', $this->modifor, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->domainCode) {
            $res['domain_code'] = $this->domainCode;
        }
        if (null !== $this->domainName) {
            $res['domain_name'] = $this->domainName;
        }
        if (null !== $this->domainVersion) {
            $res['domain_version'] = $this->domainVersion;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->serviceCode) {
            $res['service_code'] = $this->serviceCode;
        }
        if (null !== $this->serviceName) {
            $res['service_name'] = $this->serviceName;
        }
        if (null !== $this->offerCode) {
            $res['offer_code'] = $this->offerCode;
        }
        if (null !== $this->offerName) {
            $res['offer_name'] = $this->offerName;
        }
        if (null !== $this->omsData) {
            $res['oms_data'] = $this->omsData;
        }
        if (null !== $this->omsBizNo) {
            $res['oms_biz_no'] = $this->omsBizNo;
        }
        if (null !== $this->verificationCache) {
            $res['verification_cache'] = $this->verificationCache;
        }
        if (null !== $this->verificationUrl) {
            $res['verification_url'] = $this->verificationUrl;
        }
        if (null !== $this->bpmsId) {
            $res['bpms_id'] = $this->bpmsId;
        }
        if (null !== $this->configData) {
            $res['config_data'] = $this->configData;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->creator) {
            $res['creator'] = $this->creator;
        }
        if (null !== $this->modifor) {
            $res['modifor'] = $this->modifor;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAccountVerificationRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['domain_code'])) {
            $model->domainCode = $map['domain_code'];
        }
        if (isset($map['domain_name'])) {
            $model->domainName = $map['domain_name'];
        }
        if (isset($map['domain_version'])) {
            $model->domainVersion = $map['domain_version'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['product_name'])) {
            $model->productName = $map['product_name'];
        }
        if (isset($map['service_code'])) {
            $model->serviceCode = $map['service_code'];
        }
        if (isset($map['service_name'])) {
            $model->serviceName = $map['service_name'];
        }
        if (isset($map['offer_code'])) {
            $model->offerCode = $map['offer_code'];
        }
        if (isset($map['offer_name'])) {
            $model->offerName = $map['offer_name'];
        }
        if (isset($map['oms_data'])) {
            $model->omsData = $map['oms_data'];
        }
        if (isset($map['oms_biz_no'])) {
            $model->omsBizNo = $map['oms_biz_no'];
        }
        if (isset($map['verification_cache'])) {
            $model->verificationCache = $map['verification_cache'];
        }
        if (isset($map['verification_url'])) {
            $model->verificationUrl = $map['verification_url'];
        }
        if (isset($map['bpms_id'])) {
            $model->bpmsId = $map['bpms_id'];
        }
        if (isset($map['config_data'])) {
            $model->configData = $map['config_data'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['creator'])) {
            $model->creator = $map['creator'];
        }
        if (isset($map['modifor'])) {
            $model->modifor = $map['modifor'];
        }

        return $model;
    }
}
