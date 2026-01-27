<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class CaptureCutpaymentsubWithdrawalRequest extends Model
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

    // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
    /**
     * @var string
     */
    public $outerOrderNo;

    // 提现的订单号，商户订单号需要唯一，方便定位到每一笔订单
    /**
     * @var string
     */
    public $withdrawOrderId;

    // 二级商户账户号
    /**
     * @var string
     */
    public $contractNo;

    // 提现金额，单位：元，整数部分最长10位数，保留两位小数
    /**
     * @var string
     */
    public $dealAmount;

    // 一级商户商户号
    /**
     * @var string
     */
    public $firstLevelMemberid;

    // 一级商户终端号
    /**
     * @var string
     */
    public $firstLevelTerminalid;

    // 扩展信息，预留字段
    /**
     * @var string
     */
    public $externParam;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'outerOrderNo'         => 'outer_order_no',
        'withdrawOrderId'      => 'withdraw_order_id',
        'contractNo'           => 'contract_no',
        'dealAmount'           => 'deal_amount',
        'firstLevelMemberid'   => 'first_level_memberid',
        'firstLevelTerminalid' => 'first_level_terminalid',
        'externParam'          => 'extern_param',
    ];

    public function validate()
    {
        Model::validateRequired('outerOrderNo', $this->outerOrderNo, true);
        Model::validateRequired('withdrawOrderId', $this->withdrawOrderId, true);
        Model::validateRequired('contractNo', $this->contractNo, true);
        Model::validateRequired('dealAmount', $this->dealAmount, true);
        Model::validateRequired('firstLevelMemberid', $this->firstLevelMemberid, true);
        Model::validateRequired('firstLevelTerminalid', $this->firstLevelTerminalid, true);
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
        if (null !== $this->outerOrderNo) {
            $res['outer_order_no'] = $this->outerOrderNo;
        }
        if (null !== $this->withdrawOrderId) {
            $res['withdraw_order_id'] = $this->withdrawOrderId;
        }
        if (null !== $this->contractNo) {
            $res['contract_no'] = $this->contractNo;
        }
        if (null !== $this->dealAmount) {
            $res['deal_amount'] = $this->dealAmount;
        }
        if (null !== $this->firstLevelMemberid) {
            $res['first_level_memberid'] = $this->firstLevelMemberid;
        }
        if (null !== $this->firstLevelTerminalid) {
            $res['first_level_terminalid'] = $this->firstLevelTerminalid;
        }
        if (null !== $this->externParam) {
            $res['extern_param'] = $this->externParam;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CaptureCutpaymentsubWithdrawalRequest
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
        if (isset($map['outer_order_no'])) {
            $model->outerOrderNo = $map['outer_order_no'];
        }
        if (isset($map['withdraw_order_id'])) {
            $model->withdrawOrderId = $map['withdraw_order_id'];
        }
        if (isset($map['contract_no'])) {
            $model->contractNo = $map['contract_no'];
        }
        if (isset($map['deal_amount'])) {
            $model->dealAmount = $map['deal_amount'];
        }
        if (isset($map['first_level_memberid'])) {
            $model->firstLevelMemberid = $map['first_level_memberid'];
        }
        if (isset($map['first_level_terminalid'])) {
            $model->firstLevelTerminalid = $map['first_level_terminalid'];
        }
        if (isset($map['extern_param'])) {
            $model->externParam = $map['extern_param'];
        }

        return $model;
    }
}
