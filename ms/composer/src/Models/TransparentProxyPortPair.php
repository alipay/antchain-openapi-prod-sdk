<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class TransparentProxyPortPair extends Model
{
    // 是否是默认值
    /**
     * @example 1
     *
     * @var int
     */
    public $defaultValue;

    // 端口
    /**
     * @example 1024
     *
     * @var int
     */
    public $endPort;

    // 起始端口
    /**
     * @example 81
     *
     * @var int
     */
    public $startPort;
    protected $_name = [
        'defaultValue' => 'default_value',
        'endPort'      => 'end_port',
        'startPort'    => 'start_port',
    ];

    public function validate()
    {
        Model::validateRequired('endPort', $this->endPort, true);
        Model::validateRequired('startPort', $this->startPort, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->defaultValue) {
            $res['default_value'] = $this->defaultValue;
        }
        if (null !== $this->endPort) {
            $res['end_port'] = $this->endPort;
        }
        if (null !== $this->startPort) {
            $res['start_port'] = $this->startPort;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TransparentProxyPortPair
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['default_value'])) {
            $model->defaultValue = $map['default_value'];
        }
        if (isset($map['end_port'])) {
            $model->endPort = $map['end_port'];
        }
        if (isset($map['start_port'])) {
            $model->startPort = $map['start_port'];
        }

        return $model;
    }
}
