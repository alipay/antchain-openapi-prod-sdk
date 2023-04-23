<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PARTNER\Models;

use AlibabaCloud\Tea\Model;

class ExpenditureQuotationOffer extends Model
{
    // 支出配置单商品主键id
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 一客一价
    /**
     * @example
     *
     * @var ExpenditureQuotationOfferPrice[]
     */
    public $personalPrice;

    // 外部业务单据号
    /**
     * @example 123456
     *
     * @var string
     */
    public $outBusinessNo;

    // 支出订购id
    /**
     * @example 20220719EC00061535
     *
     * @var string
     */
    public $arrangementNo;
    protected $_name = [
        'id'            => 'id',
        'personalPrice' => 'personal_price',
        'outBusinessNo' => 'out_business_no',
        'arrangementNo' => 'arrangement_no',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->personalPrice) {
            $res['personal_price'] = [];
            if (null !== $this->personalPrice && \is_array($this->personalPrice)) {
                $n = 0;
                foreach ($this->personalPrice as $item) {
                    $res['personal_price'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->outBusinessNo) {
            $res['out_business_no'] = $this->outBusinessNo;
        }
        if (null !== $this->arrangementNo) {
            $res['arrangement_no'] = $this->arrangementNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExpenditureQuotationOffer
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['personal_price'])) {
            if (!empty($map['personal_price'])) {
                $model->personalPrice = [];
                $n                    = 0;
                foreach ($map['personal_price'] as $item) {
                    $model->personalPrice[$n++] = null !== $item ? ExpenditureQuotationOfferPrice::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['out_business_no'])) {
            $model->outBusinessNo = $map['out_business_no'];
        }
        if (isset($map['arrangement_no'])) {
            $model->arrangementNo = $map['arrangement_no'];
        }

        return $model;
    }
}
