<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class BatchcreateTraasmetaAppRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // apps
    /**
     * @var TraasAppDto[]
     */
    public $apps;
    protected $_name = [
        'authToken' => 'auth_token',
        'apps'      => 'apps',
    ];

    public function validate()
    {
        Model::validateRequired('apps', $this->apps, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->apps) {
            $res['apps'] = [];
            if (null !== $this->apps && \is_array($this->apps)) {
                $n = 0;
                foreach ($this->apps as $item) {
                    $res['apps'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchcreateTraasmetaAppRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['apps'])) {
            if (!empty($map['apps'])) {
                $model->apps = [];
                $n           = 0;
                foreach ($map['apps'] as $item) {
                    $model->apps[$n++] = null !== $item ? TraasAppDto::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
