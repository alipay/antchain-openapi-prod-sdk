<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\FAIROPENNET\Models;

use AlibabaCloud\Tea\Model;

class NormalNodeIdentityInfo extends Model
{
    /**
     * @example
     *
     * @var string
     */
    public $nodeId;

    /**
     * @example
     *
     * @var string
     */
    public $identityInfo;
    protected $_name = [
        'nodeId'       => 'node_id',
        'identityInfo' => 'identity_info',
    ];

    public function validate()
    {
        Model::validateRequired('nodeId', $this->nodeId, true);
        Model::validateRequired('identityInfo', $this->identityInfo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->nodeId) {
            $res['node_id'] = $this->nodeId;
        }
        if (null !== $this->identityInfo) {
            $res['identity_info'] = $this->identityInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NormalNodeIdentityInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['node_id'])) {
            $model->nodeId = $map['node_id'];
        }
        if (isset($map['identity_info'])) {
            $model->identityInfo = $map['identity_info'];
        }

        return $model;
    }
}
