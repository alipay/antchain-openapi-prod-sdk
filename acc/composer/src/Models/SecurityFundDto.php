<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class SecurityFundDto extends Model
{
    // 保证金类型
    /**
     * @example type
     *
     * @var string
     */
    public $type;

    // 金额
    /**
     * @example 1
     *
     * @var string
     */
    public $amount;
    protected $_name = [
        'type'   => 'type',
        'amount' => 'amount',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('amount', $this->amount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SecurityFundDto
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }

        return $model;
    }
}
