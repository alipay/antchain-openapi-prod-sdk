<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class SuperviseApprove extends Model
{
    // 关联的订单id
    /**
     * @example 1111
     *
     * @var string
     */
    public $orderId;

    // 当前的阶段
    /**
     * @example 1
     *
     * @var int
     */
    public $stage;

    // json组织，用于存储监修报审的具体信息
    /**
     * @example [{"name":"123","mobilePhone":"123","email":"456","dingDing":"999","telePhone":"8888","position":"aaa"}]
     *
     * @var string
     */
    public $extInfo;

    // 当前阶段的审批状态   0:待审批，1:审批通过 2:审批拒绝
    /**
     * @example 0
     *
     * @var int
     */
    public $approvalStatus;

    // 审批备注
    /**
     * @example x x x x x x
     *
     * @var string
     */
    public $approvalComments;

    // 上链的交易hash
    /**
     * @example xxxx
     *
     * @var string
     */
    public $txHash;

    // 关联的订单交易的ip id
    /**
     * @example cccc
     *
     * @var string
     */
    public $ipId;

    // 关联交易的卖家id
    /**
     * @example xxxx
     *
     * @var string
     */
    public $sellerAccountId;

    // 关联交易的买家id
    /**
     * @example ccccc
     *
     * @var string
     */
    public $buyerAccountId;

    // 审批额外信息
    /**
     * @example x x x x x
     *
     * @var string
     */
    public $approvalExtInfo;
    protected $_name = [
        'orderId'          => 'order_id',
        'stage'            => 'stage',
        'extInfo'          => 'ext_info',
        'approvalStatus'   => 'approval_status',
        'approvalComments' => 'approval_comments',
        'txHash'           => 'tx_hash',
        'ipId'             => 'ip_id',
        'sellerAccountId'  => 'seller_account_id',
        'buyerAccountId'   => 'buyer_account_id',
        'approvalExtInfo'  => 'approval_ext_info',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('stage', $this->stage, true);
        Model::validateRequired('extInfo', $this->extInfo, true);
        Model::validateRequired('approvalStatus', $this->approvalStatus, true);
        Model::validateRequired('txHash', $this->txHash, true);
        Model::validateRequired('ipId', $this->ipId, true);
        Model::validateRequired('sellerAccountId', $this->sellerAccountId, true);
        Model::validateRequired('buyerAccountId', $this->buyerAccountId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->stage) {
            $res['stage'] = $this->stage;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }
        if (null !== $this->approvalStatus) {
            $res['approval_status'] = $this->approvalStatus;
        }
        if (null !== $this->approvalComments) {
            $res['approval_comments'] = $this->approvalComments;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->ipId) {
            $res['ip_id'] = $this->ipId;
        }
        if (null !== $this->sellerAccountId) {
            $res['seller_account_id'] = $this->sellerAccountId;
        }
        if (null !== $this->buyerAccountId) {
            $res['buyer_account_id'] = $this->buyerAccountId;
        }
        if (null !== $this->approvalExtInfo) {
            $res['approval_ext_info'] = $this->approvalExtInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SuperviseApprove
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['stage'])) {
            $model->stage = $map['stage'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }
        if (isset($map['approval_status'])) {
            $model->approvalStatus = $map['approval_status'];
        }
        if (isset($map['approval_comments'])) {
            $model->approvalComments = $map['approval_comments'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['ip_id'])) {
            $model->ipId = $map['ip_id'];
        }
        if (isset($map['seller_account_id'])) {
            $model->sellerAccountId = $map['seller_account_id'];
        }
        if (isset($map['buyer_account_id'])) {
            $model->buyerAccountId = $map['buyer_account_id'];
        }
        if (isset($map['approval_ext_info'])) {
            $model->approvalExtInfo = $map['approval_ext_info'];
        }

        return $model;
    }
}
