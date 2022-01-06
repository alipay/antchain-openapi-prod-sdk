<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class TransparentProxyIpPair extends Model
{
    // 是否是默认值
    /**
     * @example 1
     *
     * @var int
     */
    public $defaultValue;

    // 起始IP
    /**
     * @example 127.0.0.0
     *
     * @var string
     */
    public $startIp;

    // 终止IP
    /**
     * @example 127.0.0.8
     *
     * @var string
     */
    public $endIp;
    protected $_name = [
        'defaultValue' => 'default_value',
        'startIp'      => 'start_ip',
        'endIp'        => 'end_ip',
    ];

    public function validate()
    {
        Model::validateRequired('startIp', $this->startIp, true);
        Model::validateRequired('endIp', $this->endIp, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->defaultValue) {
            $res['default_value'] = $this->defaultValue;
        }
        if (null !== $this->startIp) {
            $res['start_ip'] = $this->startIp;
        }
        if (null !== $this->endIp) {
            $res['end_ip'] = $this->endIp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TransparentProxyIpPair
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['default_value'])) {
            $model->defaultValue = $map['default_value'];
        }
        if (isset($map['start_ip'])) {
            $model->startIp = $map['start_ip'];
        }
        if (isset($map['end_ip'])) {
            $model->endIp = $map['end_ip'];
        }

        return $model;
    }
}
