<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class BatchcreateTraasmetaHostmachineRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // hosts
    /**
     * @var TraasHostMachineDto[]
     */
    public $hosts;
    protected $_name = [
        'authToken' => 'auth_token',
        'hosts'     => 'hosts',
    ];

    public function validate()
    {
        Model::validateRequired('hosts', $this->hosts, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->hosts) {
            $res['hosts'] = [];
            if (null !== $this->hosts && \is_array($this->hosts)) {
                $n = 0;
                foreach ($this->hosts as $item) {
                    $res['hosts'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchcreateTraasmetaHostmachineRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['hosts'])) {
            if (!empty($map['hosts'])) {
                $model->hosts = [];
                $n            = 0;
                foreach ($map['hosts'] as $item) {
                    $model->hosts[$n++] = null !== $item ? TraasHostMachineDto::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
