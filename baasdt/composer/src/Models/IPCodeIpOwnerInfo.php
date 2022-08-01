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

    // 版权方头像，临时访问地址，可直接访问
    /**
     * @example http://xxx
     *
     * @var string
     */
    public $ipOwnerImageTmp;

    // ip描述
    /**
     * @example 这是一段ip描述
     *
     * @var string
     */
    public $ipDescription;

    // 默认为空或者0是版权信息；1是著作信息；2是创作信息；3是联名信息；4是自定义
    /**
     * @example
     *
     * @var int
     */
    public $ipOwnerType;

    // 自定义资质信息类型
    /**
     * @example 资质信息
     *
     * @var string
     */
    public $ipOwnerCustom;
    protected $_name = [
        'ipOwnerName'     => 'ip_owner_name',
        'ipOwnerImage'    => 'ip_owner_image',
        'ipOwnerImageTmp' => 'ip_owner_image_tmp',
        'ipDescription'   => 'ip_description',
        'ipOwnerType'     => 'ip_owner_type',
        'ipOwnerCustom'   => 'ip_owner_custom',
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
        if (null !== $this->ipOwnerImageTmp) {
            $res['ip_owner_image_tmp'] = $this->ipOwnerImageTmp;
        }
        if (null !== $this->ipDescription) {
            $res['ip_description'] = $this->ipDescription;
        }
        if (null !== $this->ipOwnerType) {
            $res['ip_owner_type'] = $this->ipOwnerType;
        }
        if (null !== $this->ipOwnerCustom) {
            $res['ip_owner_custom'] = $this->ipOwnerCustom;
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
        if (isset($map['ip_owner_image_tmp'])) {
            $model->ipOwnerImageTmp = $map['ip_owner_image_tmp'];
        }
        if (isset($map['ip_description'])) {
            $model->ipDescription = $map['ip_description'];
        }
        if (isset($map['ip_owner_type'])) {
            $model->ipOwnerType = $map['ip_owner_type'];
        }
        if (isset($map['ip_owner_custom'])) {
            $model->ipOwnerCustom = $map['ip_owner_custom'];
        }

        return $model;
    }
}
