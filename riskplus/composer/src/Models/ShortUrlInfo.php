<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class ShortUrlInfo extends Model
{
    // 支持卡片短信的手机号
    /**
     * @example 15012345678
     *
     * @var string
     */
    public $mobile;

    // 解析生成的短链
    /**
     * @example https://www.alipay.com/F49v0ifM
     *
     * @var string
     */
    public $shortUrl;
    protected $_name = [
        'mobile'   => 'mobile',
        'shortUrl' => 'short_url',
    ];

    public function validate()
    {
        Model::validateRequired('mobile', $this->mobile, true);
        Model::validateRequired('shortUrl', $this->shortUrl, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->shortUrl) {
            $res['short_url'] = $this->shortUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ShortUrlInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['short_url'])) {
            $model->shortUrl = $map['short_url'];
        }

        return $model;
    }
}
