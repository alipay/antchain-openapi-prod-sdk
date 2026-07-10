<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class NotaryFeeItem extends Model
{
    // 费用分项描述
    /**
     * @example 起步费用
     *
     * @var string
     */
    public $feeItemDesc;

    // 费用分项金额(分)
    /**
     * @example 200000
     *
     * @var int
     */
    public $feeItemAmountRmbFen;

    // 费用分项详情列表
    /**
     * @example
     *
     * @var FeeDetail[]
     */
    public $feeDetailList;
    protected $_name = [
        'feeItemDesc'         => 'fee_item_desc',
        'feeItemAmountRmbFen' => 'fee_item_amount_rmb_fen',
        'feeDetailList'       => 'fee_detail_list',
    ];

    public function validate()
    {
        Model::validateRequired('feeItemDesc', $this->feeItemDesc, true);
        Model::validateRequired('feeItemAmountRmbFen', $this->feeItemAmountRmbFen, true);
        Model::validateRequired('feeDetailList', $this->feeDetailList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->feeItemDesc) {
            $res['fee_item_desc'] = $this->feeItemDesc;
        }
        if (null !== $this->feeItemAmountRmbFen) {
            $res['fee_item_amount_rmb_fen'] = $this->feeItemAmountRmbFen;
        }
        if (null !== $this->feeDetailList) {
            $res['fee_detail_list'] = [];
            if (null !== $this->feeDetailList && \is_array($this->feeDetailList)) {
                $n = 0;
                foreach ($this->feeDetailList as $item) {
                    $res['fee_detail_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NotaryFeeItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['fee_item_desc'])) {
            $model->feeItemDesc = $map['fee_item_desc'];
        }
        if (isset($map['fee_item_amount_rmb_fen'])) {
            $model->feeItemAmountRmbFen = $map['fee_item_amount_rmb_fen'];
        }
        if (isset($map['fee_detail_list'])) {
            if (!empty($map['fee_detail_list'])) {
                $model->feeDetailList = [];
                $n                    = 0;
                foreach ($map['fee_detail_list'] as $item) {
                    $model->feeDetailList[$n++] = null !== $item ? FeeDetail::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
