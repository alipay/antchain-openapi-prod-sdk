<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class EnableAgentVersionRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // agent版本号
    /**
     * @var string
     */
    public $agentVersion;

    // agent存储url
    /**
     * @var string
     */
    public $agentUrl;
    protected $_name = [
        'authToken'    => 'auth_token',
        'agentVersion' => 'agent_version',
        'agentUrl'     => 'agent_url',
    ];

    public function validate()
    {
        Model::validateRequired('agentVersion', $this->agentVersion, true);
        Model::validateRequired('agentUrl', $this->agentUrl, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->agentVersion) {
            $res['agent_version'] = $this->agentVersion;
        }
        if (null !== $this->agentUrl) {
            $res['agent_url'] = $this->agentUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EnableAgentVersionRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['agent_version'])) {
            $model->agentVersion = $map['agent_version'];
        }
        if (isset($map['agent_url'])) {
            $model->agentUrl = $map['agent_url'];
        }

        return $model;
    }
}
