<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateLeasePromiseRequest extends Model
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

    // 融资租赁业务id，由资方控制台生成返回
    /**
     * @var string
     */
    public $applicationId;

    // 审核方式,0为系统自动审核，1为人工审核
    /**
     * @var int
     */
    public $auditMode;

    // 清分机构金融科技租户ID
    /**
     * @var string
     */
    public $clearingOrg;

    // 放款机构金融科技租户ID
    /**
     * @var string
     */
    public $creditOrg;

    // 第一次还款时的日期
    /**
     * @var string
     */
    public $firstPayDate;

    // 融资机构的阿里uid
    /**
     * @var string
     */
    public $leaseAlipayUid;

    // 宽限期，精确到毫秒
    /**
     * @var int
     */
    public $limit;

    // 订单id 长度不可超过50
    /**
     * @var string
     */
    public $orderId;

    // 应付租金，精确到毫厘，即123400表示12.34元
    /**
     * @var string[]
     */
    public $payDateList;

    // 租赁方承诺额外字段
    /**
     * @var string[]
     */
    public $payExtraInfoList;

    // 应付租金 精确到毫厘，即123400表示12.34元
    //
    /**
     * @var int
     */
    public $payMoney;

    // 应付租金 精确到毫厘，即123400表示12.34元
    /**
     * @var int[]
     */
    public $payMoneyList;

    // 应付租金的期数
    /**
     * @var int
     */
    public $payPeriod;

    // 是否启动异步订单处理
    /**
     * @var int
     */
    public $async;

    // 首付款代扣流水号，最大长度是128
    /**
     * @var string
     */
    public $downPaymentSerialNumber;
    protected $_name = [
        'authToken'               => 'auth_token',
        'productInstanceId'       => 'product_instance_id',
        'applicationId'           => 'application_id',
        'auditMode'               => 'audit_mode',
        'clearingOrg'             => 'clearing_org',
        'creditOrg'               => 'credit_org',
        'firstPayDate'            => 'first_pay_date',
        'leaseAlipayUid'          => 'lease_alipay_uid',
        'limit'                   => 'limit',
        'orderId'                 => 'order_id',
        'payDateList'             => 'pay_date_list',
        'payExtraInfoList'        => 'pay_extra_info_list',
        'payMoney'                => 'pay_money',
        'payMoneyList'            => 'pay_money_list',
        'payPeriod'               => 'pay_period',
        'async'                   => 'async',
        'downPaymentSerialNumber' => 'down_payment_serial_number',
    ];

    public function validate()
    {
        Model::validateRequired('auditMode', $this->auditMode, true);
        Model::validateRequired('clearingOrg', $this->clearingOrg, true);
        Model::validateRequired('creditOrg', $this->creditOrg, true);
        Model::validateRequired('leaseAlipayUid', $this->leaseAlipayUid, true);
        Model::validateRequired('limit', $this->limit, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('payDateList', $this->payDateList, true);
        Model::validateRequired('payMoneyList', $this->payMoneyList, true);
        Model::validateRequired('payPeriod', $this->payPeriod, true);
        Model::validateMaxLength('downPaymentSerialNumber', $this->downPaymentSerialNumber, 128);
        Model::validateMinLength('downPaymentSerialNumber', $this->downPaymentSerialNumber, 0);
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
        if (null !== $this->applicationId) {
            $res['application_id'] = $this->applicationId;
        }
        if (null !== $this->auditMode) {
            $res['audit_mode'] = $this->auditMode;
        }
        if (null !== $this->clearingOrg) {
            $res['clearing_org'] = $this->clearingOrg;
        }
        if (null !== $this->creditOrg) {
            $res['credit_org'] = $this->creditOrg;
        }
        if (null !== $this->firstPayDate) {
            $res['first_pay_date'] = $this->firstPayDate;
        }
        if (null !== $this->leaseAlipayUid) {
            $res['lease_alipay_uid'] = $this->leaseAlipayUid;
        }
        if (null !== $this->limit) {
            $res['limit'] = $this->limit;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->payDateList) {
            $res['pay_date_list'] = $this->payDateList;
        }
        if (null !== $this->payExtraInfoList) {
            $res['pay_extra_info_list'] = $this->payExtraInfoList;
        }
        if (null !== $this->payMoney) {
            $res['pay_money'] = $this->payMoney;
        }
        if (null !== $this->payMoneyList) {
            $res['pay_money_list'] = $this->payMoneyList;
        }
        if (null !== $this->payPeriod) {
            $res['pay_period'] = $this->payPeriod;
        }
        if (null !== $this->async) {
            $res['async'] = $this->async;
        }
        if (null !== $this->downPaymentSerialNumber) {
            $res['down_payment_serial_number'] = $this->downPaymentSerialNumber;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateLeasePromiseRequest
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
        if (isset($map['application_id'])) {
            $model->applicationId = $map['application_id'];
        }
        if (isset($map['audit_mode'])) {
            $model->auditMode = $map['audit_mode'];
        }
        if (isset($map['clearing_org'])) {
            $model->clearingOrg = $map['clearing_org'];
        }
        if (isset($map['credit_org'])) {
            $model->creditOrg = $map['credit_org'];
        }
        if (isset($map['first_pay_date'])) {
            $model->firstPayDate = $map['first_pay_date'];
        }
        if (isset($map['lease_alipay_uid'])) {
            $model->leaseAlipayUid = $map['lease_alipay_uid'];
        }
        if (isset($map['limit'])) {
            $model->limit = $map['limit'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['pay_date_list'])) {
            if (!empty($map['pay_date_list'])) {
                $model->payDateList = $map['pay_date_list'];
            }
        }
        if (isset($map['pay_extra_info_list'])) {
            if (!empty($map['pay_extra_info_list'])) {
                $model->payExtraInfoList = $map['pay_extra_info_list'];
            }
        }
        if (isset($map['pay_money'])) {
            $model->payMoney = $map['pay_money'];
        }
        if (isset($map['pay_money_list'])) {
            if (!empty($map['pay_money_list'])) {
                $model->payMoneyList = $map['pay_money_list'];
            }
        }
        if (isset($map['pay_period'])) {
            $model->payPeriod = $map['pay_period'];
        }
        if (isset($map['async'])) {
            $model->async = $map['async'];
        }
        if (isset($map['down_payment_serial_number'])) {
            $model->downPaymentSerialNumber = $map['down_payment_serial_number'];
        }

        return $model;
    }
}
