<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SP\Models;

use AlibabaCloud\Tea\Model;

class ExpenditureQuotationItemResult extends Model
{
    // 支出配置单商品维度的外部唯一id
    /**
     * @example 支出配置单商品维度的外部唯一id
     *
     * @var string
     */
    public $outUniqueId;

    // 支出配置单商品合约号
    /**
     * @example 支出配置单商品合约号
     *
     * @var string
     */
    public $arrangementNo;
    protected $_name = [
        'outUniqueId'   => 'out_unique_id',
        'arrangementNo' => 'arrangement_no',
    ];

    public function validate()
    {
        Model::validateRequired('outUniqueId', $this->outUniqueId, true);
        Model::validateRequired('arrangementNo', $this->arrangementNo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->outUniqueId) {
            $res['out_unique_id'] = $this->outUniqueId;
        }
        if (null !== $this->arrangementNo) {
            $res['arrangement_no'] = $this->arrangementNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExpenditureQuotationItemResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['out_unique_id'])) {
            $model->outUniqueId = $map['out_unique_id'];
        }
        if (isset($map['arrangement_no'])) {
            $model->arrangementNo = $map['arrangement_no'];
        }

        return $model;
    }
}
