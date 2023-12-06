<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTC\Models;

use AlibabaCloud\Tea\Model;

class AvatarMaterialDTO extends Model
{
    // 装扮id
    /**
     * @example 1111
     *
     * @var string
     */
    public $decoId;

    // 装扮名称
    /**
     * @example 湖人主场球衣
     *
     * @var string
     */
    public $decoName;

    // webGl ab包地址
    /**
     * @example https://mdn.alipayobjects.com/huamei_n3jbep/afts/ab/A*eG-PSZRxPfwAAAAAAAAAAAAADgt8AA/original
     *
     * @var string
     */
    public $webAbUrl;

    // 贴图文件配置
    /**
     * @example https://mdn.alipayobjects.com/huamei_n3jbep/afts/ab/A*eG-PSZRxPfwAAAAAAAAAAAAADgt8AA/original
     *
     * @var string
     */
    public $textureUrl;

    // 缩略图
    /**
     * @example https://www.xx.com
     *
     * @var string
     */
    public $thumbnail;

    // json字符串，装扮额外属性信息
    // 如自定义头发颜色，性别等
    /**
     * @example {"COLOR":"0F#1111","GENDER":"MALE"}
     *
     * @var string
     */
    public $avatarPvJson;
    protected $_name = [
        'decoId'       => 'deco_id',
        'decoName'     => 'deco_name',
        'webAbUrl'     => 'web_ab_url',
        'textureUrl'   => 'texture_url',
        'thumbnail'    => 'thumbnail',
        'avatarPvJson' => 'avatar_pv_json',
    ];

    public function validate()
    {
        Model::validateRequired('decoId', $this->decoId, true);
        Model::validateRequired('decoName', $this->decoName, true);
        Model::validateRequired('webAbUrl', $this->webAbUrl, true);
        Model::validateRequired('textureUrl', $this->textureUrl, true);
        Model::validateRequired('thumbnail', $this->thumbnail, true);
        Model::validateRequired('avatarPvJson', $this->avatarPvJson, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->decoId) {
            $res['deco_id'] = $this->decoId;
        }
        if (null !== $this->decoName) {
            $res['deco_name'] = $this->decoName;
        }
        if (null !== $this->webAbUrl) {
            $res['web_ab_url'] = $this->webAbUrl;
        }
        if (null !== $this->textureUrl) {
            $res['texture_url'] = $this->textureUrl;
        }
        if (null !== $this->thumbnail) {
            $res['thumbnail'] = $this->thumbnail;
        }
        if (null !== $this->avatarPvJson) {
            $res['avatar_pv_json'] = $this->avatarPvJson;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AvatarMaterialDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['deco_id'])) {
            $model->decoId = $map['deco_id'];
        }
        if (isset($map['deco_name'])) {
            $model->decoName = $map['deco_name'];
        }
        if (isset($map['web_ab_url'])) {
            $model->webAbUrl = $map['web_ab_url'];
        }
        if (isset($map['texture_url'])) {
            $model->textureUrl = $map['texture_url'];
        }
        if (isset($map['thumbnail'])) {
            $model->thumbnail = $map['thumbnail'];
        }
        if (isset($map['avatar_pv_json'])) {
            $model->avatarPvJson = $map['avatar_pv_json'];
        }

        return $model;
    }
}
