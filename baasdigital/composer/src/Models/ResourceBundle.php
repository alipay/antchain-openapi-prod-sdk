<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDIGITAL\Models;

use AlibabaCloud\Tea\Model;

class ResourceBundle extends Model
{
    // 可公开访问的资源地址
    /**
     * @example https://domain/file/tv5aioiqzrn1at9haj2f.jpg
     *
     * @var string
     */
    public $uri;

    // 上传资源时指定的资源类型
    /**
     * @example image/jpeg
     *
     * @var string
     */
    public $type;

    // 资源描述
    /**
     * @example 资源描述
     *
     * @var string
     */
    public $description;
    protected $_name = [
        'uri'         => 'uri',
        'type'        => 'type',
        'description' => 'description',
    ];

    public function validate()
    {
        Model::validateRequired('uri', $this->uri, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateMinLength('uri', $this->uri, 1);
        Model::validateMinLength('type', $this->type, 1);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->uri) {
            $res['uri'] = $this->uri;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ResourceBundle
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['uri'])) {
            $model->uri = $map['uri'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }

        return $model;
    }
}
