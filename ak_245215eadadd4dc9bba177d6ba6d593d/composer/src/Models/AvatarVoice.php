<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models;

use AlibabaCloud\Tea\Model;

class AvatarVoice extends Model
{
    // 音色名称
    /**
     * @example 小薇-客服
     *
     * @var string
     */
    public $name;

    // 音色代码
    /**
     * @example voice_xiaowei
     *
     * @var string
     */
    public $code;

    // CLONE--克隆音色；
    // PRESET--预置；
    // CUSTOM--自定义，暂时不采用。
    /**
     * @example CLONE
     *
     * @var string
     */
    public $type;

    // 音色形象url
    /**
     * @example https://cdn.xsxsx.demo.png
     *
     * @var string
     */
    public $picUrl;

    // 试听音频片段
    /**
     * @example https://cdn.xsxsxs.aaa.wav
     *
     * @var string
     */
    public $demoUrl;
    protected $_name = [
        'name'    => 'name',
        'code'    => 'code',
        'type'    => 'type',
        'picUrl'  => 'pic_url',
        'demoUrl' => 'demo_url',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('picUrl', $this->picUrl, true);
        Model::validateRequired('demoUrl', $this->demoUrl, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->picUrl) {
            $res['pic_url'] = $this->picUrl;
        }
        if (null !== $this->demoUrl) {
            $res['demo_url'] = $this->demoUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AvatarVoice
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['pic_url'])) {
            $model->picUrl = $map['pic_url'];
        }
        if (isset($map['demo_url'])) {
            $model->demoUrl = $map['demo_url'];
        }

        return $model;
    }
}
