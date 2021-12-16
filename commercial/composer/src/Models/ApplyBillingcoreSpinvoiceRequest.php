<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class ApplyBillingcoreSpinvoiceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 账单号，多个时逗号分隔
    /**
     * @var string
     */
    public $billNos;

    // 账单总金额
    /**
     * @var string
     */
    public $billAmt;

    // 币种
    /**
     * @var string
     */
    public $ccy;

    // 销售方信息
    /**
     * @var TaxInfo
     */
    public $sellerInfo;

    // 购买方信息
    /**
     * @var TaxInfo
     */
    public $buyerInfo;

    // 发票信息
    /**
     * @var InvoiceInfo[]
     */
    public $invoiceInfos;
    protected $_name = [
        'authToken'    => 'auth_token',
        'billNos'      => 'bill_nos',
        'billAmt'      => 'bill_amt',
        'ccy'          => 'ccy',
        'sellerInfo'   => 'seller_info',
        'buyerInfo'    => 'buyer_info',
        'invoiceInfos' => 'invoice_infos',
    ];

    public function validate()
    {
        Model::validateRequired('billNos', $this->billNos, true);
        Model::validateRequired('billAmt', $this->billAmt, true);
        Model::validateRequired('ccy', $this->ccy, true);
        Model::validateRequired('sellerInfo', $this->sellerInfo, true);
        Model::validateRequired('buyerInfo', $this->buyerInfo, true);
        Model::validateRequired('invoiceInfos', $this->invoiceInfos, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->billNos) {
            $res['bill_nos'] = $this->billNos;
        }
        if (null !== $this->billAmt) {
            $res['bill_amt'] = $this->billAmt;
        }
        if (null !== $this->ccy) {
            $res['ccy'] = $this->ccy;
        }
        if (null !== $this->sellerInfo) {
            $res['seller_info'] = null !== $this->sellerInfo ? $this->sellerInfo->toMap() : null;
        }
        if (null !== $this->buyerInfo) {
            $res['buyer_info'] = null !== $this->buyerInfo ? $this->buyerInfo->toMap() : null;
        }
        if (null !== $this->invoiceInfos) {
            $res['invoice_infos'] = [];
            if (null !== $this->invoiceInfos && \is_array($this->invoiceInfos)) {
                $n = 0;
                foreach ($this->invoiceInfos as $item) {
                    $res['invoice_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyBillingcoreSpinvoiceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['bill_nos'])) {
            $model->billNos = $map['bill_nos'];
        }
        if (isset($map['bill_amt'])) {
            $model->billAmt = $map['bill_amt'];
        }
        if (isset($map['ccy'])) {
            $model->ccy = $map['ccy'];
        }
        if (isset($map['seller_info'])) {
            $model->sellerInfo = TaxInfo::fromMap($map['seller_info']);
        }
        if (isset($map['buyer_info'])) {
            $model->buyerInfo = TaxInfo::fromMap($map['buyer_info']);
        }
        if (isset($map['invoice_infos'])) {
            if (!empty($map['invoice_infos'])) {
                $model->invoiceInfos = [];
                $n                   = 0;
                foreach ($map['invoice_infos'] as $item) {
                    $model->invoiceInfos[$n++] = null !== $item ? InvoiceInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
