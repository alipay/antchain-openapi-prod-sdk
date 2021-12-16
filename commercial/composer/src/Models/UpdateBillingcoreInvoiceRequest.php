<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class UpdateBillingcoreInvoiceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 请求唯一id，可以是时间戳
    /**
     * @var string
     */
    public $requestUniqueId;

    // 发票信息
    /**
     * @var Invoice
     */
    public $invoice;
    protected $_name = [
        'authToken'       => 'auth_token',
        'requestUniqueId' => 'request_unique_id',
        'invoice'         => 'invoice',
    ];

    public function validate()
    {
        Model::validateRequired('invoice', $this->invoice, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->requestUniqueId) {
            $res['request_unique_id'] = $this->requestUniqueId;
        }
        if (null !== $this->invoice) {
            $res['invoice'] = null !== $this->invoice ? $this->invoice->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateBillingcoreInvoiceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['request_unique_id'])) {
            $model->requestUniqueId = $map['request_unique_id'];
        }
        if (isset($map['invoice'])) {
            $model->invoice = Invoice::fromMap($map['invoice']);
        }

        return $model;
    }
}
