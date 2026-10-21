<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGENT\Models;

use AlibabaCloud\Tea\Model;

class TreeDetailResponse extends Model {
    protected $_name = [
        'name' => 'name',
        'id' => 'id',
        'description' => 'description',
        'version' => 'version',
        'activeversion' => 'activeversion',
        'tenanttag' => 'tenanttag',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->activeversion) {
            $res['activeversion'] = $this->activeversion;
        }
        if (null !== $this->tenanttag) {
            $res['tenanttag'] = $this->tenanttag;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return TreeDetailResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['version'])){
            $model->version = $map['version'];
        }
        if(isset($map['activeversion'])){
            $model->activeversion = $map['activeversion'];
        }
        if(isset($map['tenanttag'])){
            $model->tenanttag = $map['tenanttag'];
        }
        return $model;
    }
    // 知识库名称
    /**
     * @example 知识库名称
     * @var string
     */
    public $name;

    // 知识库id
    /**
     * @example tree_1231
     * @var string
     */
    public $id;

    // 知识库描述
    /**
     * @example 知识库描述
     * @var string
     */
    public $description;

    // 当前最新版本
    /**
     * @example V2026.08.1
     * @var string
     */
    public $version;

    // 当前激活的版本号，未激活任何版本时为 null
    /**
     * @example V2026.08.1
     * @var string
     */
    public $activeversion;

    // 官方知识库数据为 "official",否则 null
    /**
     * @example null
     * @var string
     */
    public $tenanttag;

}
