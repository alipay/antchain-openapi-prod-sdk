<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class IPCodeIpOwnerInfo extends Model
{
    // 版权所有者名称
    /**
     * @example 丹尼尔
     *
     * @var string
     */
    public $ipOwnerName;

    // 版权方头像oss地址
    /**
     * @example OSS://BAASDT/YHNDSWOS/2021-07-16/kr6492x67fe68049/9ec4e7596f830ad9e1f297353e51ee0bf4b23a83c55126520a6b17b7ea95814e.jpg
     *
     * @var string
     */
    public $ipOwnerImage;

    // ip描述
    /**
     * @example 这是一段ip描述
     *
     * @var string
     */
    public $ipDescription;
    protected $_name = [
        'ipOwnerName'   => 'ip_owner_name',
        'ipOwnerImage'  => 'ip_owner_image',
        'ipDescription' => 'ip_description',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->ipOwnerName) {
            $res['ip_owner_name'] = $this->ipOwnerName;
        }
        if (null !== $this->ipOwnerImage) {
            $res['ip_owner_image'] = $this->ipOwnerImage;
        }
        if (null !== $this->ipDescription) {
            $res['ip_description'] = $this->ipDescription;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IPCodeIpOwnerInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ip_owner_name'])) {
            $model->ipOwnerName = $map['ip_owner_name'];
        }
        if (isset($map['ip_owner_image'])) {
            $model->ipOwnerImage = $map['ip_owner_image'];
        }
        if (isset($map['ip_description'])) {
            $model->ipDescription = $map['ip_description'];
        }

        return $model;
    }
}
