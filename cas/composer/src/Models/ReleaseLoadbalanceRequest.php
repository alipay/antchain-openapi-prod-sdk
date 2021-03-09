<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class ReleaseLoadbalanceRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // loadbalance ids
    /**
     * @var string[]
     */
    public $loadbalanceSequences;
    protected $_name = [
        'authToken'            => 'auth_token',
        'loadbalanceSequences' => 'loadbalance_sequences',
    ];

    public function validate()
    {
        Model::validateRequired('loadbalanceSequences', $this->loadbalanceSequences, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->loadbalanceSequences) {
            $res['loadbalance_sequences'] = $this->loadbalanceSequences;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ReleaseLoadbalanceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['loadbalance_sequences'])) {
            if (!empty($map['loadbalance_sequences'])) {
                $model->loadbalanceSequences = $map['loadbalance_sequences'];
            }
        }

        return $model;
    }
}
