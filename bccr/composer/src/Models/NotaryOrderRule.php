<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class NotaryOrderRule extends Model
{
    // 公证出证支持公证书类型
    /**
     * @example PAPER,E_PAPER,BOTH
     *
     * @var string
     */
    public $orderType;
    protected $_name = [
        'orderType' => 'order_type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orderType) {
            $res['order_type'] = $this->orderType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NotaryOrderRule
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_type'])) {
            $model->orderType = $map['order_type'];
        }

        return $model;
    }
}
