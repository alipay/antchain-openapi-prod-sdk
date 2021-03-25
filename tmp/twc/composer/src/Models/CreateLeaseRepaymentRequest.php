<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateLeaseRepaymentRequest extends Model
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

    // 融资租赁租户还款额外字段
    /**
     * @var string
     */
    public $extraInfo;

    // 是否最终订单还款结束
    /**
     * @var bool
     */
    public $isFinish;

    // 租赁平台商户Id 长度不可超过50
    /**
     * @var string
     */
    public $leaseId;

    // 订单id 长度不可超过50
    //
    /**
     * @var string
     */
    public $orderId;

    // 逾期天数,支用到期日开始计算
    /**
     * @var int
     */
    public $overdueDay;

    // 逾期应还款总额,本金+利息+逾期利息,精确到毫厘，即123400表示12.34元
    /**
     * @var int
     */
    public $overdueMoney;

    // 逾期利率（日利率）,精确到小数点后四位 12.34% 表示为1234
    /**
     * @var int
     */
    public $overdueRate;

    // 逾期状态,暂时都以0处理，目前不处理
    /**
     * @var int
     */
    public $overdueStatus;

    // 剩余应还金额，精确到毫厘，即123400表示12.34元
    /**
     * @var int
     */
    public $remainReturnMoney;

    // 剩余应还期数
    //
    /**
     * @var int
     */
    public $remainReturnTerm;

    // 每次还款流水凭证，需要融资方确认，id一样则不处理
    /**
     * @var string
     */
    public $repaymentUniqueId;

    // 还款结果简要描述,长度不超过256
    /**
     * @var string
     */
    public $returnDescription;

    // 还款批次
    //
    /**
     * @var int
     */
    public $returnIndex;

    // 还款总额,本金+利息，精确到毫厘，即123400表示12.34元
    /**
     * @var int
     */
    public $returnMoney;

    // 还款结果状态,1.成功 2.失败
    /**
     * @var int
     */
    public $returnStatus;

    // 还款日期，格式为"2019-07-31 12:00:00"
    /**
     * @var string
     */
    public $returnTime;

    // 还款来源,1.共管账号，2.网商清分
    /**
     * @var int
     */
    public $source;

    // 逾期后还款状态,1未还款,2已还款
    /**
     * @var int
     */
    public $status;

    // 是否启动订单的异步处理
    /**
     * @var int
     */
    public $async;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'applicationId'     => 'application_id',
        'extraInfo'         => 'extra_info',
        'isFinish'          => 'is_finish',
        'leaseId'           => 'lease_id',
        'orderId'           => 'order_id',
        'overdueDay'        => 'overdue_day',
        'overdueMoney'      => 'overdue_money',
        'overdueRate'       => 'overdue_rate',
        'overdueStatus'     => 'overdue_status',
        'remainReturnMoney' => 'remain_return_money',
        'remainReturnTerm'  => 'remain_return_term',
        'repaymentUniqueId' => 'repayment_unique_id',
        'returnDescription' => 'return_description',
        'returnIndex'       => 'return_index',
        'returnMoney'       => 'return_money',
        'returnStatus'      => 'return_status',
        'returnTime'        => 'return_time',
        'source'            => 'source',
        'status'            => 'status',
        'async'             => 'async',
    ];

    public function validate()
    {
        Model::validateRequired('isFinish', $this->isFinish, true);
        Model::validateRequired('leaseId', $this->leaseId, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('remainReturnMoney', $this->remainReturnMoney, true);
        Model::validateRequired('remainReturnTerm', $this->remainReturnTerm, true);
        Model::validateRequired('repaymentUniqueId', $this->repaymentUniqueId, true);
        Model::validateRequired('returnDescription', $this->returnDescription, true);
        Model::validateRequired('returnIndex', $this->returnIndex, true);
        Model::validateRequired('returnMoney', $this->returnMoney, true);
        Model::validateRequired('returnStatus', $this->returnStatus, true);
        Model::validateRequired('returnTime', $this->returnTime, true);
        Model::validateRequired('source', $this->source, true);
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
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }
        if (null !== $this->isFinish) {
            $res['is_finish'] = $this->isFinish;
        }
        if (null !== $this->leaseId) {
            $res['lease_id'] = $this->leaseId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->overdueDay) {
            $res['overdue_day'] = $this->overdueDay;
        }
        if (null !== $this->overdueMoney) {
            $res['overdue_money'] = $this->overdueMoney;
        }
        if (null !== $this->overdueRate) {
            $res['overdue_rate'] = $this->overdueRate;
        }
        if (null !== $this->overdueStatus) {
            $res['overdue_status'] = $this->overdueStatus;
        }
        if (null !== $this->remainReturnMoney) {
            $res['remain_return_money'] = $this->remainReturnMoney;
        }
        if (null !== $this->remainReturnTerm) {
            $res['remain_return_term'] = $this->remainReturnTerm;
        }
        if (null !== $this->repaymentUniqueId) {
            $res['repayment_unique_id'] = $this->repaymentUniqueId;
        }
        if (null !== $this->returnDescription) {
            $res['return_description'] = $this->returnDescription;
        }
        if (null !== $this->returnIndex) {
            $res['return_index'] = $this->returnIndex;
        }
        if (null !== $this->returnMoney) {
            $res['return_money'] = $this->returnMoney;
        }
        if (null !== $this->returnStatus) {
            $res['return_status'] = $this->returnStatus;
        }
        if (null !== $this->returnTime) {
            $res['return_time'] = $this->returnTime;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->async) {
            $res['async'] = $this->async;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateLeaseRepaymentRequest
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
        if (isset($map['extra_info'])) {
            $model->extraInfo = $map['extra_info'];
        }
        if (isset($map['is_finish'])) {
            $model->isFinish = $map['is_finish'];
        }
        if (isset($map['lease_id'])) {
            $model->leaseId = $map['lease_id'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['overdue_day'])) {
            $model->overdueDay = $map['overdue_day'];
        }
        if (isset($map['overdue_money'])) {
            $model->overdueMoney = $map['overdue_money'];
        }
        if (isset($map['overdue_rate'])) {
            $model->overdueRate = $map['overdue_rate'];
        }
        if (isset($map['overdue_status'])) {
            $model->overdueStatus = $map['overdue_status'];
        }
        if (isset($map['remain_return_money'])) {
            $model->remainReturnMoney = $map['remain_return_money'];
        }
        if (isset($map['remain_return_term'])) {
            $model->remainReturnTerm = $map['remain_return_term'];
        }
        if (isset($map['repayment_unique_id'])) {
            $model->repaymentUniqueId = $map['repayment_unique_id'];
        }
        if (isset($map['return_description'])) {
            $model->returnDescription = $map['return_description'];
        }
        if (isset($map['return_index'])) {
            $model->returnIndex = $map['return_index'];
        }
        if (isset($map['return_money'])) {
            $model->returnMoney = $map['return_money'];
        }
        if (isset($map['return_status'])) {
            $model->returnStatus = $map['return_status'];
        }
        if (isset($map['return_time'])) {
            $model->returnTime = $map['return_time'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['async'])) {
            $model->async = $map['async'];
        }

        return $model;
    }
}
