<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class ExportXsiteConfigRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $workspaceName;

    /**
     * @var XSiteExport
     */
    public $data;
    protected $_name = [
        'authToken'     => 'auth_token',
        'workspaceName' => 'workspace_name',
        'data'          => 'data',
    ];

    public function validate()
    {
        Model::validateRequired('data', $this->data, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        if (null !== $this->data) {
            $res['data'] = null !== $this->data ? $this->data->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExportXsiteConfigRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }
        if (isset($map['data'])) {
            $model->data = XSiteExport::fromMap($map['data']);
        }

        return $model;
    }
}
