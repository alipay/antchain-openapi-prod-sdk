<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models;

use AlibabaCloud\Tea\Model;

class IifaaEkytResponse extends Model
{
    // 响应头
    /**
     * @example
     *
     * @var ResponseHead
     */
    public $head;

    // 业务响应结果
    /**
     * @example 126dncnceicncwuiooo
     *
     * @var string
     */
    public $bizRes;
    protected $_name = [
        'head'   => 'head',
        'bizRes' => 'biz_res',
    ];

    public function validate()
    {
        Model::validateRequired('head', $this->head, true);
        Model::validateRequired('bizRes', $this->bizRes, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->head) {
            $res['head'] = null !== $this->head ? $this->head->toMap() : null;
        }
        if (null !== $this->bizRes) {
            $res['biz_res'] = $this->bizRes;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IifaaEkytResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['head'])) {
            $model->head = ResponseHead::fromMap($map['head']);
        }
        if (isset($map['biz_res'])) {
            $model->bizRes = $map['biz_res'];
        }

        return $model;
    }
}
