<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class DataDownloadInfo extends Model
{
    // 商户社会统一信用代码
    /**
     * @example 91301010101010101A
     *
     * @var string
     */
    public $merchantId;

    // 流水号
    /**
     * @example 123123122134
     *
     * @var string
     */
    public $bizNo;

    // 状态
    /**
     * @example TODO
     *
     * @var string
     */
    public $status;

    // TRADE_PROMISE_BILL: 交易履约账单
    /**
     * @example 交易履约账单
     *
     * @var string
     */
    public $type;

    // 筛选开始时间
    /**
     * @example 2024-10-17
     *
     * @var string
     */
    public $startTime;

    // 筛选结束时间
    /**
     * @example 2024-11-17
     *
     * @var string
     */
    public $endTime;

    // 任务创建时间
    /**
     * @example 2024-10-17 18:41:59
     *
     * @var string
     */
    public $createTime;

    // 下载结果
    /**
     * @example 下载结果
     *
     * @var string
     */
    public $resultInfo;

    // 融资类型
    /**
     * @example SUPPLY_CHAIN_FINANCE
     *
     * @var string
     */
    public $fundMode;

    // 放款渠道
    /**
     * @example BANK
     *
     * @var string
     */
    public $loanChannel;
    protected $_name = [
        'merchantId'  => 'merchant_id',
        'bizNo'       => 'biz_no',
        'status'      => 'status',
        'type'        => 'type',
        'startTime'   => 'start_time',
        'endTime'     => 'end_time',
        'createTime'  => 'create_time',
        'resultInfo'  => 'result_info',
        'fundMode'    => 'fund_mode',
        'loanChannel' => 'loan_channel',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->bizNo) {
            $res['biz_no'] = $this->bizNo;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->resultInfo) {
            $res['result_info'] = $this->resultInfo;
        }
        if (null !== $this->fundMode) {
            $res['fund_mode'] = $this->fundMode;
        }
        if (null !== $this->loanChannel) {
            $res['loan_channel'] = $this->loanChannel;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DataDownloadInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['biz_no'])) {
            $model->bizNo = $map['biz_no'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['result_info'])) {
            $model->resultInfo = $map['result_info'];
        }
        if (isset($map['fund_mode'])) {
            $model->fundMode = $map['fund_mode'];
        }
        if (isset($map['loan_channel'])) {
            $model->loanChannel = $map['loan_channel'];
        }

        return $model;
    }
}
