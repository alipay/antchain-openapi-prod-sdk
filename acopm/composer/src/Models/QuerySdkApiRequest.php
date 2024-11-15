<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM\Models;

use AlibabaCloud\Tea\Model;

class QuerySdkApiRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 商业能力id
    /**
     * @var string
     */
    public $abilityId;

    // 发布版本号
    /**
     * @var string
     */
    public $publishVersion;
    protected $_name = [
        'authToken'      => 'auth_token',
        'abilityId'      => 'ability_id',
        'publishVersion' => 'publish_version',
    ];

    public function validate()
    {
        Model::validateRequired('abilityId', $this->abilityId, true);
        Model::validateRequired('publishVersion', $this->publishVersion, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->abilityId) {
            $res['ability_id'] = $this->abilityId;
        }
        if (null !== $this->publishVersion) {
            $res['publish_version'] = $this->publishVersion;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySdkApiRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['ability_id'])) {
            $model->abilityId = $map['ability_id'];
        }
        if (isset($map['publish_version'])) {
            $model->publishVersion = $map['publish_version'];
        }

        return $model;
    }
}
