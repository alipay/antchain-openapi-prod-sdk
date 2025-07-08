<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class SpuPictureInfo extends Model
{
    // spu主图url
    /**
     * @example
     *
     * @var string
     */
    public $mainPic;

    // spu详情图片url
    /**
     * @example
     *
     * @var string[]
     */
    public $detailPic;
    protected $_name = [
        'mainPic'   => 'main_pic',
        'detailPic' => 'detail_pic',
    ];

    public function validate()
    {
        Model::validateRequired('mainPic', $this->mainPic, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->mainPic) {
            $res['main_pic'] = $this->mainPic;
        }
        if (null !== $this->detailPic) {
            $res['detail_pic'] = $this->detailPic;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SpuPictureInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['main_pic'])) {
            $model->mainPic = $map['main_pic'];
        }
        if (isset($map['detail_pic'])) {
            if (!empty($map['detail_pic'])) {
                $model->detailPic = $map['detail_pic'];
            }
        }

        return $model;
    }
}
