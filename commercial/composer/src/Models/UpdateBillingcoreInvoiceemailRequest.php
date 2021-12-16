<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class UpdateBillingcoreInvoiceemailRequest extends Model
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

    // 发票电子邮件信息
    /**
     * @var InvoiceEmail
     */
    public $invoiceEmail;
    protected $_name = [
        'authToken'       => 'auth_token',
        'requestUniqueId' => 'request_unique_id',
        'invoiceEmail'    => 'invoice_email',
    ];

    public function validate()
    {
        Model::validateRequired('invoiceEmail', $this->invoiceEmail, true);
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
        if (null !== $this->invoiceEmail) {
            $res['invoice_email'] = null !== $this->invoiceEmail ? $this->invoiceEmail->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateBillingcoreInvoiceemailRequest
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
        if (isset($map['invoice_email'])) {
            $model->invoiceEmail = InvoiceEmail::fromMap($map['invoice_email']);
        }

        return $model;
    }
}
