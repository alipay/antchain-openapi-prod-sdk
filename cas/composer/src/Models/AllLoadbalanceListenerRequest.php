<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class AllLoadbalanceListenerRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // lb_id
    /**
     * @var string
     */
    public $lbId;

    // workspace
    /**
     * @var string
     */
    public $workspace;
    protected $_name = [
        'authToken' => 'auth_token',
        'lbId'      => 'lb_id',
        'workspace' => 'workspace',
    ];

    public function validate()
    {
        Model::validateRequired('lbId', $this->lbId, true);
        Model::validateRequired('workspace', $this->workspace, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->lbId) {
            $res['lb_id'] = $this->lbId;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AllLoadbalanceListenerRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['lb_id'])) {
            $model->lbId = $map['lb_id'];
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }

        return $model;
    }
}
