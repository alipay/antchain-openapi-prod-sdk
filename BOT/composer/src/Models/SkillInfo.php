<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class SkillInfo extends Model {
    protected $_name = [
        'name' => 'name',
        'version' => 'version',
        'url' => 'url',
        'skillId' => 'skill_id',
    ];
    public function validate() {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('version', $this->version, true);
        Model::validateRequired('url', $this->url, true);
        Model::validateRequired('skillId', $this->skillId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->skillId) {
            $res['skill_id'] = $this->skillId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SkillInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['version'])){
            $model->version = $map['version'];
        }
        if(isset($map['url'])){
            $model->url = $map['url'];
        }
        if(isset($map['skill_id'])){
            $model->skillId = $map['skill_id'];
        }
        return $model;
    }
    // skill名称
    /**
     * @example xxx
     * @var string
     */
    public $name;

    // 版本
    /**
     * @example 1.2
     * @var string
     */
    public $version;

    // oss地址
    /**
     * @example url
     * @var string
     */
    public $url;

    // skillId
    /**
     * @example 11223344556778899
     * @var string
     */
    public $skillId;

}
