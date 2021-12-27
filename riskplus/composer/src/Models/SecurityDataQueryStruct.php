<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class SecurityDataQueryStruct extends Model
{
    // 请求数据参数
    /**
     * @example {}
     *
     * @var string
     */
    public $params;

    // 请求数据类型
    /**
     * @example IP
     *
     * @var string
     */
    public $type;

    // 请求数据版本
    /**
     * @example 1.0
     *
     * @var string
     */
    public $version;
    protected $_name = [
        'params'  => 'params',
        'type'    => 'type',
        'version' => 'version',
    ];

    public function validate()
    {
        Model::validateRequired('params', $this->params, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('version', $this->version, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->params) {
            $res['params'] = $this->params;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SecurityDataQueryStruct
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['params'])) {
            $model->params = $map['params'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }

        return $model;
    }
}
