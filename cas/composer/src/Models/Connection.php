<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class Connection extends Model
{
    // access_key
    /**
     * @example access_key
     *
     * @var string
     */
    public $accessKey;

    // access_secret
    /**
     * @example access_secret
     *
     * @var string
     */
    public $accessSecret;

    // created_time
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $createdTime;

    // executor
    /**
     * @example executor
     *
     * @var string
     */
    public $executor;

    // id
    /**
     * @example id
     *
     * @var int
     */
    public $id;

    // identity
    /**
     * @example identity
     *
     * @var string
     */
    public $identity;

    // 修改时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $modifiedTime;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // plug
    /**
     * @example
     *
     * @var ConnectionStub
     */
    public $plug;

    // socket
    /**
     * @example
     *
     * @var ConnectionStub
     */
    public $socket;

    // status
    /**
     * @example NORMAL
     *
     * @var string
     */
    public $status;

    // tenant_id
    /**
     * @example tenant_id
     *
     * @var string
     */
    public $tenantId;
    protected $_name = [
        'accessKey'    => 'access_key',
        'accessSecret' => 'access_secret',
        'createdTime'  => 'created_time',
        'executor'     => 'executor',
        'id'           => 'id',
        'identity'     => 'identity',
        'modifiedTime' => 'modified_time',
        'name'         => 'name',
        'plug'         => 'plug',
        'socket'       => 'socket',
        'status'       => 'status',
        'tenantId'     => 'tenant_id',
    ];

    public function validate()
    {
        Model::validatePattern('createdTime', $this->createdTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('modifiedTime', $this->modifiedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accessKey) {
            $res['access_key'] = $this->accessKey;
        }
        if (null !== $this->accessSecret) {
            $res['access_secret'] = $this->accessSecret;
        }
        if (null !== $this->createdTime) {
            $res['created_time'] = $this->createdTime;
        }
        if (null !== $this->executor) {
            $res['executor'] = $this->executor;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->identity) {
            $res['identity'] = $this->identity;
        }
        if (null !== $this->modifiedTime) {
            $res['modified_time'] = $this->modifiedTime;
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
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Connection
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['access_key'])) {
            $model->accessKey = $map['access_key'];
        }
        if (isset($map['access_secret'])) {
            $model->accessSecret = $map['access_secret'];
        }
        if (isset($map['created_time'])) {
            $model->createdTime = $map['created_time'];
        }
        if (isset($map['executor'])) {
            $model->executor = $map['executor'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['identity'])) {
            $model->identity = $map['identity'];
        }
        if (isset($map['modified_time'])) {
            $model->modifiedTime = $map['modified_time'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['plug'])) {
            $model->plug = ConnectionStub::fromMap($map['plug']);
        }
        if (isset($map['socket'])) {
            $model->socket = ConnectionStub::fromMap($map['socket']);
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }

        return $model;
    }
}
