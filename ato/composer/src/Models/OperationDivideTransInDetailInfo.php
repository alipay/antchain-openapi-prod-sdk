<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class OperationDivideTransInDetailInfo extends Model
{
    // 分账收入方名称
    /**
     * @example xxx公司
     *
     * @var string
     */
    public $transInName;

    // 分账收入方支付宝用户id, 支付宝2088id
    /**
     * @example 2088****1
     *
     * @var string
     */
    public $transInUserId;

    // 分账金额，单位为分
    /**
     * @example 100
     *
     * @var int
     */
    public $divideAmount;

    // 分账描述
    /**
     * @example 分账给经营商
     *
     * @var string
     */
    public $desc;

    // INIT("INIT", "初始化"),
    // PROCESSING("PROCESSING", "处理中"),
    // FAILED("FAILED", "失败"),
    // SUCCESS("SUCCESS", "分账成功");
    /**
     * @example SUCCESS
     *
     * @var string
     */
    public $divideStatus;
    protected $_name = [
        'transInName'   => 'trans_in_name',
        'transInUserId' => 'trans_in_user_id',
        'divideAmount'  => 'divide_amount',
        'desc'          => 'desc',
        'divideStatus'  => 'divide_status',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->transInName) {
            $res['trans_in_name'] = $this->transInName;
        }
        if (null !== $this->transInUserId) {
            $res['trans_in_user_id'] = $this->transInUserId;
        }
        if (null !== $this->divideAmount) {
            $res['divide_amount'] = $this->divideAmount;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }
        if (null !== $this->divideStatus) {
            $res['divide_status'] = $this->divideStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperationDivideTransInDetailInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['trans_in_name'])) {
            $model->transInName = $map['trans_in_name'];
        }
        if (isset($map['trans_in_user_id'])) {
            $model->transInUserId = $map['trans_in_user_id'];
        }
        if (isset($map['divide_amount'])) {
            $model->divideAmount = $map['divide_amount'];
        }
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }
        if (isset($map['divide_status'])) {
            $model->divideStatus = $map['divide_status'];
        }

        return $model;
    }
}
