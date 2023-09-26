<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class ChainInsightSearchStatus extends Model
{
    // 链ID
    /**
     * @example c3179e0d54a340a38d338664fe71d54c
     *
     * @var string
     */
    public $bizId;

    // 链名称
    /**
     * @example 测试链
     *
     * @var string
     */
    public $bizIdName;

    // Indexing,Enabled,Disabled
    /**
     * @example 开通状态
     *
     * @var string
     */
    public $status;

    // 当前索引的区块高度
    /**
     * @example 100
     *
     * @var int
     */
    public $currentHeight;

    // 当前区块链高度
    /**
     * @example 1000
     *
     * @var int
     */
    public $ledgerHeight;

    // 预计索引完成的时间，单位秒
    /**
     * @example 2000
     *
     * @var int
     */
    public $estimateTime;
    protected $_name = [
        'bizId'         => 'biz_id',
        'bizIdName'     => 'biz_id_name',
        'status'        => 'status',
        'currentHeight' => 'current_height',
        'ledgerHeight'  => 'ledger_height',
        'estimateTime'  => 'estimate_time',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->bizIdName) {
            $res['biz_id_name'] = $this->bizIdName;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->currentHeight) {
            $res['current_height'] = $this->currentHeight;
        }
        if (null !== $this->ledgerHeight) {
            $res['ledger_height'] = $this->ledgerHeight;
        }
        if (null !== $this->estimateTime) {
            $res['estimate_time'] = $this->estimateTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChainInsightSearchStatus
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['biz_id_name'])) {
            $model->bizIdName = $map['biz_id_name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['current_height'])) {
            $model->currentHeight = $map['current_height'];
        }
        if (isset($map['ledger_height'])) {
            $model->ledgerHeight = $map['ledger_height'];
        }
        if (isset($map['estimate_time'])) {
            $model->estimateTime = $map['estimate_time'];
        }

        return $model;
    }
}
