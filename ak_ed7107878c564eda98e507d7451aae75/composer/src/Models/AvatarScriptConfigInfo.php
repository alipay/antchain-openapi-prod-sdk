<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models;

use AlibabaCloud\Tea\Model;

class AvatarScriptConfigInfo extends Model
{
    // 唤醒词列表
    /**
     * @example ["你好"]
     *
     * @var string[]
     */
    public $wakeWords;

    // 欢迎语列表
    /**
     * @example ["你好我是数字人"]
     *
     * @var string[]
     */
    public $welcomePhrases;

    // 兜底语列表
    /**
     * @example ["对不起"]
     *
     * @var string[]
     */
    public $fallbackPhrases;
    protected $_name = [
        'wakeWords'       => 'wake_words',
        'welcomePhrases'  => 'welcome_phrases',
        'fallbackPhrases' => 'fallback_phrases',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->wakeWords) {
            $res['wake_words'] = $this->wakeWords;
        }
        if (null !== $this->welcomePhrases) {
            $res['welcome_phrases'] = $this->welcomePhrases;
        }
        if (null !== $this->fallbackPhrases) {
            $res['fallback_phrases'] = $this->fallbackPhrases;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AvatarScriptConfigInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['wake_words'])) {
            if (!empty($map['wake_words'])) {
                $model->wakeWords = $map['wake_words'];
            }
        }
        if (isset($map['welcome_phrases'])) {
            if (!empty($map['welcome_phrases'])) {
                $model->welcomePhrases = $map['welcome_phrases'];
            }
        }
        if (isset($map['fallback_phrases'])) {
            if (!empty($map['fallback_phrases'])) {
                $model->fallbackPhrases = $map['fallback_phrases'];
            }
        }

        return $model;
    }
}
