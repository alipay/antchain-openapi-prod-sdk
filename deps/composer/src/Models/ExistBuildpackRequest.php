<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class ExistBuildpackRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $tenant;

    // buildpackId
    /**
     * @var string
     */
    public $buildpackId;

    // fullVersion
    /**
     * @var string
     */
    public $fullVersion;

    // techstackId
    /**
     * @var int
     */
    public $techstackId;
    protected $_name = [
        'authToken'   => 'auth_token',
        'tenant'      => 'tenant',
        'buildpackId' => 'buildpack_id',
        'fullVersion' => 'full_version',
        'techstackId' => 'techstack_id',
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
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->buildpackId) {
            $res['buildpack_id'] = $this->buildpackId;
        }
        if (null !== $this->fullVersion) {
            $res['full_version'] = $this->fullVersion;
        }
        if (null !== $this->techstackId) {
            $res['techstack_id'] = $this->techstackId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExistBuildpackRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['tenant'])) {
            $model->tenant = $map['tenant'];
        }
        if (isset($map['buildpack_id'])) {
            $model->buildpackId = $map['buildpack_id'];
        }
        if (isset($map['full_version'])) {
            $model->fullVersion = $map['full_version'];
        }
        if (isset($map['techstack_id'])) {
            $model->techstackId = $map['techstack_id'];
        }

        return $model;
    }
}
