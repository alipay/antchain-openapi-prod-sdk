<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class Correction extends Model
{
    // 分支事务上下文
    /**
     * @example c=d;
     *
     * @var string
     */
    public $actionContext;

    // 参与者名称
    /**
     * @example PCREDITBILL_TRANS_TRANSFER_FOR_TRADE
     *
     * @var string
     */
    public $actionName;

    // 1：提交，2：回滚
    /**
     * @example 1
     *
     * @var int
     */
    public $actionType;

    // 主事务上下文
    /**
     * @example a=b;
     *
     * @var string
     */
    public $activityContext;

    // 应用名
    /**
     * @example paycore
     *
     * @var string
     */
    public $appName;

    // 创建时间
    /**
     * @example 2018-10-10 10:10:00
     *
     * @var string
     */
    public $gmtCreate;

    // 记录id
    /**
     * @example 201
     *
     * @var int
     */
    public $id;

    // 操作人
    /**
     * @example 张三
     *
     * @var string
     */
    public $operator;

    // 0 已提交  4 已执行
    /**
     * @example 0
     *
     * @var string
     */
    public $state;

    // 是否同步主账务；0、不同步，1、同步
    /**
     * @example 0
     *
     * @var int
     */
    public $syncAcctrans;

    // 是否同步统一支付；0、不同步，1同步
    /**
     * @example 0
     *
     * @var int
     */
    public $syncPaycore;

    // tracer上下文
    /**
     * @example aa=1;
     *
     * @var string
     */
    public $tracerContext;

    // 事务id
    /**
     * @example b3f0f17e45d54d56967a5bd6dd1a28c501-0000000000
     *
     * @var string
     */
    public $txId;
    protected $_name = [
        'actionContext'   => 'action_context',
        'actionName'      => 'action_name',
        'actionType'      => 'action_type',
        'activityContext' => 'activity_context',
        'appName'         => 'app_name',
        'gmtCreate'       => 'gmt_create',
        'id'              => 'id',
        'operator'        => 'operator',
        'state'           => 'state',
        'syncAcctrans'    => 'sync_acctrans',
        'syncPaycore'     => 'sync_paycore',
        'tracerContext'   => 'tracer_context',
        'txId'            => 'tx_id',
    ];

    public function validate()
    {
        Model::validateRequired('actionContext', $this->actionContext, true);
        Model::validateRequired('actionName', $this->actionName, true);
        Model::validateRequired('actionType', $this->actionType, true);
        Model::validateRequired('activityContext', $this->activityContext, true);
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('state', $this->state, true);
        Model::validateRequired('syncAcctrans', $this->syncAcctrans, true);
        Model::validateRequired('syncPaycore', $this->syncPaycore, true);
        Model::validateRequired('txId', $this->txId, true);
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->actionContext) {
            $res['action_context'] = $this->actionContext;
        }
        if (null !== $this->actionName) {
            $res['action_name'] = $this->actionName;
        }
        if (null !== $this->actionType) {
            $res['action_type'] = $this->actionType;
        }
        if (null !== $this->activityContext) {
            $res['activity_context'] = $this->activityContext;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->syncAcctrans) {
            $res['sync_acctrans'] = $this->syncAcctrans;
        }
        if (null !== $this->syncPaycore) {
            $res['sync_paycore'] = $this->syncPaycore;
        }
        if (null !== $this->tracerContext) {
            $res['tracer_context'] = $this->tracerContext;
        }
        if (null !== $this->txId) {
            $res['tx_id'] = $this->txId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Correction
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['action_context'])) {
            $model->actionContext = $map['action_context'];
        }
        if (isset($map['action_name'])) {
            $model->actionName = $map['action_name'];
        }
        if (isset($map['action_type'])) {
            $model->actionType = $map['action_type'];
        }
        if (isset($map['activity_context'])) {
            $model->activityContext = $map['activity_context'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['sync_acctrans'])) {
            $model->syncAcctrans = $map['sync_acctrans'];
        }
        if (isset($map['sync_paycore'])) {
            $model->syncPaycore = $map['sync_paycore'];
        }
        if (isset($map['tracer_context'])) {
            $model->tracerContext = $map['tracer_context'];
        }
        if (isset($map['tx_id'])) {
            $model->txId = $map['tx_id'];
        }

        return $model;
    }
}
