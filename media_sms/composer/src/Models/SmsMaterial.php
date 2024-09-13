<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MEDIA_SMS\Models;

use AlibabaCloud\Tea\Model;

class SmsMaterial extends Model
{
    // 素材名称，当素材类型
    // 为"text/plain"时可不传，其他情况必传
    /**
     * @example 图片1
     *
     * @var string
     */
    public $materialName;

    // 素材类型
    // 本期最多只⽀持⼀张图⽚和⼀段⽂本信息；变量占位符只能是按顺序的数字{1}-{9},最多⽀持9个变量；链接中的变量只能放在尾部，如：http://aabbcc/{1}
    /**
     * @example 1、图⽚ "image/png" "image/jpg" "image/gif" "image/jpeg" 2、视频 "video/mp4" "video/3gp" 3、⾳频 "audio/mp3" "audio/amr" "audio/aac" 4、⽂本 "text/plain"
     *
     * @var string
     */
    public $materialType;

    // 素材内容
    /**
     * @example  1、⽂本：原内容 2、图⽚/视频/⾳ 频：base64编码之 后的字符串
     *
     * @var string
     */
    public $materialContent;
    protected $_name = [
        'materialName'    => 'material_name',
        'materialType'    => 'material_type',
        'materialContent' => 'material_content',
    ];

    public function validate()
    {
        Model::validateRequired('materialType', $this->materialType, true);
        Model::validateRequired('materialContent', $this->materialContent, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->materialName) {
            $res['material_name'] = $this->materialName;
        }
        if (null !== $this->materialType) {
            $res['material_type'] = $this->materialType;
        }
        if (null !== $this->materialContent) {
            $res['material_content'] = $this->materialContent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SmsMaterial
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['material_name'])) {
            $model->materialName = $map['material_name'];
        }
        if (isset($map['material_type'])) {
            $model->materialType = $map['material_type'];
        }
        if (isset($map['material_content'])) {
            $model->materialContent = $map['material_content'];
        }

        return $model;
    }
}
