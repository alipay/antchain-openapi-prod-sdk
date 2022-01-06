<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class ActionModel extends Model
{
    // 拓展信息
    /**
     * @example 拦截还是监控
     *
     * @var string
     */
    public $extension;

    // REJECT/PASS
    /**
     * @example REJECT
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'extension' => 'extension',
        'type'      => 'type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->extension) {
            $res['extension'] = $this->extension;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ActionModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['extension'])) {
            $model->extension = $map['extension'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
