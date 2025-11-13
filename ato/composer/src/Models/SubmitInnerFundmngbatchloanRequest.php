<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class SubmitInnerFundmngbatchloanRequest extends Model
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

    // 资方租户id
    /**
     * @var string
     */
    public $fundTenantId;

    // 商家代偿开始天数
    /**
     * @var int
     */
    public $merchantCompensateStartDay;

    // 分账支付宝账号uid
    /**
     * @var string
     */
    public $divideAlipayUserId;

    // 分账支付宝登录账号
    /**
     * @var string
     */
    public $divideAlipayLoginId;

    // 代偿支付宝账号uid
    /**
     * @var string
     */
    public $compensateAlipayUserId;

    // 代偿支付宝登录账号
    /**
     * @var string
     */
    public $compensateAlipayLoginId;

    // 融资模式
    // 供应链金融:SUPPLY_CHAIN_FINANCE;
    // 自定义还款:DEFAULT
    /**
     * @var string
     */
    public $fundMode;

    // 批量放款文件
    /**
     * @var FileInfo
     */
    public $fileInfo;

    // 页面调用traceid
    /**
     * @var string
     */
    public $traceId;

    // 付费角色
    // MERCHANT ：商户
    // FINANCIER： 资方
    /**
     * @var string
     */
    public $paidRole;

    // 付费方社会统一信用代码
    /**
     * @var string
     */
    public $paidCompanyId;

    // 放款渠道
    // BANK :银行
    // ALIPAY : 支付宝
    /**
     * @var string
     */
    public $loanChannel;
    protected $_name = [
        'authToken'                  => 'auth_token',
        'productInstanceId'          => 'product_instance_id',
        'fundTenantId'               => 'fund_tenant_id',
        'merchantCompensateStartDay' => 'merchant_compensate_start_day',
        'divideAlipayUserId'         => 'divide_alipay_user_id',
        'divideAlipayLoginId'        => 'divide_alipay_login_id',
        'compensateAlipayUserId'     => 'compensate_alipay_user_id',
        'compensateAlipayLoginId'    => 'compensate_alipay_login_id',
        'fundMode'                   => 'fund_mode',
        'fileInfo'                   => 'file_info',
        'traceId'                    => 'trace_id',
        'paidRole'                   => 'paid_role',
        'paidCompanyId'              => 'paid_company_id',
        'loanChannel'                => 'loan_channel',
    ];

    public function validate()
    {
        Model::validateRequired('fundTenantId', $this->fundTenantId, true);
        Model::validateRequired('divideAlipayUserId', $this->divideAlipayUserId, true);
        Model::validateRequired('divideAlipayLoginId', $this->divideAlipayLoginId, true);
        Model::validateRequired('compensateAlipayUserId', $this->compensateAlipayUserId, true);
        Model::validateRequired('compensateAlipayLoginId', $this->compensateAlipayLoginId, true);
        Model::validateRequired('fundMode', $this->fundMode, true);
        Model::validateRequired('fileInfo', $this->fileInfo, true);
        Model::validateRequired('traceId', $this->traceId, true);
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
        if (null !== $this->fundTenantId) {
            $res['fund_tenant_id'] = $this->fundTenantId;
        }
        if (null !== $this->merchantCompensateStartDay) {
            $res['merchant_compensate_start_day'] = $this->merchantCompensateStartDay;
        }
        if (null !== $this->divideAlipayUserId) {
            $res['divide_alipay_user_id'] = $this->divideAlipayUserId;
        }
        if (null !== $this->divideAlipayLoginId) {
            $res['divide_alipay_login_id'] = $this->divideAlipayLoginId;
        }
        if (null !== $this->compensateAlipayUserId) {
            $res['compensate_alipay_user_id'] = $this->compensateAlipayUserId;
        }
        if (null !== $this->compensateAlipayLoginId) {
            $res['compensate_alipay_login_id'] = $this->compensateAlipayLoginId;
        }
        if (null !== $this->fundMode) {
            $res['fund_mode'] = $this->fundMode;
        }
        if (null !== $this->fileInfo) {
            $res['file_info'] = null !== $this->fileInfo ? $this->fileInfo->toMap() : null;
        }
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }
        if (null !== $this->paidRole) {
            $res['paid_role'] = $this->paidRole;
        }
        if (null !== $this->paidCompanyId) {
            $res['paid_company_id'] = $this->paidCompanyId;
        }
        if (null !== $this->loanChannel) {
            $res['loan_channel'] = $this->loanChannel;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitInnerFundmngbatchloanRequest
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
        if (isset($map['fund_tenant_id'])) {
            $model->fundTenantId = $map['fund_tenant_id'];
        }
        if (isset($map['merchant_compensate_start_day'])) {
            $model->merchantCompensateStartDay = $map['merchant_compensate_start_day'];
        }
        if (isset($map['divide_alipay_user_id'])) {
            $model->divideAlipayUserId = $map['divide_alipay_user_id'];
        }
        if (isset($map['divide_alipay_login_id'])) {
            $model->divideAlipayLoginId = $map['divide_alipay_login_id'];
        }
        if (isset($map['compensate_alipay_user_id'])) {
            $model->compensateAlipayUserId = $map['compensate_alipay_user_id'];
        }
        if (isset($map['compensate_alipay_login_id'])) {
            $model->compensateAlipayLoginId = $map['compensate_alipay_login_id'];
        }
        if (isset($map['fund_mode'])) {
            $model->fundMode = $map['fund_mode'];
        }
        if (isset($map['file_info'])) {
            $model->fileInfo = FileInfo::fromMap($map['file_info']);
        }
        if (isset($map['trace_id'])) {
            $model->traceId = $map['trace_id'];
        }
        if (isset($map['paid_role'])) {
            $model->paidRole = $map['paid_role'];
        }
        if (isset($map['paid_company_id'])) {
            $model->paidCompanyId = $map['paid_company_id'];
        }
        if (isset($map['loan_channel'])) {
            $model->loanChannel = $map['loan_channel'];
        }

        return $model;
    }
}
