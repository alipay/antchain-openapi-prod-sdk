<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class SaleData extends Model
{
    // 摘要数据
    /**
     * @example 摘要数据
     *
     * @var SaleDigestData
     */
    public $saleDigiestData;
    protected $_name = [
        'saleDigiestData' => 'sale_digiest_data',
    ];

    public function validate()
    {
        Model::validateRequired('saleDigiestData', $this->saleDigiestData, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->saleDigiestData) {
            $res['sale_digiest_data'] = null !== $this->saleDigiestData ? $this->saleDigiestData->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaleData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sale_digiest_data'])) {
            $model->saleDigiestData = SaleDigestData::fromMap($map['sale_digiest_data']);
        }

        return $model;
    }
}
