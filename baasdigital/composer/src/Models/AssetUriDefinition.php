<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDIGITAL\Models;

use AlibabaCloud\Tea\Model;

class AssetUriDefinition extends Model
{
    // 数字权证名称
    /**
     * @example xxx权证
     *
     * @var string
     */
    public $name;

    // 数字权证描述
    /**
     * @example xxx权证
     *
     * @var string
     */
    public $description;

    // 该权证的图片地址
    /**
     * @example https://domain/file/tv5aioiqzrn1at9haj2f.jpg
     *
     * @var string
     */
    public $image;

    // 资产指向外部的链接
    /**
     * @example http://xxxxxx
     *
     * @var string
     */
    public $externalUrl;

    // 背景颜色, 16进制6位Hex
    /**
     * @example FFFFFF
     *
     * @var string
     */
    public $backgroundColor;

    // 动态资源地址，可指向音视频资源，需先上传
    /**
     * @example https://domain/file/tv5aioiqzrn1at9haj2f.mp4
     *
     * @var string
     */
    public $animationUrl;

    // 资源集合，可定义多个组合资源，适合有多资源文件的资产
    /**
     * @example
     *
     * @var ResourceBundle[]
     */
    public $resourceBundle;

    // 自定义的资产属性数组，数组元素需为json格式
    /**
     * @example [{"display_type":"date","trait_type":"birthday","value":1546360800}]
     *
     * @var string[]
     */
    public $attributes;
    protected $_name = [
        'name'            => 'name',
        'description'     => 'description',
        'image'           => 'image',
        'externalUrl'     => 'external_url',
        'backgroundColor' => 'background_color',
        'animationUrl'    => 'animation_url',
        'resourceBundle'  => 'resource_bundle',
        'attributes'      => 'attributes',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('image', $this->image, true);
        Model::validateMinLength('image', $this->image, 1);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->image) {
            $res['image'] = $this->image;
        }
        if (null !== $this->externalUrl) {
            $res['external_url'] = $this->externalUrl;
        }
        if (null !== $this->backgroundColor) {
            $res['background_color'] = $this->backgroundColor;
        }
        if (null !== $this->animationUrl) {
            $res['animation_url'] = $this->animationUrl;
        }
        if (null !== $this->resourceBundle) {
            $res['resource_bundle'] = [];
            if (null !== $this->resourceBundle && \is_array($this->resourceBundle)) {
                $n = 0;
                foreach ($this->resourceBundle as $item) {
                    $res['resource_bundle'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->attributes) {
            $res['attributes'] = $this->attributes;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AssetUriDefinition
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['image'])) {
            $model->image = $map['image'];
        }
        if (isset($map['external_url'])) {
            $model->externalUrl = $map['external_url'];
        }
        if (isset($map['background_color'])) {
            $model->backgroundColor = $map['background_color'];
        }
        if (isset($map['animation_url'])) {
            $model->animationUrl = $map['animation_url'];
        }
        if (isset($map['resource_bundle'])) {
            if (!empty($map['resource_bundle'])) {
                $model->resourceBundle = [];
                $n                     = 0;
                foreach ($map['resource_bundle'] as $item) {
                    $model->resourceBundle[$n++] = null !== $item ? ResourceBundle::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['attributes'])) {
            if (!empty($map['attributes'])) {
                $model->attributes = $map['attributes'];
            }
        }

        return $model;
    }
}
