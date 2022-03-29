<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ComponentContent extends Model
{
    // 文本内容
    /**
     * @example 请检查是否存在拼写错误
     *
     * @var string
     */
    public $content;

    // 超链接
    /**
     * @example http://www.yueque.com
     *
     * @var string
     */
    public $url;

    // 是否粗体
    /**
     * @example true, false
     *
     * @var bool
     */
    public $bold;
    protected $_name = [
        'content' => 'content',
        'url'     => 'url',
        'bold'    => 'bold',
    ];

    public function validate()
    {
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('bold', $this->bold, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->bold) {
            $res['bold'] = $this->bold;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ComponentContent
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['url'])) {
            $model->url = $map['url'];
        }
        if (isset($map['bold'])) {
            $model->bold = $map['bold'];
        }

        return $model;
    }
}
