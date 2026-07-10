<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class EvidenceUrlInfo extends Model
{
    // 取证网址
    /**
     * @example www.baidu.com
     *
     * @var string
     */
    public $url;

    // 音视频取证时间
    /**
     * @example 10
     *
     * @var int
     */
    public $autoSurfingMinute;
    protected $_name = [
        'url'               => 'url',
        'autoSurfingMinute' => 'auto_surfing_minute',
    ];

    public function validate()
    {
        Model::validateRequired('url', $this->url, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->autoSurfingMinute) {
            $res['auto_surfing_minute'] = $this->autoSurfingMinute;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EvidenceUrlInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['url'])) {
            $model->url = $map['url'];
        }
        if (isset($map['auto_surfing_minute'])) {
            $model->autoSurfingMinute = $map['auto_surfing_minute'];
        }

        return $model;
    }
}
