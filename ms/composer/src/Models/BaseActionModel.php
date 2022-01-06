<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class BaseActionModel extends Model
{
    // 行为类型REJECT/PASS
    /**
     * @example PASS
     *
     * @var string
     */
    public $type;

    // 扩展字段
    /**
     * @example 暂无
     *
     * @var string
     */
    public $extension;

    // 开启状态
    /**
     * @example true, false
     *
     * @var bool
     */
    public $enabled;
    protected $_name = [
        'type'      => 'type',
        'extension' => 'extension',
        'enabled'   => 'enabled',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->extension) {
            $res['extension'] = $this->extension;
        }
        if (null !== $this->enabled) {
            $res['enabled'] = $this->enabled;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BaseActionModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['extension'])) {
            $model->extension = $map['extension'];
        }
        if (isset($map['enabled'])) {
            $model->enabled = $map['enabled'];
        }

        return $model;
    }
}
