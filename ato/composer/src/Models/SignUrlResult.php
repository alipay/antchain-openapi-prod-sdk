<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class SignUrlResult extends Model
{
    // 签署（长）链接
    /**
     * @example https://xxxx.com
     *
     * @var string
     */
    public $url;

    // 签署短链接
    /**
     * @example https://xxxx.com
     *
     * @var string
     */
    public $shortUrl;

    // 签署链接提示信息
    /**
     * @example 签署链接创建成功
     *
     * @var string
     */
    public $signMsg;
    protected $_name = [
        'url'      => 'url',
        'shortUrl' => 'short_url',
        'signMsg'  => 'sign_msg',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->shortUrl) {
            $res['short_url'] = $this->shortUrl;
        }
        if (null !== $this->signMsg) {
            $res['sign_msg'] = $this->signMsg;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SignUrlResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['url'])) {
            $model->url = $map['url'];
        }
        if (isset($map['short_url'])) {
            $model->shortUrl = $map['short_url'];
        }
        if (isset($map['sign_msg'])) {
            $model->signMsg = $map['sign_msg'];
        }

        return $model;
    }
}
