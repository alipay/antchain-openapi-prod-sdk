<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class UpdateBillingcoreInvoiceaddressRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 发票寄送地址
    /**
     * @var InvoiceAddress
     */
    public $invoiceAddress;

    // 请求唯一id，可以是时间戳
    /**
     * @var string
     */
    public $requestUniqueId;
    protected $_name = [
        'authToken'       => 'auth_token',
        'invoiceAddress'  => 'invoice_address',
        'requestUniqueId' => 'request_unique_id',
    ];

    public function validate()
    {
        Model::validateRequired('invoiceAddress', $this->invoiceAddress, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->invoiceAddress) {
            $res['invoice_address'] = null !== $this->invoiceAddress ? $this->invoiceAddress->toMap() : null;
        }
        if (null !== $this->requestUniqueId) {
            $res['request_unique_id'] = $this->requestUniqueId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateBillingcoreInvoiceaddressRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['invoice_address'])) {
            $model->invoiceAddress = InvoiceAddress::fromMap($map['invoice_address']);
        }
        if (isset($map['request_unique_id'])) {
            $model->requestUniqueId = $map['request_unique_id'];
        }

        return $model;
    }
}
