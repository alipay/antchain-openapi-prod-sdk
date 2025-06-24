<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class Additional extends Model
{
    // 骑手标识；1-骑手
    /**
     * @example 1
     *
     * @var string
     */
    public $deliveryman;

    // 关键词
    /**
     * @example xxxx
     *
     * @var string
     */
    public $keyWord;
    protected $_name = [
        'deliveryman' => 'deliveryman',
        'keyWord'     => 'key_word',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->deliveryman) {
            $res['deliveryman'] = $this->deliveryman;
        }
        if (null !== $this->keyWord) {
            $res['key_word'] = $this->keyWord;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Additional
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['deliveryman'])) {
            $model->deliveryman = $map['deliveryman'];
        }
        if (isset($map['key_word'])) {
            $model->keyWord = $map['key_word'];
        }

        return $model;
    }
}
