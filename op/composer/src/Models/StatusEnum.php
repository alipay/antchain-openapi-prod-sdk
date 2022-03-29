<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\OP\Models;

use AlibabaCloud\Tea\Model;

class StatusEnum extends Model
{
    // api状态码
    /**
     * @example INIT
     *
     * @var string
     */
    public $code;

    // api状态码描述
    /**
     * @example 离线
     *
     * @var string
     */
    public $description;
    protected $_name = [
        'code'        => 'code',
        'description' => 'description',
    ];

    public function validate()
    {
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('description', $this->description, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StatusEnum
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }

        return $model;
    }
}
