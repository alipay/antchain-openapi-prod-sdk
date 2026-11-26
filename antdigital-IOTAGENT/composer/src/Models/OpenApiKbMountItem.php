<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class OpenApiKbMountItem extends Model {
    protected $_name = [
        'kbId' => 'kb_id',
        'name' => 'name',
        'description' => 'description',
        'provider' => 'provider',
    ];
    public function validate() {
        Model::validateRequired('kbId', $this->kbId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('provider', $this->provider, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->kbId) {
            $res['kb_id'] = $this->kbId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->provider) {
            $res['provider'] = $this->provider;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OpenApiKbMountItem
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['kb_id'])){
            $model->kbId = $map['kb_id'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['provider'])){
            $model->provider = $map['provider'];
        }
        return $model;
    }
    // 知识库ID
    /**
     * @example 7470569204104081408
     * @var string
     */
    public $kbId;

    // 映射kbName
    /**
     * @example 产品使用手册
     * @var string
     */
    public $name;

    // 映射kbDescription
    /**
     * @example 产品使用说明与FAQ
     * @var string
     */
    public $description;

    // 枚举:OFFICIAL,CUSTOM
    /**
     * @example OFFICIAL
     * @var string
     */
    public $provider;

}
