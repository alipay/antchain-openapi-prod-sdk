<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class HostAlias extends Model
{
    // Hostnames for the above IP address.
    /**
     * @example
     *
     * @var string[]
     */
    public $hostnames;

    // IP address of the host file entry.
    //
    /**
     * @example 192.168.1.1
     *
     * @var string
     */
    public $ip;
    protected $_name = [
        'hostnames' => 'hostnames',
        'ip'        => 'ip',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->hostnames) {
            $res['hostnames'] = $this->hostnames;
        }
        if (null !== $this->ip) {
            $res['ip'] = $this->ip;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return HostAlias
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['hostnames'])) {
            if (!empty($map['hostnames'])) {
                $model->hostnames = $map['hostnames'];
            }
        }
        if (isset($map['ip'])) {
            $model->ip = $map['ip'];
        }

        return $model;
    }
}
