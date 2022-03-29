<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class BatchdeleteTraasmetaCellRequest extends Model
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
    protected $_name = [
        'authToken' => 'auth_token',
        'uuids'     => 'uuids',
    ];

    public function validate()
    {
        Model::validateRequired('uuids', $this->uuids, true);
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchdeleteTraasmetaCellRequest
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

        return $model;
    }
}
