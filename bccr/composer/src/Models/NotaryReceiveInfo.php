<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class NotaryReceiveInfo extends Model
{
    // 公证书类型
    /**
     * @example PAPER:纸质公证书 E-PAPER:电子公证书 BOTH:纸质+电子公证书
     *
     * @var string
     */
    public $orderType;

    // 公证书送达信息
    /**
     * @example
     *
     * @var ReceiveInfo
     */
    public $receiveInfo;

    // 开票信息
    /**
     * @example
     *
     * @var NotaryInvoiceInfo
     */
    public $invoiceInfo;
    protected $_name = [
        'orderType'   => 'order_type',
        'receiveInfo' => 'receive_info',
        'invoiceInfo' => 'invoice_info',
    ];

    public function validate()
    {
        Model::validateRequired('orderType', $this->orderType, true);
        Model::validateRequired('receiveInfo', $this->receiveInfo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orderType) {
            $res['order_type'] = $this->orderType;
        }
        if (null !== $this->receiveInfo) {
            $res['receive_info'] = null !== $this->receiveInfo ? $this->receiveInfo->toMap() : null;
        }
        if (null !== $this->invoiceInfo) {
            $res['invoice_info'] = null !== $this->invoiceInfo ? $this->invoiceInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NotaryReceiveInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_type'])) {
            $model->orderType = $map['order_type'];
        }
        if (isset($map['receive_info'])) {
            $model->receiveInfo = ReceiveInfo::fromMap($map['receive_info']);
        }
        if (isset($map['invoice_info'])) {
            $model->invoiceInfo = NotaryInvoiceInfo::fromMap($map['invoice_info']);
        }

        return $model;
    }
}
