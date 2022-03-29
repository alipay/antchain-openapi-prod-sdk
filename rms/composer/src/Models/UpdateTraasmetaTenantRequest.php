<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class UpdateTraasmetaTenantRequest extends Model
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

    // display_name
    /**
     * @var string
     */
    public $displayName;

    // outside_id
    /**
     * @var string
     */
    public $outsideId;
    protected $_name = [
        'authToken'   => 'auth_token',
        'uuid'        => 'uuid',
        'displayName' => 'display_name',
        'outsideId'   => 'outside_id',
    ];

    public function validate()
    {
        Model::validateRequired('uuid', $this->uuid, true);
        Model::validateRequired('displayName', $this->displayName, true);
        Model::validateRequired('outsideId', $this->outsideId, true);
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
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->outsideId) {
            $res['outside_id'] = $this->outsideId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateTraasmetaTenantRequest
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
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }
        if (isset($map['outside_id'])) {
            $model->outsideId = $map['outside_id'];
        }

        return $model;
    }
}
