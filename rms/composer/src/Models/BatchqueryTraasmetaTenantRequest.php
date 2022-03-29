<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryTraasmetaTenantRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // uuid数组
    /**
     * @var string[]
     */
    public $uuids;

    // names
    /**
     * @var string[]
     */
    public $names;
    protected $_name = [
        'authToken' => 'auth_token',
        'uuids'     => 'uuids',
        'names'     => 'names',
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
        if (null !== $this->names) {
            $res['names'] = $this->names;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchqueryTraasmetaTenantRequest
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
        if (isset($map['names'])) {
            if (!empty($map['names'])) {
                $model->names = $map['names'];
            }
        }

        return $model;
    }
}
