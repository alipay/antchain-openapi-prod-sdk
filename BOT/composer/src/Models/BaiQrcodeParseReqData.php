<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class BaiQrcodeParseReqData extends Model
{
    // 待识别图片的url
    /**
     * @example http://testImage.com/xxxxx
     *
     * @var string
     */
    public $imageUrl;
    protected $_name = [
        'imageUrl' => 'image_url',
    ];

    public function validate()
    {
        Model::validateRequired('imageUrl', $this->imageUrl, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->imageUrl) {
            $res['image_url'] = $this->imageUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BaiQrcodeParseReqData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['image_url'])) {
            $model->imageUrl = $map['image_url'];
        }

        return $model;
    }
}
