<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class UpdateApptechstackrelationRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'appId' => 'app_id',
        'buildpackArch' => 'buildpack_arch',
        'creationTime' => 'creation_time',
        'extraInfo' => 'extra_info',
        'id' => 'id',
        'modificationTime' => 'modification_time',
        'techstackId' => 'techstack_id',
        'techstackIdentity' => 'techstack_identity',
        'techstackName' => 'techstack_name',
    ];
    public function validate() {
        Model::validatePattern('creationTime', $this->creationTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('modificationTime', $this->modificationTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->buildpackArch) {
            $res['buildpack_arch'] = $this->buildpackArch;
        }
        if (null !== $this->creationTime) {
            $res['creation_time'] = $this->creationTime;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->modificationTime) {
            $res['modification_time'] = $this->modificationTime;
        }
        if (null !== $this->techstackId) {
            $res['techstack_id'] = $this->techstackId;
        }
        if (null !== $this->techstackIdentity) {
            $res['techstack_identity'] = $this->techstackIdentity;
        }
        if (null !== $this->techstackName) {
            $res['techstack_name'] = $this->techstackName;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateApptechstackrelationRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['app_id'])){
            $model->appId = $map['app_id'];
        }
        if(isset($map['buildpack_arch'])){
            $model->buildpackArch = $map['buildpack_arch'];
        }
        if(isset($map['creation_time'])){
            $model->creationTime = $map['creation_time'];
        }
        if(isset($map['extra_info'])){
            $model->extraInfo = $map['extra_info'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['modification_time'])){
            $model->modificationTime = $map['modification_time'];
        }
        if(isset($map['techstack_id'])){
            $model->techstackId = $map['techstack_id'];
        }
        if(isset($map['techstack_identity'])){
            $model->techstackIdentity = $map['techstack_identity'];
        }
        if(isset($map['techstack_name'])){
            $model->techstackName = $map['techstack_name'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $tenant;

    // appId
    /**
     * @var string
     */
    public $appId;

    // buildpackArch
    /**
     * @var string
     */
    public $buildpackArch;

    // creationTime
    /**
     * @var string
     */
    public $creationTime;

    // extraInfo
    /**
     * @var string
     */
    public $extraInfo;

    // id
    /**
     * @var string
     */
    public $id;

    // modificationTime
    /**
     * @var string
     */
    public $modificationTime;

    // techstackId
    /**
     * @var int
     */
    public $techstackId;

    // techstackIdentity
    /**
     * @var string
     */
    public $techstackIdentity;

    // techstackName
    /**
     * @var string
     */
    public $techstackName;

}
