<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PARTNER\Models;

use AlibabaCloud\Tea\Model;

class ExpenditureQuotationRequest extends Model
{
    // 定价模式：
    // Standard("Standard", "标准价"),
    // Customer("Customer", "自定义价格"),
    /**
     * @example Standard
     *
     * @var string
     */
    public $priceMode;

    // 支出配置单对象列表
    /**
     * @example
     *
     * @var ExpenditureQuotationItem[]
     */
    public $quotationItems;
    protected $_name = [
        'priceMode'      => 'price_mode',
        'quotationItems' => 'quotation_items',
    ];

    public function validate()
    {
        Model::validateRequired('priceMode', $this->priceMode, true);
        Model::validateRequired('quotationItems', $this->quotationItems, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->priceMode) {
            $res['price_mode'] = $this->priceMode;
        }
        if (null !== $this->quotationItems) {
            $res['quotation_items'] = [];
            if (null !== $this->quotationItems && \is_array($this->quotationItems)) {
                $n = 0;
                foreach ($this->quotationItems as $item) {
                    $res['quotation_items'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExpenditureQuotationRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['price_mode'])) {
            $model->priceMode = $map['price_mode'];
        }
        if (isset($map['quotation_items'])) {
            if (!empty($map['quotation_items'])) {
                $model->quotationItems = [];
                $n                     = 0;
                foreach ($map['quotation_items'] as $item) {
                    $model->quotationItems[$n++] = null !== $item ? ExpenditureQuotationItem::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
