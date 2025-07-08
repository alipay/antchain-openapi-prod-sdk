<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class SimSpuInfo extends Model
{
    // SPU ID
    /**
     * @example
     *
     * @var string
     */
    public $spuId;

    // spu名称
    /**
     * @example
     *
     * @var string
     */
    public $spuName;

    // spu图片信息
    /**
     * @example
     *
     * @var SpuPictureInfo
     */
    public $spuPictureInfo;
    protected $_name = [
        'spuId'          => 'spu_id',
        'spuName'        => 'spu_name',
        'spuPictureInfo' => 'spu_picture_info',
    ];

    public function validate()
    {
        Model::validateRequired('spuId', $this->spuId, true);
        Model::validateRequired('spuName', $this->spuName, true);
        Model::validateRequired('spuPictureInfo', $this->spuPictureInfo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->spuId) {
            $res['spu_id'] = $this->spuId;
        }
        if (null !== $this->spuName) {
            $res['spu_name'] = $this->spuName;
        }
        if (null !== $this->spuPictureInfo) {
            $res['spu_picture_info'] = null !== $this->spuPictureInfo ? $this->spuPictureInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SimSpuInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['spu_id'])) {
            $model->spuId = $map['spu_id'];
        }
        if (isset($map['spu_name'])) {
            $model->spuName = $map['spu_name'];
        }
        if (isset($map['spu_picture_info'])) {
            $model->spuPictureInfo = SpuPictureInfo::fromMap($map['spu_picture_info']);
        }

        return $model;
    }
}
