<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAAS_SPI\Models;

use AlibabaCloud\Tea\Model;

class GrantOrderDetail extends Model
{
    // 券编码
    /**
     * @example 1798234932684395
     *
     * @var string
     */
    public $voucherCode;

    // 发放扩展信息
    /**
     * @example {"supplierSettlePrice": 10.00,"supplierChannelNo": "alipay","rightsName": "28元抵扣券","outRightsCode": "1767506545030770701"}
     *
     * @var string
     */
    public $extInfo;
    protected $_name = [
        'voucherCode' => 'voucher_code',
        'extInfo'     => 'ext_info',
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
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GrantOrderDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['voucher_code'])) {
            $model->voucherCode = $map['voucher_code'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }

        return $model;
    }
}
