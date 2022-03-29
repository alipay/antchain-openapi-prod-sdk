<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class UpdateTraasmetaApptagRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // uuid
    /**
     * @var string
     */
    public $uuid;

    // tag_key
    /**
     * @var string
     */
    public $tagKey;

    // outside_id
    /**
     * @var string
     */
    public $outsideId;

    // source_from
    /**
     * @var string
     */
    public $sourceFrom;

    // extension
    /**
     * @var string
     */
    public $extension;

    // tenant_uuid
    /**
     * @var string
     */
    public $tenantUuid;

    // tenant_name
    /**
     * @var string
     */
    public $tenantName;

    // app_uuid
    /**
     * @var string
     */
    public $appUuid;

    // app_name
    /**
     * @var string
     */
    public $appName;

    // tag_value
    /**
     * @var string
     */
    public $tagValue;
    protected $_name = [
        'authToken'  => 'auth_token',
        'uuid'       => 'uuid',
        'tagKey'     => 'tag_key',
        'outsideId'  => 'outside_id',
        'sourceFrom' => 'source_from',
        'extension'  => 'extension',
        'tenantUuid' => 'tenant_uuid',
        'tenantName' => 'tenant_name',
        'appUuid'    => 'app_uuid',
        'appName'    => 'app_name',
        'tagValue'   => 'tag_value',
    ];

    public function validate()
    {
        Model::validateRequired('uuid', $this->uuid, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->uuid) {
            $res['uuid'] = $this->uuid;
        }
        if (null !== $this->tagKey) {
            $res['tag_key'] = $this->tagKey;
        }
        if (null !== $this->outsideId) {
            $res['outside_id'] = $this->outsideId;
        }
        if (null !== $this->sourceFrom) {
            $res['source_from'] = $this->sourceFrom;
        }
        if (null !== $this->extension) {
            $res['extension'] = $this->extension;
        }
        if (null !== $this->tenantUuid) {
            $res['tenant_uuid'] = $this->tenantUuid;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->appUuid) {
            $res['app_uuid'] = $this->appUuid;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->tagValue) {
            $res['tag_value'] = $this->tagValue;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateTraasmetaApptagRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['uuid'])) {
            $model->uuid = $map['uuid'];
        }
        if (isset($map['tag_key'])) {
            $model->tagKey = $map['tag_key'];
        }
        if (isset($map['outside_id'])) {
            $model->outsideId = $map['outside_id'];
        }
        if (isset($map['source_from'])) {
            $model->sourceFrom = $map['source_from'];
        }
        if (isset($map['extension'])) {
            $model->extension = $map['extension'];
        }
        if (isset($map['tenant_uuid'])) {
            $model->tenantUuid = $map['tenant_uuid'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }
        if (isset($map['app_uuid'])) {
            $model->appUuid = $map['app_uuid'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['tag_value'])) {
            $model->tagValue = $map['tag_value'];
        }

        return $model;
    }
}
