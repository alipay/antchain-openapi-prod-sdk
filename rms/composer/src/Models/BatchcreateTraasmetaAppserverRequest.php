<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class BatchcreateTraasmetaAppserverRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // app_servers
    /**
     * @var TraasAppServerDto[]
     */
    public $appServers;
    protected $_name = [
        'authToken'  => 'auth_token',
        'appServers' => 'app_servers',
    ];

    public function validate()
    {
        Model::validateRequired('appServers', $this->appServers, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->appServers) {
            $res['app_servers'] = [];
            if (null !== $this->appServers && \is_array($this->appServers)) {
                $n = 0;
                foreach ($this->appServers as $item) {
                    $res['app_servers'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchcreateTraasmetaAppserverRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['app_servers'])) {
            if (!empty($map['app_servers'])) {
                $model->appServers = [];
                $n                 = 0;
                foreach ($map['app_servers'] as $item) {
                    $model->appServers[$n++] = null !== $item ? TraasAppServerDto::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
