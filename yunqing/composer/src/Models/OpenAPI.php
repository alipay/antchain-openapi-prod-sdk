<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class OpenAPI extends Model
{
    // API方法
    /**
     * @example yunyou.yunqing.auth.import
     *
     * @var string
     */
    public $method;

    // API版本号
    /**
     * @example 1.0
     *
     * @var string
     */
    public $version;
    protected $_name = [
        'method'  => 'method',
        'version' => 'version',
    ];

    public function validate()
    {
        Model::validateRequired('method', $this->method, true);
        Model::validateRequired('version', $this->version, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->method) {
            $res['method'] = $this->method;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OpenAPI
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['method'])) {
            $model->method = $map['method'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }

        return $model;
    }
}
