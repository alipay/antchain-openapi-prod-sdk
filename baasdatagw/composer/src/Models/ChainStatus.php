<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class ChainStatus extends Model
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

    // 主链ID
    /**
     * @example c3179e0d54a340a38d338664fe71d54c
     *
     * @var string
     */
    public $parentBizId;

    // 当前区块高度
    /**
     * @example 1000
     *
     * @var int
     */
    public $ledgerHeight;

    // 交易总量
    /**
     * @example 200
     *
     * @var int
     */
    public $txCount;

    // 链状态，ok, fail
    /**
     * @example ok
     *
     * @var string
     */
    public $status;
    protected $_name = [
        'bizId'        => 'biz_id',
        'bizIdName'    => 'biz_id_name',
        'parentBizId'  => 'parent_biz_id',
        'ledgerHeight' => 'ledger_height',
        'txCount'      => 'tx_count',
        'status'       => 'status',
    ];

    public function validate()
    {
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
        if (null !== $this->parentBizId) {
            $res['parent_biz_id'] = $this->parentBizId;
        }
        if (null !== $this->ledgerHeight) {
            $res['ledger_height'] = $this->ledgerHeight;
        }
        if (null !== $this->txCount) {
            $res['tx_count'] = $this->txCount;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChainStatus
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
        if (isset($map['parent_biz_id'])) {
            $model->parentBizId = $map['parent_biz_id'];
        }
        if (isset($map['ledger_height'])) {
            $model->ledgerHeight = $map['ledger_height'];
        }
        if (isset($map['tx_count'])) {
            $model->txCount = $map['tx_count'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
