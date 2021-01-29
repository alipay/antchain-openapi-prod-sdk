<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class TechstackBuildpackCount extends Model {
    protected $_name = [
        'buildpackCount' => 'buildpack_count',
        'creationTime' => 'creation_time',
        'description' => 'description',
        'extraInfo' => 'extra_info',
        'id' => 'id',
        'identity' => 'identity',
        'modificationTime' => 'modification_time',
        'name' => 'name',
        'scope' => 'scope',
        'status' => 'status',
    ];
    public function validate() {
        Model::validatePattern('creationTime', $this->creationTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('modificationTime', $this->modificationTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('scope', $this->scope, true);
        Model::validateRequired('status', $this->status, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->buildpackCount) {
            $res['buildpack_count'] = $this->buildpackCount;
        }
        if (null !== $this->creationTime) {
            $res['creation_time'] = $this->creationTime;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->identity) {
            $res['identity'] = $this->identity;
        }
        if (null !== $this->modificationTime) {
            $res['modification_time'] = $this->modificationTime;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return TechstackBuildpackCount
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['buildpack_count'])){
            $model->buildpackCount = $map['buildpack_count'];
        }
        if(isset($map['creation_time'])){
            $model->creationTime = $map['creation_time'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['extra_info'])){
            $model->extraInfo = $map['extra_info'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['identity'])){
            $model->identity = $map['identity'];
        }
        if(isset($map['modification_time'])){
            $model->modificationTime = $map['modification_time'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['scope'])){
            $model->scope = $map['scope'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        return $model;
    }
    // buildpackCount
    /**
     * @example buildpackCount
     * @var int
     */
    public $buildpackCount;

    // creation_time
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $creationTime;

    // description
    /**
     * @example description
     * @var string
     */
    public $description;

    // extra_info
    /**
     * @example extra_info
     * @var string
     */
    public $extraInfo;

    // id
    /**
     * @example id
     * @var string
     */
    public $id;

    // identity
    /**
     * @example identity
     * @var string
     */
    public $identity;

    // modification_time
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $modificationTime;

    // name
    /**
     * @example name
     * @var string
     */
    public $name;

    // scope
    /**
     * @example scope
     * @var string
     */
    public $scope;

    // status
    /**
     * @example status
     * @var string
     */
    public $status;

}
