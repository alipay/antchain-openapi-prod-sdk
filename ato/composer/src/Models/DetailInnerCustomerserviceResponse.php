<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class DetailInnerCustomerserviceResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 公司社会统一信息代码
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

    // 服务商名称
    /**
     * @var string
     */
    public $serviceProviderName;

    // 客诉处理员支付宝绑定手机号
    /**
     * @var string
     */
    public $alipayBindMobile;

    // 客诉处理员支付宝账号
    /**
     * @var string
     */
    public $alipayLogonId;

    // 客服电话
    /**
     * @var string
     */
    public $customerServicePhone;

    // 客服人员名称
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
    protected $_name = [
        'reqMsgId'                => 'req_msg_id',
        'resultCode'              => 'result_code',
        'resultMsg'               => 'result_msg',
        'merchantId'              => 'merchant_id',
        'merchantName'            => 'merchant_name',
        'processType'             => 'process_type',
        'serviceProviderName'     => 'service_provider_name',
        'alipayBindMobile'        => 'alipay_bind_mobile',
        'alipayLogonId'           => 'alipay_logon_id',
        'customerServicePhone'    => 'customer_service_phone',
        'customerServiceName'     => 'customer_service_name',
        'onlineSupportSiteUrl'    => 'online_support_site_url',
        'customerComplaintIssues' => 'customer_complaint_issues',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
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
        if (null !== $this->alipayBindMobile) {
            $res['alipay_bind_mobile'] = $this->alipayBindMobile;
        }
        if (null !== $this->alipayLogonId) {
            $res['alipay_logon_id'] = $this->alipayLogonId;
        }
        if (null !== $this->customerServicePhone) {
            $res['customer_service_phone'] = $this->customerServicePhone;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DetailInnerCustomerserviceResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
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
        if (isset($map['alipay_bind_mobile'])) {
            $model->alipayBindMobile = $map['alipay_bind_mobile'];
        }
        if (isset($map['alipay_logon_id'])) {
            $model->alipayLogonId = $map['alipay_logon_id'];
        }
        if (isset($map['customer_service_phone'])) {
            $model->customerServicePhone = $map['customer_service_phone'];
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

        return $model;
    }
}
