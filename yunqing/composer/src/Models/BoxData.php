<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class BoxData extends Model
{
    // 装箱数据类型
    /**
     * @example APP_INSTANCE
     *
     * @var string
     */
    public $type;

    // 装箱的json数据
    /**
     * @example {}
     *
     * @var string
     */
    public $data;

    // 装箱数据版本
    /**
     * @example 1.0
     *
     * @var string
     */
    public $version;
    protected $_name = [
        'type'    => 'type',
        'data'    => 'data',
        'version' => 'version',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('data', $this->data, true);
        Model::validateRequired('version', $this->version, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BoxData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }

        return $model;
    }
}
