<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class ListenerSecurityIp extends Model
{
    // access_control
    /**
     * @example true, false
     *
     * @var bool
     */
    public $accessControl;

    // ips
    /**
     * @example
     *
     * @var string[]
     */
    public $ips;
    protected $_name = [
        'accessControl' => 'access_control',
        'ips'           => 'ips',
    ];

    public function validate()
    {
        Model::validateRequired('accessControl', $this->accessControl, true);
        Model::validateRequired('ips', $this->ips, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accessControl) {
            $res['access_control'] = $this->accessControl;
        }
        if (null !== $this->ips) {
            $res['ips'] = $this->ips;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListenerSecurityIp
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['access_control'])) {
            $model->accessControl = $map['access_control'];
        }
        if (isset($map['ips'])) {
            if (!empty($map['ips'])) {
                $model->ips = $map['ips'];
            }
        }

        return $model;
    }
}
