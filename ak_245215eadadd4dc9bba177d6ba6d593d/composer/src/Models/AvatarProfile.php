<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models;

use AlibabaCloud\Tea\Model;

class AvatarProfile extends Model
{
    // 190087
    /**
     * @example 数字人形象id
     *
     * @var string
     */
    public $avatarId;

    // 数字人形象名称
    /**
     * @example 灵韵-坐姿
     *
     * @var string
     */
    public $name;

    // CUSTOM---定制；
    // PRESET---预置
    /**
     * @example CUSTOM
     *
     * @var string
     */
    public $type;

    // 位置信息等配置信息
    /**
     * @example {"leftOffset":0,"topOffset":866,"width":1080}
     *
     * @var string
     */
    public $conf;

    // 数字人形象图片
    /**
     * @example https://3123.png
     *
     * @var string
     */
    public $picUrl;

    // 背景图片地址
    /**
     * @example https://aaaa.png
     *
     * @var string
     */
    public $bgUrl;
    protected $_name = [
        'avatarId' => 'avatar_id',
        'name'     => 'name',
        'type'     => 'type',
        'conf'     => 'conf',
        'picUrl'   => 'pic_url',
        'bgUrl'    => 'bg_url',
    ];

    public function validate()
    {
        Model::validateRequired('avatarId', $this->avatarId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('picUrl', $this->picUrl, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->avatarId) {
            $res['avatar_id'] = $this->avatarId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->conf) {
            $res['conf'] = $this->conf;
        }
        if (null !== $this->picUrl) {
            $res['pic_url'] = $this->picUrl;
        }
        if (null !== $this->bgUrl) {
            $res['bg_url'] = $this->bgUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AvatarProfile
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['avatar_id'])) {
            $model->avatarId = $map['avatar_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['conf'])) {
            $model->conf = $map['conf'];
        }
        if (isset($map['pic_url'])) {
            $model->picUrl = $map['pic_url'];
        }
        if (isset($map['bg_url'])) {
            $model->bgUrl = $map['bg_url'];
        }

        return $model;
    }
}
