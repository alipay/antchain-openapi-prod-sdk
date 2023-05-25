<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class GetImageRiskdetailurlRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 镜像地址
    /**
     * @var string
     */
    public $image;

    // 应用名称
    /**
     * @var string
     */
    public $appName;
    protected $_name = [
        'authToken' => 'auth_token',
        'image'     => 'image',
        'appName'   => 'app_name',
    ];

    public function validate()
    {
        Model::validateRequired('image', $this->image, true);
        Model::validateRequired('appName', $this->appName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->image) {
            $res['image'] = $this->image;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetImageRiskdetailurlRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['image'])) {
            $model->image = $map['image'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }

        return $model;
    }
}
