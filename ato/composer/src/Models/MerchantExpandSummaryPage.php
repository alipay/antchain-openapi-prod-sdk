<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class MerchantExpandSummaryPage extends Model
{
    // 进件id
    /**
     * @example 1231234343423423
     *
     * @var string
     */
    public $payExpandId;

    // 支付渠道
    // JDPAY
    // ALIPAY
    /**
     * @example JDPAY
     *
     * @var string
     */
    public $payChannel;

    // 进件审核状态
    /**
     * @example SUCCESS
     *
     * @var string
     */
    public $status;

    // 创建时间
    /**
     * @example 2025-12-22 10:00:00
     *
     * @var string
     */
    public $createTime;

    // 最后修改时间
    /**
     * @example 2025-12-25 10:00:00
     *
     * @var string
     */
    public $updateTime;
    protected $_name = [
        'payExpandId' => 'pay_expand_id',
        'payChannel'  => 'pay_channel',
        'status'      => 'status',
        'createTime'  => 'create_time',
        'updateTime'  => 'update_time',
    ];

    public function validate()
    {
        Model::validateRequired('payExpandId', $this->payExpandId, true);
        Model::validateRequired('payChannel', $this->payChannel, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('createTime', $this->createTime, true);
        Model::validateRequired('updateTime', $this->updateTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->payExpandId) {
            $res['pay_expand_id'] = $this->payExpandId;
        }
        if (null !== $this->payChannel) {
            $res['pay_channel'] = $this->payChannel;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MerchantExpandSummaryPage
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['pay_expand_id'])) {
            $model->payExpandId = $map['pay_expand_id'];
        }
        if (isset($map['pay_channel'])) {
            $model->payChannel = $map['pay_channel'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['update_time'])) {
            $model->updateTime = $map['update_time'];
        }

        return $model;
    }
}
