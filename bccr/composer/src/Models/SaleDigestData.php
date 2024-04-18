<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class SaleDigestData extends Model
{
    // 商品hash值
    /**
     * @example hash
     *
     * @var string
     */
    public $hash;
    protected $_name = [
        'hash' => 'hash',
    ];

    public function validate()
    {
        Model::validateRequired('hash', $this->hash, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->hash) {
            $res['hash'] = $this->hash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaleDigestData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['hash'])) {
            $model->hash = $map['hash'];
        }

        return $model;
    }
}
