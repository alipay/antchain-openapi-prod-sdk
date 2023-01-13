<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_1f51f68dfc5d438387dbbaa76f5997f4\Models;

use AlibabaCloud\Tea\Model;

class PhaseItem extends Model
{
    // 标题
    /**
     * @example 123
     *
     * @var string
     */
    public $title;

    // 类型
    // TEXT: 文本，
    // IMAGE： 图片,
    // VIDEO:  视频,
    // LONGTEXT: 长文本,
    // MAP: 地图,
    // BANNER: 广告位,
    // PDF: pdf文件,
    // CERTIFICATE: 认证信息
    // NESTED： 嵌套类型
    // CUSTOMIZE： 自定义类型
    /**
     * @example TEXT
     *
     * @var string
     */
    public $type;

    // 值
    /**
     * @example 1654570807000
     *
     * @var string
     */
    public $value;

    // 扩展信息
    /**
     * @example {"hello": "666"}
     *
     * @var string
     */
    public $extInfo;
    protected $_name = [
        'title'   => 'title',
        'type'    => 'type',
        'value'   => 'value',
        'extInfo' => 'ext_info',
    ];

    public function validate()
    {
        Model::validateRequired('title', $this->title, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('value', $this->value, true);
        Model::validateRequired('extInfo', $this->extInfo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PhaseItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }

        return $model;
    }
}
