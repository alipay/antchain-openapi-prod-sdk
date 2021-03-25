<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateLeaseCreditpromiseRequest extends Model
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

    // 融资租赁业务id，由资方控制台创建返回
    /**
     * @var string
     */
    public $applicationId;

    // 融资租赁承诺额外字段
    /**
     * @var string[]
     */
    public $creditPromiseExtraInfoList;

    // 租赁平台金融科技id
    /**
     * @var string
     */
    public $leaseId;

    // 订单id 长度不可超过50
    /**
     * @var string
     */
    public $orderId;

    // 垫付金额
    /**
     * @var int
     */
    public $payInAdvanceMoney;

    // 垫付金额，精确到毫厘，即123400表示12.34元
    /**
     * @var int[]
     */
    public $payInAdvanceMoneyList;

    // 垫付日期
    /**
     * @var string
     */
    public $payInAdvanceTime;

    // 垫付日  格式为2019-8-31 12:00:00
    /**
     * @var string[]
     */
    public $payInAdvanceTimeList;

    // 根据融资租赁合同及其补充协议哈希
    /**
     * @var string
     */
    public $promiseHash;

    // 根据融资租赁合同及其补充协议存证交易hash
    /**
     * @var string
     */
    public $promiseTxHash;

    // 归还金额
    /**
     * @var int
     */
    public $returnMoney;

    // 还款金额，精确到毫厘，即123400表示12.34元
    /**
     * @var int[]
     */
    public $returnMoneyList;

    // 还款比例，精确到小数点后四位 12.34% 表示为1234
    /**
     * @var int
     */
    public $returnRate;

    // 归还日，格式为"2019-07-31 12:00:00"
    /**
     * @var string
     */
    public $returnTime;

    // 归还日，格式为"2019-07-31 12:00:00"
    /**
     * @var string[]
     */
    public $returnTimeList;

    // 是否启动异步订单处理
    /**
     * @var int
     */
    public $async;
    protected $_name = [
        'authToken'                  => 'auth_token',
        'productInstanceId'          => 'product_instance_id',
        'applicationId'              => 'application_id',
        'creditPromiseExtraInfoList' => 'credit_promise_extra_info_list',
        'leaseId'                    => 'lease_id',
        'orderId'                    => 'order_id',
        'payInAdvanceMoney'          => 'pay_in_advance_money',
        'payInAdvanceMoneyList'      => 'pay_in_advance_money_list',
        'payInAdvanceTime'           => 'pay_in_advance_time',
        'payInAdvanceTimeList'       => 'pay_in_advance_time_list',
        'promiseHash'                => 'promise_hash',
        'promiseTxHash'              => 'promise_tx_hash',
        'returnMoney'                => 'return_money',
        'returnMoneyList'            => 'return_money_list',
        'returnRate'                 => 'return_rate',
        'returnTime'                 => 'return_time',
        'returnTimeList'             => 'return_time_list',
        'async'                      => 'async',
    ];

    public function validate()
    {
        Model::validateRequired('leaseId', $this->leaseId, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('payInAdvanceTimeList', $this->payInAdvanceTimeList, true);
        Model::validateRequired('promiseHash', $this->promiseHash, true);
        Model::validateRequired('promiseTxHash', $this->promiseTxHash, true);
        Model::validateRequired('returnMoneyList', $this->returnMoneyList, true);
        Model::validateRequired('returnTimeList', $this->returnTimeList, true);
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
        if (null !== $this->creditPromiseExtraInfoList) {
            $res['credit_promise_extra_info_list'] = $this->creditPromiseExtraInfoList;
        }
        if (null !== $this->leaseId) {
            $res['lease_id'] = $this->leaseId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->payInAdvanceMoney) {
            $res['pay_in_advance_money'] = $this->payInAdvanceMoney;
        }
        if (null !== $this->payInAdvanceMoneyList) {
            $res['pay_in_advance_money_list'] = $this->payInAdvanceMoneyList;
        }
        if (null !== $this->payInAdvanceTime) {
            $res['pay_in_advance_time'] = $this->payInAdvanceTime;
        }
        if (null !== $this->payInAdvanceTimeList) {
            $res['pay_in_advance_time_list'] = $this->payInAdvanceTimeList;
        }
        if (null !== $this->promiseHash) {
            $res['promise_hash'] = $this->promiseHash;
        }
        if (null !== $this->promiseTxHash) {
            $res['promise_tx_hash'] = $this->promiseTxHash;
        }
        if (null !== $this->returnMoney) {
            $res['return_money'] = $this->returnMoney;
        }
        if (null !== $this->returnMoneyList) {
            $res['return_money_list'] = $this->returnMoneyList;
        }
        if (null !== $this->returnRate) {
            $res['return_rate'] = $this->returnRate;
        }
        if (null !== $this->returnTime) {
            $res['return_time'] = $this->returnTime;
        }
        if (null !== $this->returnTimeList) {
            $res['return_time_list'] = $this->returnTimeList;
        }
        if (null !== $this->async) {
            $res['async'] = $this->async;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateLeaseCreditpromiseRequest
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
        if (isset($map['credit_promise_extra_info_list'])) {
            if (!empty($map['credit_promise_extra_info_list'])) {
                $model->creditPromiseExtraInfoList = $map['credit_promise_extra_info_list'];
            }
        }
        if (isset($map['lease_id'])) {
            $model->leaseId = $map['lease_id'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['pay_in_advance_money'])) {
            $model->payInAdvanceMoney = $map['pay_in_advance_money'];
        }
        if (isset($map['pay_in_advance_money_list'])) {
            if (!empty($map['pay_in_advance_money_list'])) {
                $model->payInAdvanceMoneyList = $map['pay_in_advance_money_list'];
            }
        }
        if (isset($map['pay_in_advance_time'])) {
            $model->payInAdvanceTime = $map['pay_in_advance_time'];
        }
        if (isset($map['pay_in_advance_time_list'])) {
            if (!empty($map['pay_in_advance_time_list'])) {
                $model->payInAdvanceTimeList = $map['pay_in_advance_time_list'];
            }
        }
        if (isset($map['promise_hash'])) {
            $model->promiseHash = $map['promise_hash'];
        }
        if (isset($map['promise_tx_hash'])) {
            $model->promiseTxHash = $map['promise_tx_hash'];
        }
        if (isset($map['return_money'])) {
            $model->returnMoney = $map['return_money'];
        }
        if (isset($map['return_money_list'])) {
            if (!empty($map['return_money_list'])) {
                $model->returnMoneyList = $map['return_money_list'];
            }
        }
        if (isset($map['return_rate'])) {
            $model->returnRate = $map['return_rate'];
        }
        if (isset($map['return_time'])) {
            $model->returnTime = $map['return_time'];
        }
        if (isset($map['return_time_list'])) {
            if (!empty($map['return_time_list'])) {
                $model->returnTimeList = $map['return_time_list'];
            }
        }
        if (isset($map['async'])) {
            $model->async = $map['async'];
        }

        return $model;
    }
}
