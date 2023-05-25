<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class AntScanImage extends Model
{
    // 镜像名称
    /**
     * @example reg.docker.alibaba-inc.com/imagesecurity/test:v2
     *
     * @var string
     */
    public $image;

    // app名称
    /**
     * @example test
     *
     * @var string
     */
    public $appName;
    protected $_name = [
        'image'   => 'image',
        'appName' => 'app_name',
    ];

    public function validate()
    {
        Model::validateRequired('image', $this->image, true);
        Model::validateRequired('appName', $this->appName, true);
    }

    public function toMap()
    {
        $res = [];
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
     * @return AntScanImage
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['image'])) {
            $model->image = $map['image'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }

        return $model;
    }
}
