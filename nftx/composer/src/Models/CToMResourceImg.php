<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTX\Models;

use AlibabaCloud\Tea\Model;

class CToMResourceImg extends Model
{
    // 预览图
    /**
     * @example 预览图
     *
     * @var string
     */
    public $thumbnailUrl;

    // 高清图
    /**
     * @example 高清图
     *
     * @var string
     */
    public $highDefinitionUrl;

    // key
    /**
     * @example key
     *
     * @var string
     */
    public $key;
    protected $_name = [
        'thumbnailUrl'      => 'thumbnail_url',
        'highDefinitionUrl' => 'high_definition_url',
        'key'               => 'key',
    ];

    public function validate()
    {
        Model::validateRequired('thumbnailUrl', $this->thumbnailUrl, true);
        Model::validateRequired('highDefinitionUrl', $this->highDefinitionUrl, true);
        Model::validateRequired('key', $this->key, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->thumbnailUrl) {
            $res['thumbnail_url'] = $this->thumbnailUrl;
        }
        if (null !== $this->highDefinitionUrl) {
            $res['high_definition_url'] = $this->highDefinitionUrl;
        }
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CToMResourceImg
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['thumbnail_url'])) {
            $model->thumbnailUrl = $map['thumbnail_url'];
        }
        if (isset($map['high_definition_url'])) {
            $model->highDefinitionUrl = $map['high_definition_url'];
        }
        if (isset($map['key'])) {
            $model->key = $map['key'];
        }

        return $model;
    }
}
