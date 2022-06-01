<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class BaiGoodsPointCheckRespData extends Model
{
    // 图片是否有效，无效则需要提示重拍
    /**
     * @example true, false
     *
     * @var bool
     */
    public $valid;
    protected $_name = [
        'valid' => 'valid',
    ];

    public function validate()
    {
        Model::validateRequired('valid', $this->valid, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->valid) {
            $res['valid'] = $this->valid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BaiGoodsPointCheckRespData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['valid'])) {
            $model->valid = $map['valid'];
        }

        return $model;
    }
}
