<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class BlockchainBrowserTransactionStatistic extends Model
{
    // 蚂蚁链id
    /**
     * @example 27ce375122ef483691488395808e009e
     *
     * @var string
     */
    public $bizid;

    // 开始时间
    /**
     * @example 1604480401000
     *
     * @var int
     */
    public $createTime;

    // 时间点
    /**
     * @example 2020-10-28
     *
     * @var string
     */
    public $dateTime;

    // 统计时间内最新块高度
    /**
     * @example 6372915
     *
     * @var int
     */
    public $lastSumBlockHeight;

    // 统计周期内交易的数量
    /**
     * @example 2750038
     *
     * @var int
     */
    public $transCount;
    protected $_name = [
        'bizid'              => 'bizid',
        'createTime'         => 'create_time',
        'dateTime'           => 'date_time',
        'lastSumBlockHeight' => 'last_sum_block_height',
        'transCount'         => 'trans_count',
    ];

    public function validate()
    {
        Model::validateRequired('bizid', $this->bizid, true);
        Model::validateRequired('createTime', $this->createTime, true);
        Model::validateRequired('dateTime', $this->dateTime, true);
        Model::validateRequired('lastSumBlockHeight', $this->lastSumBlockHeight, true);
        Model::validateRequired('transCount', $this->transCount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizid) {
            $res['bizid'] = $this->bizid;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->dateTime) {
            $res['date_time'] = $this->dateTime;
        }
        if (null !== $this->lastSumBlockHeight) {
            $res['last_sum_block_height'] = $this->lastSumBlockHeight;
        }
        if (null !== $this->transCount) {
            $res['trans_count'] = $this->transCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BlockchainBrowserTransactionStatistic
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['bizid'])) {
            $model->bizid = $map['bizid'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['date_time'])) {
            $model->dateTime = $map['date_time'];
        }
        if (isset($map['last_sum_block_height'])) {
            $model->lastSumBlockHeight = $map['last_sum_block_height'];
        }
        if (isset($map['trans_count'])) {
            $model->transCount = $map['trans_count'];
        }

        return $model;
    }
}
