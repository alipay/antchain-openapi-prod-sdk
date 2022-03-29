<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class CreateTraasmetaTenantRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // tenant name
    /**
     * @var string
     */
    public $name;

    // display_name
    /**
     * @var string
     */
    public $displayName;

    // outsideId
    /**
     * @var string
     */
    public $outsideId;

    // source_from
    /**
     * @var string
     */
    public $sourceFrom;
    protected $_name = [
        'authToken'   => 'auth_token',
        'name'        => 'name',
        'displayName' => 'display_name',
        'outsideId'   => 'outside_id',
        'sourceFrom'  => 'source_from',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->outsideId) {
            $res['outside_id'] = $this->outsideId;
        }
        if (null !== $this->sourceFrom) {
            $res['source_from'] = $this->sourceFrom;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateTraasmetaTenantRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }
        if (isset($map['outside_id'])) {
            $model->outsideId = $map['outside_id'];
        }
        if (isset($map['source_from'])) {
            $model->sourceFrom = $map['source_from'];
        }

        return $model;
    }
}
