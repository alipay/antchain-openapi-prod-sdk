<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PARTNER\Models;

use AlibabaCloud\Tea\Model;

class ExpenditureQuotation extends Model
{
    // 支出配置单商品
    /**
     * @example
     *
     * @var ExpenditureQuotationOffer[]
     */
    public $quotationOffers;
    protected $_name = [
        'quotationOffers' => 'quotation_offers',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->quotationOffers) {
            $res['quotation_offers'] = [];
            if (null !== $this->quotationOffers && \is_array($this->quotationOffers)) {
                $n = 0;
                foreach ($this->quotationOffers as $item) {
                    $res['quotation_offers'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExpenditureQuotation
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['quotation_offers'])) {
            if (!empty($map['quotation_offers'])) {
                $model->quotationOffers = [];
                $n                      = 0;
                foreach ($map['quotation_offers'] as $item) {
                    $model->quotationOffers[$n++] = null !== $item ? ExpenditureQuotationOffer::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
