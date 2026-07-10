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

    // 物料置信度
    /**
     * @example 0.8
     *
     * @var string
     */
    public $score;
    protected $_name = [
        'hash'  => 'hash',
        'score' => 'score',
    ];

    public function validate()
    {
        Model::validateRequired('hash', $this->hash, true);
        Model::validateRequired('score', $this->score, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->hash) {
            $res['hash'] = $this->hash;
        }
        if (null !== $this->score) {
            $res['score'] = $this->score;
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
        if (isset($map['score'])) {
            $model->score = $map['score'];
        }

        return $model;
    }
}
