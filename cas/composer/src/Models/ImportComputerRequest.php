<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class ImportComputerRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // computer iaas ids
    /**
     * @var string[]
     */
    public $computerIds;

    // workspace 名称
    /**
     * @var string
     */
    public $workspace;

    // computer 所在的 zone identity。可不填。
    /**
     * @var string
     */
    public $zone;
    protected $_name = [
        'authToken'   => 'auth_token',
        'computerIds' => 'computer_ids',
        'workspace'   => 'workspace',
        'zone'        => 'zone',
    ];

    public function validate()
    {
        Model::validateRequired('computerIds', $this->computerIds, true);
        Model::validateRequired('workspace', $this->workspace, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->computerIds) {
            $res['computer_ids'] = $this->computerIds;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        if (null !== $this->zone) {
            $res['zone'] = $this->zone;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportComputerRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['computer_ids'])) {
            if (!empty($map['computer_ids'])) {
                $model->computerIds = $map['computer_ids'];
            }
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }
        if (isset($map['zone'])) {
            $model->zone = $map['zone'];
        }

        return $model;
    }
}
