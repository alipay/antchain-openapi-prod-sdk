<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class CompanySummaryInfo extends Model
{
    // 社会统一信用代码
    /**
     * @example 91301010101010101A
     *
     * @var string
     */
    public $merchantId;

    // 公司名称
    /**
     * @example xxx公司
     *
     * @var string
     */
    public $merchantName;
    protected $_name = [
        'merchantId'   => 'merchant_id',
        'merchantName' => 'merchant_name',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->merchantName) {
            $res['merchant_name'] = $this->merchantName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CompanySummaryInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['merchant_name'])) {
            $model->merchantName = $map['merchant_name'];
        }

        return $model;
    }
}
