<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

class OrderSplitDetailList extends Model {
    protected $_name = [
        'splitStatus' => 'split_status',
        'splitAmount' => 'split_amount',
        'executeTime' => 'execute_time',
        'transOutAccount' => 'trans_out_account',
        'transInAccount' => 'trans_in_account',
        'splitFailedReason' => 'split_failed_reason',
    ];
    public function validate() {
        Model::validateRequired('splitStatus', $this->splitStatus, true);
        Model::validateRequired('splitAmount', $this->splitAmount, true);
        Model::validateRequired('transOutAccount', $this->transOutAccount, true);
        Model::validateRequired('transInAccount', $this->transInAccount, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->splitStatus) {
            $res['split_status'] = $this->splitStatus;
        }
        if (null !== $this->splitAmount) {
            $res['split_amount'] = $this->splitAmount;
        }
        if (null !== $this->executeTime) {
            $res['execute_time'] = $this->executeTime;
        }
        if (null !== $this->transOutAccount) {
            $res['trans_out_account'] = $this->transOutAccount;
        }
        if (null !== $this->transInAccount) {
            $res['trans_in_account'] = $this->transInAccount;
        }
        if (null !== $this->splitFailedReason) {
            $res['split_failed_reason'] = $this->splitFailedReason;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OrderSplitDetailList
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['split_status'])){
            $model->splitStatus = $map['split_status'];
        }
        if(isset($map['split_amount'])){
            $model->splitAmount = $map['split_amount'];
        }
        if(isset($map['execute_time'])){
            $model->executeTime = $map['execute_time'];
        }
        if(isset($map['trans_out_account'])){
            $model->transOutAccount = $map['trans_out_account'];
        }
        if(isset($map['trans_in_account'])){
            $model->transInAccount = $map['trans_in_account'];
        }
        if(isset($map['split_failed_reason'])){
            $model->splitFailedReason = $map['split_failed_reason'];
        }
        return $model;
    }
    // 某笔分账状态：PROCESSING-处理中,SUCCESS-成功,CLOSE-关闭,FAILED-失败
    /**
     * @example SUCCESS
     * @var string
     */
    public $splitStatus;

    // 分账金额，单位：分
    /**
     * @example 990
     * @var int
     */
    public $splitAmount;

    // 分账执行时间，格式为yyyy-MM-dd HH:mm:ss
    // 条件返回：splitStatus=SUCCESS 返回
    /**
     * @example 2021-07-30 12:00:00
     * @var string
     */
    public $executeTime;

    // 分账转出账号
    /**
     * @example 2088101126765726
     * @var string
     */
    public $transOutAccount;

    // 分账转入账号
    /**
     * @example 2088101126765726
     * @var string
     */
    public $transInAccount;

    // 分账失败原因，条件返回：splitStatus=FAILED 返回
    /**
     * @example 账户余额不足
     * @var string
     */
    public $splitFailedReason;

}
