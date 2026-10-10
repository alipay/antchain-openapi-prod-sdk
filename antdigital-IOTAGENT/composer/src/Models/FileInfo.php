<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class FileInfo extends Model {
    protected $_name = [
        'name' => 'name',
        'type' => 'type',
        'url' => 'url',
        'createdAt' => 'created_at',
        'id' => 'id',
    ];
    public function validate() {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('url', $this->url, true);
        Model::validateRequired('createdAt', $this->createdAt, true);
        Model::validateRequired('id', $this->id, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->createdAt) {
            $res['created_at'] = $this->createdAt;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return FileInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['url'])){
            $model->url = $map['url'];
        }
        if(isset($map['created_at'])){
            $model->createdAt = $map['created_at'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        return $model;
    }
    // 文件名称
    /**
     * @example 文件名称
     * @var string
     */
    public $name;

    // 文件类型
    /**
     * @example 文件类型
     * @var string
     */
    public $type;

    // oss地址
    /**
     * @example oss地址
     * @var string
     */
    public $url;

    // 创建时间
    /**
     * @example 11223344556778899
     * @var int
     */
    public $createdAt;

    // id
    /**
     * @example 11223344556778899
     * @var string
     */
    public $id;

}
