<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class BaiQrcodeVerifyReqData extends Model
{
    // 二维码图片url
    /**
     * @example http://xxxxxx
     *
     * @var string
     */
    public $queryImageUrl;
    protected $_name = [
        'queryImageUrl' => 'query_image_url',
    ];

    public function validate()
    {
        Model::validateRequired('queryImageUrl', $this->queryImageUrl, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->queryImageUrl) {
            $res['query_image_url'] = $this->queryImageUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BaiQrcodeVerifyReqData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['query_image_url'])) {
            $model->queryImageUrl = $map['query_image_url'];
        }

        return $model;
    }
}
