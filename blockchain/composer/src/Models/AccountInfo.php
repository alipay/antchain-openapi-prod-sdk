<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class AccountInfo extends Model
{
    // 版通数量
    /**
     * @example 1000
     *
     * @var int
     */
    public $epAmount;

    // 版通代码
    /**
     * @example 000111
     *
     * @var string
     */
    public $epCode;
    protected $_name = [
        'epAmount' => 'ep_amount',
        'epCode'   => 'ep_code',
    ];

    public function validate()
    {
        Model::validateRequired('epAmount', $this->epAmount, true);
        Model::validateRequired('epCode', $this->epCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->epAmount) {
            $res['ep_amount'] = $this->epAmount;
        }
        if (null !== $this->epCode) {
            $res['ep_code'] = $this->epCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AccountInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ep_amount'])) {
            $model->epAmount = $map['ep_amount'];
        }
        if (isset($map['ep_code'])) {
            $model->epCode = $map['ep_code'];
        }

        return $model;
    }
}
