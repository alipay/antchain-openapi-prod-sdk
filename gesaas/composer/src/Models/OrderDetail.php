<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

class OrderDetail extends Model
{
    // 凭证编号
    /**
     * @example 1798234932684395
     *
     * @var string
     */
    public $voucherCode;
    protected $_name = [
        'voucherCode' => 'voucher_code',
    ];

    public function validate()
    {
        Model::validateRequired('voucherCode', $this->voucherCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->voucherCode) {
            $res['voucher_code'] = $this->voucherCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OrderDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['voucher_code'])) {
            $model->voucherCode = $map['voucher_code'];
        }

        return $model;
    }
}
