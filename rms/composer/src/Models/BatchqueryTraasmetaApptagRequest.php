<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryTraasmetaApptagRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // uuids
    /**
     * @var string[]
     */
    public $uuids;

    // app_names
    /**
     * @var string[]
     */
    public $appNames;

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

    // tag_keys
    /**
     * @var string[]
     */
    public $tagKeys;
    protected $_name = [
        'authToken'  => 'auth_token',
        'uuids'      => 'uuids',
        'appNames'   => 'app_names',
        'tenantUuid' => 'tenant_uuid',
        'tenantName' => 'tenant_name',
        'tagKeys'    => 'tag_keys',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->uuids) {
            $res['uuids'] = $this->uuids;
        }
        if (null !== $this->appNames) {
            $res['app_names'] = $this->appNames;
        }
        if (null !== $this->tenantUuid) {
            $res['tenant_uuid'] = $this->tenantUuid;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->tagKeys) {
            $res['tag_keys'] = $this->tagKeys;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchqueryTraasmetaApptagRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['uuids'])) {
            if (!empty($map['uuids'])) {
                $model->uuids = $map['uuids'];
            }
        }
        if (isset($map['app_names'])) {
            if (!empty($map['app_names'])) {
                $model->appNames = $map['app_names'];
            }
        }
        if (isset($map['tenant_uuid'])) {
            $model->tenantUuid = $map['tenant_uuid'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }
        if (isset($map['tag_keys'])) {
            if (!empty($map['tag_keys'])) {
                $model->tagKeys = $map['tag_keys'];
            }
        }

        return $model;
    }
}
