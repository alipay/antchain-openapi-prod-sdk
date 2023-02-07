<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QueryResourcemetaAppserviceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // workspace name
    /**
     * @var string
     */
    public $workspace;

    // app_names
    /**
     * @var string[]
     */
    public $appNames;
    protected $_name = [
        'authToken' => 'auth_token',
        'workspace' => 'workspace',
        'appNames'  => 'app_names',
    ];

    public function validate()
    {
        Model::validateRequired('workspace', $this->workspace, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        if (null !== $this->appNames) {
            $res['app_names'] = $this->appNames;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryResourcemetaAppserviceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }
        if (isset($map['app_names'])) {
            if (!empty($map['app_names'])) {
                $model->appNames = $map['app_names'];
            }
        }

        return $model;
    }
}
