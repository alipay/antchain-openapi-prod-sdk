<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\ConnectionStub;

class Connection extends Model {
    protected $_name = [
        'id' => 'id',
        'tenantId' => 'tenant_id',
        'identity' => 'identity',
        'name' => 'name',
        'plug' => 'plug',
        'socket' => 'socket',
        'accessKey' => 'access_key',
        'accessSecret' => 'access_secret',
        'createdTime' => 'created_time',
        'modifiedTime' => 'modified_time',
        'executor' => 'executor',
        'status' => 'status',
    ];
    public function validate() {
        Model::validatePattern('createdTime', $this->createdTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('modifiedTime', $this->modifiedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->identity) {
            $res['identity'] = $this->identity;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->plug) {
            $res['plug'] = null !== $this->plug ? $this->plug->toMap() : null;
        }
        if (null !== $this->socket) {
            $res['socket'] = null !== $this->socket ? $this->socket->toMap() : null;
        }
        if (null !== $this->accessKey) {
            $res['access_key'] = $this->accessKey;
        }
        if (null !== $this->accessSecret) {
            $res['access_secret'] = $this->accessSecret;
        }
        if (null !== $this->createdTime) {
            $res['created_time'] = $this->createdTime;
        }
        if (null !== $this->modifiedTime) {
            $res['modified_time'] = $this->modifiedTime;
        }
        if (null !== $this->executor) {
            $res['executor'] = $this->executor;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return Connection
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['identity'])){
            $model->identity = $map['identity'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['plug'])){
            $model->plug = ConnectionStub::fromMap($map['plug']);
        }
        if(isset($map['socket'])){
            $model->socket = ConnectionStub::fromMap($map['socket']);
        }
        if(isset($map['access_key'])){
            $model->accessKey = $map['access_key'];
        }
        if(isset($map['access_secret'])){
            $model->accessSecret = $map['access_secret'];
        }
        if(isset($map['created_time'])){
            $model->createdTime = $map['created_time'];
        }
        if(isset($map['modified_time'])){
            $model->modifiedTime = $map['modified_time'];
        }
        if(isset($map['executor'])){
            $model->executor = $map['executor'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        return $model;
    }
    // id
    /**
     * @example 
     * @var int
     */
    public $id;

    // tenantId
    /**
     * @example tenantId
     * @var string
     */
    public $tenantId;

    // identity
    /**
     * @example identity
     * @var string
     */
    public $identity;

    // name
    /**
     * @example name
     * @var string
     */
    public $name;

    // plug
    /**
     * @example 
     * @var ConnectionStub
     */
    public $plug;

    // socket
    /**
     * @example socket
     * @var ConnectionStub
     */
    public $socket;

    // accessKey
    /**
     * @example accessKey
     * @var string
     */
    public $accessKey;

    // accessSecret
    /**
     * @example accessSecret
     * @var string
     */
    public $accessSecret;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $createdTime;

    // 修改时间
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $modifiedTime;

    // executor
    /**
     * @example executor
     * @var string
     */
    public $executor;

    // status
    /**
     * @example NORMAL
     * @var string
     */
    public $status;

}
