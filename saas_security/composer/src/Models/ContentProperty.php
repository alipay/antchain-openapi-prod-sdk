<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SAAS_SECURITY\Models;

use AlibabaCloud\Tea\Model;

class ContentProperty extends Model
{
    // 123
    /**
     * @example 123
     *
     * @var string
     */
    public $text;

    // 213
    /**
     * @example 123
     *
     * @var string[]
     */
    public $textList;

    // 123
    /**
     * @example
     *
     * @var string[]
     */
    public $urls;

    // 123
    /**
     * @example 123
     *
     * @var ContentAddress[]
     */
    public $pictures;

    // 123
    /**
     * @example 123
     *
     * @var ContentAddress[]
     */
    public $videos;

    // 123
    /**
     * @example 123
     *
     * @var ContentAddress[]
     */
    public $audios;
    protected $_name = [
        'text'     => 'text',
        'textList' => 'text_list',
        'urls'     => 'urls',
        'pictures' => 'pictures',
        'videos'   => 'videos',
        'audios'   => 'audios',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->text) {
            $res['text'] = $this->text;
        }
        if (null !== $this->textList) {
            $res['text_list'] = $this->textList;
        }
        if (null !== $this->urls) {
            $res['urls'] = $this->urls;
        }
        if (null !== $this->pictures) {
            $res['pictures'] = [];
            if (null !== $this->pictures && \is_array($this->pictures)) {
                $n = 0;
                foreach ($this->pictures as $item) {
                    $res['pictures'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->videos) {
            $res['videos'] = [];
            if (null !== $this->videos && \is_array($this->videos)) {
                $n = 0;
                foreach ($this->videos as $item) {
                    $res['videos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->audios) {
            $res['audios'] = [];
            if (null !== $this->audios && \is_array($this->audios)) {
                $n = 0;
                foreach ($this->audios as $item) {
                    $res['audios'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContentProperty
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['text'])) {
            $model->text = $map['text'];
        }
        if (isset($map['text_list'])) {
            if (!empty($map['text_list'])) {
                $model->textList = $map['text_list'];
            }
        }
        if (isset($map['urls'])) {
            if (!empty($map['urls'])) {
                $model->urls = $map['urls'];
            }
        }
        if (isset($map['pictures'])) {
            if (!empty($map['pictures'])) {
                $model->pictures = [];
                $n               = 0;
                foreach ($map['pictures'] as $item) {
                    $model->pictures[$n++] = null !== $item ? ContentAddress::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['videos'])) {
            if (!empty($map['videos'])) {
                $model->videos = [];
                $n             = 0;
                foreach ($map['videos'] as $item) {
                    $model->videos[$n++] = null !== $item ? ContentAddress::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['audios'])) {
            if (!empty($map['audios'])) {
                $model->audios = [];
                $n             = 0;
                foreach ($map['audios'] as $item) {
                    $model->audios[$n++] = null !== $item ? ContentAddress::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
