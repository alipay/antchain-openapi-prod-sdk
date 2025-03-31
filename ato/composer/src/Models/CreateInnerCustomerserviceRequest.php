<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class CreateInnerCustomerserviceRequest extends Model
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

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 公司社会统一信息代码,间联模式必传
    /**
     * @var string
     */
    public $merchantId;

    // 公司名称
    /**
     * @var string
     */
    public $merchantName;

    // 处理类型:
    // MERCHANT_PROCESS("MERCHANT_PROCESS", "商家处理"),
    // PROXY_PROCESS("PROXY_PROCESS", "服务商代处理"),
    /**
     * @var string
     */
    public $processType;

    // 服务商名称（已废弃）
    /**
     * @var string
     */
    public $serviceProviderName;

    // 客服电话
    /**
     * @var string
     */
    public $customerServicePhone;

    // 客诉处理员支付宝绑定手机号（已废弃）
    /**
     * @var string
     */
    public $alipayBindMobile;

    // 客诉处理员支付宝账号（已废弃）
    /**
     * @var string
     */
    public $alipayLogonId;

    // 客服人员名称（已废弃）
    /**
     * @var string
     */
    public $customerServiceName;

    // 在线客服网址
    /**
     * @var string
     */
    public $onlineSupportSiteUrl;

    // 投诉问题
    /**
     * @var string
     */
    public $customerComplaintIssues;

    // 客诉人员信息，直连必填
    /**
     * @var CustomerPersonInfo[]
     */
    public $customerPersonInfoList;

    // 进件类型
    // DIRECT("DIRECT", "直连进件模式"),
    // AGENT("AGENT", "代理商进件模式"),
    /**
     * @var string
     */
    public $expandMode;
    protected $_name = [
        'authToken'               => 'auth_token',
        'productInstanceId'       => 'product_instance_id',
        'tenantId'                => 'tenant_id',
        'merchantId'              => 'merchant_id',
        'merchantName'            => 'merchant_name',
        'processType'             => 'process_type',
        'serviceProviderName'     => 'service_provider_name',
        'customerServicePhone'    => 'customer_service_phone',
        'alipayBindMobile'        => 'alipay_bind_mobile',
        'alipayLogonId'           => 'alipay_logon_id',
        'customerServiceName'     => 'customer_service_name',
        'onlineSupportSiteUrl'    => 'online_support_site_url',
        'customerComplaintIssues' => 'customer_complaint_issues',
        'customerPersonInfoList'  => 'customer_person_info_list',
        'expandMode'              => 'expand_mode',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('processType', $this->processType, true);
        Model::validateRequired('customerServicePhone', $this->customerServicePhone, true);
        Model::validateRequired('expandMode', $this->expandMode, true);
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
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->merchantName) {
            $res['merchant_name'] = $this->merchantName;
        }
        if (null !== $this->processType) {
            $res['process_type'] = $this->processType;
        }
        if (null !== $this->serviceProviderName) {
            $res['service_provider_name'] = $this->serviceProviderName;
        }
        if (null !== $this->customerServicePhone) {
            $res['customer_service_phone'] = $this->customerServicePhone;
        }
        if (null !== $this->alipayBindMobile) {
            $res['alipay_bind_mobile'] = $this->alipayBindMobile;
        }
        if (null !== $this->alipayLogonId) {
            $res['alipay_logon_id'] = $this->alipayLogonId;
        }
        if (null !== $this->customerServiceName) {
            $res['customer_service_name'] = $this->customerServiceName;
        }
        if (null !== $this->onlineSupportSiteUrl) {
            $res['online_support_site_url'] = $this->onlineSupportSiteUrl;
        }
        if (null !== $this->customerComplaintIssues) {
            $res['customer_complaint_issues'] = $this->customerComplaintIssues;
        }
        if (null !== $this->customerPersonInfoList) {
            $res['customer_person_info_list'] = [];
            if (null !== $this->customerPersonInfoList && \is_array($this->customerPersonInfoList)) {
                $n = 0;
                foreach ($this->customerPersonInfoList as $item) {
                    $res['customer_person_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->expandMode) {
            $res['expand_mode'] = $this->expandMode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateInnerCustomerserviceRequest
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
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['merchant_name'])) {
            $model->merchantName = $map['merchant_name'];
        }
        if (isset($map['process_type'])) {
            $model->processType = $map['process_type'];
        }
        if (isset($map['service_provider_name'])) {
            $model->serviceProviderName = $map['service_provider_name'];
        }
        if (isset($map['customer_service_phone'])) {
            $model->customerServicePhone = $map['customer_service_phone'];
        }
        if (isset($map['alipay_bind_mobile'])) {
            $model->alipayBindMobile = $map['alipay_bind_mobile'];
        }
        if (isset($map['alipay_logon_id'])) {
            $model->alipayLogonId = $map['alipay_logon_id'];
        }
        if (isset($map['customer_service_name'])) {
            $model->customerServiceName = $map['customer_service_name'];
        }
        if (isset($map['online_support_site_url'])) {
            $model->onlineSupportSiteUrl = $map['online_support_site_url'];
        }
        if (isset($map['customer_complaint_issues'])) {
            $model->customerComplaintIssues = $map['customer_complaint_issues'];
        }
        if (isset($map['customer_person_info_list'])) {
            if (!empty($map['customer_person_info_list'])) {
                $model->customerPersonInfoList = [];
                $n                             = 0;
                foreach ($map['customer_person_info_list'] as $item) {
                    $model->customerPersonInfoList[$n++] = null !== $item ? CustomerPersonInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['expand_mode'])) {
            $model->expandMode = $map['expand_mode'];
        }

        return $model;
    }
}
