<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class CustomReceiptStatus extends Model
{
    // 是否结清
    /**
     * @example true, false
     *
     * @var bool
     */
    public $receiptFlag;
    protected $_name = [
        'receiptFlag' => 'receipt_flag',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->receiptFlag) {
            $res['receipt_flag'] = $this->receiptFlag;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CustomReceiptStatus
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['receipt_flag'])) {
            $model->receiptFlag = $map['receipt_flag'];
        }

        return $model;
    }
}
