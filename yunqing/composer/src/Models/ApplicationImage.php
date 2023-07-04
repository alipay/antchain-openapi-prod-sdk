<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class ApplicationImage extends Model
{
    // 架构:amd64，arm64
    /**
     * @example amd64
     *
     * @var string
     */
    public $arch;

    // 镜像名称
    /**
     * @example acs-reg.xxxx.com/ccc/xxxx
     *
     * @var string
     */
    public $image;
    protected $_name = [
        'arch'  => 'arch',
        'image' => 'image',
    ];

    public function validate()
    {
        Model::validateRequired('arch', $this->arch, true);
        Model::validateRequired('image', $this->image, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->arch) {
            $res['arch'] = $this->arch;
        }
        if (null !== $this->image) {
            $res['image'] = $this->image;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplicationImage
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['arch'])) {
            $model->arch = $map['arch'];
        }
        if (isset($map['image'])) {
            $model->image = $map['image'];
        }

        return $model;
    }
}
