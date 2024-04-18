<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class EvidenceWebUrlInfo extends Model
{
    // 取证网址
    /**
     * @example 取证网址
     *
     * @var string
     */
    public $webUrl;

    // 取证名称
    /**
     * @example 取证名称
     *
     * @var string
     */
    public $title;
    protected $_name = [
        'webUrl' => 'web_url',
        'title'  => 'title',
    ];

    public function validate()
    {
        Model::validateRequired('webUrl', $this->webUrl, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->webUrl) {
            $res['web_url'] = $this->webUrl;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EvidenceWebUrlInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['web_url'])) {
            $model->webUrl = $map['web_url'];
        }
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }

        return $model;
    }
}
