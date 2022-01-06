<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class TransparentProxyBound extends Model
{
    // 端口段
    /**
     * @example
     *
     * @var TransparentProxyPortPair[]
     */
    public $portRange;

    // 网段
    /**
     * @example
     *
     * @var TransparentProxyIpPair[]
     */
    public $ipRange;
    protected $_name = [
        'portRange' => 'port_range',
        'ipRange'   => 'ip_range',
    ];

    public function validate()
    {
        Model::validateRequired('portRange', $this->portRange, true);
        Model::validateRequired('ipRange', $this->ipRange, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->portRange) {
            $res['port_range'] = [];
            if (null !== $this->portRange && \is_array($this->portRange)) {
                $n = 0;
                foreach ($this->portRange as $item) {
                    $res['port_range'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->ipRange) {
            $res['ip_range'] = [];
            if (null !== $this->ipRange && \is_array($this->ipRange)) {
                $n = 0;
                foreach ($this->ipRange as $item) {
                    $res['ip_range'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TransparentProxyBound
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['port_range'])) {
            if (!empty($map['port_range'])) {
                $model->portRange = [];
                $n                = 0;
                foreach ($map['port_range'] as $item) {
                    $model->portRange[$n++] = null !== $item ? TransparentProxyPortPair::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['ip_range'])) {
            if (!empty($map['ip_range'])) {
                $model->ipRange = [];
                $n              = 0;
                foreach ($map['ip_range'] as $item) {
                    $model->ipRange[$n++] = null !== $item ? TransparentProxyIpPair::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
