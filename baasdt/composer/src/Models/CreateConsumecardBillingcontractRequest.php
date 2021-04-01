<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class CreateConsumecardBillingcontractRequest extends Model
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

    // 基础请求结构
    /**
     * @var BaseRequest
     */
    public $baseRequest;

    // 购买数字商品服务平台的租户ID
    /**
     * @var string
     */
    public $platformTenantId;

    // 认证平台ID 本期支付宝用户ID
    /**
     * @var string
     */
    public $certificationId;

    // 企业名称 企业营业执照名称
    /**
     * @var string
     */
    public $companyName;

    // 企业简称 默认企业营业执照名称，可自定义
    /**
     * @var string
     */
    public $companyShortName;

    // 身份信息 金融机构/非金融机构
    /**
     * @var string
     */
    public $identity;

    // 统一信用社会代码
    /**
     * @var string
     */
    public $usci;

    // 客户编号（业务系统） 平台业务系统IP
    /**
     * @var string
     */
    public $userId;

    // 营业执照地址
    /**
     * @var string
     */
    public $address;

    // 说明商家收款原因-字数中文500字以内（例如ETC服务,加油卡服务）
    /**
     * @var string
     */
    public $serviceContent;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseRequest'       => 'base_request',
        'platformTenantId'  => 'platform_tenant_id',
        'certificationId'   => 'certification_id',
        'companyName'       => 'company_name',
        'companyShortName'  => 'company_short_name',
        'identity'          => 'identity',
        'usci'              => 'usci',
        'userId'            => 'user_id',
        'address'           => 'address',
        'serviceContent'    => 'service_content',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('platformTenantId', $this->platformTenantId, true);
        Model::validateRequired('certificationId', $this->certificationId, true);
        Model::validateRequired('companyName', $this->companyName, true);
        Model::validateRequired('companyShortName', $this->companyShortName, true);
        Model::validateRequired('identity', $this->identity, true);
        Model::validateRequired('usci', $this->usci, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('address', $this->address, true);
        Model::validateRequired('serviceContent', $this->serviceContent, true);
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
        if (null !== $this->baseRequest) {
            $res['base_request'] = null !== $this->baseRequest ? $this->baseRequest->toMap() : null;
        }
        if (null !== $this->platformTenantId) {
            $res['platform_tenant_id'] = $this->platformTenantId;
        }
        if (null !== $this->certificationId) {
            $res['certification_id'] = $this->certificationId;
        }
        if (null !== $this->companyName) {
            $res['company_name'] = $this->companyName;
        }
        if (null !== $this->companyShortName) {
            $res['company_short_name'] = $this->companyShortName;
        }
        if (null !== $this->identity) {
            $res['identity'] = $this->identity;
        }
        if (null !== $this->usci) {
            $res['usci'] = $this->usci;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->serviceContent) {
            $res['service_content'] = $this->serviceContent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateConsumecardBillingcontractRequest
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
        if (isset($map['base_request'])) {
            $model->baseRequest = BaseRequest::fromMap($map['base_request']);
        }
        if (isset($map['platform_tenant_id'])) {
            $model->platformTenantId = $map['platform_tenant_id'];
        }
        if (isset($map['certification_id'])) {
            $model->certificationId = $map['certification_id'];
        }
        if (isset($map['company_name'])) {
            $model->companyName = $map['company_name'];
        }
        if (isset($map['company_short_name'])) {
            $model->companyShortName = $map['company_short_name'];
        }
        if (isset($map['identity'])) {
            $model->identity = $map['identity'];
        }
        if (isset($map['usci'])) {
            $model->usci = $map['usci'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['service_content'])) {
            $model->serviceContent = $map['service_content'];
        }

        return $model;
    }
}
