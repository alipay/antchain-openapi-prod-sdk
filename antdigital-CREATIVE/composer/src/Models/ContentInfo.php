<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVE\Models;

use AlibabaCloud\Tea\Model;

use AntChain\CREATIVE\Models\ContentUrl;

class ContentInfo extends Model {
    protected $_name = [
        'type' => 'type',
        'text' => 'text',
        'url' => 'url',
        'role' => 'role',
    ];
    public function validate() {
        Model::validateRequired('type', $this->type, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->text) {
            $res['text'] = $this->text;
        }
        if (null !== $this->url) {
            $res['url'] = null !== $this->url ? $this->url->toMap() : null;
        }
        if (null !== $this->role) {
            $res['role'] = $this->role;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ContentInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['text'])){
            $model->text = $map['text'];
        }
        if(isset($map['url'])){
            $model->url = ContentUrl::fromMap($map['url']);
        }
        if(isset($map['role'])){
            $model->role = $map['role'];
        }
        return $model;
    }
    // 类型
    /**
     * @example text
     * @var string
     */
    public $type;

    // type=text时提供，文本
    /**
     * @example 生成一只猫
     * @var string
     */
    public $text;

    // type=xxx_url时提供
    /**
     * @example www.test.com/123
     * @var ContentUrl
     */
    public $url;

    // 角色
    /**
     * @example reference_image
     * @var string
     */
    public $role;

}
